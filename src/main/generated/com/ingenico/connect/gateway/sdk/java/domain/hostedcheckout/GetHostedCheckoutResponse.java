/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.hostedcheckout;

import com.ingenico.connect.gateway.sdk.java.domain.hostedcheckout.definitions.CreatedPaymentOutput;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_GetHostedCheckoutResponse">GetHostedCheckoutResponse</a>
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
