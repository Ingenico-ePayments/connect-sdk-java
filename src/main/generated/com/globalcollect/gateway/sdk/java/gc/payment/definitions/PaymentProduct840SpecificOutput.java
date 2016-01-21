package com.globalcollect.gateway.sdk.java.gc.payment.definitions;

import com.globalcollect.gateway.sdk.java.gc.fei.definitions.Address;
import com.globalcollect.gateway.sdk.java.gc.payment.definitions.PaymentProduct840CustomerAccount;

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
