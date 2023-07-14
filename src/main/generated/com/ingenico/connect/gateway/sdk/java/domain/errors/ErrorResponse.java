/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */

package com.ingenico.connect.gateway.sdk.java.domain.errors;

import java.util.List;

import com.ingenico.connect.gateway.sdk.java.domain.errors.definitions.APIError;

public class ErrorResponse {

	private String errorId = null;

	private List<APIError> errors = null;

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
}
