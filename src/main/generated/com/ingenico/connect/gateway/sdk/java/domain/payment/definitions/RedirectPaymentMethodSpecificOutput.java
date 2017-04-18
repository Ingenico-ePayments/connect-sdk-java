/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.BankAccountIban;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_RedirectPaymentMethodSpecificOutput">RedirectPaymentMethodSpecificOutput</a>
 */
public class RedirectPaymentMethodSpecificOutput extends AbstractPaymentMethodSpecificOutput {

	private BankAccountIban bankAccountIban = null;

	private PaymentProduct836SpecificOutput paymentProduct836SpecificOutput = null;

	private PaymentProduct840SpecificOutput paymentProduct840SpecificOutput = null;

	public BankAccountIban getBankAccountIban() {
		return bankAccountIban;
	}

	public void setBankAccountIban(BankAccountIban value) {
		this.bankAccountIban = value;
	}

	public PaymentProduct836SpecificOutput getPaymentProduct836SpecificOutput() {
		return paymentProduct836SpecificOutput;
	}

	public void setPaymentProduct836SpecificOutput(PaymentProduct836SpecificOutput value) {
		this.paymentProduct836SpecificOutput = value;
	}

	public PaymentProduct840SpecificOutput getPaymentProduct840SpecificOutput() {
		return paymentProduct840SpecificOutput;
	}

	public void setPaymentProduct840SpecificOutput(PaymentProduct840SpecificOutput value) {
		this.paymentProduct840SpecificOutput = value;
	}
}
