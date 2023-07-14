/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */

package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

import java.util.List;

public class OrderInvoiceData {

	private String additionalData = null;

	private String invoiceDate = null;

	private String invoiceNumber = null;

	private List<String> textQualifiers = null;

	/**
	 * Additional data for printed invoices
	 */
	public String getAdditionalData() {
		return additionalData;
	}

	/**
	 * Additional data for printed invoices
	 */
	public void setAdditionalData(String value) {
		this.additionalData = value;
	}

	/**
	 * Date and time on invoice<br>
	 * Format: YYYYMMDDHH24MISS
	 */
	public String getInvoiceDate() {
		return invoiceDate;
	}

	/**
	 * Date and time on invoice<br>
	 * Format: YYYYMMDDHH24MISS
	 */
	public void setInvoiceDate(String value) {
		this.invoiceDate = value;
	}

	/**
	 * Your invoice number (on printed invoice) that is also returned in our report files
	 */
	public String getInvoiceNumber() {
		return invoiceNumber;
	}

	/**
	 * Your invoice number (on printed invoice) that is also returned in our report files
	 */
	public void setInvoiceNumber(String value) {
		this.invoiceNumber = value;
	}

	/**
	 * Array of 3 text qualifiers, each with a max length of 10 characters
	 */
	public List<String> getTextQualifiers() {
		return textQualifiers;
	}

	/**
	 * Array of 3 text qualifiers, each with a max length of 10 characters
	 */
	public void setTextQualifiers(List<String> value) {
		this.textQualifiers = value;
	}
}
