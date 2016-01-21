package com.globalcollect.gateway.sdk.java.gc.token.definitions;

import com.globalcollect.gateway.sdk.java.gc.token.definitions.CustomerToken;
import com.globalcollect.gateway.sdk.java.gc.token.definitions.TokenCardData;
import com.globalcollect.gateway.sdk.java.gc.token.definitions.AbstractToken;

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
