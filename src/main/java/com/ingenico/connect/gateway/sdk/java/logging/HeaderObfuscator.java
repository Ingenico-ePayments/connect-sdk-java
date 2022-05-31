package com.ingenico.connect.gateway.sdk.java.logging;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * A class that can be used to obfuscate headers. Thread-safe if all its obfuscation rules are.
 */
public final class HeaderObfuscator {

	private static final HeaderObfuscator DEFAULT_OBFUSCATOR = custom().build();

	private final Map<String, ObfuscationRule> obfuscationRules;

	private HeaderObfuscator(Map<String, ObfuscationRule> obfuscationRules) {
		// case insensitive
		Map<String, ObfuscationRule> copy = new TreeMap<String, ObfuscationRule>(String.CASE_INSENSITIVE_ORDER);
		copy.putAll(obfuscationRules);
		this.obfuscationRules = Collections.unmodifiableMap(copy);
	}

	/**
	 * Obfuscates the value for the given header as necessary.
	 */
	public String obfuscateHeader(String name, String value) {
		ObfuscationRule obfuscationRule = obfuscationRules.get(name);
		return obfuscationRule != null ? obfuscationRule.obfuscateValue(value) : value;
	}

	/**
	 * Returns a builder to create custom header obfuscators.
	 * This builder will contain some pre-defined obfuscation rules. These cannot be removed, but
	 * replacing them is possible.
	 */
	public static Builder custom() {
		return new Builder()
				.obfuscateWithFixedLength(8, "Authorization")
				.obfuscateWithFixedLength(8, "WWW-Authenticate")
				.obfuscateWithFixedLength(8, "Proxy-Authenticate")
				.obfuscateWithFixedLength(8, "Proxy-Authorization")
				.obfuscateWithFixedLength(8, "X-GCS-Authentication-Token")
				.obfuscateWithFixedLength(8, "X-GCS-CallerPassword");
	}

	/**
	 * Returns a default header obfuscator. The result will be equivalent to calling
	 * {@link #custom()}.{@link Builder#build() build()}.
	 */
	public static HeaderObfuscator defaultObfuscator() {
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
		public Builder obfuscateAll(String headerName) {
			obfuscationRules.put(headerName, ValueObfuscator.ALL);
			return this;
		}

		/**
		 * Adds an obfuscation rule that will replace values with a fixed length string containing
		 * only {@code *}.
		 */
		public Builder obfuscateWithFixedLength(int fixedLength, String headerName) {
			obfuscationRules.put(headerName, ValueObfuscator.fixedLength(fixedLength));
			return this;
		}

		/**
		 * Adds an obfuscation rule that will keep a fixed number of characters at the start, then
		 * replaces all other characters with {@code *}.
		 */
		public Builder obfuscateAllButFirst(int count, String headerName) {
			obfuscationRules.put(headerName, ValueObfuscator.keepStartCount(count));
			return this;
		}

		/**
		 * Adds an obfuscation rule that will keep a fixed number of characters at the end, then
		 * replaces all other characters with {@code *}.
		 */
		public Builder obfuscateAllButLast(int count, String headerName) {
			obfuscationRules.put(headerName, ValueObfuscator.keepEndCount(count));
			return this;
		}

		/**
		 * Adds a custom, non-{@code null} obfuscation rule.
		 */
		public Builder obfuscateCustom(String headerName, ObfuscationRule obfuscationRule) {
			if (obfuscationRule == null) {
				throw new IllegalArgumentException("obfuscationRule is required");
			}
			obfuscationRules.put(headerName, obfuscationRule);
			return this;
		}

		public HeaderObfuscator build() {
			return new HeaderObfuscator(obfuscationRules);
		}
	}
}
