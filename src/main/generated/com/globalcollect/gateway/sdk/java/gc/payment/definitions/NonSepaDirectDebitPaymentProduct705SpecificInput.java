package com.globalcollect.gateway.sdk.java.gc.payment.definitions;

import com.globalcollect.gateway.sdk.java.gc.fei.definitions.BankAccountBban;

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
