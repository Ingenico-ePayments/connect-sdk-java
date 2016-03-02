package com.globalcollect.gateway.sdk.java;

import java.util.List;

import com.globalcollect.gateway.sdk.java.gc.errors.definitions.APIError;

/**
 * Represents an error response from a create payment, payout or refund call.
 */
@SuppressWarnings("serial")
public abstract class GcDeclinedTransactionException extends GcApiException {

	public GcDeclinedTransactionException(int statusCode, String responseBody, String errorId, List<APIError> errors) {
		super(statusCode, responseBody, errorId, errors);
	}

	public GcDeclinedTransactionException(String message, int statusCode, String responseBody, String errorId, List<APIError> errors) {
		super(message, statusCode, responseBody, errorId, errors);
	}
}
