/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */

package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

public class MobilePaymentData {

	private String dpan = null;

	private String expiryDate = null;

	/**
	 * The obfuscated DPAN. Only the last four digits are visible.
	 */
	public String getDpan() {
		return dpan;
	}

	/**
	 * The obfuscated DPAN. Only the last four digits are visible.
	 */
	public void setDpan(String value) {
		this.dpan = value;
	}

	/**
	 * Expiry date of the tokenized card<br>
	 * Format: MMYY
	 */
	public String getExpiryDate() {
		return expiryDate;
	}

	/**
	 * Expiry date of the tokenized card<br>
	 * Format: MMYY
	 */
	public void setExpiryDate(String value) {
		this.expiryDate = value;
	}
}
