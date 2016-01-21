package com.globalcollect.gateway.sdk.java.gc.services.definitions;


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
