/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.hostedcheckout;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.FraudFields;
import com.ingenico.connect.gateway.sdk.java.domain.hostedcheckout.definitions.HostedCheckoutSpecificInput;
import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.BankTransferPaymentMethodSpecificInputBase;
import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.CardPaymentMethodSpecificInputBase;
import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.CashPaymentMethodSpecificInputBase;
import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.Order;
import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.RedirectPaymentMethodSpecificInputBase;

public class CreateHostedCheckoutRequest {

	private BankTransferPaymentMethodSpecificInputBase bankTransferPaymentMethodSpecificInput = null;

	private CardPaymentMethodSpecificInputBase cardPaymentMethodSpecificInput = null;

	private CashPaymentMethodSpecificInputBase cashPaymentMethodSpecificInput = null;

	private FraudFields fraudFields = null;

	private HostedCheckoutSpecificInput hostedCheckoutSpecificInput = null;

	private Order order = null;

	private RedirectPaymentMethodSpecificInputBase redirectPaymentMethodSpecificInput = null;

	/**
	 * Object containing the specific input details for bank transfer payments
	 */
	public BankTransferPaymentMethodSpecificInputBase getBankTransferPaymentMethodSpecificInput() {
		return bankTransferPaymentMethodSpecificInput;
	}

	/**
	 * Object containing the specific input details for bank transfer payments
	 */
	public void setBankTransferPaymentMethodSpecificInput(BankTransferPaymentMethodSpecificInputBase value) {
		this.bankTransferPaymentMethodSpecificInput = value;
	}

	/**
	 * Object containing the specific input details for card payments
	 */
	public CardPaymentMethodSpecificInputBase getCardPaymentMethodSpecificInput() {
		return cardPaymentMethodSpecificInput;
	}

	/**
	 * Object containing the specific input details for card payments
	 */
	public void setCardPaymentMethodSpecificInput(CardPaymentMethodSpecificInputBase value) {
		this.cardPaymentMethodSpecificInput = value;
	}

	/**
	 * Object containing the specific input details for cash payments
	 */
	public CashPaymentMethodSpecificInputBase getCashPaymentMethodSpecificInput() {
		return cashPaymentMethodSpecificInput;
	}

	/**
	 * Object containing the specific input details for cash payments
	 */
	public void setCashPaymentMethodSpecificInput(CashPaymentMethodSpecificInputBase value) {
		this.cashPaymentMethodSpecificInput = value;
	}

	/**
	 * Object containing additional data that will be used to assess the risk of fraud
	 */
	public FraudFields getFraudFields() {
		return fraudFields;
	}

	/**
	 * Object containing additional data that will be used to assess the risk of fraud
	 */
	public void setFraudFields(FraudFields value) {
		this.fraudFields = value;
	}

	/**
	 * Object containing hosted checkout specific data
	 */
	public HostedCheckoutSpecificInput getHostedCheckoutSpecificInput() {
		return hostedCheckoutSpecificInput;
	}

	/**
	 * Object containing hosted checkout specific data
	 */
	public void setHostedCheckoutSpecificInput(HostedCheckoutSpecificInput value) {
		this.hostedCheckoutSpecificInput = value;
	}

	/**
	 * Order object containing order related data
	 */
	public Order getOrder() {
		return order;
	}

	/**
	 * Order object containing order related data
	 */
	public void setOrder(Order value) {
		this.order = value;
	}

	/**
	 * Object containing the specific input details for payments that involve redirects to 3rd parties to complete, like iDeal and PayPal
	 */
	public RedirectPaymentMethodSpecificInputBase getRedirectPaymentMethodSpecificInput() {
		return redirectPaymentMethodSpecificInput;
	}

	/**
	 * Object containing the specific input details for payments that involve redirects to 3rd parties to complete, like iDeal and PayPal
	 */
	public void setRedirectPaymentMethodSpecificInput(RedirectPaymentMethodSpecificInputBase value) {
		this.redirectPaymentMethodSpecificInput = value;
	}
}
