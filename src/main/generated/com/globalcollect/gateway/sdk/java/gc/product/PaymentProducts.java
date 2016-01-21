package com.globalcollect.gateway.sdk.java.gc.product;

import com.globalcollect.gateway.sdk.java.gc.product.definitions.PaymentProduct;
import java.util.List;

/**
 * class PaymentProducts
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
