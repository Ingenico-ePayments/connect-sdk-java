/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_PaymentReferences">PaymentReferences</a>
 */
public class PaymentReferences {

	private Long merchantOrderId = null;

	private String merchantReference = null;

	private String paymentReference = null;

	private String providerId = null;

	private String providerReference = null;

	private String referenceOrigPayment = null;

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

	public String getPaymentReference() {
		return paymentReference;
	}

	public void setPaymentReference(String value) {
		this.paymentReference = value;
	}

	public String getProviderId() {
		return providerId;
	}

	public void setProviderId(String value) {
		this.providerId = value;
	}

	public String getProviderReference() {
		return providerReference;
	}

	public void setProviderReference(String value) {
		this.providerReference = value;
	}

	public String getReferenceOrigPayment() {
		return referenceOrigPayment;
	}

	public void setReferenceOrigPayment(String value) {
		this.referenceOrigPayment = value;
	}
}
