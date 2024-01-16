/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/
 */

package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

/**
 * PayPal refund details
 */
public class RefundPaymentProduct840SpecificOutput {

	private RefundPaymentProduct840CustomerAccount customerAccount = null;

	/**
	 * Object containing the PayPal account details
	 */
	public RefundPaymentProduct840CustomerAccount getCustomerAccount() {
		return customerAccount;
	}

	/**
	 * Object containing the PayPal account details
	 */
	public void setCustomerAccount(RefundPaymentProduct840CustomerAccount value) {
		this.customerAccount = value;
	}
}
