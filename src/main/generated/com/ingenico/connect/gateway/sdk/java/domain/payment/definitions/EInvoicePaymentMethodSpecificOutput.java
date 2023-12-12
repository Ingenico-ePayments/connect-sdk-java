/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */

package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.FraudResults;

/**
 * E-invoice payment specific response data
 */
public class EInvoicePaymentMethodSpecificOutput extends AbstractPaymentMethodSpecificOutput {

	private FraudResults fraudResults = null;

	private EInvoicePaymentProduct9000SpecificOutput paymentProduct9000SpecificOutput = null;

	/**
	 * Object containing the results of the fraud screening
	 */
	public FraudResults getFraudResults() {
		return fraudResults;
	}

	/**
	 * Object containing the results of the fraud screening
	 */
	public void setFraudResults(FraudResults value) {
		this.fraudResults = value;
	}

	/**
	 * AfterPay Installments (payment product 9000) specific details
	 */
	public EInvoicePaymentProduct9000SpecificOutput getPaymentProduct9000SpecificOutput() {
		return paymentProduct9000SpecificOutput;
	}

	/**
	 * AfterPay Installments (payment product 9000) specific details
	 */
	public void setPaymentProduct9000SpecificOutput(EInvoicePaymentProduct9000SpecificOutput value) {
		this.paymentProduct9000SpecificOutput = value;
	}
}
