/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

public class PaymentCreationReferences {

	private String additionalReference = null;

	private String externalReference = null;

	/**
	 * The additional reference identifier for this transaction. Data in this property will also be returned in our report files, allowing you to reconcile them.
	 */
	public String getAdditionalReference() {
		return additionalReference;
	}

	/**
	 * The additional reference identifier for this transaction. Data in this property will also be returned in our report files, allowing you to reconcile them.
	 */
	public void setAdditionalReference(String value) {
		this.additionalReference = value;
	}

	/**
	 * The external reference identifier for this transaction. Data in this property will also be returned in our report files, allowing you to reconcile them.
	 */
	public String getExternalReference() {
		return externalReference;
	}

	/**
	 * The external reference identifier for this transaction. Data in this property will also be returned in our report files, allowing you to reconcile them.
	 */
	public void setExternalReference(String value) {
		this.externalReference = value;
	}
}
