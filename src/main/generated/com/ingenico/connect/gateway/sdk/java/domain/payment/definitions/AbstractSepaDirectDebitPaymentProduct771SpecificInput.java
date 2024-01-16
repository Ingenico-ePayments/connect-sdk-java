/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/
 */

package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

public class AbstractSepaDirectDebitPaymentProduct771SpecificInput {

	private String mandateReference = null;

	/**
	 * @deprecated Use existingUniqueMandateReference or mandate.uniqueMandateReference instead
	 */
	@Deprecated
	public String getMandateReference() {
		return mandateReference;
	}

	/**
	 * @deprecated Use existingUniqueMandateReference or mandate.uniqueMandateReference instead
	 */
	@Deprecated
	public void setMandateReference(String value) {
		this.mandateReference = value;
	}
}
