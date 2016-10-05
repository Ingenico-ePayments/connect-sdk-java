/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.riskassessments;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.BankAccountBban;
import com.ingenico.connect.gateway.sdk.java.domain.definitions.BankAccountIban;
import com.ingenico.connect.gateway.sdk.java.domain.riskassessments.definitions.RiskAssessment;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_RiskAssessmentBankAccount">RiskAssessmentBankAccount</a>
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
