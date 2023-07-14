/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */

package com.ingenico.connect.gateway.sdk.java.domain.dispute;

import java.util.List;

import com.ingenico.connect.gateway.sdk.java.domain.dispute.definitions.Dispute;

public class DisputesResponse {

	private List<Dispute> disputes = null;

	/**
	 * Array containing disputes and their characteristics.
	 */
	public List<Dispute> getDisputes() {
		return disputes;
	}

	/**
	 * Array containing disputes and their characteristics.
	 */
	public void setDisputes(List<Dispute> value) {
		this.disputes = value;
	}
}
