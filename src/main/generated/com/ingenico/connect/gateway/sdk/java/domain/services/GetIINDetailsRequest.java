/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.services;

import com.ingenico.connect.gateway.sdk.java.domain.services.definitions.PaymentContext;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_GetIINDetailsRequest">GetIINDetailsRequest</a>
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
