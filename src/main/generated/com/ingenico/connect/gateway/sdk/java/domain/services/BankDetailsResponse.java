/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.services;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.BankAccountBban;
import com.ingenico.connect.gateway.sdk.java.domain.definitions.BankAccountIban;
import com.ingenico.connect.gateway.sdk.java.domain.services.definitions.BankData;
import com.ingenico.connect.gateway.sdk.java.domain.services.definitions.Swift;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_BankDetailsResponse">BankDetailsResponse</a>
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
