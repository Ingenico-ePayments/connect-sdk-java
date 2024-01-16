/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/
 */

package com.ingenico.connect.gateway.sdk.java.domain.riskassessments;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.Card;
import com.ingenico.connect.gateway.sdk.java.domain.riskassessments.definitions.RiskAssessment;

public class RiskAssessmentCard extends RiskAssessment {

	private Card card = null;

	/**
	 * Object containing Card object
	 */
	public Card getCard() {
		return card;
	}

	/**
	 * Object containing Card object
	 */
	public void setCard(Card value) {
		this.card = value;
	}
}
