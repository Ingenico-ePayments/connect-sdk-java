/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/
 */

package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

public class SdkDataOutput {

	private String sdkTransactionId = null;

	/**
	 * Universally unique transaction identifier assigned by the 3-D Secure SDK to identify this transaction.
	 */
	public String getSdkTransactionId() {
		return sdkTransactionId;
	}

	/**
	 * Universally unique transaction identifier assigned by the 3-D Secure SDK to identify this transaction.
	 */
	public void setSdkTransactionId(String value) {
		this.sdkTransactionId = value;
	}
}
