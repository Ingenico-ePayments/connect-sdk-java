/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */

package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.mandates.definitions.CreateMandateWithReturnUrl;

/**
 * Object containing information specific to SEPA Direct Debit for Create Payments.
 */
public class SepaDirectDebitPaymentProduct771SpecificInput extends AbstractSepaDirectDebitPaymentProduct771SpecificInput {

	private String existingUniqueMandateReference = null;

	private CreateMandateWithReturnUrl mandate = null;

	/**
	 * The unique reference of the existing mandate to use in this payment.
	 */
	public String getExistingUniqueMandateReference() {
		return existingUniqueMandateReference;
	}

	/**
	 * The unique reference of the existing mandate to use in this payment.
	 */
	public void setExistingUniqueMandateReference(String value) {
		this.existingUniqueMandateReference = value;
	}

	/**
	 * Object containing information to create a SEPA Direct Debit mandate.
	 */
	public CreateMandateWithReturnUrl getMandate() {
		return mandate;
	}

	/**
	 * Object containing information to create a SEPA Direct Debit mandate.
	 */
	public void setMandate(CreateMandateWithReturnUrl value) {
		this.mandate = value;
	}
}
