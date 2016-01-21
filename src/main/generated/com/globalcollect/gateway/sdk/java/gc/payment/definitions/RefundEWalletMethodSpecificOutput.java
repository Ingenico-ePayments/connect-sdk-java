package com.globalcollect.gateway.sdk.java.gc.payment.definitions;

import com.globalcollect.gateway.sdk.java.gc.payment.definitions.RefundPaymentProduct840SpecificOutput;
import com.globalcollect.gateway.sdk.java.gc.payment.definitions.RefundMethodSpecificOutput;

public class RefundEWalletMethodSpecificOutput extends RefundMethodSpecificOutput {

	private RefundPaymentProduct840SpecificOutput paymentProduct840SpecificOutput = null;

	public RefundPaymentProduct840SpecificOutput getPaymentProduct840SpecificOutput() {
		return paymentProduct840SpecificOutput;
	}

	public void setPaymentProduct840SpecificOutput(RefundPaymentProduct840SpecificOutput value) {
		this.paymentProduct840SpecificOutput = value;
	}
}
