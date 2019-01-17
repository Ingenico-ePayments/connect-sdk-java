/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

public class ProtectionEligibility {

	private String eligibility = null;

	private String type = null;

	/**
	 * Possible values: <ul class="paragraph-width"> <li> Eligible <li> PartiallyEligible <li> Ineligible </ul>
	 */
	public String getEligibility() {
		return eligibility;
	}

	/**
	 * Possible values: <ul class="paragraph-width"> <li> Eligible <li> PartiallyEligible <li> Ineligible </ul>
	 */
	public void setEligibility(String value) {
		this.eligibility = value;
	}

	/**
	 * Possible values: <ul class="paragraph-width"> <li> ItemNotReceivedEligible <li> UnauthorizedPaymentEligible <li> Ineligible </ul>
	 */
	public String getType() {
		return type;
	}

	/**
	 * Possible values: <ul class="paragraph-width"> <li> ItemNotReceivedEligible <li> UnauthorizedPaymentEligible <li> Ineligible </ul>
	 */
	public void setType(String value) {
		this.type = value;
	}
}
