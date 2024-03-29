/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/
 */

package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

public class PaymentReferences {

	private Long merchantOrderId = null;

	private String merchantReference = null;

	private String paymentReference = null;

	private String providerId = null;

	private String providerMerchantId = null;

	private String providerReference = null;

	private String referenceOrigPayment = null;

	/**
	 * Your order ID for this transaction that is also returned in our report files
	 */
	public Long getMerchantOrderId() {
		return merchantOrderId;
	}

	/**
	 * Your order ID for this transaction that is also returned in our report files
	 */
	public void setMerchantOrderId(Long value) {
		this.merchantOrderId = value;
	}

	/**
	 * Your unique reference of the transaction that is also returned in our report files. This is almost always used for your reconciliation of our report files.
	 */
	public String getMerchantReference() {
		return merchantReference;
	}

	/**
	 * Your unique reference of the transaction that is also returned in our report files. This is almost always used for your reconciliation of our report files.
	 */
	public void setMerchantReference(String value) {
		this.merchantReference = value;
	}

	/**
	 * Payment Reference generated by WebCollect
	 */
	public String getPaymentReference() {
		return paymentReference;
	}

	/**
	 * Payment Reference generated by WebCollect
	 */
	public void setPaymentReference(String value) {
		this.paymentReference = value;
	}

	/**
	 * Provides an additional means of reconciliation for Gateway merchants
	 */
	public String getProviderId() {
		return providerId;
	}

	/**
	 * Provides an additional means of reconciliation for Gateway merchants
	 */
	public void setProviderId(String value) {
		this.providerId = value;
	}

	/**
	 * Provides an additional means of reconciliation, this is the MerchantId used at the provider
	 */
	public String getProviderMerchantId() {
		return providerMerchantId;
	}

	/**
	 * Provides an additional means of reconciliation, this is the MerchantId used at the provider
	 */
	public void setProviderMerchantId(String value) {
		this.providerMerchantId = value;
	}

	/**
	 * Provides an additional means of reconciliation for Gateway merchants
	 */
	public String getProviderReference() {
		return providerReference;
	}

	/**
	 * Provides an additional means of reconciliation for Gateway merchants
	 */
	public void setProviderReference(String value) {
		this.providerReference = value;
	}

	/**
	 * When you did not supply a merchantReference for your payment, you need to fill this property with the reference of the original payment when you want to refund it
	 */
	public String getReferenceOrigPayment() {
		return referenceOrigPayment;
	}

	/**
	 * When you did not supply a merchantReference for your payment, you need to fill this property with the reference of the original payment when you want to refund it
	 */
	public void setReferenceOrigPayment(String value) {
		this.referenceOrigPayment = value;
	}
}
