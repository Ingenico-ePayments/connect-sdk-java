package com.globalcollect.gateway.sdk.java.gc.hostedcheckout;

import com.globalcollect.gateway.sdk.java.gc.fei.definitions.FraudFields;
import com.globalcollect.gateway.sdk.java.gc.hostedcheckout.definitions.HostedCheckoutSpecificInput;
import com.globalcollect.gateway.sdk.java.gc.payment.definitions.BankTransferPaymentMethodSpecificInputBase;
import com.globalcollect.gateway.sdk.java.gc.payment.definitions.CardPaymentMethodSpecificInputBase;
import com.globalcollect.gateway.sdk.java.gc.payment.definitions.CashPaymentMethodSpecificInputBase;
import com.globalcollect.gateway.sdk.java.gc.payment.definitions.Order;
import com.globalcollect.gateway.sdk.java.gc.payment.definitions.RedirectPaymentMethodSpecificInputBase;

/**
 * class CreateHostedCheckoutRequest
 */
public class CreateHostedCheckoutRequest {

	private BankTransferPaymentMethodSpecificInputBase bankTransferPaymentMethodSpecificInput = null;

	private CardPaymentMethodSpecificInputBase cardPaymentMethodSpecificInput = null;

	private CashPaymentMethodSpecificInputBase cashPaymentMethodSpecificInput = null;

	private FraudFields fraudFields = null;

	private HostedCheckoutSpecificInput hostedCheckoutSpecificInput = null;

	private Order order = null;

	private RedirectPaymentMethodSpecificInputBase redirectPaymentMethodSpecificInput = null;

	public BankTransferPaymentMethodSpecificInputBase getBankTransferPaymentMethodSpecificInput() {
		return bankTransferPaymentMethodSpecificInput;
	}

	public void setBankTransferPaymentMethodSpecificInput(BankTransferPaymentMethodSpecificInputBase value) {
		this.bankTransferPaymentMethodSpecificInput = value;
	}

	public CardPaymentMethodSpecificInputBase getCardPaymentMethodSpecificInput() {
		return cardPaymentMethodSpecificInput;
	}

	public void setCardPaymentMethodSpecificInput(CardPaymentMethodSpecificInputBase value) {
		this.cardPaymentMethodSpecificInput = value;
	}

	public CashPaymentMethodSpecificInputBase getCashPaymentMethodSpecificInput() {
		return cashPaymentMethodSpecificInput;
	}

	public void setCashPaymentMethodSpecificInput(CashPaymentMethodSpecificInputBase value) {
		this.cashPaymentMethodSpecificInput = value;
	}

	public FraudFields getFraudFields() {
		return fraudFields;
	}

	public void setFraudFields(FraudFields value) {
		this.fraudFields = value;
	}

	public HostedCheckoutSpecificInput getHostedCheckoutSpecificInput() {
		return hostedCheckoutSpecificInput;
	}

	public void setHostedCheckoutSpecificInput(HostedCheckoutSpecificInput value) {
		this.hostedCheckoutSpecificInput = value;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order value) {
		this.order = value;
	}

	public RedirectPaymentMethodSpecificInputBase getRedirectPaymentMethodSpecificInput() {
		return redirectPaymentMethodSpecificInput;
	}

	public void setRedirectPaymentMethodSpecificInput(RedirectPaymentMethodSpecificInputBase value) {
		this.redirectPaymentMethodSpecificInput = value;
	}
}
