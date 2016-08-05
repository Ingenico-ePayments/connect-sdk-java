package com.globalcollect.gateway.sdk.java.gc.services;

import com.globalcollect.gateway.sdk.java.gc.services.definitions.PaymentContext;

/**
 * class GetIINDetailsRequest
 */
public class GetIINDetailsRequest {

	private String bin = null;

	private PaymentContext paymentContext = null;

	public String getBin() {
		return bin;
	}

	public void setBin(String value) {
		this.bin = value;
	}

	public PaymentContext getPaymentContext() {
		return paymentContext;
	}

	public void setPaymentContext(PaymentContext value) {
		this.paymentContext = value;
	}
}
