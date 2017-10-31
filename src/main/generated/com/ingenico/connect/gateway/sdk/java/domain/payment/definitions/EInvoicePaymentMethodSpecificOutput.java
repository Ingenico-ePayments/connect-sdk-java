/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

/**
 * E-invoice payment specific response data
 */
public class EInvoicePaymentMethodSpecificOutput extends AbstractPaymentMethodSpecificOutput {

	private EInvoicePaymentProduct9000SpecificOutput paymentProduct9000SpecificOutput = null;

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
