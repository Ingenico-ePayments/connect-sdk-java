/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.capture.definitions;

public class CaptureStatusOutput {

	private Integer statusCode = null;

	/**
	 * Numeric status code that is returned by either Ingenico's Global Collect Payment Platform or Ingenico's Ogone Payment Platform. It is returned to ease the migration from the local APIs to Ingenico Connect. You should not write new business logic based on this field as it will be deprecated in a future version of the API. The value can also be found in the Global Collect Payment Console, in the Global Collect report files and the Ogone BackOffice and report files.
	 */
	public Integer getStatusCode() {
		return statusCode;
	}

	/**
	 * Numeric status code that is returned by either Ingenico's Global Collect Payment Platform or Ingenico's Ogone Payment Platform. It is returned to ease the migration from the local APIs to Ingenico Connect. You should not write new business logic based on this field as it will be deprecated in a future version of the API. The value can also be found in the Global Collect Payment Console, in the Global Collect report files and the Ogone BackOffice and report files.
	 */
	public void setStatusCode(Integer value) {
		this.statusCode = value;
	}
}
