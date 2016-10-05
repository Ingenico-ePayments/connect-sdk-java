/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.hostedcheckout.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.PaymentProductFilter;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_PaymentProductFiltersHostedCheckout">PaymentProductFiltersHostedCheckout</a>
 */
public class PaymentProductFiltersHostedCheckout {

	private PaymentProductFilter exclude = null;

	private PaymentProductFilter restrictTo = null;

	private Boolean tokensOnly = null;

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

	public Boolean getTokensOnly() {
		return tokensOnly;
	}

	public void setTokensOnly(Boolean value) {
		this.tokensOnly = value;
	}
}
