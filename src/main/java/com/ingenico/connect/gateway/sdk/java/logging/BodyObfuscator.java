package com.ingenico.connect.gateway.sdk.java.logging;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * A class that can be used to obfuscate properties in JSON bodies. Thread-safe if all its obfuscation rules are.
 */
public final class BodyObfuscator {

	private static final BodyObfuscator DEFAULT_OBFUSCATOR = custom().build();

	private final Map<String, ObfuscationRule> obfuscationRules;
	private final Pattern propertyPattern;

	private BodyObfuscator(Map<String, ObfuscationRule> obfuscationRules) {
		// case sensitive
		this.obfuscationRules = Collections.unmodifiableMap(new LinkedHashMap<String, ObfuscationRule>(obfuscationRules));
		this.propertyPattern = buildPropertyPattern(obfuscationRules.keySet());
	}

	private Pattern buildPropertyPattern(Set<String> propertyNames) {
		if (propertyNames.isEmpty()) {
			// no matches possible
			return Pattern.compile("$^");
		}

		Iterator<String> iterator = propertyNames.iterator();

		/*
		 * Regex to create: (["'])(X|Y|Z)\1\s*:\s*(?:(["'])(.*?)(?<!\\)\3|([^"'\s\[\{][\S&&[^,]]*))
		 * Groups:
		 * 1: opening " or ' for the property name
		 * 2: property name
		 * 3: opening " or ' for the value
		 * 4: quoted value
		 * 5: non-quoted-value
		 * The negative lookbehind is to allow escaped quotes to be part of the value.
		 * What this does not allow currently is having values end with a \ (which would be escaped to \\).
		 */
		StringBuilder regex = new StringBuilder();
		regex.append("([\"'])(");
		regex.append(Pattern.quote(iterator.next()));
		while (iterator.hasNext()) {
			regex.append('|').append(Pattern.quote(iterator.next()));
		}
		regex.append(")\\1\\s*:\\s*(?:([\"'])(.*?)(?<!\\\\)\\3|([^\"'\\s\\[\\{][\\S&&[^,]]*))");

		 // not case insensitive
		final int flags = Pattern.DOTALL;

		return Pattern.compile(regex.toString(), flags);
	}

	private String obfuscateValue(String propertyName, String value) {
		ObfuscationRule obfuscationRule = obfuscationRules.get(propertyName);
		return obfuscationRule != null ? obfuscationRule.obfuscateValue(value) : value;
	}

	/**
	 * Obfuscates the given body as necessary.
	 */
	public String obfuscateBody(CharSequence body) {
		if (body == null) {
			return null;
		}
		if (body.length() == 0) {
			return "";
		}

		StringBuilder sb = new StringBuilder(body.length());
		int index = 0;
		Matcher matcher = propertyPattern.matcher(body);
		while (matcher.find()) {
			String propertyName = matcher.group(2);
			String value = matcher.group(4);
			int valueStart = matcher.start(4);
			int valueEnd = matcher.end(4);
			if (value == null) {
				value = matcher.group(5);
				valueStart = matcher.start(5);
				valueEnd = matcher.end(5);
			}

			String obfuscatedValue = obfuscateValue(propertyName, value);

			sb.append(body, index, valueStart);
			sb.append(obfuscatedValue);
			index = valueEnd;
		}
		sb.append(body, index, body.length());

		return sb.toString();
	}

	/**
	 * Obfuscates the body from the given stream as necessary.
	 * @param charset The charset to use to read the body input stream.
	 */
	public String obfuscateBody(InputStream bodyStream, Charset charset) throws IOException {
		return obfuscateBody(new InputStreamReader(bodyStream, charset));
	}

	/**
	 * Obfuscates the body from the given stream as necessary.
	 */
	public String obfuscateBody(Reader bodyStream) throws IOException {
		StringBuilder body = new StringBuilder();
		char[] buffer = new char[4096];
		int len;
		while ((len = bodyStream.read(buffer)) != -1) {
			body.append(buffer, 0, len);
		}

		return obfuscateBody(body);
	}

	/**
	 * Returns a builder to create custom body obfuscators.
	 * This builder will contain some pre-defined obfuscation rules. These cannot be removed, but
	 * replacing them is possible.
	 */
	public static Builder custom() {
		return new Builder()
				.obfuscateAllButLast(4, "cardNumber")
				.obfuscateAllButLast(2, "expiryDate")
				.obfuscateAll("cvv")
				.obfuscateAllButLast(4, "iban")
				.obfuscateAllButLast(4, "accountNumber")
				.obfuscateAllButLast(4, "reformattedAccountNumber")
				.obfuscateAllButFirst(6, "bin")
				// key-value pairs can contain any value, like credit card numbers or other private data; mask all values
				.obfuscateAll("value")
				.obfuscateWithFixedLength(8, "keyId")
				.obfuscateWithFixedLength(8, "secretKey")
				.obfuscateWithFixedLength(8, "publicKey")
				.obfuscateWithFixedLength(8, "userAuthenticationToken")
				// encrypted payload is a base64 string that contains an encrypted value; to make decrypting even harder, just mask the entire thing
				.obfuscateWithFixedLength(8, "encryptedPayload")
				// decrypted payload is a simple base64 string that may contain credit card numbers or other private data; just mask the entire thing
				.obfuscateWithFixedLength(8, "decryptedPayload")
				// encrypted customer input is similar to encrypted payload
				.obfuscateWithFixedLength(8, "encryptedCustomerInput");
	}

	/**
	 * Returns a default body obfuscator. The result will be equivalent to calling
	 * {@link #custom()}.{@link Builder#build() build()}.
	 */
	public static BodyObfuscator defaultObfuscator() {
		return DEFAULT_OBFUSCATOR;
	}

	public static class Builder {

		private final Map<String, ObfuscationRule> obfuscationRules;

		private Builder() {
			obfuscationRules = new LinkedHashMap<String, ObfuscationRule>();
		}

		/**
		 * Adds an obfuscation rule that will replace all characters with {@code *}.
		 */
		public Builder obfuscateAll(String propertyName) {
			obfuscationRules.put(propertyName, ValueObfuscator.ALL);
			return this;
		}

		/**
		 * Adds an obfuscation rule that will replace values with a fixed length string containing
		 * only {@code *}.
		 */
		public Builder obfuscateWithFixedLength(int fixedLength, String propertyName) {
			obfuscationRules.put(propertyName, ValueObfuscator.fixedLength(fixedLength));
			return this;
		}

		/**
		 * Adds an obfuscation rule that will keep a fixed number of characters at the start, then
		 * replaces all other characters with {@code *}.
		 */
		public Builder obfuscateAllButFirst(int count, String propertyName) {
			obfuscationRules.put(propertyName, ValueObfuscator.keepStartCount(count));
			return this;
		}

		/**
		 * Adds an obfuscation rule that will keep a fixed number of characters at the end, then
		 * replaces all other characters with {@code *}.
		 */
		public Builder obfuscateAllButLast(int count, String propertyName) {
			obfuscationRules.put(propertyName, ValueObfuscator.keepEndCount(count));
			return this;
		}

		/**
		 * Adds a custom, non-{@code null} obfuscation rule.
		 */
		public Builder obfuscateCustom(String propertyName, ObfuscationRule obfuscationRule) {
			if (obfuscationRule == null) {
				throw new IllegalArgumentException("obfuscationRule is required");
			}
			obfuscationRules.put(propertyName, obfuscationRule);
			return this;
		}

		public BodyObfuscator build() {
			return new BodyObfuscator(obfuscationRules);
		}
	}
}
