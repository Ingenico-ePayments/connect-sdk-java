/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.product;

public class DeviceFingerprintRequest {

	private String collectorCallback = null;

	/**
	 * If this JavaScript function is set, it will be called after the device fingerprint data collecting is finished.
	 */
	public String getCollectorCallback() {
		return collectorCallback;
	}

	/**
	 * If this JavaScript function is set, it will be called after the device fingerprint data collecting is finished.
	 */
	public void setCollectorCallback(String value) {
		this.collectorCallback = value;
	}
}
