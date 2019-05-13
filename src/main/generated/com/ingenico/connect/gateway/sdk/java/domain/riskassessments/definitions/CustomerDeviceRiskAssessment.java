/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.riskassessments.definitions;

/**
 * Object containing information on the device and browser of the customer
 */
public class CustomerDeviceRiskAssessment {

	private String defaultFormFill = null;

	private String deviceFingerprintTransactionId = null;

	/**
	 * Degree of default form fill, with the following possible values:
	 * <ul class="paragraph-width">
	 * <li>automatically - All fields filled automatically
	 * <li>automatically-but-modified - All fields filled automatically, but some fields were modified manually
	 * <li>manually - All fields were entered manually
	 * </ul>
	 */
	public String getDefaultFormFill() {
		return defaultFormFill;
	}

	/**
	 * Degree of default form fill, with the following possible values:
	 * <ul class="paragraph-width">
	 * <li>automatically - All fields filled automatically
	 * <li>automatically-but-modified - All fields filled automatically, but some fields were modified manually
	 * <li>manually - All fields were entered manually
	 * </ul>
	 */
	public void setDefaultFormFill(String value) {
		this.defaultFormFill = value;
	}

	/**
	 * One must set the deviceFingerprintTransactionId received by the response of the endpoint /{merchant}/products/{paymentProductId}/deviceFingerprint
	 */
	public String getDeviceFingerprintTransactionId() {
		return deviceFingerprintTransactionId;
	}

	/**
	 * One must set the deviceFingerprintTransactionId received by the response of the endpoint /{merchant}/products/{paymentProductId}/deviceFingerprint
	 */
	public void setDeviceFingerprintTransactionId(String value) {
		this.deviceFingerprintTransactionId = value;
	}
}
