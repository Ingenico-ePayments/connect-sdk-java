package com.globalcollect.gateway.sdk.java.gc.token.definitions;

import com.globalcollect.gateway.sdk.java.gc.token.definitions.CustomerTokenWithContactDetails;
import com.globalcollect.gateway.sdk.java.gc.token.definitions.MandateSepaDirectDebit;
import com.globalcollect.gateway.sdk.java.gc.token.definitions.AbstractToken;

public class TokenSepaDirectDebit extends AbstractToken {

	private CustomerTokenWithContactDetails customer = null;

	private MandateSepaDirectDebit mandate = null;

	public CustomerTokenWithContactDetails getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerTokenWithContactDetails value) {
		this.customer = value;
	}

	public MandateSepaDirectDebit getMandate() {
		return mandate;
	}

	public void setMandate(MandateSepaDirectDebit value) {
		this.mandate = value;
	}
}
