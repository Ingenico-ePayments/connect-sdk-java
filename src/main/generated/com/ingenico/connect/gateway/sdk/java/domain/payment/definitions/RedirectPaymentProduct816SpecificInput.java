/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.BankAccountIban;

/**
 * Please find below specific input fields for payment product 816 (giropay)
 */
public class RedirectPaymentProduct816SpecificInput {

	private BankAccountIban bankAccountIban = null;

	/**
	 * Object containing the bank account details of the customer
	 */
	public BankAccountIban getBankAccountIban() {
		return bankAccountIban;
	}

	/**
	 * Object containing the bank account details of the customer
	 */
	public void setBankAccountIban(BankAccountIban value) {
		this.bankAccountIban = value;
	}
}
