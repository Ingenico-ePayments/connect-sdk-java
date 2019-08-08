/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.CardEssentials;
import com.ingenico.connect.gateway.sdk.java.domain.definitions.CardFraudResults;

/**
 * Card payment specific response data
 */
public class CardPaymentMethodSpecificOutput extends AbstractPaymentMethodSpecificOutput {

	private String authorisationCode = null;

	private CardEssentials card = null;

	private CardFraudResults fraudResults = null;

	private String initialSchemeTransactionId = null;

	private String schemeTransactionId = null;

	private ThreeDSecureResults threeDSecureResults = null;

	private String token = null;

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
	 * Object containing card details
	 */
	public CardEssentials getCard() {
		return card;
	}

	/**
	 * Object containing card details
	 */
	public void setCard(CardEssentials value) {
		this.card = value;
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
	 * The unique scheme transactionId of the initial transaction that was performed with SCA.<br>Should be stored by the merchant to allow it to be submitted in future transactions.
	 */
	public String getInitialSchemeTransactionId() {
		return initialSchemeTransactionId;
	}

	/**
	 * The unique scheme transactionId of the initial transaction that was performed with SCA.<br>Should be stored by the merchant to allow it to be submitted in future transactions.
	 */
	public void setInitialSchemeTransactionId(String value) {
		this.initialSchemeTransactionId = value;
	}

	/**
	 * The unique scheme transactionId of this transaction.<br>Should be stored by the merchant to allow it to be submitted in future transactions. Use this value in case the initialSchemeTransactionId property is empty.
	 */
	public String getSchemeTransactionId() {
		return schemeTransactionId;
	}

	/**
	 * The unique scheme transactionId of this transaction.<br>Should be stored by the merchant to allow it to be submitted in future transactions. Use this value in case the initialSchemeTransactionId property is empty.
	 */
	public void setSchemeTransactionId(String value) {
		this.schemeTransactionId = value;
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

	/**
	 * If a token was used for or created during the payment, then the ID of that token. This property is only populated for payments on the Ogone payment platform.
	 */
	public String getToken() {
		return token;
	}

	/**
	 * If a token was used for or created during the payment, then the ID of that token. This property is only populated for payments on the Ogone payment platform.
	 */
	public void setToken(String value) {
		this.token = value;
	}
}
