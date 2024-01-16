/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/
 */

package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.mandates.definitions.CreateMandateBase;

/**
 * Object containing information specific to SEPA Direct Debit for Hosted Checkouts.
 */
public class SepaDirectDebitPaymentProduct771SpecificInputBase extends AbstractSepaDirectDebitPaymentProduct771SpecificInput {

	private String existingUniqueMandateReference = null;

	private CreateMandateBase mandate = null;

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
	public CreateMandateBase getMandate() {
		return mandate;
	}

	/**
	 * Object containing information to create a SEPA Direct Debit mandate.
	 */
	public void setMandate(CreateMandateBase value) {
		this.mandate = value;
	}
}
