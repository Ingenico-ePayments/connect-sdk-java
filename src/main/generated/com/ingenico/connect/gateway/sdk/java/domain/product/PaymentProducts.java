/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.product;

import java.util.List;

import com.ingenico.connect.gateway.sdk.java.domain.product.definitions.PaymentProduct;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_PaymentProducts">PaymentProducts</a>
 */
public class PaymentProducts {

	private List<PaymentProduct> paymentProducts = null;

	public List<PaymentProduct> getPaymentProducts() {
		return paymentProducts;
	}

	public void setPaymentProducts(List<PaymentProduct> value) {
		this.paymentProducts = value;
	}
}
