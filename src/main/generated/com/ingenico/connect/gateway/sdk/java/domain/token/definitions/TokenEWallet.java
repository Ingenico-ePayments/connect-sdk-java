/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */

package com.ingenico.connect.gateway.sdk.java.domain.token.definitions;

public class TokenEWallet extends AbstractToken {

	private CustomerToken customer = null;

	private TokenEWalletData data = null;

	/**
	 * Object containing the details of the customer
	 */
	public CustomerToken getCustomer() {
		return customer;
	}

	/**
	 * Object containing the details of the customer
	 */
	public void setCustomer(CustomerToken value) {
		this.customer = value;
	}

	/**
	 * Object containing the eWallet tokenizable data
	 */
	public TokenEWalletData getData() {
		return data;
	}

	/**
	 * Object containing the eWallet tokenizable data
	 */
	public void setData(TokenEWalletData value) {
		this.data = value;
	}
}
