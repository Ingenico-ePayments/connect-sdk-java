/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.definitions;

public class BankAccountIban extends BankAccount {

	private String iban = null;

	/**
	 * The IBAN is the International Bank Account Number. It is an internationally agreed format for the BBAN and includes the ISO country code and two check digits.
	 */
	public String getIban() {
		return iban;
	}

	/**
	 * The IBAN is the International Bank Account Number. It is an internationally agreed format for the BBAN and includes the ISO country code and two check digits.
	 */
	public void setIban(String value) {
		this.iban = value;
	}
}
