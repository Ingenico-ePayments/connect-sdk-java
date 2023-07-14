/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */

package com.ingenico.connect.gateway.sdk.java.domain.services;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.BankAccountBban;
import com.ingenico.connect.gateway.sdk.java.domain.definitions.BankAccountIban;
import com.ingenico.connect.gateway.sdk.java.domain.services.definitions.BankData;
import com.ingenico.connect.gateway.sdk.java.domain.services.definitions.Swift;

public class BankDetailsResponse {

	private BankAccountBban bankAccountBban = null;

	private BankAccountIban bankAccountIban = null;

	private BankData bankData = null;

	private Swift swift = null;

	/**
	 * Object that holds the Basic Bank Account Number (BBAN) data
	 */
	public BankAccountBban getBankAccountBban() {
		return bankAccountBban;
	}

	/**
	 * Object that holds the Basic Bank Account Number (BBAN) data
	 */
	public void setBankAccountBban(BankAccountBban value) {
		this.bankAccountBban = value;
	}

	/**
	 * Object that holds the International Bank Account Number (IBAN) data
	 */
	public BankAccountIban getBankAccountIban() {
		return bankAccountIban;
	}

	/**
	 * Object that holds the International Bank Account Number (IBAN) data
	 */
	public void setBankAccountIban(BankAccountIban value) {
		this.bankAccountIban = value;
	}

	/**
	 * Object that holds the reformatted bank account data
	 */
	public BankData getBankData() {
		return bankData;
	}

	/**
	 * Object that holds the reformatted bank account data
	 */
	public void setBankData(BankData value) {
		this.bankData = value;
	}

	/**
	 * Object that holds all the SWIFT routing information
	 */
	public Swift getSwift() {
		return swift;
	}

	/**
	 * Object that holds all the SWIFT routing information
	 */
	public void setSwift(Swift value) {
		this.swift = value;
	}
}
