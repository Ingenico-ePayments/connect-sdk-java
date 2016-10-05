/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.token.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.token.definitions.CustomerToken;
import com.ingenico.connect.gateway.sdk.java.domain.token.definitions.TokenCardData;
import com.ingenico.connect.gateway.sdk.java.domain.token.definitions.AbstractToken;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_TokenCard">TokenCard</a>
 */
public class TokenCard extends AbstractToken {

	private CustomerToken customer = null;

	private TokenCardData data = null;

	public CustomerToken getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerToken value) {
		this.customer = value;
	}

	public TokenCardData getData() {
		return data;
	}

	public void setData(TokenCardData value) {
		this.data = value;
	}
}
