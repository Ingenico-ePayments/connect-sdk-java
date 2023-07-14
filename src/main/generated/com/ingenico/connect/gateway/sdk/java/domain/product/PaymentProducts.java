/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */

package com.ingenico.connect.gateway.sdk.java.domain.product;

import java.util.List;

import com.ingenico.connect.gateway.sdk.java.domain.product.definitions.PaymentProduct;

public class PaymentProducts {

	private List<PaymentProduct> paymentProducts = null;

	/**
	 * Array containing payment products and their characteristics
	 */
	public List<PaymentProduct> getPaymentProducts() {
		return paymentProducts;
	}

	/**
	 * Array containing payment products and their characteristics
	 */
	public void setPaymentProducts(List<PaymentProduct> value) {
		this.paymentProducts = value;
	}
}
