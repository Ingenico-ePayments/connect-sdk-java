/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.hostedcheckout.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.Payment;
import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.PaymentCreationReferences;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_CreatedPaymentOutput">CreatedPaymentOutput</a>
 */
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
