/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.token.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.token.definitions.CustomerToken;
import com.ingenico.connect.gateway.sdk.java.domain.token.definitions.MandateNonSepaDirectDebit;
import com.ingenico.connect.gateway.sdk.java.domain.token.definitions.AbstractToken;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_TokenNonSepaDirectDebit">TokenNonSepaDirectDebit</a>
 */
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
