/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/
 */

package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

public class ApprovePaymentPaymentMethodSpecificInput {

	private String dateCollect = null;

	private String token = null;

	/**
	 * The desired date for the collection<br>
	 * Format: YYYYMMDD
	 */
	public String getDateCollect() {
		return dateCollect;
	}

	/**
	 * The desired date for the collection<br>
	 * Format: YYYYMMDD
	 */
	public void setDateCollect(String value) {
		this.dateCollect = value;
	}

	/**
	 * Token containing tokenized bank account details
	 */
	public String getToken() {
		return token;
	}

	/**
	 * Token containing tokenized bank account details
	 */
	public void setToken(String value) {
		this.token = value;
	}
}
