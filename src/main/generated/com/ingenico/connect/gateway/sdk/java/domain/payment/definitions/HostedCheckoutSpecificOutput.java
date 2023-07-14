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
	 * Using the Configuration Center it is possible to create multiple variations of your MyCheckout payment pages. By specifying a specific variant you can force the use of another variant then the default. This allows you to test out the effect of certain changes to your hosted mandate pages in a controlled manner. Please note that you need to specify the ID of the variant.
	 */
	public String getVariant() {
		return variant;
	}

	/**
	 * Using the Configuration Center it is possible to create multiple variations of your MyCheckout payment pages. By specifying a specific variant you can force the use of another variant then the default. This allows you to test out the effect of certain changes to your hosted mandate pages in a controlled manner. Please note that you need to specify the ID of the variant.
	 */
	public void setVariant(String value) {
		this.variant = value;
	}
}
