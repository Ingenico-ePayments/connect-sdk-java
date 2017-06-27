/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payout;

import java.util.List;

import com.ingenico.connect.gateway.sdk.java.domain.errors.definitions.APIError;
import com.ingenico.connect.gateway.sdk.java.domain.payout.definitions.PayoutResult;

public class PayoutErrorResponse {

	private String errorId = null;

	private List<APIError> errors = null;

	private PayoutResult payoutResult = null;

	/**
	 * Unique reference, for debugging purposes, of this error response
	 */
	public String getErrorId() {
		return errorId;
	}

	/**
	 * Unique reference, for debugging purposes, of this error response
	 */
	public void setErrorId(String value) {
		this.errorId = value;
	}

	/**
	 * List of one or more errors
	 */
	public List<APIError> getErrors() {
		return errors;
	}

	/**
	 * List of one or more errors
	 */
	public void setErrors(List<APIError> value) {
		this.errors = value;
	}

	/**
	 * Object that contains details on the created payout in case one has been created
	 */
	public PayoutResult getPayoutResult() {
		return payoutResult;
	}

	/**
	 * Object that contains details on the created payout in case one has been created
	 */
	public void setPayoutResult(PayoutResult value) {
		this.payoutResult = value;
	}
}
