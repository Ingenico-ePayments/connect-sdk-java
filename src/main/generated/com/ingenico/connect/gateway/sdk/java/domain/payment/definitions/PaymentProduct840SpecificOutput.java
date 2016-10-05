/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.Address;
import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.PaymentProduct840CustomerAccount;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_PaymentProduct840SpecificOutput">PaymentProduct840SpecificOutput</a>
 */
public class PaymentProduct840SpecificOutput {

	private PaymentProduct840CustomerAccount customerAccount = null;

	private Address customerAddress = null;

	public PaymentProduct840CustomerAccount getCustomerAccount() {
		return customerAccount;
	}

	public void setCustomerAccount(PaymentProduct840CustomerAccount value) {
		this.customerAccount = value;
	}

	public Address getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(Address value) {
		this.customerAddress = value;
	}
}
