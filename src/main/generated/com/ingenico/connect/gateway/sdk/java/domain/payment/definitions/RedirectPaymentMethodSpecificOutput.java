/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.BankAccountIban;
import com.ingenico.connect.gateway.sdk.java.domain.definitions.FraudResults;

public class RedirectPaymentMethodSpecificOutput extends AbstractPaymentMethodSpecificOutput {

	private BankAccountIban bankAccountIban = null;

	private FraudResults fraudResults = null;

	private PaymentProduct836SpecificOutput paymentProduct836SpecificOutput = null;

	private PaymentProduct840SpecificOutput paymentProduct840SpecificOutput = null;

	private String token = null;

	/**
	 * Object containing account holder name and IBAN information
	 */
	public BankAccountIban getBankAccountIban() {
		return bankAccountIban;
	}

	/**
	 * Object containing account holder name and IBAN information
	 */
	public void setBankAccountIban(BankAccountIban value) {
		this.bankAccountIban = value;
	}

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
	 * Sofort (payment product 836) specific details
	 */
	public PaymentProduct836SpecificOutput getPaymentProduct836SpecificOutput() {
		return paymentProduct836SpecificOutput;
	}

	/**
	 * Sofort (payment product 836) specific details
	 */
	public void setPaymentProduct836SpecificOutput(PaymentProduct836SpecificOutput value) {
		this.paymentProduct836SpecificOutput = value;
	}

	/**
	 * PayPal (payment product 840) specific details
	 */
	public PaymentProduct840SpecificOutput getPaymentProduct840SpecificOutput() {
		return paymentProduct840SpecificOutput;
	}

	/**
	 * PayPal (payment product 840) specific details
	 */
	public void setPaymentProduct840SpecificOutput(PaymentProduct840SpecificOutput value) {
		this.paymentProduct840SpecificOutput = value;
	}

	/**
	 * ID of the token. This property is populated for the Ogone payment platform when the payment was done with a token or when the payment was tokenized.
	 */
	public String getToken() {
		return token;
	}

	/**
	 * ID of the token. This property is populated for the Ogone payment platform when the payment was done with a token or when the payment was tokenized.
	 */
	public void setToken(String value) {
		this.token = value;
	}
}
