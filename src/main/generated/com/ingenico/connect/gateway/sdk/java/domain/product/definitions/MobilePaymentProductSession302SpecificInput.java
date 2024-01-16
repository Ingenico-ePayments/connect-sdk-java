/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/
 */

package com.ingenico.connect.gateway.sdk.java.domain.product.definitions;

public class MobilePaymentProductSession302SpecificInput {

	private String displayName = null;

	private String domainName = null;

	private String validationUrl = null;

	/**
	 * Used as an input for the Apple Pay payment button. Provide your company name in a human readable form.
	 */
	public String getDisplayName() {
		return displayName;
	}

	/**
	 * Used as an input for the Apple Pay payment button. Provide your company name in a human readable form.
	 */
	public void setDisplayName(String value) {
		this.displayName = value;
	}

	/**
	 * Provide a fully qualified domain name of your own payment page that will be showing an Apple Pay button.
	 */
	public String getDomainName() {
		return domainName;
	}

	/**
	 * Provide a fully qualified domain name of your own payment page that will be showing an Apple Pay button.
	 */
	public void setDomainName(String value) {
		this.domainName = value;
	}

	/**
	 * Provide the validation URL that has been provided by Apple once you have started an Apple Pay session.
	 */
	public String getValidationUrl() {
		return validationUrl;
	}

	/**
	 * Provide the validation URL that has been provided by Apple once you have started an Apple Pay session.
	 */
	public void setValidationUrl(String value) {
		this.validationUrl = value;
	}
}
