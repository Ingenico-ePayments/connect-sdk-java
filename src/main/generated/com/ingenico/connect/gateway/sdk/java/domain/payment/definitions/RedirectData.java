/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

public class RedirectData {

	private String RETURNMAC = null;

	private String redirectURL = null;

	/**
	 * A Message Authentication Code (MAC) is used to authenticate the redirection back to merchant after the payment
	 */
	public String getRETURNMAC() {
		return RETURNMAC;
	}

	/**
	 * A Message Authentication Code (MAC) is used to authenticate the redirection back to merchant after the payment
	 */
	public void setRETURNMAC(String value) {
		this.RETURNMAC = value;
	}

	/**
	 * The URL that the consumer should be redirected to
	 */
	public String getRedirectURL() {
		return redirectURL;
	}

	/**
	 * The URL that the consumer should be redirected to
	 */
	public void setRedirectURL(String value) {
		this.redirectURL = value;
	}
}
