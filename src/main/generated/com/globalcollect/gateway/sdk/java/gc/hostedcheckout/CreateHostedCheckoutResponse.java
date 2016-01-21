package com.globalcollect.gateway.sdk.java.gc.hostedcheckout;


/**
 * class CreateHostedCheckoutResponse
 */
public class CreateHostedCheckoutResponse {

	private String RETURNMAC = null;

	private String hostedCheckoutId = null;

	private String partialRedirectUrl = null;

	public String getRETURNMAC() {
		return RETURNMAC;
	}

	public void setRETURNMAC(String value) {
		this.RETURNMAC = value;
	}

	public String getHostedCheckoutId() {
		return hostedCheckoutId;
	}

	public void setHostedCheckoutId(String value) {
		this.hostedCheckoutId = value;
	}

	public String getPartialRedirectUrl() {
		return partialRedirectUrl;
	}

	public void setPartialRedirectUrl(String value) {
		this.partialRedirectUrl = value;
	}
}
