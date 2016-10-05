/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;


/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_RedirectPaymentProduct809SpecificInput">RedirectPaymentProduct809SpecificInput</a>
 */
public class RedirectPaymentProduct809SpecificInput {

	private String expirationPeriod = null;

	private String issuerId = null;

	public String getExpirationPeriod() {
		return expirationPeriod;
	}

	public void setExpirationPeriod(String value) {
		this.expirationPeriod = value;
	}

	public String getIssuerId() {
		return issuerId;
	}

	public void setIssuerId(String value) {
		this.issuerId = value;
	}
}
