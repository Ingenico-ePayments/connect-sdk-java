package com.globalcollect.gateway.sdk.java;

/**
 * Thrown when a response was received from GlobalCollect which indicates an error.
 */
@SuppressWarnings("serial")
public class GcResponseException extends RuntimeException {

	private final int statusCode;
	private final String body;

	public GcResponseException(int statusCode, String body) {
		super("GlobalCollect returned an error response");
		this.statusCode = statusCode;
		this.body = body;
	}

	/**
	 * @return The HTTP status code that was returned by GlobalCollect.
	 */
	public int getStatusCode() {
		return statusCode;
	}

	/**
	 * @return The raw response body that was returned by GlobalCollect.
	 */
	public String getBody() {
		return body;
	}

}
