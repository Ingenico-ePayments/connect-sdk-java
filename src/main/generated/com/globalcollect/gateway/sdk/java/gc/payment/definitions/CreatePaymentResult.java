package com.globalcollect.gateway.sdk.java.gc.payment.definitions;

import com.globalcollect.gateway.sdk.java.gc.payment.definitions.MerchantAction;
import com.globalcollect.gateway.sdk.java.gc.payment.definitions.Payment;
import com.globalcollect.gateway.sdk.java.gc.payment.definitions.PaymentCreationOutput;

public class CreatePaymentResult {

	private PaymentCreationOutput creationOutput = null;

	private MerchantAction merchantAction = null;

	private Payment payment = null;

	public PaymentCreationOutput getCreationOutput() {
		return creationOutput;
	}

	public void setCreationOutput(PaymentCreationOutput value) {
		this.creationOutput = value;
	}

	public MerchantAction getMerchantAction() {
		return merchantAction;
	}

	public void setMerchantAction(MerchantAction value) {
		this.merchantAction = value;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment value) {
		this.payment = value;
	}
}
