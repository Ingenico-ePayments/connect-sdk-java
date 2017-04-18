/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.AbstractPaymentMethodSpecificInput;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_RedirectPaymentMethodSpecificInputBase">RedirectPaymentMethodSpecificInputBase</a>
 */
public class RedirectPaymentMethodSpecificInputBase extends AbstractPaymentMethodSpecificInput {

	private Integer expirationPeriod = null;

	private String recurringPaymentSequenceIndicator = null;

	private String token = null;

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

	public String getToken() {
		return token;
	}

	public void setToken(String value) {
		this.token = value;
	}
}
