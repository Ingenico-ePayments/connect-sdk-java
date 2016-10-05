/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.BankAccountBban;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_NonSepaDirectDebitPaymentProduct705SpecificInput">NonSepaDirectDebitPaymentProduct705SpecificInput</a>
 */
public class NonSepaDirectDebitPaymentProduct705SpecificInput {

	private String authorisationId = null;

	private BankAccountBban bankAccountBban = null;

	private String transactionType = null;

	public String getAuthorisationId() {
		return authorisationId;
	}

	public void setAuthorisationId(String value) {
		this.authorisationId = value;
	}

	public BankAccountBban getBankAccountBban() {
		return bankAccountBban;
	}

	public void setBankAccountBban(BankAccountBban value) {
		this.bankAccountBban = value;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String value) {
		this.transactionType = value;
	}
}
