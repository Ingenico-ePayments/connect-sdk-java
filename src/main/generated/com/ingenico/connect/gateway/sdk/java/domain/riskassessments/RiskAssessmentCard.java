/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.riskassessments;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.Card;
import com.ingenico.connect.gateway.sdk.java.domain.riskassessments.definitions.RiskAssessment;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_RiskAssessmentCard">RiskAssessmentCard</a>
 */
public class RiskAssessmentCard extends RiskAssessment {

	private Card card = null;

	public Card getCard() {
		return card;
	}

	public void setCard(Card value) {
		this.card = value;
	}
}
