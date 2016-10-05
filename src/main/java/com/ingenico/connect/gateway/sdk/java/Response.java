package com.ingenico.connect.gateway.sdk.java;

import java.util.Collections;
import java.util.List;

/**
 * A response from the GlobalCollect platform.
 */
public class Response {

	private final int statusCode;
	private final String body;
	private final List<ResponseHeader> headers;

	public Response(int statusCode, String body, List<ResponseHeader> headers) {
		this.statusCode = statusCode;
		this.body = body;
		this.headers = headers != null ? Collections.unmodifiableList(headers) : Collections.<ResponseHeader>emptyList();
	}

	/**
	 * @return The HTTP status code that was returned by the GlobalCollect platform.
	 */
	public int getStatusCode() {
		return statusCode;
	}

	/**
	 * @return The raw response body that was returned by the GlobalCollect platform.
	 */
	public String getBody() {
		return body;
	}

	/**
	 * @return The headers that were returned by the GlobalCollect platform. Never {@code null}.
	 */
	public List<ResponseHeader> getHeaders() {
		return headers;
	}

	/**
	 * @return The header with the given name, or {@code null} if there was no such header.
	 */
	public ResponseHeader getHeader(String headerName) {
		for (ResponseHeader header : headers) {
			if (header.getName().equalsIgnoreCase(headerName)) {
				return header;
			}
		}
		return null;
	}

	/**
	 * @return The value of the header with the given name, or {@code null} if there was no such header.
	 */
	public String getHeaderValue(String headerName) {
		ResponseHeader header = getHeader(headerName);
		return header != null ? header.getValue() : null;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(getClass().getName())
				.append("[statusCode=").append(statusCode);
		if (body != null && body.length() > 0) {
			sb.append(",body='").append(body).append("'");
		}
		if (!headers.isEmpty()) {
			sb.append(",headers=").append(headers);
		}
		return sb.append("]").toString();
	}
}
