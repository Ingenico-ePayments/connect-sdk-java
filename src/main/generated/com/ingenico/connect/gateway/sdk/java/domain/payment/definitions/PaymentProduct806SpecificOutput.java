/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */

package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.Address;

public class PaymentProduct806SpecificOutput {

	private Address billingAddress = null;

	private TrustlyBankAccount customerAccount = null;

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
	 * Object containing the account details
	 */
	public TrustlyBankAccount getCustomerAccount() {
		return customerAccount;
	}

	/**
	 * Object containing the account details
	 */
	public void setCustomerAccount(TrustlyBankAccount value) {
		this.customerAccount = value;
	}
}
