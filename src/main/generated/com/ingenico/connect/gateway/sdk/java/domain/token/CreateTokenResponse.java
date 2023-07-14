/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */

package com.ingenico.connect.gateway.sdk.java.domain.token;

public class CreateTokenResponse {

	private Boolean isNewToken = null;

	private String originalPaymentId = null;

	private String token = null;

	/**
	 * Indicates if a new token was created
	 * <ul class="paragraph-width">
	 * <li>true - A new token was created
	 * <li>false - A token with the same card number already exists and is returned. Please note that the existing token has not been updated. When you want to update other data then the card number, you need to use the update API call, as data is never updated during the creation of a token.
	 * </ul>
	 */
	public Boolean getIsNewToken() {
		return isNewToken;
	}

	/**
	 * Indicates if a new token was created
	 * <ul class="paragraph-width">
	 * <li>true - A new token was created
	 * <li>false - A token with the same card number already exists and is returned. Please note that the existing token has not been updated. When you want to update other data then the card number, you need to use the update API call, as data is never updated during the creation of a token.
	 * </ul>
	 */
	public void setIsNewToken(Boolean value) {
		this.isNewToken = value;
	}

	/**
	 * The initial Payment ID of the transaction from which the token has been created
	 */
	public String getOriginalPaymentId() {
		return originalPaymentId;
	}

	/**
	 * The initial Payment ID of the transaction from which the token has been created
	 */
	public void setOriginalPaymentId(String value) {
		this.originalPaymentId = value;
	}

	/**
	 * ID of the token
	 */
	public String getToken() {
		return token;
	}

	/**
	 * ID of the token
	 */
	public void setToken(String value) {
		this.token = value;
	}
}
