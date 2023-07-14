/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */

package com.ingenico.connect.gateway.sdk.java.domain.sessions.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.PaymentProductFilter;

public class PaymentProductFiltersClientSession {

	private PaymentProductFilter exclude = null;

	private PaymentProductFilter restrictTo = null;

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
}
