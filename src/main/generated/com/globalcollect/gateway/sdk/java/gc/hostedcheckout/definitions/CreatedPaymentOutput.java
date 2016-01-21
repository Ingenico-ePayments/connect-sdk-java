package com.globalcollect.gateway.sdk.java.gc.hostedcheckout.definitions;

import com.globalcollect.gateway.sdk.java.gc.hostedcheckout.definitions.DisplayedData;
import com.globalcollect.gateway.sdk.java.gc.payment.definitions.Payment;
import com.globalcollect.gateway.sdk.java.gc.payment.definitions.PaymentCreationReferences;

public class CreatedPaymentOutput {

	private DisplayedData displayedData = null;

	private Payment payment = null;

	private PaymentCreationReferences paymentCreationReferences = null;

	private String paymentStatusCategory = null;

	private String tokens = null;

	public DisplayedData getDisplayedData() {
		return displayedData;
	}

	public void setDisplayedData(DisplayedData value) {
		this.displayedData = value;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment value) {
		this.payment = value;
	}

	public PaymentCreationReferences getPaymentCreationReferences() {
		return paymentCreationReferences;
	}

	public void setPaymentCreationReferences(PaymentCreationReferences value) {
		this.paymentCreationReferences = value;
	}

	public String getPaymentStatusCategory() {
		return paymentStatusCategory;
	}

	public void setPaymentStatusCategory(String value) {
		this.paymentStatusCategory = value;
	}

	public String getTokens() {
		return tokens;
	}

	public void setTokens(String value) {
		this.tokens = value;
	}
}
