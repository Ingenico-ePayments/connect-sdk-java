/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.token.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.token.definitions.CustomerTokenWithContactDetails;
import com.ingenico.connect.gateway.sdk.java.domain.token.definitions.MandateSepaDirectDebit;
import com.ingenico.connect.gateway.sdk.java.domain.token.definitions.AbstractToken;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_TokenSepaDirectDebit">TokenSepaDirectDebit</a>
 */
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
