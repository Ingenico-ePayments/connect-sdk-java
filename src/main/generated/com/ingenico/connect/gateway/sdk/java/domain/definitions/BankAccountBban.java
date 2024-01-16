/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/
 */

package com.ingenico.connect.gateway.sdk.java.domain.definitions;

public class BankAccountBban extends BankAccount {

	private String accountNumber = null;

	private String bankCode = null;

	private String bankName = null;

	private String branchCode = null;

	private String checkDigit = null;

	private String countryCode = null;

	/**
	 * Bank account number
	 */
	public String getAccountNumber() {
		return accountNumber;
	}

	/**
	 * Bank account number
	 */
	public void setAccountNumber(String value) {
		this.accountNumber = value;
	}

	/**
	 * Bank code
	 */
	public String getBankCode() {
		return bankCode;
	}

	/**
	 * Bank code
	 */
	public void setBankCode(String value) {
		this.bankCode = value;
	}

	/**
	 * Name of the bank
	 */
	public String getBankName() {
		return bankName;
	}

	/**
	 * Name of the bank
	 */
	public void setBankName(String value) {
		this.bankName = value;
	}

	/**
	 * Branch code
	 */
	public String getBranchCode() {
		return branchCode;
	}

	/**
	 * Branch code
	 */
	public void setBranchCode(String value) {
		this.branchCode = value;
	}

	/**
	 * Bank check digit
	 */
	public String getCheckDigit() {
		return checkDigit;
	}

	/**
	 * Bank check digit
	 */
	public void setCheckDigit(String value) {
		this.checkDigit = value;
	}

	/**
	 * ISO 3166-1 alpha-2 country code of the country where the bank account is held
	 * For UK payouts this value is automatically set to GB as only payouts to UK accounts are supported.
	 */
	public String getCountryCode() {
		return countryCode;
	}

	/**
	 * ISO 3166-1 alpha-2 country code of the country where the bank account is held
	 * For UK payouts this value is automatically set to GB as only payouts to UK accounts are supported.
	 */
	public void setCountryCode(String value) {
		this.countryCode = value;
	}
}
