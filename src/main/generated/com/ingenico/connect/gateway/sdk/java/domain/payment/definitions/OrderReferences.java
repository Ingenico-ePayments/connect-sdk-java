/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.OrderInvoiceData;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_OrderReferences">OrderReferences</a>
 */
public class OrderReferences {

	private String descriptor = null;

	private OrderInvoiceData invoiceData = null;

	private Long merchantOrderId = null;

	private String merchantReference = null;

	public String getDescriptor() {
		return descriptor;
	}

	public void setDescriptor(String value) {
		this.descriptor = value;
	}

	public OrderInvoiceData getInvoiceData() {
		return invoiceData;
	}

	public void setInvoiceData(OrderInvoiceData value) {
		this.invoiceData = value;
	}

	public Long getMerchantOrderId() {
		return merchantOrderId;
	}

	public void setMerchantOrderId(Long value) {
		this.merchantOrderId = value;
	}

	public String getMerchantReference() {
		return merchantReference;
	}

	public void setMerchantReference(String value) {
		this.merchantReference = value;
	}
}
