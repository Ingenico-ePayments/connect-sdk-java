/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/
 */

package com.ingenico.connect.gateway.sdk.java.domain.errors.definitions;

public class APIError {

	private String category = null;

	private String code = null;

	private Integer httpStatusCode = null;

	private String id = null;

	private String message = null;

	private String propertyName = null;

	private String requestId = null;

	/**
	 * Category the error belongs to. The category should give an indication of the type of error you are dealing with.
	 * 
	 * Possible values:
	 * <ul class="paragraph-width"><li>CONNECT_PLATFORM_ERROR - indicating that a functional error has occurred in the Connect platform.</li>
	 * <li>PAYMENT_PLATFORM_ERROR - indicating that a functional error has occurred in the Payment platform.</li>
	 * <li>IO_ERROR - indicating that a technical error has occurred within the Connect platform or between Connect and any of the payment platforms or third party systems.</li></ul>
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * Category the error belongs to. The category should give an indication of the type of error you are dealing with.
	 * 
	 * Possible values:
	 * <ul class="paragraph-width"><li>CONNECT_PLATFORM_ERROR - indicating that a functional error has occurred in the Connect platform.</li>
	 * <li>PAYMENT_PLATFORM_ERROR - indicating that a functional error has occurred in the Payment platform.</li>
	 * <li>IO_ERROR - indicating that a technical error has occurred within the Connect platform or between Connect and any of the payment platforms or third party systems.</li></ul>
	 */
	public void setCategory(String value) {
		this.category = value;
	}

	/**
	 * Error code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * Error code
	 */
	public void setCode(String value) {
		this.code = value;
	}

	/**
	 * HTTP status code for this error that can be used to determine the type of error
	 */
	public Integer getHttpStatusCode() {
		return httpStatusCode;
	}

	/**
	 * HTTP status code for this error that can be used to determine the type of error
	 */
	public void setHttpStatusCode(Integer value) {
		this.httpStatusCode = value;
	}

	/**
	 * ID of the error. This is a short human-readable message that briefly describes the error.
	 */
	public String getId() {
		return id;
	}

	/**
	 * ID of the error. This is a short human-readable message that briefly describes the error.
	 */
	public void setId(String value) {
		this.id = value;
	}

	/**
	 * Human-readable error message that is not meant to be relayed to customer as it might tip off people who are trying to commit fraud
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * Human-readable error message that is not meant to be relayed to customer as it might tip off people who are trying to commit fraud
	 */
	public void setMessage(String value) {
		this.message = value;
	}

	/**
	 * Returned only if the error relates to a value that was missing or incorrect.<br>
	 * Contains a location path to the value as a <a href="http://docs.jsonata.org/basic.html">JSonata query</a>.<br>
	 * Some common examples:
	 * <ul class="paragraph-width"><li>a.b selects the value of property b of root property a,</li>
	 * <li>a[1] selects the first element of the array in root property a,</li>
	 * <li>a[b='some value'] selects all elements of the array in root property a that have a property b with value 'some value'.</li></ul>
	 */
	public String getPropertyName() {
		return propertyName;
	}

	/**
	 * Returned only if the error relates to a value that was missing or incorrect.<br>
	 * Contains a location path to the value as a <a href="http://docs.jsonata.org/basic.html">JSonata query</a>.<br>
	 * Some common examples:
	 * <ul class="paragraph-width"><li>a.b selects the value of property b of root property a,</li>
	 * <li>a[1] selects the first element of the array in root property a,</li>
	 * <li>a[b='some value'] selects all elements of the array in root property a that have a property b with value 'some value'.</li></ul>
	 */
	public void setPropertyName(String value) {
		this.propertyName = value;
	}

	/**
	 * ID of the request that can be used for debugging purposes
	 */
	public String getRequestId() {
		return requestId;
	}

	/**
	 * ID of the request that can be used for debugging purposes
	 */
	public void setRequestId(String value) {
		this.requestId = value;
	}
}
