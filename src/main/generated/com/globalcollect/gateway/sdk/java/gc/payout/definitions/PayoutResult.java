package com.globalcollect.gateway.sdk.java.gc.payout.definitions;

import com.globalcollect.gateway.sdk.java.gc.fei.definitions.OrderStatusOutput;
import com.globalcollect.gateway.sdk.java.gc.payment.definitions.OrderOutput;
import com.globalcollect.gateway.sdk.java.gc.fei.definitions.AbstractOrderStatus;

public class PayoutResult extends AbstractOrderStatus {

	private OrderOutput payoutOutput = null;

	private String status = null;

	private OrderStatusOutput statusOutput = null;

	public OrderOutput getPayoutOutput() {
		return payoutOutput;
	}

	public void setPayoutOutput(OrderOutput value) {
		this.payoutOutput = value;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String value) {
		this.status = value;
	}

	public OrderStatusOutput getStatusOutput() {
		return statusOutput;
	}

	public void setStatusOutput(OrderStatusOutput value) {
		this.statusOutput = value;
	}
}
