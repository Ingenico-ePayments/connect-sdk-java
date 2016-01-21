package com.globalcollect.gateway.sdk.java.gc.token.definitions;

import com.globalcollect.gateway.sdk.java.gc.token.definitions.CustomerToken;
import com.globalcollect.gateway.sdk.java.gc.token.definitions.TokenEWalletData;
import com.globalcollect.gateway.sdk.java.gc.token.definitions.AbstractToken;

public class TokenEWallet extends AbstractToken {

	private CustomerToken customer = null;

	private TokenEWalletData data = null;

	public CustomerToken getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerToken value) {
		this.customer = value;
	}

	public TokenEWalletData getData() {
		return data;
	}

	public void setData(TokenEWalletData value) {
		this.data = value;
	}
}
