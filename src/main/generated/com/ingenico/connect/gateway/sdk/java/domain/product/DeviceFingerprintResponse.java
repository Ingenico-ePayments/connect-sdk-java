/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.product;

public class DeviceFingerprintResponse {

	private String deviceFingerprintTransactionId = null;

	private String html = null;

	/**
	 * Contains the unique id which is used by the device fingerprint collector script.
	 * This will must be set in the <span class="property">CreatePayment</span>'s property <span class="property">fraudFields.deviceFingerprintTransactionId</span>.
	 */
	public String getDeviceFingerprintTransactionId() {
		return deviceFingerprintTransactionId;
	}

	/**
	 * Contains the unique id which is used by the device fingerprint collector script.
	 * This will must be set in the <span class="property">CreatePayment</span>'s property <span class="property">fraudFields.deviceFingerprintTransactionId</span>.
	 */
	public void setDeviceFingerprintTransactionId(String value) {
		this.deviceFingerprintTransactionId = value;
	}

	/**
	 * Contains the ready-to-use device fingerprint collector script. You have to inject it into your code to get it run.
	 */
	public String getHtml() {
		return html;
	}

	/**
	 * Contains the ready-to-use device fingerprint collector script. You have to inject it into your code to get it run.
	 */
	public void setHtml(String value) {
		this.html = value;
	}
}
