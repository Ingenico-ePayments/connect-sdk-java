/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.AbstractPaymentMethodSpecificInput;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_BankTransferPaymentMethodSpecificInputBase">BankTransferPaymentMethodSpecificInputBase</a>
 */
public class BankTransferPaymentMethodSpecificInputBase extends AbstractPaymentMethodSpecificInput {

	private String additionalReference = null;

	public String getAdditionalReference() {
		return additionalReference;
	}

	public void setAdditionalReference(String value) {
		this.additionalReference = value;
	}
}
