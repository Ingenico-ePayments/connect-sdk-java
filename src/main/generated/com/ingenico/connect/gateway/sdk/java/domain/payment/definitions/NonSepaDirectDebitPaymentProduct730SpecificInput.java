/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.BankAccountBban;

/**
 * ACH specific input fields
 */
public class NonSepaDirectDebitPaymentProduct730SpecificInput {

	private BankAccountBban bankAccountBban = null;

	/**
	 * Object containing account holder name and bank account information
	 */
	public BankAccountBban getBankAccountBban() {
		return bankAccountBban;
	}

	/**
	 * Object containing account holder name and bank account information
	 */
	public void setBankAccountBban(BankAccountBban value) {
		this.bankAccountBban = value;
	}
}
