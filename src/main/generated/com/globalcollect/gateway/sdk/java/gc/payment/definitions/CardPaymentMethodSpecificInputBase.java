package com.globalcollect.gateway.sdk.java.gc.payment.definitions;

import com.globalcollect.gateway.sdk.java.gc.fei.definitions.AbstractPaymentMethodSpecificInput;

public class CardPaymentMethodSpecificInputBase extends AbstractPaymentMethodSpecificInput {

	private String customerReference = null;

	private String recurringPaymentSequenceIndicator = null;

	private Boolean skipAuthentication = null;

	private Boolean skipFraudService = null;

	private String token = null;

	public String getCustomerReference() {
		return customerReference;
	}

	public void setCustomerReference(String value) {
		this.customerReference = value;
	}

	public String getRecurringPaymentSequenceIndicator() {
		return recurringPaymentSequenceIndicator;
	}

	public void setRecurringPaymentSequenceIndicator(String value) {
		this.recurringPaymentSequenceIndicator = value;
	}

	public Boolean getSkipAuthentication() {
		return skipAuthentication;
	}

	public void setSkipAuthentication(Boolean value) {
		this.skipAuthentication = value;
	}

	public Boolean getSkipFraudService() {
		return skipFraudService;
	}

	public void setSkipFraudService(Boolean value) {
		this.skipFraudService = value;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String value) {
		this.token = value;
	}
}
