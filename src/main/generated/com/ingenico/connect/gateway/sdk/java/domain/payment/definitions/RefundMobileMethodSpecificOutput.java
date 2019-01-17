/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

public class RefundMobileMethodSpecificOutput extends RefundMethodSpecificOutput {

	private String network = null;

	/**
	 * The network that was used for the refund. The string that represents the network is identical to the strings that the payment product vendors use in their documentation.
	 * For instance: "Visa" for <a href="https://developer.apple.com/reference/passkit/pkpaymentnetwork" target="_blank">Apple Pay</a>, and "VISA" for <a href="https://developers.google.com/pay/api/android/reference/object#CardParameters" target="_blank">Google Pay</a>.
	 */
	public String getNetwork() {
		return network;
	}

	/**
	 * The network that was used for the refund. The string that represents the network is identical to the strings that the payment product vendors use in their documentation.
	 * For instance: "Visa" for <a href="https://developer.apple.com/reference/passkit/pkpaymentnetwork" target="_blank">Apple Pay</a>, and "VISA" for <a href="https://developers.google.com/pay/api/android/reference/object#CardParameters" target="_blank">Google Pay</a>.
	 */
	public void setNetwork(String value) {
		this.network = value;
	}
}
