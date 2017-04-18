/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_CashPaymentMethodSpecificInput">CashPaymentMethodSpecificInput</a>
 */
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
