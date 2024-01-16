/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/
 */

package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.CardFraudResults;

public class MobilePaymentMethodSpecificOutput extends AbstractPaymentMethodSpecificOutput {

	private String authorisationCode = null;

	private CardFraudResults fraudResults = null;

	private String network = null;

	private MobilePaymentData paymentData = null;

	private ThreeDSecureResults threeDSecureResults = null;

	/**
	 * Card Authorization code as returned by the acquirer
	 */
	public String getAuthorisationCode() {
		return authorisationCode;
	}

	/**
	 * Card Authorization code as returned by the acquirer
	 */
	public void setAuthorisationCode(String value) {
		this.authorisationCode = value;
	}

	/**
	 * Fraud results contained in the CardFraudResults object
	 */
	public CardFraudResults getFraudResults() {
		return fraudResults;
	}

	/**
	 * Fraud results contained in the CardFraudResults object
	 */
	public void setFraudResults(CardFraudResults value) {
		this.fraudResults = value;
	}

	/**
	 * The network that was used for the refund
	 */
	public String getNetwork() {
		return network;
	}

	/**
	 * The network that was used for the refund
	 */
	public void setNetwork(String value) {
		this.network = value;
	}

	/**
	 * Object containing payment details
	 */
	public MobilePaymentData getPaymentData() {
		return paymentData;
	}

	/**
	 * Object containing payment details
	 */
	public void setPaymentData(MobilePaymentData value) {
		this.paymentData = value;
	}

	/**
	 * 3D Secure results object
	 */
	public ThreeDSecureResults getThreeDSecureResults() {
		return threeDSecureResults;
	}

	/**
	 * 3D Secure results object
	 */
	public void setThreeDSecureResults(ThreeDSecureResults value) {
		this.threeDSecureResults = value;
	}
}
