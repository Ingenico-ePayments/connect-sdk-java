/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/
 */

package com.ingenico.connect.gateway.sdk.java.domain.token.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.BankAccountBban;

public class TokenNonSepaDirectDebitPaymentProduct705SpecificData {

	private String authorisationId = null;

	private BankAccountBban bankAccountBban = null;

	/**
	 * Core reference number for the direct debit instruction in UK
	 */
	public String getAuthorisationId() {
		return authorisationId;
	}

	/**
	 * Core reference number for the direct debit instruction in UK
	 */
	public void setAuthorisationId(String value) {
		this.authorisationId = value;
	}

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
