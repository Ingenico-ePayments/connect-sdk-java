/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.services.definitions;


/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_BankData">BankData</a>
 */
public class BankData {

	private String newBankName = null;

	private String reformattedAccountNumber = null;

	private String reformattedBankCode = null;

	private String reformattedBranchCode = null;

	public String getNewBankName() {
		return newBankName;
	}

	public void setNewBankName(String value) {
		this.newBankName = value;
	}

	public String getReformattedAccountNumber() {
		return reformattedAccountNumber;
	}

	public void setReformattedAccountNumber(String value) {
		this.reformattedAccountNumber = value;
	}

	public String getReformattedBankCode() {
		return reformattedBankCode;
	}

	public void setReformattedBankCode(String value) {
		this.reformattedBankCode = value;
	}

	public String getReformattedBranchCode() {
		return reformattedBranchCode;
	}

	public void setReformattedBranchCode(String value) {
		this.reformattedBranchCode = value;
	}
}
