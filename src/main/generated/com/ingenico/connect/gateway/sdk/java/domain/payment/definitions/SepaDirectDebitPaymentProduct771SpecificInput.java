/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.mandates.definitions.CreateMandateBase;

/**
 * Object containing information specific to SEPA Direct Debit
 */
public class SepaDirectDebitPaymentProduct771SpecificInput {

	private CreateMandateBase mandate = null;

	private String mandateReference = null;

	/**
	 * Object containing informatin to create a SEPA Direct Debit mandate. Required for creating HostedCheckouts
	 */
	public CreateMandateBase getMandate() {
		return mandate;
	}

	/**
	 * Object containing informatin to create a SEPA Direct Debit mandate. Required for creating HostedCheckouts
	 */
	public void setMandate(CreateMandateBase value) {
		this.mandate = value;
	}

	/**
	 * A mandate ID to create a mandate under iff the information to create a mandate has been supplied. Otherwise refers to the mandate to retrieve and use in the payment.
	 */
	public String getMandateReference() {
		return mandateReference;
	}

	/**
	 * A mandate ID to create a mandate under iff the information to create a mandate has been supplied. Otherwise refers to the mandate to retrieve and use in the payment.
	 */
	public void setMandateReference(String value) {
		this.mandateReference = value;
	}
}
