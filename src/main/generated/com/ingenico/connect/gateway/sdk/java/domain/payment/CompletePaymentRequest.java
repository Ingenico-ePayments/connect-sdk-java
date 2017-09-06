/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment;

import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.CompletePaymentCardPaymentMethodSpecificInput;
import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.Order;

public class CompletePaymentRequest {

	private CompletePaymentCardPaymentMethodSpecificInput cardPaymentMethodSpecificInput = null;

	private Order order = null;

	/**
	 * Object containing the specific input details for card payments
	 */
	public CompletePaymentCardPaymentMethodSpecificInput getCardPaymentMethodSpecificInput() {
		return cardPaymentMethodSpecificInput;
	}

	/**
	 * Object containing the specific input details for card payments
	 */
	public void setCardPaymentMethodSpecificInput(CompletePaymentCardPaymentMethodSpecificInput value) {
		this.cardPaymentMethodSpecificInput = value;
	}

	/**
	 * Order object containing order related data
	 */
	public Order getOrder() {
		return order;
	}

	/**
	 * Order object containing order related data
	 */
	public void setOrder(Order value) {
		this.order = value;
	}
}
