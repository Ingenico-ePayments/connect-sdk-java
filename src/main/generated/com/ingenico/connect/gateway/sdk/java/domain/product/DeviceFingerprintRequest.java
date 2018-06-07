/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.product;

public class DeviceFingerprintRequest {

	private String collectorCallback = null;

	/**
	 * You can supply a JavaScript function call that will be called after the device fingerprint data collecting using the provided JavaScript snippet is finished. This will then be added to the snippet that is returned in the property <span class="property">html</span>.
	 */
	public String getCollectorCallback() {
		return collectorCallback;
	}

	/**
	 * You can supply a JavaScript function call that will be called after the device fingerprint data collecting using the provided JavaScript snippet is finished. This will then be added to the snippet that is returned in the property <span class="property">html</span>.
	 */
	public void setCollectorCallback(String value) {
		this.collectorCallback = value;
	}
}
