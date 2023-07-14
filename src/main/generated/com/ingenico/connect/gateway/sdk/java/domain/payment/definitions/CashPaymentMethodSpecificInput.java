/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */

package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

public class CashPaymentMethodSpecificInput extends AbstractCashPaymentMethodSpecificInput {

	@SuppressWarnings("deprecation")
	private CashPaymentProduct1503SpecificInput paymentProduct1503SpecificInput = null;

	private CashPaymentProduct1504SpecificInput paymentProduct1504SpecificInput = null;

	private CashPaymentProduct1521SpecificInput paymentProduct1521SpecificInput = null;

	private CashPaymentProduct1522SpecificInput paymentProduct1522SpecificInput = null;

	private CashPaymentProduct1523SpecificInput paymentProduct1523SpecificInput = null;

	private CashPaymentProduct1524SpecificInput paymentProduct1524SpecificInput = null;

	private CashPaymentProduct1526SpecificInput paymentProduct1526SpecificInput = null;

	/**
	 * Object that holds the specific data for Boleto Bancario in Brazil (payment product 1503)
	 *
	 * @deprecated No replacement
	 */
	@Deprecated
	public CashPaymentProduct1503SpecificInput getPaymentProduct1503SpecificInput() {
		return paymentProduct1503SpecificInput;
	}

	/**
	 * Object that holds the specific data for Boleto Bancario in Brazil (payment product 1503)
	 *
	 * @deprecated No replacement
	 */
	@Deprecated
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

	/**
	 * Object that holds the specific data for e-Pay (payment product 1521).
	 */
	public CashPaymentProduct1521SpecificInput getPaymentProduct1521SpecificInput() {
		return paymentProduct1521SpecificInput;
	}

	/**
	 * Object that holds the specific data for e-Pay (payment product 1521).
	 */
	public void setPaymentProduct1521SpecificInput(CashPaymentProduct1521SpecificInput value) {
		this.paymentProduct1521SpecificInput = value;
	}

	/**
	 * Object that holds the specific data for Tesco - Paysbuy Cash (payment product 1522).
	 */
	public CashPaymentProduct1522SpecificInput getPaymentProduct1522SpecificInput() {
		return paymentProduct1522SpecificInput;
	}

	/**
	 * Object that holds the specific data for Tesco - Paysbuy Cash (payment product 1522).
	 */
	public void setPaymentProduct1522SpecificInput(CashPaymentProduct1522SpecificInput value) {
		this.paymentProduct1522SpecificInput = value;
	}

	/**
	 * Object that holds the specific data for ATM Transfers Indonesia(payment product 1523).
	 */
	public CashPaymentProduct1523SpecificInput getPaymentProduct1523SpecificInput() {
		return paymentProduct1523SpecificInput;
	}

	/**
	 * Object that holds the specific data for ATM Transfers Indonesia(payment product 1523).
	 */
	public void setPaymentProduct1523SpecificInput(CashPaymentProduct1523SpecificInput value) {
		this.paymentProduct1523SpecificInput = value;
	}

	/**
	 * Object that holds the specific data for DragonPay (payment product 1524).
	 */
	public CashPaymentProduct1524SpecificInput getPaymentProduct1524SpecificInput() {
		return paymentProduct1524SpecificInput;
	}

	/**
	 * Object that holds the specific data for DragonPay (payment product 1524).
	 */
	public void setPaymentProduct1524SpecificInput(CashPaymentProduct1524SpecificInput value) {
		this.paymentProduct1524SpecificInput = value;
	}

	/**
	 * Object that holds the specific data for 7-11 MOLPay Cash (payment product 1526).
	 */
	public CashPaymentProduct1526SpecificInput getPaymentProduct1526SpecificInput() {
		return paymentProduct1526SpecificInput;
	}

	/**
	 * Object that holds the specific data for 7-11 MOLPay Cash (payment product 1526).
	 */
	public void setPaymentProduct1526SpecificInput(CashPaymentProduct1526SpecificInput value) {
		this.paymentProduct1526SpecificInput = value;
	}
}
