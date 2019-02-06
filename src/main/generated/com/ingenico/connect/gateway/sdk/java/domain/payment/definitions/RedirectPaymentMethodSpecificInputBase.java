/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

public class RedirectPaymentMethodSpecificInputBase extends AbstractRedirectPaymentMethodSpecificInput {

	private RedirectPaymentProduct840SpecificInputBase paymentProduct840SpecificInput = null;

	/**
	 * Object containing specific input required for PayPal payments (Payment product ID 840)
	 */
	public RedirectPaymentProduct840SpecificInputBase getPaymentProduct840SpecificInput() {
		return paymentProduct840SpecificInput;
	}

	/**
	 * Object containing specific input required for PayPal payments (Payment product ID 840)
	 */
	public void setPaymentProduct840SpecificInput(RedirectPaymentProduct840SpecificInputBase value) {
		this.paymentProduct840SpecificInput = value;
	}
}
