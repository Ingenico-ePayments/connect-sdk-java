/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.errors.definitions;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_APIError">APIError</a>
 */
public class APIError {

	private String category = null;

	private String code = null;

	private Integer httpStatusCode = null;

	private String id = null;

	private String message = null;

	private String propertyName = null;

	private String requestId = null;

	public String getCategory() {
		return category;
	}

	public void setCategory(String value) {
		this.category = value;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String value) {
		this.code = value;
	}

	public Integer getHttpStatusCode() {
		return httpStatusCode;
	}

	public void setHttpStatusCode(Integer value) {
		this.httpStatusCode = value;
	}

	public String getId() {
		return id;
	}

	public void setId(String value) {
		this.id = value;
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
