/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payout.definitions;


/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_PayoutReferences">PayoutReferences</a>
 */
public class PayoutReferences {

	private String invoiceNumber = null;

	private Long merchantOrderId = null;

	private String merchantReference = null;

	public String getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(String value) {
		this.invoiceNumber = value;
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
