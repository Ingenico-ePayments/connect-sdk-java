/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */

package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

public class RefundEWalletMethodSpecificOutput extends RefundMethodSpecificOutput {

	private RefundPaymentProduct840SpecificOutput paymentProduct840SpecificOutput = null;

	/**
	 * PayPal (payment product 840) specific details
	 */
	public RefundPaymentProduct840SpecificOutput getPaymentProduct840SpecificOutput() {
		return paymentProduct840SpecificOutput;
	}

	/**
	 * PayPal (payment product 840) specific details
	 */
	public void setPaymentProduct840SpecificOutput(RefundPaymentProduct840SpecificOutput value) {
		this.paymentProduct840SpecificOutput = value;
	}
}
