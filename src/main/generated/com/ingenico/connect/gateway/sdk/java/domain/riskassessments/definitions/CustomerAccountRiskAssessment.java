/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */

package com.ingenico.connect.gateway.sdk.java.domain.riskassessments.definitions;

/**
 * Object containing data related to the account the customer has with you
 */
public class CustomerAccountRiskAssessment {

	private Boolean hasForgottenPassword = null;

	private Boolean hasPassword = null;

	/**
	 * Specifies if the customer (initially) had forgotten their password
	 * <ul class="paragraph-width">
	 * <li>true - The customer has forgotten their password
	 * <li>false - The customer has not forgotten their password
	 * </ul>
	 */
	public Boolean getHasForgottenPassword() {
		return hasForgottenPassword;
	}

	/**
	 * Specifies if the customer (initially) had forgotten their password
	 * <ul class="paragraph-width">
	 * <li>true - The customer has forgotten their password
	 * <li>false - The customer has not forgotten their password
	 * </ul>
	 */
	public void setHasForgottenPassword(Boolean value) {
		this.hasForgottenPassword = value;
	}

	/**
	 * Specifies if the customer entered a password to gain access to an account registered with the you
	 * <ul class="paragraph-width">
	 * <li>true - The customer has used a password to gain access
	 * <li>false - The customer has not used a password to gain access
	 * </ul>
	 */
	public Boolean getHasPassword() {
		return hasPassword;
	}

	/**
	 * Specifies if the customer entered a password to gain access to an account registered with the you
	 * <ul class="paragraph-width">
	 * <li>true - The customer has used a password to gain access
	 * <li>false - The customer has not used a password to gain access
	 * </ul>
	 */
	public void setHasPassword(Boolean value) {
		this.hasPassword = value;
	}
}
