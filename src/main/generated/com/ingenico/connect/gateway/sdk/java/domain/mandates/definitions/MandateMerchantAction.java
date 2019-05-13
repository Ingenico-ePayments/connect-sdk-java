/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.mandates.definitions;

public class MandateMerchantAction {

	private String actionType = null;

	private MandateRedirectData redirectData = null;

	/**
	 * Action merchants needs to take in the online mandate process. Possible values are:<br>
	 * <ul class="paragraph-width"><li>REDIRECT - The customer needs to be redirected using the details found in redirectData</ul>
	 */
	public String getActionType() {
		return actionType;
	}

	/**
	 * Action merchants needs to take in the online mandate process. Possible values are:<br>
	 * <ul class="paragraph-width"><li>REDIRECT - The customer needs to be redirected using the details found in redirectData</ul>
	 */
	public void setActionType(String value) {
		this.actionType = value;
	}

	/**
	 * Object containing all data needed to redirect the customer
	 */
	public MandateRedirectData getRedirectData() {
		return redirectData;
	}

	/**
	 * Object containing all data needed to redirect the customer
	 */
	public void setRedirectData(MandateRedirectData value) {
		this.redirectData = value;
	}
}
