package com.globalcollect.gateway.sdk.java.gc.refund.definitions;

import com.globalcollect.gateway.sdk.java.gc.fei.definitions.BankAccountBban;

public class BankAccountBbanRefund extends BankAccountBban {

	private String bankCity = null;

	private String swiftCode = null;

	public String getBankCity() {
		return bankCity;
	}

	public void setBankCity(String value) {
		this.bankCity = value;
	}

	public String getSwiftCode() {
		return swiftCode;
	}

	public void setSwiftCode(String value) {
		this.swiftCode = value;
	}
}
