package com.globalcollect.gateway.sdk.java.gc.payment.definitions;

import com.globalcollect.gateway.sdk.java.gc.payment.definitions.NonSepaDirectDebitPaymentProduct705SpecificInput;
import com.globalcollect.gateway.sdk.java.gc.payment.definitions.NonSepaDirectDebitPaymentProduct707SpecificInput;
import com.globalcollect.gateway.sdk.java.gc.fei.definitions.AbstractPaymentMethodSpecificInput;

public class NonSepaDirectDebitPaymentMethodSpecificInput extends AbstractPaymentMethodSpecificInput {

	private String dateCollect = null;

	private String directDebitText = null;

	private Boolean isRecurring = null;

	private NonSepaDirectDebitPaymentProduct705SpecificInput paymentProduct705SpecificInput = null;

	private NonSepaDirectDebitPaymentProduct707SpecificInput paymentProduct707SpecificInput = null;

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

	public NonSepaDirectDebitPaymentProduct705SpecificInput getPaymentProduct705SpecificInput() {
		return paymentProduct705SpecificInput;
	}

	public void setPaymentProduct705SpecificInput(NonSepaDirectDebitPaymentProduct705SpecificInput value) {
		this.paymentProduct705SpecificInput = value;
	}

	public NonSepaDirectDebitPaymentProduct707SpecificInput getPaymentProduct707SpecificInput() {
		return paymentProduct707SpecificInput;
	}

	public void setPaymentProduct707SpecificInput(NonSepaDirectDebitPaymentProduct707SpecificInput value) {
		this.paymentProduct707SpecificInput = value;
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
