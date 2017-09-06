package com.ingenico.connect.gateway.sdk.java;

import java.util.List;

/**
 * Thrown when a response was received from the Ingenico ePayments platform which indicates an error.
 */
@SuppressWarnings("serial")
public class ResponseException extends RuntimeException {

	private final Response response;

	public ResponseException(Response response) {
		super("the Ingenico ePayments platform returned an error response");
		this.response = response;
	}

	/**
	 * @return The response that was returned by the Ingenico ePayments platform.
	 */
	public Response getResponse() {
		return response;
	}

	/**
	 * @return The HTTP status code that was returned by the Ingenico ePayments platform.
	 */
	public int getStatusCode() {
		return response.getStatusCode();
	}

	/**
	 * @return The raw response body that was returned by the Ingenico ePayments platform.
	 */
	public String getBody() {
		return response.getBody();
	}

	/**
	 * @return The headers that were returned by the Ingenico ePayments platform. Never {@code null}.
	 */
	public List<ResponseHeader> getHeaders() {
		return response.getHeaders();
	}

	/**
	 * @return The header with the given name, or {@code null} if there was no such header.
	 */
	public ResponseHeader getHeader(String headerName) {
		return response.getHeader(headerName);
	}

	/**
	 * @return The value of the header with the given name, or {@code null} if there was no such header.
	 */
	public String getHeaderValue(String headerName) {
		return response.getHeaderValue(headerName);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(super.toString());
		int statusCode = response.getStatusCode();
		if (statusCode > 0) {
			sb.append("; statusCode=").append(statusCode);
		}
		String responseBody = response.getBody();
		if (responseBody != null && responseBody.length() > 0) {
			sb.append("; responseBody='").append(responseBody).append("'");
		}
		return sb.toString();
	}
}
