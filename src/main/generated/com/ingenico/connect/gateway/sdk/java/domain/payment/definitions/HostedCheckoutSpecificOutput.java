/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

public class HostedCheckoutSpecificOutput {

	private String hostedCheckoutId = null;

	private String variant = null;

	/**
	 * The ID of the Hosted Checkout Session in which the payment was made.
	 */
	public String getHostedCheckoutId() {
		return hostedCheckoutId;
	}

	/**
	 * The ID of the Hosted Checkout Session in which the payment was made.
	 */
	public void setHostedCheckoutId(String value) {
		this.hostedCheckoutId = value;
	}

	/**
	 * The ID of the variant used to create the Hosted Checkout Session in which the payment was made.
	 */
	public String getVariant() {
		return variant;
	}

	/**
	 * The ID of the variant used to create the Hosted Checkout Session in which the payment was made.
	 */
	public void setVariant(String value) {
		this.variant = value;
	}
}
