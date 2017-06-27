/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.product;

import java.util.List;

import com.ingenico.connect.gateway.sdk.java.domain.product.definitions.PaymentProductGroup;

public class PaymentProductGroups {

	private List<PaymentProductGroup> paymentProductGroups = null;

	/**
	 * Array containing payment product groups and their characteristics
	 */
	public List<PaymentProductGroup> getPaymentProductGroups() {
		return paymentProductGroups;
	}

	/**
	 * Array containing payment product groups and their characteristics
	 */
	public void setPaymentProductGroups(List<PaymentProductGroup> value) {
		this.paymentProductGroups = value;
	}
}
