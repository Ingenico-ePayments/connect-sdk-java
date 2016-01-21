package com.globalcollect.gateway.sdk.java.gc.payment.definitions;

import com.globalcollect.gateway.sdk.java.gc.fei.definitions.AbstractPaymentMethodSpecificInput;

public class RedirectPaymentMethodSpecificInputBase extends AbstractPaymentMethodSpecificInput {

	private String recurringPaymentSequenceIndicator = null;

	private String token = null;

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
