package com.globalcollect.gateway.sdk.java.gc.payment.definitions;

import com.globalcollect.gateway.sdk.java.gc.fei.definitions.BankAccountIban;
import com.globalcollect.gateway.sdk.java.gc.payment.definitions.PaymentProduct836SpecificOutput;
import com.globalcollect.gateway.sdk.java.gc.payment.definitions.PaymentProduct840SpecificOutput;
import com.globalcollect.gateway.sdk.java.gc.payment.definitions.AbstractPaymentMethodSpecificOutput;

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
