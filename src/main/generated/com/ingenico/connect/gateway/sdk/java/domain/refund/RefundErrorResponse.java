/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/
 */

package com.ingenico.connect.gateway.sdk.java.domain.refund;

import java.util.List;

import com.ingenico.connect.gateway.sdk.java.domain.errors.definitions.APIError;
import com.ingenico.connect.gateway.sdk.java.domain.refund.definitions.RefundResult;

public class RefundErrorResponse {

	private String errorId = null;

	private List<APIError> errors = null;

	private RefundResult refundResult = null;

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
	 * Object that contains details on the created refund in case one has been created
	 */
	public RefundResult getRefundResult() {
		return refundResult;
	}

	/**
	 * Object that contains details on the created refund in case one has been created
	 */
	public void setRefundResult(RefundResult value) {
		this.refundResult = value;
	}
}
