package com.globalcollect.gateway.sdk.java.gc.token.definitions;

import com.globalcollect.gateway.sdk.java.gc.fei.definitions.BankAccountIban;

public class TokenNonSepaDirectDebitPaymentProduct707SpecificData {

	private String addressLine1 = null;

	private String addressLine2 = null;

	private String addressLine3 = null;

	private String addressLine4 = null;

	private BankAccountIban bankAccountIban = null;

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String value) {
		this.addressLine1 = value;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String value) {
		this.addressLine2 = value;
	}

	public String getAddressLine3() {
		return addressLine3;
	}

	public void setAddressLine3(String value) {
		this.addressLine3 = value;
	}

	public String getAddressLine4() {
		return addressLine4;
	}

	public void setAddressLine4(String value) {
		this.addressLine4 = value;
	}

	public BankAccountIban getBankAccountIban() {
		return bankAccountIban;
	}

	public void setBankAccountIban(BankAccountIban value) {
		this.bankAccountIban = value;
	}
}
