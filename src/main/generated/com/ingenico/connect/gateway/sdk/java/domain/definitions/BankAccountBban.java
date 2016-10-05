/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.BankAccount;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_BankAccountBban">BankAccountBban</a>
 */
public class BankAccountBban extends BankAccount {

	private String accountNumber = null;

	private String bankCode = null;

	private String bankName = null;

	private String branchCode = null;

	private String checkDigit = null;

	private String countryCode = null;

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String value) {
		this.accountNumber = value;
	}

	public String getBankCode() {
		return bankCode;
	}

	public void setBankCode(String value) {
		this.bankCode = value;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String value) {
		this.bankName = value;
	}

	public String getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(String value) {
		this.branchCode = value;
	}

	public String getCheckDigit() {
		return checkDigit;
	}

	public void setCheckDigit(String value) {
		this.checkDigit = value;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String value) {
		this.countryCode = value;
	}
}
