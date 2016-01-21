package com.globalcollect.gateway.sdk.java.gc.hostedcheckout;

import com.globalcollect.gateway.sdk.java.gc.hostedcheckout.definitions.CreatedPaymentOutput;

/**
 * class GetHostedCheckoutResponse
 */
public class GetHostedCheckoutResponse {

	private CreatedPaymentOutput createdPaymentOutput = null;

	private String status = null;

	public CreatedPaymentOutput getCreatedPaymentOutput() {
		return createdPaymentOutput;
	}

	public void setCreatedPaymentOutput(CreatedPaymentOutput value) {
		this.createdPaymentOutput = value;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String value) {
		this.status = value;
	}
}
