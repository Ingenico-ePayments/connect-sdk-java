/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.MerchantAction;
import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.Payment;
import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.PaymentCreationOutput;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_CreatePaymentResult">CreatePaymentResult</a>
 */
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
