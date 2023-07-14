/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */

package com.ingenico.connect.gateway.sdk.java.domain.product;

import com.ingenico.connect.gateway.sdk.java.domain.product.definitions.MobilePaymentProductSession302SpecificOutput;

public class CreatePaymentProductSessionResponse {

	private MobilePaymentProductSession302SpecificOutput paymentProductSession302SpecificOutput = null;

	/**
	 * Object containing the Apple Pay session object.
	 */
	public MobilePaymentProductSession302SpecificOutput getPaymentProductSession302SpecificOutput() {
		return paymentProductSession302SpecificOutput;
	}

	/**
	 * Object containing the Apple Pay session object.
	 */
	public void setPaymentProductSession302SpecificOutput(MobilePaymentProductSession302SpecificOutput value) {
		this.paymentProductSession302SpecificOutput = value;
	}
}
