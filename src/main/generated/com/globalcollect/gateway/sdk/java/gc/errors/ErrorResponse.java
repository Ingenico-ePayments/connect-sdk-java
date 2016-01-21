package com.globalcollect.gateway.sdk.java.gc.errors;

import com.globalcollect.gateway.sdk.java.gc.errors.definitions.APIError;
import java.util.List;

/**
 * class ErrorResponse
 */
public class ErrorResponse {

	private String errorId = null;

	private List<APIError> errors = null;

	public String getErrorId() {
		return errorId;
	}

	public void setErrorId(String value) {
		this.errorId = value;
	}

	public List<APIError> getErrors() {
		return errors;
	}

	public void setErrors(List<APIError> value) {
		this.errors = value;
	}
}
