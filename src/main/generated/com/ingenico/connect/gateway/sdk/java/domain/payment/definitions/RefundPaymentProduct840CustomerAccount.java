/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;


/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_RefundPaymentProduct840CustomerAccount">RefundPaymentProduct840CustomerAccount</a>
 */
public class RefundPaymentProduct840CustomerAccount {

	private String customerAccountStatus = null;

	private String customerAddressStatus = null;

	private String payerId = null;

	public String getCustomerAccountStatus() {
		return customerAccountStatus;
	}

	public void setCustomerAccountStatus(String value) {
		this.customerAccountStatus = value;
	}

	public String getCustomerAddressStatus() {
		return customerAddressStatus;
	}

	public void setCustomerAddressStatus(String value) {
		this.customerAddressStatus = value;
	}

	public String getPayerId() {
		return payerId;
	}

	public void setPayerId(String value) {
		this.payerId = value;
	}
}
