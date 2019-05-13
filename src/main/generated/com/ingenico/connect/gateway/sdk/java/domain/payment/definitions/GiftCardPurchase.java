/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.AmountOfMoney;

/**
 * Object containing information on purchased gift card(s)
 */
public class GiftCardPurchase {

	private AmountOfMoney amountOfMoney = null;

	private Integer numberOfGiftCards = null;

	/**
	 * Object containing information on an amount of money
	 */
	public AmountOfMoney getAmountOfMoney() {
		return amountOfMoney;
	}

	/**
	 * Object containing information on an amount of money
	 */
	public void setAmountOfMoney(AmountOfMoney value) {
		this.amountOfMoney = value;
	}

	/**
	 * Number of gift cards that are purchased through this transaction
	 */
	public Integer getNumberOfGiftCards() {
		return numberOfGiftCards;
	}

	/**
	 * Number of gift cards that are purchased through this transaction
	 */
	public void setNumberOfGiftCards(Integer value) {
		this.numberOfGiftCards = value;
	}
}
