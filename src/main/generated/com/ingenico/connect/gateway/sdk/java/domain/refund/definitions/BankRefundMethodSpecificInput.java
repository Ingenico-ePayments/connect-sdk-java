/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.refund.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.BankAccountIban;
import com.ingenico.connect.gateway.sdk.java.domain.refund.definitions.BankAccountBbanRefund;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_BankRefundMethodSpecificInput">BankRefundMethodSpecificInput</a>
 */
public class BankRefundMethodSpecificInput {

	private BankAccountBbanRefund bankAccountBban = null;

	private BankAccountIban bankAccountIban = null;

	private String countryCode = null;

	public BankAccountBbanRefund getBankAccountBban() {
		return bankAccountBban;
	}

	public void setBankAccountBban(BankAccountBbanRefund value) {
		this.bankAccountBban = value;
	}

	public BankAccountIban getBankAccountIban() {
		return bankAccountIban;
	}

	public void setBankAccountIban(BankAccountIban value) {
		this.bankAccountIban = value;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String value) {
		this.countryCode = value;
	}
}
