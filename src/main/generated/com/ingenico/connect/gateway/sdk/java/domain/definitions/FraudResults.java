/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */

package com.ingenico.connect.gateway.sdk.java.domain.definitions;

public class FraudResults {

	private String fraudServiceResult = null;

	private InAuth inAuth = null;

	/**
	 * Results from the fraud prevention check. Possible values are:
	 * <ul class="paragraph-width">
	 * <li>accepted - Based on the checks performed the transaction can be accepted
	 * <li>challenged - Based on the checks performed the transaction should be manually reviewed
	 * <li>denied - Based on the checks performed the transaction should be rejected
	 * <li>no-advice - No fraud check was requested/performed
	 * <li>error - The fraud check resulted in an error and the fraud check was thus not performed
	 * </ul>
	 */
	public String getFraudServiceResult() {
		return fraudServiceResult;
	}

	/**
	 * Results from the fraud prevention check. Possible values are:
	 * <ul class="paragraph-width">
	 * <li>accepted - Based on the checks performed the transaction can be accepted
	 * <li>challenged - Based on the checks performed the transaction should be manually reviewed
	 * <li>denied - Based on the checks performed the transaction should be rejected
	 * <li>no-advice - No fraud check was requested/performed
	 * <li>error - The fraud check resulted in an error and the fraud check was thus not performed
	 * </ul>
	 */
	public void setFraudServiceResult(String value) {
		this.fraudServiceResult = value;
	}

	/**
	 * Object containing device fingerprinting details from InAuth
	 */
	public InAuth getInAuth() {
		return inAuth;
	}

	/**
	 * Object containing device fingerprinting details from InAuth
	 */
	public void setInAuth(InAuth value) {
		this.inAuth = value;
	}
}
