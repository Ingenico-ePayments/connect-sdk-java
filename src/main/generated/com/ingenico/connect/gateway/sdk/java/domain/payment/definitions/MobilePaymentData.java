/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_MobilePaymentData">MobilePaymentData</a>
 */
public class MobilePaymentData {

	private String dpan = null;

	private String expiryDate = null;

	public String getDpan() {
		return dpan;
	}

	public void setDpan(String value) {
		this.dpan = value;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String value) {
		this.expiryDate = value;
	}
}
