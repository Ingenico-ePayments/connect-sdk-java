package com.globalcollect.gateway.sdk.java.gc.token.definitions;

import com.globalcollect.gateway.sdk.java.gc.token.definitions.CustomerTokenWithContactDetails;
import com.globalcollect.gateway.sdk.java.gc.token.definitions.MandateSepaDirectDebitWithoutCreditor;
import com.globalcollect.gateway.sdk.java.gc.token.definitions.AbstractToken;

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
