/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.mandates.definitions.CreateMandateBase;

/**
 * Object containing information specific to SEPA Direct Debit for Hosted Checkouts.
 */
public class SepaDirectDebitPaymentProduct771SpecificInputBase extends AbstractSepaDirectDebitPaymentProduct771SpecificInput {

	private CreateMandateBase mandate = null;

	/**
	 * Object containing information to create a SEPA Direct Debit mandate. Required for creating HostedCheckouts with SEPA Direct Debit supported.
	 */
	public CreateMandateBase getMandate() {
		return mandate;
	}

	/**
	 * Object containing information to create a SEPA Direct Debit mandate. Required for creating HostedCheckouts with SEPA Direct Debit supported.
	 */
	public void setMandate(CreateMandateBase value) {
		this.mandate = value;
	}
}
