/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.refund;

public class ApproveRefundRequest {

	private Long amount = null;

	/**
	 * Refund amount to be approved
	 */
	public Long getAmount() {
		return amount;
	}

	/**
	 * Refund amount to be approved
	 */
	public void setAmount(Long value) {
		this.amount = value;
	}
}
