package com.globalcollect.gateway.sdk.java;

/**
 * Thrown when a response was received from the GlobalCollect platform which indicates an error.
 */
@SuppressWarnings("serial")
public class GcResponseException extends RuntimeException {

	private final int statusCode;
	private final String body;

	public GcResponseException(int statusCode, String body) {
		super("the GlobalCollect platform returned an error response");
		this.statusCode = statusCode;
		this.body = body;
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
}
