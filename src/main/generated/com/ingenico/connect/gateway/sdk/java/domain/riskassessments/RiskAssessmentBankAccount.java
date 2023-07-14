/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */

package com.ingenico.connect.gateway.sdk.java.domain.riskassessments;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.BankAccountBban;
import com.ingenico.connect.gateway.sdk.java.domain.definitions.BankAccountIban;
import com.ingenico.connect.gateway.sdk.java.domain.riskassessments.definitions.RiskAssessment;

public class RiskAssessmentBankAccount extends RiskAssessment {

	private BankAccountBban bankAccountBban = null;

	private BankAccountIban bankAccountIban = null;

	/**
	 * Object containing account holder name and bank account information
	 */
	public BankAccountBban getBankAccountBban() {
		return bankAccountBban;
	}

	/**
	 * Object containing account holder name and bank account information
	 */
	public void setBankAccountBban(BankAccountBban value) {
		this.bankAccountBban = value;
	}

	/**
	 * Object containing account holder name and IBAN information
	 */
	public BankAccountIban getBankAccountIban() {
		return bankAccountIban;
	}

	/**
	 * Object containing account holder name and IBAN information
	 */
	public void setBankAccountIban(BankAccountIban value) {
		this.bankAccountIban = value;
	}
}
