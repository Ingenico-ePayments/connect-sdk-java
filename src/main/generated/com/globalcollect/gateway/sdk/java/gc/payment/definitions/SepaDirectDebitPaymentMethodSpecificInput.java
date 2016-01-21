package com.globalcollect.gateway.sdk.java.gc.payment.definitions;

import com.globalcollect.gateway.sdk.java.gc.fei.definitions.AbstractPaymentMethodSpecificInput;

public class SepaDirectDebitPaymentMethodSpecificInput extends AbstractPaymentMethodSpecificInput {

	private String dateCollect = null;

	private String directDebitText = null;

	private Boolean isRecurring = null;

	private String recurringPaymentSequenceIndicator = null;

	private String token = null;

	public String getDateCollect() {
		return dateCollect;
	}

	public void setDateCollect(String value) {
		this.dateCollect = value;
	}

	public String getDirectDebitText() {
		return directDebitText;
	}

	public void setDirectDebitText(String value) {
		this.directDebitText = value;
	}

	public Boolean getIsRecurring() {
		return isRecurring;
	}

	public void setIsRecurring(Boolean value) {
		this.isRecurring = value;
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
