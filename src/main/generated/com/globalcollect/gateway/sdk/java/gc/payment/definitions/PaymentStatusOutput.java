package com.globalcollect.gateway.sdk.java.gc.payment.definitions;

import com.globalcollect.gateway.sdk.java.gc.fei.definitions.OrderStatusOutput;

public class PaymentStatusOutput extends OrderStatusOutput {

	private Boolean isAuthorized = null;

	public Boolean getIsAuthorized() {
		return isAuthorized;
	}

	public void setIsAuthorized(Boolean value) {
		this.isAuthorized = value;
	}
}
