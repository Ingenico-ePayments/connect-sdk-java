package com.globalcollect.gateway.sdk.java.gc.product;

import com.globalcollect.gateway.sdk.java.gc.product.definitions.PaymentProductGroup;
import java.util.List;

/**
 * class PaymentProductGroups
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
