/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.AbstractPaymentMethodSpecificInput;

public class AbstractRedirectPaymentMethodSpecificInput extends AbstractPaymentMethodSpecificInput {

	private Integer expirationPeriod = null;

	private String recurringPaymentSequenceIndicator = null;

	private Boolean requiresApproval = null;

	private String token = null;

	private Boolean tokenize = null;

	public Integer getExpirationPeriod() {
		return expirationPeriod;
	}

	public void setExpirationPeriod(Integer value) {
		this.expirationPeriod = value;
	}

	public String getRecurringPaymentSequenceIndicator() {
		return recurringPaymentSequenceIndicator;
	}

	public void setRecurringPaymentSequenceIndicator(String value) {
		this.recurringPaymentSequenceIndicator = value;
	}

	public Boolean getRequiresApproval() {
		return requiresApproval;
	}

	public void setRequiresApproval(Boolean value) {
		this.requiresApproval = value;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String value) {
		this.token = value;
	}

	public Boolean getTokenize() {
		return tokenize;
	}

	public void setTokenize(Boolean value) {
		this.tokenize = value;
	}
}
