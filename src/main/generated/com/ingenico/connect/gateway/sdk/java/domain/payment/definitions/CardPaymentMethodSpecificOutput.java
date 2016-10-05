/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.CardEssentials;
import com.ingenico.connect.gateway.sdk.java.domain.definitions.CardFraudResults;
import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.ThreeDSecureResults;
import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.AbstractPaymentMethodSpecificOutput;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_CardPaymentMethodSpecificOutput">CardPaymentMethodSpecificOutput</a>
 */
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
