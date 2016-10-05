package com.ingenico.connect.gateway.sdk.java;

import java.util.List;

import com.ingenico.connect.gateway.sdk.java.domain.errors.definitions.APIError;

/**
 * Represents an error response from the GlobalCollect platform when authorization failed.
 */
@SuppressWarnings("serial")
public class AuthorizationException extends ApiException {

	public AuthorizationException(int statusCode, String responseBody, String errorId, List<APIError> errors) {
		super("the GlobalCollect platform returned an authorization error response", statusCode, responseBody, errorId, errors);
	}

	public AuthorizationException(String message, int statusCode, String responseBody, String errorId, List<APIError> errors) {
		super(message, statusCode, responseBody, errorId, errors);
	}
}
