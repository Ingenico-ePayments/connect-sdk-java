/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payout.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.AbstractOrderStatus;
import com.ingenico.connect.gateway.sdk.java.domain.definitions.OrderStatusOutput;
import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.OrderOutput;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_PayoutResult">PayoutResult</a>
 */
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
