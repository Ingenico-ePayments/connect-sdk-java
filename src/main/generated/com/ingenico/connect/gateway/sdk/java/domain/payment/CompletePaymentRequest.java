/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/
 */

package com.ingenico.connect.gateway.sdk.java.domain.payment;

import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.CompletePaymentCardPaymentMethodSpecificInput;
import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.Merchant;
import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.Order;

public class CompletePaymentRequest {

	private CompletePaymentCardPaymentMethodSpecificInput cardPaymentMethodSpecificInput = null;

	private Merchant merchant = null;

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
	 * Object containing information on you, the merchant
	 */
	public Merchant getMerchant() {
		return merchant;
	}

	/**
	 * Object containing information on you, the merchant
	 */
	public void setMerchant(Merchant value) {
		this.merchant = value;
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
