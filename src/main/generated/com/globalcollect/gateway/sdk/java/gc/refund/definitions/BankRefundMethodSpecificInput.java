package com.globalcollect.gateway.sdk.java.gc.refund.definitions;

import com.globalcollect.gateway.sdk.java.gc.fei.definitions.BankAccountIban;
import com.globalcollect.gateway.sdk.java.gc.refund.definitions.BankAccountBbanRefund;

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
