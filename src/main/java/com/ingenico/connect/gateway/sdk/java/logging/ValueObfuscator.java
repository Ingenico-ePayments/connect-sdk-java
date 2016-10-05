package com.ingenico.connect.gateway.sdk.java.logging;

import java.util.Arrays;

final class ValueObfuscator {

	static final ValueObfuscator ALL = new ValueObfuscator(0, 0, 0);

	private final char maskCharacter;
	private final int fixedLength;
	private final int keepStartCount;
	private final int keepEndCount;

	private ValueObfuscator(int fixedLength, int keepStartCount, int keepEndCount) {
		this.maskCharacter = '*';
		this.fixedLength = fixedLength;
		this.keepStartCount = keepStartCount;
		this.keepEndCount = keepEndCount;
	}

	static ValueObfuscator fixedLength(int fixedLength) {
		return new ValueObfuscator(fixedLength, 0, 0);
	}

	static ValueObfuscator keepStartCount(int count) {
		return new ValueObfuscator(0, count, 0);
	}

	static ValueObfuscator keepEndCount(int count) {
		return new ValueObfuscator(0, 0, count);
	}

	String obfuscateValue(String value) {
		if (value == null || value.isEmpty()) {
			return value;
		}
		if (fixedLength > 0) {
			return repeatMask(fixedLength);
		}
		if (keepStartCount == 0 && keepEndCount == 0) {
			return repeatMask(value.length());
		}
		if (value.length() < keepStartCount + keepEndCount) {
			return value;
		}
		char[] chars = value.toCharArray();
		Arrays.fill(chars, keepStartCount, value.length() - keepEndCount, maskCharacter);
		return new String(chars);
	}

	private String repeatMask(int count) {
		char[] chars = new char[count];
		Arrays.fill(chars, maskCharacter);
		return new String(chars);
	}
}
