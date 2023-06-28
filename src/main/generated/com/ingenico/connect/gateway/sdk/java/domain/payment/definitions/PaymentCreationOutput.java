/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

public class PaymentCreationOutput extends PaymentCreationReferences {

	private Boolean isCheckedRememberMe = null;

	private Boolean isNewToken = null;

	private String token = null;

	private Boolean tokenizationSucceeded = null;

	/**
	 * Indicates whether the customer ticked the "Remember my details for future purchases" checkbox on the MyCheckout hosted payment pages
	 */
	public Boolean getIsCheckedRememberMe() {
		return isCheckedRememberMe;
	}

	/**
	 * Indicates whether the customer ticked the "Remember my details for future purchases" checkbox on the MyCheckout hosted payment pages
	 */
	public void setIsCheckedRememberMe(Boolean value) {
		this.isCheckedRememberMe = value;
	}

	/**
	 * Indicates if a new token was created
	 * <ul class="paragraph-width">
	 * <li>true - A new token was created
	 * <li>false - A token with the same card number already exists and is returned. Please note that the existing token has not been updated. When you want to update other data then the card number, you need to update data stored in the token explicitly, as data is never updated during the creation of a token.
	 * </ul>
	 */
	public Boolean getIsNewToken() {
		return isNewToken;
	}

	/**
	 * Indicates if a new token was created
	 * <ul class="paragraph-width">
	 * <li>true - A new token was created
	 * <li>false - A token with the same card number already exists and is returned. Please note that the existing token has not been updated. When you want to update other data then the card number, you need to update data stored in the token explicitly, as data is never updated during the creation of a token.
	 * </ul>
	 */
	public void setIsNewToken(Boolean value) {
		this.isNewToken = value;
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

	/**
	 * Indicates if tokenization was successful or not. If this value is false, then the token and isNewToken properties will not be set.
	 */
	public Boolean getTokenizationSucceeded() {
		return tokenizationSucceeded;
	}

	/**
	 * Indicates if tokenization was successful or not. If this value is false, then the token and isNewToken properties will not be set.
	 */
	public void setTokenizationSucceeded(Boolean value) {
		this.tokenizationSucceeded = value;
	}
}
