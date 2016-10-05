/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.hostedcheckout;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.FraudFields;
import com.ingenico.connect.gateway.sdk.java.domain.hostedcheckout.definitions.HostedCheckoutSpecificInput;
import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.BankTransferPaymentMethodSpecificInputBase;
import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.CardPaymentMethodSpecificInputBase;
import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.CashPaymentMethodSpecificInputBase;
import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.Order;
import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.RedirectPaymentMethodSpecificInputBase;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_CreateHostedCheckoutRequest">CreateHostedCheckoutRequest</a>
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
