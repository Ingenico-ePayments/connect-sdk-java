/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/
 */

package com.ingenico.connect.gateway.sdk.java.domain.payout.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.Card;

public class CardPayoutMethodSpecificInput extends AbstractPayoutMethodSpecificInput {

	private Card card = null;

	private Integer paymentProductId = null;

	private PayoutRecipient recipient = null;

	private String token = null;

	/**
	 * Object containing the card details.
	 */
	public Card getCard() {
		return card;
	}

	/**
	 * Object containing the card details.
	 */
	public void setCard(Card value) {
		this.card = value;
	}

	/**
	 * Payment product identifier<br>
	 * Please see <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/paymentproducts.html">payment products</a> for a full overview of possible values.
	 */
	public Integer getPaymentProductId() {
		return paymentProductId;
	}

	/**
	 * Payment product identifier<br>
	 * Please see <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/paymentproducts.html">payment products</a> for a full overview of possible values.
	 */
	public void setPaymentProductId(Integer value) {
		this.paymentProductId = value;
	}

	/**
	 * Object containing the details of the recipient of the payout
	 */
	public PayoutRecipient getRecipient() {
		return recipient;
	}

	/**
	 * Object containing the details of the recipient of the payout
	 */
	public void setRecipient(PayoutRecipient value) {
		this.recipient = value;
	}

	/**
	 * ID of the token that holds previously stored card data.<br> If both the token and card are provided, then the card takes precedence over the token.
	 */
	public String getToken() {
		return token;
	}

	/**
	 * ID of the token that holds previously stored card data.<br> If both the token and card are provided, then the card takes precedence over the token.
	 */
	public void setToken(String value) {
		this.token = value;
	}
}
