package com.globalcollect.gateway.sdk.java.gc.fei.definitions;

import com.globalcollect.gateway.sdk.java.gc.errors.definitions.APIError;
import java.util.List;

public class OrderStatusOutput {

	private List<APIError> errors = null;

	private Boolean isCancellable = null;

	private Integer statusCode = null;

	private String statusCodeChangeDateTime = null;

	public List<APIError> getErrors() {
		return errors;
	}

	public void setErrors(List<APIError> value) {
		this.errors = value;
	}

	public Boolean getIsCancellable() {
		return isCancellable;
	}

	public void setIsCancellable(Boolean value) {
		this.isCancellable = value;
	}

	public Integer getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(Integer value) {
		this.statusCode = value;
	}

	public String getStatusCodeChangeDateTime() {
		return statusCodeChangeDateTime;
	}

	public void setStatusCodeChangeDateTime(String value) {
		this.statusCodeChangeDateTime = value;
	}
}
