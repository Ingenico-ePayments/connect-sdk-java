/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */

package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.BankAccountBban;
import com.ingenico.connect.gateway.sdk.java.domain.definitions.BankAccountIban;
import com.ingenico.connect.gateway.sdk.java.domain.definitions.FraudResults;

public class RedirectPaymentMethodSpecificOutput extends AbstractPaymentMethodSpecificOutput {

	private BankAccountBban bankAccountBban = null;

	private BankAccountIban bankAccountIban = null;

	private String bic = null;

	private FraudResults fraudResults = null;

	private PaymentProduct3201SpecificOutput paymentProduct3201SpecificOutput = null;

	private PaymentProduct806SpecificOutput paymentProduct806SpecificOutput = null;

	private PaymentProduct836SpecificOutput paymentProduct836SpecificOutput = null;

	private PaymentProduct840SpecificOutput paymentProduct840SpecificOutput = null;

	private String token = null;

	/**
	 * Object that holds the Basic Bank Account Number (BBAN) data
	 */
	public BankAccountBban getBankAccountBban() {
		return bankAccountBban;
	}

	/**
	 * Object that holds the Basic Bank Account Number (BBAN) data
	 */
	public void setBankAccountBban(BankAccountBban value) {
		this.bankAccountBban = value;
	}

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
	 * The BIC is the Business Identifier Code, also known as SWIFT or Bank Identifier code. It is a code with an internationally agreed format to Identify a specific bank or even branch. The BIC contains 8 or 11 positions: the first 4 contain the bank code, followed by the country code and location code.
	 */
	public String getBic() {
		return bic;
	}

	/**
	 * The BIC is the Business Identifier Code, also known as SWIFT or Bank Identifier code. It is a code with an internationally agreed format to Identify a specific bank or even branch. The BIC contains 8 or 11 positions: the first 4 contain the bank code, followed by the country code and location code.
	 */
	public void setBic(String value) {
		this.bic = value;
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
	 * PostFinance Card (payment product 3201) specific details
	 */
	public PaymentProduct3201SpecificOutput getPaymentProduct3201SpecificOutput() {
		return paymentProduct3201SpecificOutput;
	}

	/**
	 * PostFinance Card (payment product 3201) specific details
	 */
	public void setPaymentProduct3201SpecificOutput(PaymentProduct3201SpecificOutput value) {
		this.paymentProduct3201SpecificOutput = value;
	}

	/**
	 * Trustly (payment product 806) specific details
	 */
	public PaymentProduct806SpecificOutput getPaymentProduct806SpecificOutput() {
		return paymentProduct806SpecificOutput;
	}

	/**
	 * Trustly (payment product 806) specific details
	 */
	public void setPaymentProduct806SpecificOutput(PaymentProduct806SpecificOutput value) {
		this.paymentProduct806SpecificOutput = value;
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
	 * ID of the token. This property is populated when the payment was done with a token or when the payment was tokenized.
	 */
	public String getToken() {
		return token;
	}

	/**
	 * ID of the token. This property is populated when the payment was done with a token or when the payment was tokenized.
	 */
	public void setToken(String value) {
		this.token = value;
	}
}
