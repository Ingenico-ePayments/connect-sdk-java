/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */

package com.ingenico.connect.gateway.sdk.java.domain.services.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.BankAccountBban;
import com.ingenico.connect.gateway.sdk.java.domain.definitions.BankAccountIban;

public class BankDetails {

	private BankAccountBban bankAccountBban = null;

	private BankAccountIban bankAccountIban = null;

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
	 * Object that holds the International Bank Account Number (IBAN) data
	 */
	public BankAccountIban getBankAccountIban() {
		return bankAccountIban;
	}

	/**
	 * Object that holds the International Bank Account Number (IBAN) data
	 */
	public void setBankAccountIban(BankAccountIban value) {
		this.bankAccountIban = value;
	}
}
