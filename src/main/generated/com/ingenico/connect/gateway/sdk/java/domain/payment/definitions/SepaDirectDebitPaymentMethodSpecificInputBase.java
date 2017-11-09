/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.AbstractPaymentMethodSpecificInput;

public class SepaDirectDebitPaymentMethodSpecificInputBase extends AbstractPaymentMethodSpecificInput {

	private SepaDirectDebitPaymentProduct771SpecificInput paymentProduct771SpecificInput = null;

	/**
	 * Object containing information specific to SEPA Direct Debit
	 */
	public SepaDirectDebitPaymentProduct771SpecificInput getPaymentProduct771SpecificInput() {
		return paymentProduct771SpecificInput;
	}

	/**
	 * Object containing information specific to SEPA Direct Debit
	 */
	public void setPaymentProduct771SpecificInput(SepaDirectDebitPaymentProduct771SpecificInput value) {
		this.paymentProduct771SpecificInput = value;
	}
}
