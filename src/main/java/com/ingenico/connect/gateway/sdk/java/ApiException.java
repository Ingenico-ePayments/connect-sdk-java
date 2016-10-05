package com.ingenico.connect.gateway.sdk.java;

import java.util.Collections;
import java.util.List;

import com.ingenico.connect.gateway.sdk.java.domain.errors.definitions.APIError;

/**
 * Represents an error response from the GlobalCollect platform which contains an ID and a list of errors.
 */
@SuppressWarnings("serial")
public class ApiException extends RuntimeException {

	private final int statusCode;
	private final String responseBody;
	private final String errorId;
	private final List<APIError> errors;

	public ApiException(int statusCode, String responseBody, String errorId, List<APIError> errors) {
		this("the GlobalCollect platform returned an error response", statusCode, responseBody, errorId, errors);
	}

	public ApiException(String message, int statusCode, String responseBody, String errorId, List<APIError> errors) {
		super(message);
		this.statusCode = statusCode;
		this.responseBody = responseBody;
		this.errorId = errorId;
		this.errors = errors == null ? Collections.<APIError>emptyList() : errors;
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
	public String getResponseBody() {
		return responseBody;
	}

	/**
	 * @return The error ID received from the GlobalCollect platform if available.
	 */
	public String getErrorId() {
		return errorId;
	}

	/**
	 * @return The error list received from the GlobalCollect platform if available. Never {@code null}.
	 */
	public List<APIError> getErrors() {
		return errors;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(super.toString());
		if (statusCode > 0) {
			sb.append("; statusCode=").append(statusCode);
		}
		if (responseBody != null && responseBody.length() > 0) {
			sb.append("; responseBody='").append(responseBody).append("'");
		}
		return sb.toString();
	}
}
