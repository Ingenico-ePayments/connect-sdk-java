package com.globalcollect.gateway.sdk.java.gc.services;

import com.globalcollect.gateway.sdk.java.gc.fei.definitions.BankAccountBban;
import com.globalcollect.gateway.sdk.java.gc.fei.definitions.BankAccountIban;
import com.globalcollect.gateway.sdk.java.gc.services.definitions.BankData;
import com.globalcollect.gateway.sdk.java.gc.services.definitions.Swift;

/**
 * class BankDetailsResponse
 */
public class BankDetailsResponse {

	private BankAccountBban bankAccountBban = null;

	private BankAccountIban bankAccountIban = null;

	private BankData bankData = null;

	private Swift swift = null;

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

	public BankData getBankData() {
		return bankData;
	}

	public void setBankData(BankData value) {
		this.bankData = value;
	}

	public Swift getSwift() {
		return swift;
	}

	public void setSwift(Swift value) {
		this.swift = value;
	}
}
