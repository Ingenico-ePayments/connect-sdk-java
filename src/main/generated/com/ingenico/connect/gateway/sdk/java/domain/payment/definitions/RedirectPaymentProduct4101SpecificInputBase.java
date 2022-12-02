/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

/**
 * Please find below specific input fields for payment product 4101 (UPI)
 */
public class RedirectPaymentProduct4101SpecificInputBase extends AbstractRedirectPaymentProduct4101SpecificInput {

	private String displayName = null;

	/**
	 * The merchant name as shown to the customer in some payment applications.
	 */
	public String getDisplayName() {
		return displayName;
	}

	/**
	 * The merchant name as shown to the customer in some payment applications.
	 */
	public void setDisplayName(String value) {
		this.displayName = value;
	}
}
