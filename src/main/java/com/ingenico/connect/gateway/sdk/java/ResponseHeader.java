package com.ingenico.connect.gateway.sdk.java;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * A single response header. Immutable.
 */
public class ResponseHeader {

	private static final Pattern DISPOSITION_FILENAME_PATTERN = Pattern.compile("(?:^|;)\\s*filename\\s*=\\s*(.*?)\\s*(?:;|$)", Pattern.CASE_INSENSITIVE);

	private final String name;
	private final String value;

	public ResponseHeader(String name, String value) {
		if (name == null) {
			throw new IllegalArgumentException("name is required");
		}
		this.name = name;
		this.value = value;
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
	public static ResponseHeader getHeader(List<ResponseHeader> headers, String headerName) {
		for (ResponseHeader header : headers) {
			if (header.getName().equalsIgnoreCase(headerName)) {
				return header;
			}
		}
		return null;
	}

	/**
	 * @return The value of the header from the given list with the given name, or {@code null} if there was no such header.
	 */
	public static String getHeaderValue(List<ResponseHeader> headers, String headerName) {
		ResponseHeader header = getHeader(headers, headerName);
		return header != null ? header.getValue() : null;
	}

	/**
	 * @return The value of the {@code filename} parameter of the {@code Content-Disposition} header from the given list,
	 *         or {@code null} if there was no such header or parameter.
	 */
	public static String getDispositionFilename(List<ResponseHeader> headers) {
		String headerValue = getHeaderValue(headers, "Content-Disposition");
		if (headerValue == null) {
			return null;
		}
		Matcher matcher = DISPOSITION_FILENAME_PATTERN.matcher(headerValue);
		if (matcher.find()) {
			String filename = matcher.group(1);
			return trimQuotes(filename);
		}
		return null;
	}

	private static String trimQuotes(String filename) {
		if (filename.length() < 2) {
			return filename;
		}
		if (filename.startsWith("\"") && filename.endsWith("\"")
				|| filename.startsWith("'") && filename.endsWith("'")) {
			return filename.substring(1, filename.length() - 1);
		}
		return filename;
	}
}
