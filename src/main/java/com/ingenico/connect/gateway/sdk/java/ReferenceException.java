package com.ingenico.connect.gateway.sdk.java;

import java.util.List;

import com.ingenico.connect.gateway.sdk.java.domain.errors.definitions.APIError;

/**
 * Represents an error response from the Ingenico ePayments platform when a non-existing or removed object is trying to be accessed.
 */
@SuppressWarnings("serial")
public class ReferenceException extends ApiException {

	public ReferenceException(int statusCode, String responseBody, String errorId, List<APIError> errors) {
		super("the Ingenico ePayments platform returned a reference error response", statusCode, responseBody, errorId, errors);
	}

	public ReferenceException(String message, int statusCode, String responseBody, String errorId, List<APIError> errors) {
		super(message, statusCode, responseBody, errorId, errors);
	}
}
