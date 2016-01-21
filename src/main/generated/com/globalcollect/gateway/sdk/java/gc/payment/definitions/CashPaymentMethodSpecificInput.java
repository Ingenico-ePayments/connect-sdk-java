package com.globalcollect.gateway.sdk.java.gc.payment.definitions;

import com.globalcollect.gateway.sdk.java.gc.payment.definitions.CashPaymentProduct1503SpecificInput;
import com.globalcollect.gateway.sdk.java.gc.payment.definitions.CashPaymentProduct1504SpecificInput;
import com.globalcollect.gateway.sdk.java.gc.payment.definitions.CashPaymentMethodSpecificInputBase;

public class CashPaymentMethodSpecificInput extends CashPaymentMethodSpecificInputBase {

	private CashPaymentProduct1503SpecificInput paymentProduct1503SpecificInput = null;

	private CashPaymentProduct1504SpecificInput paymentProduct1504SpecificInput = null;

	public CashPaymentProduct1503SpecificInput getPaymentProduct1503SpecificInput() {
		return paymentProduct1503SpecificInput;
	}

	public void setPaymentProduct1503SpecificInput(CashPaymentProduct1503SpecificInput value) {
		this.paymentProduct1503SpecificInput = value;
	}

	public CashPaymentProduct1504SpecificInput getPaymentProduct1504SpecificInput() {
		return paymentProduct1504SpecificInput;
	}

	public void setPaymentProduct1504SpecificInput(CashPaymentProduct1504SpecificInput value) {
		this.paymentProduct1504SpecificInput = value;
	}
}
