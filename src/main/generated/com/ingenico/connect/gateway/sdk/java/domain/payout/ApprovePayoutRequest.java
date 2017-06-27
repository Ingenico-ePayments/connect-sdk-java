/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payout;

public class ApprovePayoutRequest {

	private String datePayout = null;

	/**
	 * The desired date for the payout<br>
	 * Format: YYYYMMDD
	 */
	public String getDatePayout() {
		return datePayout;
	}

	/**
	 * The desired date for the payout<br>
	 * Format: YYYYMMDD
	 */
	public void setDatePayout(String value) {
		this.datePayout = value;
	}
}
