package com.globalcollect.gateway.sdk.java.gc.fei.definitions;

import com.globalcollect.gateway.sdk.java.gc.fei.definitions.BankAccount;

public class BankAccountIban extends BankAccount {

	private String iban = null;

	public String getIban() {
		return iban;
	}

	public void setIban(String value) {
		this.iban = value;
	}
}
