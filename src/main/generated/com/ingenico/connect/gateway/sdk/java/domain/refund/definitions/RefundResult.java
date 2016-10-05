/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.refund.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.OrderStatusOutput;
import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.RefundOutput;
import com.ingenico.connect.gateway.sdk.java.domain.definitions.AbstractOrderStatus;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_RefundResult">RefundResult</a>
 */
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
