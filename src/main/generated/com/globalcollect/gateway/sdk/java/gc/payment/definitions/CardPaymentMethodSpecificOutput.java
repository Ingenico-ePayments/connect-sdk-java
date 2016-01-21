package com.globalcollect.gateway.sdk.java.gc.payment.definitions;

import com.globalcollect.gateway.sdk.java.gc.fei.definitions.CardEssentials;
import com.globalcollect.gateway.sdk.java.gc.fei.definitions.CardFraudResults;
import com.globalcollect.gateway.sdk.java.gc.payment.definitions.ThreeDSecureResults;
import com.globalcollect.gateway.sdk.java.gc.payment.definitions.AbstractPaymentMethodSpecificOutput;

public class CardPaymentMethodSpecificOutput extends AbstractPaymentMethodSpecificOutput {

	private String authorisationCode = null;

	private CardEssentials card = null;

	private CardFraudResults fraudResults = null;

	private ThreeDSecureResults threeDSecureResults = null;

	public String getAuthorisationCode() {
		return authorisationCode;
	}

	public void setAuthorisationCode(String value) {
		this.authorisationCode = value;
	}

	public CardEssentials getCard() {
		return card;
	}

	public void setCard(CardEssentials value) {
		this.card = value;
	}

	public CardFraudResults getFraudResults() {
		return fraudResults;
	}

	public void setFraudResults(CardFraudResults value) {
		this.fraudResults = value;
	}

	public ThreeDSecureResults getThreeDSecureResults() {
		return threeDSecureResults;
	}

	public void setThreeDSecureResults(ThreeDSecureResults value) {
		this.threeDSecureResults = value;
	}
}
