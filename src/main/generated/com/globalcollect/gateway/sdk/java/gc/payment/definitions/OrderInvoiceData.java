package com.globalcollect.gateway.sdk.java.gc.payment.definitions;

import java.util.List;

public class OrderInvoiceData {

	private String additionalData = null;

	private String invoiceDate = null;

	private String invoiceNumber = null;

	private List<String> textQualifiers = null;

	public String getAdditionalData() {
		return additionalData;
	}

	public void setAdditionalData(String value) {
		this.additionalData = value;
	}

	public String getInvoiceDate() {
		return invoiceDate;
	}

	public void setInvoiceDate(String value) {
		this.invoiceDate = value;
	}

	public String getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(String value) {
		this.invoiceNumber = value;
	}

	public List<String> getTextQualifiers() {
		return textQualifiers;
	}

	public void setTextQualifiers(List<String> value) {
		this.textQualifiers = value;
	}
}
