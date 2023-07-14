/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */

package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

public class OrderTypeInformation {

	private String purchaseType = null;

	private String transactionType = null;

	private String usageType = null;

	/**
	 * Possible values are:<ul class="paragraph-width">
	 * <li>physical
	 * <li>digital
	 * </ul>
	 */
	public String getPurchaseType() {
		return purchaseType;
	}

	/**
	 * Possible values are:<ul class="paragraph-width">
	 * <li>physical
	 * <li>digital
	 * </ul>
	 */
	public void setPurchaseType(String value) {
		this.purchaseType = value;
	}

	/**
	 * Identifies the type of transaction being authenticated.
	 * Possible values are:<ul class="paragraph-width">
	 * <li>purchase = The purpose of the transaction is to purchase goods or services (Default)
	 * <li>check-acceptance = The purpose of the transaction is to accept a 'check'/'cheque'
	 * <li>account-funding = The purpose of the transaction is to fund an account
	 * <li>quasi-cash = The purpose of the transaction is to buy a quasi cash type product that is representative of actual cash such as money orders, traveler's checks, foreign currency, lottery tickets or casino gaming chips
	 * <li>prepaid-activation-or-load = The purpose of the transaction is to activate or load a prepaid card
	 * </ul>
	 */
	public String getTransactionType() {
		return transactionType;
	}

	/**
	 * Identifies the type of transaction being authenticated.
	 * Possible values are:<ul class="paragraph-width">
	 * <li>purchase = The purpose of the transaction is to purchase goods or services (Default)
	 * <li>check-acceptance = The purpose of the transaction is to accept a 'check'/'cheque'
	 * <li>account-funding = The purpose of the transaction is to fund an account
	 * <li>quasi-cash = The purpose of the transaction is to buy a quasi cash type product that is representative of actual cash such as money orders, traveler's checks, foreign currency, lottery tickets or casino gaming chips
	 * <li>prepaid-activation-or-load = The purpose of the transaction is to activate or load a prepaid card
	 * </ul>
	 */
	public void setTransactionType(String value) {
		this.transactionType = value;
	}

	/**
	 * Possible values are:<ul class="paragraph-width">
	 * <li>private
	 * <li>commercial
	 * </ul>
	 */
	public String getUsageType() {
		return usageType;
	}

	/**
	 * Possible values are:<ul class="paragraph-width">
	 * <li>private
	 * <li>commercial
	 * </ul>
	 */
	public void setUsageType(String value) {
		this.usageType = value;
	}
}
