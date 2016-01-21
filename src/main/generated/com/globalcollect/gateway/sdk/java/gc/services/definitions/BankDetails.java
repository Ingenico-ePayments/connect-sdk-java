package com.globalcollect.gateway.sdk.java.gc.services.definitions;

import com.globalcollect.gateway.sdk.java.gc.fei.definitions.BankAccountBban;
import com.globalcollect.gateway.sdk.java.gc.fei.definitions.BankAccountIban;

public class BankDetails {

	private BankAccountBban bankAccountBban = null;

	private BankAccountIban bankAccountIban = null;

	public BankAccountBban getBankAccountBban() {
		return bankAccountBban;
	}

	public void setBankAccountBban(BankAccountBban value) {
		this.bankAccountBban = value;
	}

	public BankAccountIban getBankAccountIban() {
		return bankAccountIban;
	}

	public void setBankAccountIban(BankAccountIban value) {
		this.bankAccountIban = value;
	}
}
