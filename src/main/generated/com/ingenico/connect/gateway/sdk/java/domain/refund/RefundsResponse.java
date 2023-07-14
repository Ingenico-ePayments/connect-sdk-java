/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */

package com.ingenico.connect.gateway.sdk.java.domain.refund;

import java.util.List;

import com.ingenico.connect.gateway.sdk.java.domain.refund.definitions.RefundResult;

public class RefundsResponse {

	private List<RefundResult> refunds = null;

	/**
	 * The list of all refunds performed on the requested payment.
	 */
	public List<RefundResult> getRefunds() {
		return refunds;
	}

	/**
	 * The list of all refunds performed on the requested payment.
	 */
	public void setRefunds(List<RefundResult> value) {
		this.refunds = value;
	}
}
