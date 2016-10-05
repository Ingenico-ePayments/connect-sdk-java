/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

import java.util.List;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_OrderInvoiceData">OrderInvoiceData</a>
 */
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
