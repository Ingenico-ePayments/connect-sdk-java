/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.token.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.BankAccountBban;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_TokenNonSepaDirectDebitPaymentProduct705SpecificData">TokenNonSepaDirectDebitPaymentProduct705SpecificData</a>
 */
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
