/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.sessions;

import java.util.List;

import com.ingenico.connect.gateway.sdk.java.domain.sessions.definitions.PaymentProductFiltersClientSession;

public class SessionRequest {

	private PaymentProductFiltersClientSession paymentProductFilters = null;

	private List<String> tokens = null;

	/**
	 * Restrict the payment products available for payment completion by restricting to and excluding certain payment products and payment product groups.
	 */
	public PaymentProductFiltersClientSession getPaymentProductFilters() {
		return paymentProductFilters;
	}

	/**
	 * Restrict the payment products available for payment completion by restricting to and excluding certain payment products and payment product groups.
	 */
	public void setPaymentProductFilters(PaymentProductFiltersClientSession value) {
		this.paymentProductFilters = value;
	}

	/**
	 * List of previously stored tokens linked to the customer that wants to checkout.
	 */
	public List<String> getTokens() {
		return tokens;
	}

	/**
	 * List of previously stored tokens linked to the customer that wants to checkout.
	 */
	public void setTokens(List<String> value) {
		this.tokens = value;
	}
}
