/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

public class CashPaymentMethodSpecificInput extends AbstractCashPaymentMethodSpecificInput {

	private CashPaymentProduct1503SpecificInput paymentProduct1503SpecificInput = null;

	private CashPaymentProduct1504SpecificInput paymentProduct1504SpecificInput = null;

	/**
	 * Object that holds the specific data for Boleto Bancario in Brazil (payment product 1503)
	 */
	public CashPaymentProduct1503SpecificInput getPaymentProduct1503SpecificInput() {
		return paymentProduct1503SpecificInput;
	}

	/**
	 * Object that holds the specific data for Boleto Bancario in Brazil (payment product 1503)
	 */
	public void setPaymentProduct1503SpecificInput(CashPaymentProduct1503SpecificInput value) {
		this.paymentProduct1503SpecificInput = value;
	}

	/**
	 * Object that holds the specific data for Konbini in Japan (payment product 1504)
	 */
	public CashPaymentProduct1504SpecificInput getPaymentProduct1504SpecificInput() {
		return paymentProduct1504SpecificInput;
	}

	/**
	 * Object that holds the specific data for Konbini in Japan (payment product 1504)
	 */
	public void setPaymentProduct1504SpecificInput(CashPaymentProduct1504SpecificInput value) {
		this.paymentProduct1504SpecificInput = value;
	}
}
