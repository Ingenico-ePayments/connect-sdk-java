/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.OrderStatusOutput;

public class PaymentStatusOutput extends OrderStatusOutput {

	private Boolean isAuthorized = null;

	private Boolean isRefundable = null;

	/**
	 * Indicates if the transaction has been authorized
	 * <ul><li>true
	 * <li>false
	 * </ul>
	 */
	public Boolean getIsAuthorized() {
		return isAuthorized;
	}

	/**
	 * Indicates if the transaction has been authorized
	 * <ul><li>true
	 * <li>false
	 * </ul>
	 */
	public void setIsAuthorized(Boolean value) {
		this.isAuthorized = value;
	}

	/**
	 * Flag indicating if the payment can be refunded
	 * <ul><li>true
	 * <li>false
	 * </ul>
	 */
	public Boolean getIsRefundable() {
		return isRefundable;
	}

	/**
	 * Flag indicating if the payment can be refunded
	 * <ul><li>true
	 * <li>false
	 * </ul>
	 */
	public void setIsRefundable(Boolean value) {
		this.isRefundable = value;
	}
}
