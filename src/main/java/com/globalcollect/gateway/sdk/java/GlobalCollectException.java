package com.globalcollect.gateway.sdk.java;

import java.util.List;

import com.globalcollect.gateway.sdk.java.gc.errors.definitions.APIError;

/**
 * Represents an error response from the GlobalCollect platform when something went wrong at the GlobalCollect platform or further downstream.
 */
@SuppressWarnings("serial")
public class GlobalCollectException extends GcApiException {

	public GlobalCollectException(int statusCode, String responseBody, String errorId, List<APIError> errors) {
		super("the GlobalCollect platform returned an error response", statusCode, responseBody, errorId, errors);
	}

	public GlobalCollectException(String message, int statusCode, String responseBody, String errorId, List<APIError> errors) {
		super(message, statusCode, responseBody, errorId, errors);
	}
}
