/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.services;

/**
 * Output of the retrieval of the privacy policy
 */
public class GetPrivacyPolicyResponse {

	private String htmlContent = null;

	/**
	 * HTML content to be displayed to the user
	 */
	public String getHtmlContent() {
		return htmlContent;
	}

	/**
	 * HTML content to be displayed to the user
	 */
	public void setHtmlContent(String value) {
		this.htmlContent = value;
	}
}
