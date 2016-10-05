/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.OrderStatusOutput;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_PaymentStatusOutput">PaymentStatusOutput</a>
 */
public class PaymentStatusOutput extends OrderStatusOutput {

	private Boolean isAuthorized = null;

	private Boolean isRefundable = null;

	public Boolean getIsAuthorized() {
		return isAuthorized;
	}

	public void setIsAuthorized(Boolean value) {
		this.isAuthorized = value;
	}

	public Boolean getIsRefundable() {
		return isRefundable;
	}

	public void setIsRefundable(Boolean value) {
		this.isRefundable = value;
	}
}
