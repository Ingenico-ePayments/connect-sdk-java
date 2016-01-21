package com.globalcollect.gateway.sdk.java.gc.riskassessments;

import com.globalcollect.gateway.sdk.java.gc.fei.definitions.BankAccountBban;
import com.globalcollect.gateway.sdk.java.gc.fei.definitions.BankAccountIban;
import com.globalcollect.gateway.sdk.java.gc.riskassessments.definitions.RiskAssessment;

/**
 * class RiskAssessmentBankAccount
 */
public class RiskAssessmentBankAccount extends RiskAssessment {

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
