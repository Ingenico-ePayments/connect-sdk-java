/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/
 */

package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.Address;

public class PaymentProduct840SpecificOutput {

	private Address billingAddress = null;

	private PaymentProduct840CustomerAccount customerAccount = null;

	private Address customerAddress = null;

	private ProtectionEligibility protectionEligibility = null;

	/**
	 * Object containing the billing address details of the customer
	 */
	public Address getBillingAddress() {
		return billingAddress;
	}

	/**
	 * Object containing the billing address details of the customer
	 */
	public void setBillingAddress(Address value) {
		this.billingAddress = value;
	}

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
	 * Object containing the address details of the customer
	 */
	public Address getCustomerAddress() {
		return customerAddress;
	}

	/**
	 * Object containing the address details of the customer
	 */
	public void setCustomerAddress(Address value) {
		this.customerAddress = value;
	}

	/**
	 * Protection Eligibility data of the PayPal customer
	 */
	public ProtectionEligibility getProtectionEligibility() {
		return protectionEligibility;
	}

	/**
	 * Protection Eligibility data of the PayPal customer
	 */
	public void setProtectionEligibility(ProtectionEligibility value) {
		this.protectionEligibility = value;
	}
}
