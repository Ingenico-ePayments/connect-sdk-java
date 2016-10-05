/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;


/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_RedirectData">RedirectData</a>
 */
public class RedirectData {

	private String RETURNMAC = null;

	private String redirectURL = null;

	public String getRETURNMAC() {
		return RETURNMAC;
	}

	public void setRETURNMAC(String value) {
		this.RETURNMAC = value;
	}

	public String getRedirectURL() {
		return redirectURL;
	}

	public void setRedirectURL(String value) {
		this.redirectURL = value;
	}
}
