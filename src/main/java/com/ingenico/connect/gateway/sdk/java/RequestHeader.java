package com.ingenico.connect.gateway.sdk.java;

import java.util.regex.Pattern;

/**
 * A single request header. Immutable.
 */
public class RequestHeader {

	private static final Pattern WHITE_SPACE_NORMALIZER = Pattern.compile("[\\s&&[^\r\n]]*(\r?\n)[\\s&&[^\r\n]]*");
	
	private final String name;
	private final String value;

	public RequestHeader(String name, String value) {
		if (name == null || name.trim().isEmpty()) {
			throw new IllegalArgumentException("name is required");
		}
		this.name = name;
		this.value = normalizeValue(value);
	}

	private String normalizeValue(String value) {
		if (value == null || value.isEmpty()) {
			return value;
		}
		// Replace all sequences of whitespace*-linebreak-whitespace* into a single linebreak-space
		// This will ensure that:
		// - no line ends with whitespace, because this causes authentication failures
		// - each line starts with a single whitespace, so it is a valid header value
		return WHITE_SPACE_NORMALIZER.matcher(value).replaceAll("$1 ");
	}

	public String getName(){
		return name;
	}

	/**
	 * @return The un-encoded value.
	 */
	public String getValue() {
		return value;
	}

	@Override
	public String toString() {
		return getName() + ":" + getValue();
	}
}
