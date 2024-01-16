/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/
 */

package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

public class CardPaymentMethodSpecificInputBase extends AbstractCardPaymentMethodSpecificInput {

	private ThreeDSecureBase threeDSecure = null;

	/**
	 * Object containing specific data regarding 3-D Secure
	 */
	public ThreeDSecureBase getThreeDSecure() {
		return threeDSecure;
	}

	/**
	 * Object containing specific data regarding 3-D Secure
	 */
	public void setThreeDSecure(ThreeDSecureBase value) {
		this.threeDSecure = value;
	}
}
