package com.globalcollect.gateway.sdk.java.gc.token.definitions;

import com.globalcollect.gateway.sdk.java.gc.token.definitions.CustomerToken;
import com.globalcollect.gateway.sdk.java.gc.token.definitions.MandateNonSepaDirectDebit;
import com.globalcollect.gateway.sdk.java.gc.token.definitions.AbstractToken;

public class TokenNonSepaDirectDebit extends AbstractToken {

	private CustomerToken customer = null;

	private MandateNonSepaDirectDebit mandate = null;

	public CustomerToken getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerToken value) {
		this.customer = value;
	}

	public MandateNonSepaDirectDebit getMandate() {
		return mandate;
	}

	public void setMandate(MandateNonSepaDirectDebit value) {
		this.mandate = value;
	}
}
