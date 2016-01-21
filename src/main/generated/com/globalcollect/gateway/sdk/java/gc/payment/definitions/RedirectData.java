package com.globalcollect.gateway.sdk.java.gc.payment.definitions;


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
