package com.globalcollect.gateway.sdk.java;

import java.util.List;

import com.globalcollect.gateway.sdk.java.gc.errors.definitions.APIError;

/**
 * Represents an error response from GlobalCollect when validation of requests failed.
 */
@SuppressWarnings("serial")
public class GcValidationException extends GcApiException {

	public GcValidationException(int statusCode, String responseBody, String errorId, List<APIError> errors) {
		super("GlobalCollect returned an incorrect request error response", statusCode, responseBody, errorId, errors);
	}

	public GcValidationException(String message, int statusCode, String responseBody, String errorId, List<APIError> errors) {
		super(message, statusCode, responseBody, errorId, errors);
	}
	
}
