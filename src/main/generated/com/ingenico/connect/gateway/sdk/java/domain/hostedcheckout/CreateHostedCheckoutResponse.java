/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.hostedcheckout;

import java.util.List;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_CreateHostedCheckoutResponse">CreateHostedCheckoutResponse</a>
 */
public class CreateHostedCheckoutResponse {

	private String RETURNMAC = null;

	private String hostedCheckoutId = null;

	private List<String> invalidTokens = null;

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

	public List<String> getInvalidTokens() {
		return invalidTokens;
	}

	public void setInvalidTokens(List<String> value) {
		this.invalidTokens = value;
	}

	public String getPartialRedirectUrl() {
		return partialRedirectUrl;
	}

	public void setPartialRedirectUrl(String value) {
		this.partialRedirectUrl = value;
	}
}
