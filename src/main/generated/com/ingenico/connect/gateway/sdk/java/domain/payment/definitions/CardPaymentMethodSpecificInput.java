/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.Card;
import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.ExternalCardholderAuthenticationData;
import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.CardPaymentMethodSpecificInputBase;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_CardPaymentMethodSpecificInput">CardPaymentMethodSpecificInput</a>
 */
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
