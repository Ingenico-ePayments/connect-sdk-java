package com.globalcollect.gateway.sdk.java.gc.services;


/**
 * class BINLookupResponse
 */
public class BINLookupResponse {

	private String countryCode = null;

	private Integer paymentProductId = null;

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String value) {
		this.countryCode = value;
	}

	public Integer getPaymentProductId() {
		return paymentProductId;
	}

	public void setPaymentProductId(Integer value) {
		this.paymentProductId = value;
	}
}
