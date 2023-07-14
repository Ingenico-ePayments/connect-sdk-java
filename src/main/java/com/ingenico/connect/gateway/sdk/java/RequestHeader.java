package com.ingenico.connect.gateway.sdk.java;

import java.util.List;
import java.util.regex.Pattern;

/**
 * A single request header. Immutable.
 */
public class RequestHeader {

	private static final Pattern WHITE_SPACE_NORMALIZER = Pattern.compile("\r?\n[\\s&&[^\r\n]]*");

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
		// Replace all sequences of linebreak-whitespace* with a single space
		// This matches the normalization done by DefaultAuthenticator, and ensures that multiline headers
		// will not cause authentication failures
		return WHITE_SPACE_NORMALIZER.matcher(value).replaceAll(" ").trim();
	}

	public String getName() {
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

	/**
	 * @return The header from the given list with the given name, or {@code null} if there was no such header.
	 */
	public static RequestHeader getHeader(List<RequestHeader> headers, String headerName) {
		for (RequestHeader header : headers) {
			if (header.getName().equalsIgnoreCase(headerName)) {
				return header;
			}
		}
		return null;
	}

	/**
	 * @return The value of the header from the given list with the given name, or {@code null} if there was no such header.
	 */
	public static String getHeaderValue(List<RequestHeader> headers, String headerName) {
		RequestHeader header = getHeader(headers, headerName);
		return header != null ? header.getValue() : null;
	}
}
