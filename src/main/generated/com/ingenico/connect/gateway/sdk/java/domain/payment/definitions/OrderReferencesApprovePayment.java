/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/
 */

package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

public class OrderReferencesApprovePayment {

	private String merchantReference = null;

	/**
	 * Your (unique) reference for the transaction that you can use to reconcile our report files
	 */
	public String getMerchantReference() {
		return merchantReference;
	}

	/**
	 * Your (unique) reference for the transaction that you can use to reconcile our report files
	 */
	public void setMerchantReference(String value) {
		this.merchantReference = value;
	}
}
