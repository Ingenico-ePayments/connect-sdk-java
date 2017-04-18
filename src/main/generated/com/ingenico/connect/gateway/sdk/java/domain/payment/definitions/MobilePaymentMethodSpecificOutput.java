/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.CardFraudResults;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_MobilePaymentMethodSpecificOutput">MobilePaymentMethodSpecificOutput</a>
 */
public class MobilePaymentMethodSpecificOutput extends AbstractPaymentMethodSpecificOutput {

	private String authorisationCode = null;

	private CardFraudResults fraudResults = null;

	private String network = null;

	private MobilePaymentData paymentData = null;

	private ThreeDSecureResults threeDSecureResults = null;

	public String getAuthorisationCode() {
		return authorisationCode;
	}

	public void setAuthorisationCode(String value) {
		this.authorisationCode = value;
	}

	public CardFraudResults getFraudResults() {
		return fraudResults;
	}

	public void setFraudResults(CardFraudResults value) {
		this.fraudResults = value;
	}

	public String getNetwork() {
		return network;
	}

	public void setNetwork(String value) {
		this.network = value;
	}

	public MobilePaymentData getPaymentData() {
		return paymentData;
	}

	public void setPaymentData(MobilePaymentData value) {
		this.paymentData = value;
	}

	public ThreeDSecureResults getThreeDSecureResults() {
		return threeDSecureResults;
	}

	public void setThreeDSecureResults(ThreeDSecureResults value) {
		this.threeDSecureResults = value;
	}
}
