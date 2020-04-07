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

	public String getAccountLastDigits() {
		return accountLastDigits;
	}

	public void setAccountLastDigits(String value) {
		this.accountLastDigits = value;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String value) {
		this.bankName = value;
	}

	public String getClearinghouse() {
		return clearinghouse;
	}

	public void setClearinghouse(String value) {
		this.clearinghouse = value;
	}

	public String getPersonIdentificationNumber() {
		return personIdentificationNumber;
	}

	public void setPersonIdentificationNumber(String value) {
		this.personIdentificationNumber = value;
	}
}
