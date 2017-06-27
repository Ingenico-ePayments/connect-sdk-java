/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

/**
 * Please find below specific input fields for payment product 320 (Android Pay)
 */
public class MobilePaymentProduct320SpecificInput {

	private String keyId = null;

	/**
	 * The identifier of the public key that is used to create the vendor's encrypted payment data
	 */
	public String getKeyId() {
		return keyId;
	}

	/**
	 * The identifier of the public key that is used to create the vendor's encrypted payment data
	 */
	public void setKeyId(String value) {
		this.keyId = value;
	}
}
