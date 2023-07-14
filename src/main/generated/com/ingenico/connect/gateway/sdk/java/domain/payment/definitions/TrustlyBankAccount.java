/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */

package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

public class TrustlyBankAccount {

	private String accountLastDigits = null;

	private String bankName = null;

	private String clearinghouse = null;

	private String personIdentificationNumber = null;

	/**
	 * The last digits of the account number
	 */
	public String getAccountLastDigits() {
		return accountLastDigits;
	}

	/**
	 * The last digits of the account number
	 */
	public void setAccountLastDigits(String value) {
		this.accountLastDigits = value;
	}

	/**
	 * The name of the bank
	 */
	public String getBankName() {
		return bankName;
	}

	/**
	 * The name of the bank
	 */
	public void setBankName(String value) {
		this.bankName = value;
	}

	/**
	 * The country of the clearing house
	 */
	public String getClearinghouse() {
		return clearinghouse;
	}

	/**
	 * The country of the clearing house
	 */
	public void setClearinghouse(String value) {
		this.clearinghouse = value;
	}

	/**
	 * The ID number of the account holder
	 */
	public String getPersonIdentificationNumber() {
		return personIdentificationNumber;
	}

	/**
	 * The ID number of the account holder
	 */
	public void setPersonIdentificationNumber(String value) {
		this.personIdentificationNumber = value;
	}
}
