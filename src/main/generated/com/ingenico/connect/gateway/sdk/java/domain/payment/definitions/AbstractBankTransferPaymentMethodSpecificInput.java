/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/
 */

package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.AbstractPaymentMethodSpecificInput;

public class AbstractBankTransferPaymentMethodSpecificInput extends AbstractPaymentMethodSpecificInput {

	private String additionalReference = null;

	public String getAdditionalReference() {
		return additionalReference;
	}

	public void setAdditionalReference(String value) {
		this.additionalReference = value;
	}
}
