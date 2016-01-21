package com.globalcollect.gateway.sdk.java.gc.riskassessments;

import com.globalcollect.gateway.sdk.java.gc.fei.definitions.Card;
import com.globalcollect.gateway.sdk.java.gc.riskassessments.definitions.RiskAssessment;

/**
 * class RiskAssessmentCard
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
