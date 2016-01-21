package com.globalcollect.gateway.sdk.java.gc.payment.definitions;

import com.globalcollect.gateway.sdk.java.gc.fei.definitions.AbstractPaymentMethodSpecificInput;

public class InvoicePaymentMethodSpecificInput extends AbstractPaymentMethodSpecificInput {

	private String additionalReference = null;

	public String getAdditionalReference() {
		return additionalReference;
	}

	public void setAdditionalReference(String value) {
		this.additionalReference = value;
	}
}
