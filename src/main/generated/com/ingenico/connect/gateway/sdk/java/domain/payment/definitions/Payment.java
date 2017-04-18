/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.AbstractOrderStatus;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_Payment">Payment</a>
 */
public class Payment extends AbstractOrderStatus {

	private PaymentOutput paymentOutput = null;

	private String status = null;

	private PaymentStatusOutput statusOutput = null;

	public PaymentOutput getPaymentOutput() {
		return paymentOutput;
	}

	public void setPaymentOutput(PaymentOutput value) {
		this.paymentOutput = value;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String value) {
		this.status = value;
	}

	public PaymentStatusOutput getStatusOutput() {
		return statusOutput;
	}

	public void setStatusOutput(PaymentStatusOutput value) {
		this.statusOutput = value;
	}
}
