package com.globalcollect.gateway.sdk.java;

import java.util.List;

import com.globalcollect.gateway.sdk.java.gc.errors.definitions.APIError;

/**
 * Represents an error response from the GlobalCollect platform when authorization failed.
 */
@SuppressWarnings("serial")
public class GcAuthorizationException extends GcApiException {

	public GcAuthorizationException(int statusCode, String responseBody, String errorId, List<APIError> errors) {
		super("the GlobalCollect platform returned an authorization error response", statusCode, responseBody, errorId, errors);
	}

	public GcAuthorizationException(String message, int statusCode, String responseBody, String errorId, List<APIError> errors) {
		super(message, statusCode, responseBody, errorId, errors);
	}
}
