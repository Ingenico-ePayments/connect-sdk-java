/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */

package com.ingenico.connect.gateway.sdk.java.domain.mandates.definitions;

public class CreateMandateWithReturnUrl extends CreateMandateBase {

	private String returnUrl = null;

	/**
	 * Return URL to use if the mandate signing requires redirection.
	 */
	public String getReturnUrl() {
		return returnUrl;
	}

	/**
	 * Return URL to use if the mandate signing requires redirection.
	 */
	public void setReturnUrl(String value) {
		this.returnUrl = value;
	}
}
