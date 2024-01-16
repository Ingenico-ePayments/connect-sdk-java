/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/
 */

package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.AbstractPaymentMethodSpecificInput;

public class InvoicePaymentMethodSpecificInput extends AbstractPaymentMethodSpecificInput {

	private String additionalReference = null;

	/**
	 * Your (additional) reference identifier for this transaction. Data supplied in this property will also be returned in our report files, allowing you to reconcile the incoming funds.
	 */
	public String getAdditionalReference() {
		return additionalReference;
	}

	/**
	 * Your (additional) reference identifier for this transaction. Data supplied in this property will also be returned in our report files, allowing you to reconcile the incoming funds.
	 */
	public void setAdditionalReference(String value) {
		this.additionalReference = value;
	}
}
