package com.ingenico.connect.gateway.sdk.java.logging;

import java.util.Map;

final class HeaderObfuscator extends Obfuscator {

	HeaderObfuscator(Map<String, ValueObfuscator> obfuscators) {
		// case insensitive
		super(obfuscators, true);
	}

	static Builder builder() {
		return new Builder();
	}

	static class Builder extends Obfuscator.Builder {

		@Override
		Builder withAll(String name) {
			super.withAll(name);
			return this;
		}

		@Override
		Builder withFixedLength(String name, int fixedLength) {
			super.withFixedLength(name, fixedLength);
			return this;
		}

		@Override
		Builder withKeepStartCount(String key, int count) {
			super.withKeepStartCount(key, count);
			return this;
		}

		@Override
		Builder withKeepEndCount(String name, int count) {
			super.withKeepEndCount(name, count);
			return this;
		}

		@Override
		HeaderObfuscator build() {
			return new HeaderObfuscator(getObfuscators());
		}
	}
}
