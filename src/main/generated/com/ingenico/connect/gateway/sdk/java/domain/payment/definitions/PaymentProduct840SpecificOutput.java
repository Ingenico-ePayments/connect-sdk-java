/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.Address;

public class PaymentProduct840SpecificOutput {

	private PaymentProduct840CustomerAccount customerAccount = null;

	private Address customerAddress = null;

	/**
	 * Object containing the details of the PayPal account
	 */
	public PaymentProduct840CustomerAccount getCustomerAccount() {
		return customerAccount;
	}

	/**
	 * Object containing the details of the PayPal account
	 */
	public void setCustomerAccount(PaymentProduct840CustomerAccount value) {
		this.customerAccount = value;
	}

	/**
	 * Object containing the address details of the consumer
	 */
	public Address getCustomerAddress() {
		return customerAddress;
	}

	/**
	 * Object containing the address details of the consumer
	 */
	public void setCustomerAddress(Address value) {
		this.customerAddress = value;
	}
}
