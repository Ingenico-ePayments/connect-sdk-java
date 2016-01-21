package com.globalcollect.gateway.sdk.java.gc.token.definitions;

import com.globalcollect.gateway.sdk.java.gc.fei.definitions.BankAccountBban;

public class TokenNonSepaDirectDebitPaymentProduct705SpecificData {

	private String authorisationId = null;

	private BankAccountBban bankAccountBban = null;

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
}
