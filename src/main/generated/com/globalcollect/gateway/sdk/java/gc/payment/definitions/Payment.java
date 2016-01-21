package com.globalcollect.gateway.sdk.java.gc.payment.definitions;

import com.globalcollect.gateway.sdk.java.gc.payment.definitions.PaymentOutput;
import com.globalcollect.gateway.sdk.java.gc.payment.definitions.PaymentStatusOutput;
import com.globalcollect.gateway.sdk.java.gc.fei.definitions.AbstractOrderStatus;

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
