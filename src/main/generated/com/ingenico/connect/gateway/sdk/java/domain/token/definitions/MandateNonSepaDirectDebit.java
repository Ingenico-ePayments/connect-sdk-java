/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.token.definitions;

public class MandateNonSepaDirectDebit {

	private TokenNonSepaDirectDebitPaymentProduct705SpecificData paymentProduct705SpecificData = null;

	private TokenNonSepaDirectDebitPaymentProduct730SpecificData paymentProduct730SpecificData = null;

	/**
	 * Object containing specific data for Direct Debit UK
	 */
	public TokenNonSepaDirectDebitPaymentProduct705SpecificData getPaymentProduct705SpecificData() {
		return paymentProduct705SpecificData;
	}

	/**
	 * Object containing specific data for Direct Debit UK
	 */
	public void setPaymentProduct705SpecificData(TokenNonSepaDirectDebitPaymentProduct705SpecificData value) {
		this.paymentProduct705SpecificData = value;
	}

	/**
	 * Object containing specific data for ACH
	 */
	public TokenNonSepaDirectDebitPaymentProduct730SpecificData getPaymentProduct730SpecificData() {
		return paymentProduct730SpecificData;
	}

	/**
	 * Object containing specific data for ACH
	 */
	public void setPaymentProduct730SpecificData(TokenNonSepaDirectDebitPaymentProduct730SpecificData value) {
		this.paymentProduct730SpecificData = value;
	}
}
