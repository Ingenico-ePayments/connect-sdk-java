/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */

package com.ingenico.connect.gateway.sdk.java.domain.services.definitions;

public class BankData {

	private String newBankName = null;

	private String reformattedAccountNumber = null;

	private String reformattedBankCode = null;

	private String reformattedBranchCode = null;

	/**
	 * Bank name, matching the bank code of the request
	 */
	public String getNewBankName() {
		return newBankName;
	}

	/**
	 * Bank name, matching the bank code of the request
	 */
	public void setNewBankName(String value) {
		this.newBankName = value;
	}

	/**
	 * Reformatted account number according to local clearing rules
	 */
	public String getReformattedAccountNumber() {
		return reformattedAccountNumber;
	}

	/**
	 * Reformatted account number according to local clearing rules
	 */
	public void setReformattedAccountNumber(String value) {
		this.reformattedAccountNumber = value;
	}

	/**
	 * Reformatted bank code according to local clearing rules
	 */
	public String getReformattedBankCode() {
		return reformattedBankCode;
	}

	/**
	 * Reformatted bank code according to local clearing rules
	 */
	public void setReformattedBankCode(String value) {
		this.reformattedBankCode = value;
	}

	/**
	 * Reformatted branch code according to local clearing rules
	 */
	public String getReformattedBranchCode() {
		return reformattedBranchCode;
	}

	/**
	 * Reformatted branch code according to local clearing rules
	 */
	public void setReformattedBranchCode(String value) {
		this.reformattedBranchCode = value;
	}
}
