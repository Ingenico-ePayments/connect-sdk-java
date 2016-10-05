/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.refund.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.BankAccountBban;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_BankAccountBbanRefund">BankAccountBbanRefund</a>
 */
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
