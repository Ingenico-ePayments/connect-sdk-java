/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.hostedcheckout.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.AbstractPaymentMethodSpecificInput;

public class MobilePaymentMethodSpecificInputHostedCheckout extends AbstractPaymentMethodSpecificInput {

	private MobilePaymentProduct302SpecificInputHostedCheckout paymentProduct302SpecificInput = null;

	private MobilePaymentProduct320SpecificInputHostedCheckout paymentProduct320SpecificInput = null;

	/**
	 * Object containing information specific to Apple Pay
	 */
	public MobilePaymentProduct302SpecificInputHostedCheckout getPaymentProduct302SpecificInput() {
		return paymentProduct302SpecificInput;
	}

	/**
	 * Object containing information specific to Apple Pay
	 */
	public void setPaymentProduct302SpecificInput(MobilePaymentProduct302SpecificInputHostedCheckout value) {
		this.paymentProduct302SpecificInput = value;
	}

	/**
	 * Object containing information specific to Google Pay (paymentProductId 320)
	 */
	public MobilePaymentProduct320SpecificInputHostedCheckout getPaymentProduct320SpecificInput() {
		return paymentProduct320SpecificInput;
	}

	/**
	 * Object containing information specific to Google Pay (paymentProductId 320)
	 */
	public void setPaymentProduct320SpecificInput(MobilePaymentProduct320SpecificInputHostedCheckout value) {
		this.paymentProduct320SpecificInput = value;
	}
}
