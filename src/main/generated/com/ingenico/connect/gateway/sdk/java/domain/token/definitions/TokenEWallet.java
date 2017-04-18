/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.token.definitions;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_TokenEWallet">TokenEWallet</a>
 */
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
