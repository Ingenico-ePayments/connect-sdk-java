/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */

package com.ingenico.connect.gateway.sdk.java.domain.refund.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.BankAccountIban;

public class BankRefundMethodSpecificInput {

	private BankAccountBbanRefund bankAccountBban = null;

	private BankAccountIban bankAccountIban = null;

	private String countryCode = null;

	/**
	 * Object that holds the Basic Bank Account Number (BBAN) data
	 */
	public BankAccountBbanRefund getBankAccountBban() {
		return bankAccountBban;
	}

	/**
	 * Object that holds the Basic Bank Account Number (BBAN) data
	 */
	public void setBankAccountBban(BankAccountBbanRefund value) {
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
	 * ISO 3166-1 alpha-2 country code of the country where money will be refunded to
	 */
	public String getCountryCode() {
		return countryCode;
	}

	/**
	 * ISO 3166-1 alpha-2 country code of the country where money will be refunded to
	 */
	public void setCountryCode(String value) {
		this.countryCode = value;
	}
}
