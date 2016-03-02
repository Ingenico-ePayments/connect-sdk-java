package com.globalcollect.gateway.sdk.java;

import java.util.List;

import com.globalcollect.gateway.sdk.java.gc.errors.definitions.APIError;

/**
 * Represents an error response from the GlobalCollect platform when a non-existing or removed object is trying to be accessed.
 */
@SuppressWarnings("serial")
public class GcReferenceException extends GcApiException {

	public GcReferenceException(int statusCode, String responseBody, String errorId, List<APIError> errors) {
		super("the GlobalCollect platform returned a reference error response", statusCode, responseBody, errorId, errors);
	}

	public GcReferenceException(String message, int statusCode, String responseBody, String errorId, List<APIError> errors) {
		super(message, statusCode, responseBody, errorId, errors);
	}
}
