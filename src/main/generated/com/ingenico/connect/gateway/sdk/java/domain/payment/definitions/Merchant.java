/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

public class Merchant {

	private String contactWebsiteUrl = null;

	private Seller seller = null;

	private String websiteUrl = null;

	/**
	 * URL to find contact or support details to contact in case of questions.
	 */
	public String getContactWebsiteUrl() {
		return contactWebsiteUrl;
	}

	/**
	 * URL to find contact or support details to contact in case of questions.
	 */
	public void setContactWebsiteUrl(String value) {
		this.contactWebsiteUrl = value;
	}

	/**
	 * Object containing seller details
	 */
	public Seller getSeller() {
		return seller;
	}

	/**
	 * Object containing seller details
	 */
	public void setSeller(Seller value) {
		this.seller = value;
	}

	/**
	 * The website from which the purchase was made
	 */
	public String getWebsiteUrl() {
		return websiteUrl;
	}

	/**
	 * The website from which the purchase was made
	 */
	public void setWebsiteUrl(String value) {
		this.websiteUrl = value;
	}
}
