/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.RefundPaymentProduct840SpecificOutput;
import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.RefundMethodSpecificOutput;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_RefundEWalletMethodSpecificOutput">RefundEWalletMethodSpecificOutput</a>
 */
public class RefundEWalletMethodSpecificOutput extends RefundMethodSpecificOutput {

	private RefundPaymentProduct840SpecificOutput paymentProduct840SpecificOutput = null;

	public RefundPaymentProduct840SpecificOutput getPaymentProduct840SpecificOutput() {
		return paymentProduct840SpecificOutput;
	}

	public void setPaymentProduct840SpecificOutput(RefundPaymentProduct840SpecificOutput value) {
		this.paymentProduct840SpecificOutput = value;
	}
}
