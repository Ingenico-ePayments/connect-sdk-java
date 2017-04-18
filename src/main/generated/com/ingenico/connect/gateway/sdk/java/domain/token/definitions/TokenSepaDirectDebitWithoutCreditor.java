/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.token.definitions;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_TokenSepaDirectDebitWithoutCreditor">TokenSepaDirectDebitWithoutCreditor</a>
 */
public class TokenSepaDirectDebitWithoutCreditor extends AbstractToken {

	private CustomerTokenWithContactDetails customer = null;

	private MandateSepaDirectDebitWithoutCreditor mandate = null;

	public CustomerTokenWithContactDetails getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerTokenWithContactDetails value) {
		this.customer = value;
	}

	public MandateSepaDirectDebitWithoutCreditor getMandate() {
		return mandate;
	}

	public void setMandate(MandateSepaDirectDebitWithoutCreditor value) {
		this.mandate = value;
	}
}
