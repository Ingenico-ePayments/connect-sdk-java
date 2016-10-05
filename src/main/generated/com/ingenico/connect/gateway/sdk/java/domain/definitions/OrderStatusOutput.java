/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.errors.definitions.APIError;
import java.util.List;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_OrderStatusOutput">OrderStatusOutput</a>
 */
public class OrderStatusOutput {

	private List<APIError> errors = null;

	private Boolean isCancellable = null;

	private String statusCategory = null;

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

	public String getStatusCategory() {
		return statusCategory;
	}

	public void setStatusCategory(String value) {
		this.statusCategory = value;
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
