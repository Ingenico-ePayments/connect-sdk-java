/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.definitions;

public class FraudFieldsShippingDetails {

	private String methodDetails = null;

	private Integer methodSpeed = null;

	private Integer methodType = null;

	/**
	 * Details regarding the shipping method
	 */
	public String getMethodDetails() {
		return methodDetails;
	}

	/**
	 * Details regarding the shipping method
	 */
	public void setMethodDetails(String value) {
		this.methodDetails = value;
	}

	/**
	 * Shipping method speed indicator
	 */
	public Integer getMethodSpeed() {
		return methodSpeed;
	}

	/**
	 * Shipping method speed indicator
	 */
	public void setMethodSpeed(Integer value) {
		this.methodSpeed = value;
	}

	/**
	 * Shipping method type indicator
	 */
	public Integer getMethodType() {
		return methodType;
	}

	/**
	 * Shipping method type indicator
	 */
	public void setMethodType(Integer value) {
		this.methodType = value;
	}
}
