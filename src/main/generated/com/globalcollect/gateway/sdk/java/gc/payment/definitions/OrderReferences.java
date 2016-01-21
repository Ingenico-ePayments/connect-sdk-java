package com.globalcollect.gateway.sdk.java.gc.payment.definitions;

import com.globalcollect.gateway.sdk.java.gc.payment.definitions.OrderInvoiceData;

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
