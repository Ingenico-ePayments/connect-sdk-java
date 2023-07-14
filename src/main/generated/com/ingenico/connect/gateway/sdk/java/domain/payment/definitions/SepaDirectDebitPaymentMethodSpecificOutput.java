/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */

package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.FraudResults;

public class SepaDirectDebitPaymentMethodSpecificOutput extends AbstractPaymentMethodSpecificOutput {

	private FraudResults fraudResults = null;

	private PaymentProduct771SpecificOutput paymentProduct771SpecificOutput = null;

	private String token = null;

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
	 * Output that is SEPA Direct Debit specific (i.e. the used mandate)
	 */
	public PaymentProduct771SpecificOutput getPaymentProduct771SpecificOutput() {
		return paymentProduct771SpecificOutput;
	}

	/**
	 * Output that is SEPA Direct Debit specific (i.e. the used mandate)
	 */
	public void setPaymentProduct771SpecificOutput(PaymentProduct771SpecificOutput value) {
		this.paymentProduct771SpecificOutput = value;
	}

	/**
	 * ID of the token. This property is populated for the GlobalCollect payment platform when the payment was done with a token or when the payment was tokenized.
	 */
	public String getToken() {
		return token;
	}

	/**
	 * ID of the token. This property is populated for the GlobalCollect payment platform when the payment was done with a token or when the payment was tokenized.
	 */
	public void setToken(String value) {
		this.token = value;
	}
}
