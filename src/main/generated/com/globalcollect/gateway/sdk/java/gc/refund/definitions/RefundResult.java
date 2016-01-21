package com.globalcollect.gateway.sdk.java.gc.refund.definitions;

import com.globalcollect.gateway.sdk.java.gc.fei.definitions.OrderStatusOutput;
import com.globalcollect.gateway.sdk.java.gc.payment.definitions.RefundOutput;
import com.globalcollect.gateway.sdk.java.gc.fei.definitions.AbstractOrderStatus;

public class RefundResult extends AbstractOrderStatus {

	private RefundOutput refundOutput = null;

	private String status = null;

	private OrderStatusOutput statusOutput = null;

	public RefundOutput getRefundOutput() {
		return refundOutput;
	}

	public void setRefundOutput(RefundOutput value) {
		this.refundOutput = value;
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
