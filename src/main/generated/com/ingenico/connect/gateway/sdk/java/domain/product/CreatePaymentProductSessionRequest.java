/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */

package com.ingenico.connect.gateway.sdk.java.domain.product;

import com.ingenico.connect.gateway.sdk.java.domain.product.definitions.MobilePaymentProductSession302SpecificInput;

public class CreatePaymentProductSessionRequest {

	private MobilePaymentProductSession302SpecificInput paymentProductSession302SpecificInput = null;

	/**
	 * Object containing details for creating an Apple Pay session.
	 */
	public MobilePaymentProductSession302SpecificInput getPaymentProductSession302SpecificInput() {
		return paymentProductSession302SpecificInput;
	}

	/**
	 * Object containing details for creating an Apple Pay session.
	 */
	public void setPaymentProductSession302SpecificInput(MobilePaymentProductSession302SpecificInput value) {
		this.paymentProductSession302SpecificInput = value;
	}
}
