package com.globalcollect.gateway.sdk.java.gc.errors.definitions;


public class APIError {

	private String code = null;

	private String message = null;

	private String propertyName = null;

	private String requestId = null;

	public String getCode() {
		return code;
	}

	public void setCode(String value) {
		this.code = value;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String value) {
		this.message = value;
	}

	public String getPropertyName() {
		return propertyName;
	}

	public void setPropertyName(String value) {
		this.propertyName = value;
	}

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String value) {
		this.requestId = value;
	}
}
