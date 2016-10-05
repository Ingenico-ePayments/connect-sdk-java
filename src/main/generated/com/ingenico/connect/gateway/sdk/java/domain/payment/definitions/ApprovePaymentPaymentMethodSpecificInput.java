/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;


/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_ApprovePaymentPaymentMethodSpecificInput">ApprovePaymentPaymentMethodSpecificInput</a>
 */
public class ApprovePaymentPaymentMethodSpecificInput {

	private String dateCollect = null;

	private String token = null;

	public String getDateCollect() {
		return dateCollect;
	}

	public void setDateCollect(String value) {
		this.dateCollect = value;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String value) {
		this.token = value;
	}
}
