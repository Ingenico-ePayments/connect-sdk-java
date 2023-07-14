/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */

package com.ingenico.connect.gateway.sdk.java.domain.token.definitions;

public class TokenEWalletData {

	private String billingAgreementId = null;

	/**
	 * Identification of the PayPal recurring billing agreement
	 */
	public String getBillingAgreementId() {
		return billingAgreementId;
	}

	/**
	 * Identification of the PayPal recurring billing agreement
	 */
	public void setBillingAgreementId(String value) {
		this.billingAgreementId = value;
	}
}
