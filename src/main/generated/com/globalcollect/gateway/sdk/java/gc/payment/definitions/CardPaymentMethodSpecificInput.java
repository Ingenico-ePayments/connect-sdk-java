package com.globalcollect.gateway.sdk.java.gc.payment.definitions;

import com.globalcollect.gateway.sdk.java.gc.fei.definitions.Card;
import com.globalcollect.gateway.sdk.java.gc.payment.definitions.ExternalCardholderAuthenticationData;
import com.globalcollect.gateway.sdk.java.gc.payment.definitions.CardPaymentMethodSpecificInputBase;

public class CardPaymentMethodSpecificInput extends CardPaymentMethodSpecificInputBase {

	private Card card = null;

	private ExternalCardholderAuthenticationData externalCardholderAuthenticationData = null;

	private Boolean isRecurring = null;

	private String returnUrl = null;

	public Card getCard() {
		return card;
	}

	public void setCard(Card value) {
		this.card = value;
	}

	public ExternalCardholderAuthenticationData getExternalCardholderAuthenticationData() {
		return externalCardholderAuthenticationData;
	}

	public void setExternalCardholderAuthenticationData(ExternalCardholderAuthenticationData value) {
		this.externalCardholderAuthenticationData = value;
	}

	public Boolean getIsRecurring() {
		return isRecurring;
	}

	public void setIsRecurring(Boolean value) {
		this.isRecurring = value;
	}

	public String getReturnUrl() {
		return returnUrl;
	}

	public void setReturnUrl(String value) {
		this.returnUrl = value;
	}
}
