/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

/**
 * Contains specific input required for UPI payments.
 */
public class RedirectPaymentProduct4101SpecificInput {

	private String integrationType = null;

	private String vpa = null;

	/**
	 * The integration type to be used in the UPI payment
	 */
	public String getIntegrationType() {
		return integrationType;
	}

	/**
	 * The integration type to be used in the UPI payment
	 */
	public void setIntegrationType(String value) {
		this.integrationType = value;
	}

	/**
	 * The virtual payment address.
	 */
	public String getVpa() {
		return vpa;
	}

	/**
	 * The virtual payment address.
	 */
	public void setVpa(String value) {
		this.vpa = value;
	}
}
