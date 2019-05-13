/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.hostedcheckout.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.PaymentProductFilter;

public class PaymentProductFiltersHostedCheckout {

	private PaymentProductFilter exclude = null;

	private PaymentProductFilter restrictTo = null;

	private Boolean tokensOnly = null;

	/**
	 * Contains the payment product ids and payment product groups that should be excluded from the payment products available for the payment. Note that excluding a payment product will ensure exclusion, even if the payment product is also present in the restrictTo filter, and that excluding a payment product group will exclude all payment products that are a part of that group, even if one or more of them are present in the restrictTo filters.
	 */
	public PaymentProductFilter getExclude() {
		return exclude;
	}

	/**
	 * Contains the payment product ids and payment product groups that should be excluded from the payment products available for the payment. Note that excluding a payment product will ensure exclusion, even if the payment product is also present in the restrictTo filter, and that excluding a payment product group will exclude all payment products that are a part of that group, even if one or more of them are present in the restrictTo filters.
	 */
	public void setExclude(PaymentProductFilter value) {
		this.exclude = value;
	}

	/**
	 * Contains the payment product ids and payment product groups that should be at most contained in the payment products available for completing the payment. Note that the list of payment products available for completing the payment will only contain payment products present in these filters, but not all payment products in these filters might be present in the list. Some of them might not be allowed in context or they might be present in the exclude filters.
	 */
	public PaymentProductFilter getRestrictTo() {
		return restrictTo;
	}

	/**
	 * Contains the payment product ids and payment product groups that should be at most contained in the payment products available for completing the payment. Note that the list of payment products available for completing the payment will only contain payment products present in these filters, but not all payment products in these filters might be present in the list. Some of them might not be allowed in context or they might be present in the exclude filters.
	 */
	public void setRestrictTo(PaymentProductFilter value) {
		this.restrictTo = value;
	}

	/**
	 * <ul class="paragraph-width">
	 * <li>true - The customer may only complete the payment using one of the provided accounts on file.
	 * <li>false -The customer can complete the payment using any way they like, as long as it is allowed in the payment context. Default.
	 * </ul>
	 * Note that the request must contain at least one valid account on file with an allowed payment product (not excluded and allowed in context) if this property is set to true, else the request will fail.
	 */
	public Boolean getTokensOnly() {
		return tokensOnly;
	}

	/**
	 * <ul class="paragraph-width">
	 * <li>true - The customer may only complete the payment using one of the provided accounts on file.
	 * <li>false -The customer can complete the payment using any way they like, as long as it is allowed in the payment context. Default.
	 * </ul>
	 * Note that the request must contain at least one valid account on file with an allowed payment product (not excluded and allowed in context) if this property is set to true, else the request will fail.
	 */
	public void setTokensOnly(Boolean value) {
		this.tokensOnly = value;
	}
}
