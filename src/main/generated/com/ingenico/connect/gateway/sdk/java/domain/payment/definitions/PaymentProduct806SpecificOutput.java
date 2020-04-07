/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.Address;

public class PaymentProduct806SpecificOutput {

	private Address billingAddress = null;

	private TrustlyBankAccount customerAccount = null;

	public Address getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(Address value) {
		this.billingAddress = value;
	}

	public TrustlyBankAccount getCustomerAccount() {
		return customerAccount;
	}

	public void setCustomerAccount(TrustlyBankAccount value) {
		this.customerAccount = value;
	}
}
