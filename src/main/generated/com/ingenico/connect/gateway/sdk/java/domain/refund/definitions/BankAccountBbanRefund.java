/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.refund.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.BankAccountBban;

public class BankAccountBbanRefund extends BankAccountBban {

	private String bankCity = null;

	private String swiftCode = null;

	/**
	 * City of the bank to refund to
	 */
	public String getBankCity() {
		return bankCity;
	}

	/**
	 * City of the bank to refund to
	 */
	public void setBankCity(String value) {
		this.bankCity = value;
	}

	/**
	 * The BIC is the Business Identifier Code, also known as SWIFT or Bank Identifier code. It is a code with an internationally agreed format to Identify a specific bank. The BIC contains 8 or 11 positions: the first 4 contain the bank code, followed by the country code and location code.
	 */
	public String getSwiftCode() {
		return swiftCode;
	}

	/**
	 * The BIC is the Business Identifier Code, also known as SWIFT or Bank Identifier code. It is a code with an internationally agreed format to Identify a specific bank. The BIC contains 8 or 11 positions: the first 4 contain the bank code, followed by the country code and location code.
	 */
	public void setSwiftCode(String value) {
		this.swiftCode = value;
	}
}
