/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.product;

import java.util.List;

import com.ingenico.connect.gateway.sdk.java.domain.product.definitions.PaymentProductGroup;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_PaymentProductGroups">PaymentProductGroups</a>
 */
public class PaymentProductGroups {

	private List<PaymentProductGroup> paymentProductGroups = null;

	public List<PaymentProductGroup> getPaymentProductGroups() {
		return paymentProductGroups;
	}

	public void setPaymentProductGroups(List<PaymentProductGroup> value) {
		this.paymentProductGroups = value;
	}
}
