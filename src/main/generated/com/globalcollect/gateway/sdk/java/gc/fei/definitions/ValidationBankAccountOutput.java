package com.globalcollect.gateway.sdk.java.gc.fei.definitions;

import com.globalcollect.gateway.sdk.java.gc.fei.definitions.ValidationBankAccountCheck;
import java.util.List;

public class ValidationBankAccountOutput {

	private List<ValidationBankAccountCheck> checks = null;

	private String newBankName = null;

	private String reformattedAccountNumber = null;

	private String reformattedBankCode = null;

	private String reformattedBranchCode = null;

	public List<ValidationBankAccountCheck> getChecks() {
		return checks;
	}

	public void setChecks(List<ValidationBankAccountCheck> value) {
		this.checks = value;
	}

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
