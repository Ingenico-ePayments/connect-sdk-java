/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.sessions.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.PaymentProductFilter;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_PaymentProductFiltersClientSession">PaymentProductFiltersClientSession</a>
 */
public class PaymentProductFiltersClientSession {

	private PaymentProductFilter exclude = null;

	private PaymentProductFilter restrictTo = null;

	public PaymentProductFilter getExclude() {
		return exclude;
	}

	public void setExclude(PaymentProductFilter value) {
		this.exclude = value;
	}

	public PaymentProductFilter getRestrictTo() {
		return restrictTo;
	}

	public void setRestrictTo(PaymentProductFilter value) {
		this.restrictTo = value;
	}
}
