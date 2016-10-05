/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.sessions;

import com.ingenico.connect.gateway.sdk.java.domain.sessions.definitions.PaymentProductFiltersClientSession;
import java.util.List;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_SessionRequest">SessionRequest</a>
 */
public class SessionRequest {

	private PaymentProductFiltersClientSession paymentProductFilters = null;

	private List<String> tokens = null;

	public PaymentProductFiltersClientSession getPaymentProductFilters() {
		return paymentProductFilters;
	}

	public void setPaymentProductFilters(PaymentProductFiltersClientSession value) {
		this.paymentProductFilters = value;
	}

	public List<String> getTokens() {
		return tokens;
	}

	public void setTokens(List<String> value) {
		this.tokens = value;
	}
}
