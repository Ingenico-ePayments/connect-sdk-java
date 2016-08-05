package com.globalcollect.gateway.sdk.java.logging;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class PropertyObfuscator extends Obfuscator {

	private final Pattern propertyPattern;

	PropertyObfuscator(Map<String, ValueObfuscator> obfuscators) {
		// case sensitive
		super(obfuscators, false);
		this.propertyPattern = buildPropertyPattern(obfuscators.keySet());
	}

	private Pattern buildPropertyPattern(Set<String> propertyNames) {
		if (propertyNames.isEmpty()) {
			// no matches possible
			return Pattern.compile("$^");
		}

		Iterator<String> iterator = propertyNames.iterator();

		/*
		 * Regex to create: (["'])(X|Y|Z)\1\s*:\s*(?:(["'])(.*?)(?<!\\)\3|([^"'\s]\S*))
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
		regex.append(")\\1\\s*:\\s*(?:([\"'])(.*?)(?<!\\\\)\\3|([^\"'\\s]\\S*))");

		 // not case insensitive
		final int flags = Pattern.DOTALL;

		return Pattern.compile(regex.toString(), flags);
	}

	String obfuscate(CharSequence body) {
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

	static Builder builder() {
		return new Builder();
	}

	static class Builder extends Obfuscator.Builder {

		@Override
		Builder withAll(String property) {
			super.withAll(property);
			return this;
		}

		@Override
		Builder withFixedLength(String property, int fixedLength) {
			super.withFixedLength(property, fixedLength);
			return this;
		}

		@Override
		Builder withKeepStartCount(String key, int count) {
			super.withKeepStartCount(key, count);
			return this;
		}

		@Override
		Builder withKeepEndCount(String property, int count) {
			super.withKeepEndCount(property, count);
			return this;
		}

		@Override
		PropertyObfuscator build() {
			return new PropertyObfuscator(getObfuscators());
		}
	}
}
