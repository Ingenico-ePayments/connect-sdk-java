/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

/**
 * Please find below specific input fields for payment product 4101 (UPI)
 */
public class RedirectPaymentProduct4101SpecificInput {

	private String integrationType = null;

	private String merchantName = null;

	private String transactionNote = null;

	private String vpa = null;

	/**
	 * The value of this property must be either or 'vpa', 'QRCode', or 'urlIntent'.
	 */
	public String getIntegrationType() {
		return integrationType;
	}

	/**
	 * The value of this property must be either or 'vpa', 'QRCode', or 'urlIntent'.
	 */
	public void setIntegrationType(String value) {
		this.integrationType = value;
	}

	/**
	 * The merchant name as shown to the customer in some payment applications.
	 */
	public String getMerchantName() {
		return merchantName;
	}

	/**
	 * The merchant name as shown to the customer in some payment applications.
	 */
	public void setMerchantName(String value) {
		this.merchantName = value;
	}

	/**
	 * Some additional transaction information as shown to the customer in some payment applications.
	 */
	public String getTransactionNote() {
		return transactionNote;
	}

	/**
	 * Some additional transaction information as shown to the customer in some payment applications.
	 */
	public void setTransactionNote(String value) {
		this.transactionNote = value;
	}

	/**
	 * The Virtual Payment Address (VPA) of the customer.
	 */
	public String getVpa() {
		return vpa;
	}

	/**
	 * The Virtual Payment Address (VPA) of the customer.
	 */
	public void setVpa(String value) {
		this.vpa = value;
	}
}
