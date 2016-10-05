package com.ingenico.connect.gateway.sdk.java;

import java.util.List;

import com.ingenico.connect.gateway.sdk.java.domain.errors.definitions.APIError;

/**
 * Represents an error response from a create payment, payout or refund call.
 */
@SuppressWarnings("serial")
public abstract class DeclinedTransactionException extends ApiException {

	public DeclinedTransactionException(int statusCode, String responseBody, String errorId, List<APIError> errors) {
		super(statusCode, responseBody, errorId, errors);
	}

	public DeclinedTransactionException(String message, int statusCode, String responseBody, String errorId, List<APIError> errors) {
		super(message, statusCode, responseBody, errorId, errors);
	}
}
