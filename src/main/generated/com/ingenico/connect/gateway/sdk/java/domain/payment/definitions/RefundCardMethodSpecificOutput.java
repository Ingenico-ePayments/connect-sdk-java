/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */

package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

public class RefundCardMethodSpecificOutput extends RefundMethodSpecificOutput {

	private String authorisationCode = null;

	/**
	 * Card Authorization code as returned by the acquirer
	 */
	public String getAuthorisationCode() {
		return authorisationCode;
	}

	/**
	 * Card Authorization code as returned by the acquirer
	 */
	public void setAuthorisationCode(String value) {
		this.authorisationCode = value;
	}
}
