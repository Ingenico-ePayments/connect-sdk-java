/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/
 */

package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

public class Merchant {

	private String configurationId = null;

	private String contactWebsiteUrl = null;

	private Seller seller = null;

	private String websiteUrl = null;

	/**
	 * In case your account has been setup with multiple configurations you can use this property to identify the one you would like to use for the transaction. Note that you can only submit preconfigured values in combination with the Worldline Online Payments Acceptance platform. In case no value is supplied a default value of 0 will be submitted to the Worldline Online Payments Acceptance platform. The Worldline Online Payments Acceptance platform internally refers to this as a PosId.
	 */
	public String getConfigurationId() {
		return configurationId;
	}

	/**
	 * In case your account has been setup with multiple configurations you can use this property to identify the one you would like to use for the transaction. Note that you can only submit preconfigured values in combination with the Worldline Online Payments Acceptance platform. In case no value is supplied a default value of 0 will be submitted to the Worldline Online Payments Acceptance platform. The Worldline Online Payments Acceptance platform internally refers to this as a PosId.
	 */
	public void setConfigurationId(String value) {
		this.configurationId = value;
	}

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
	 * The website from which the purchase was made. The '+' character is not allowed in this property for transactions that are processed by TechProcess Payment Platform.
	 */
	public String getWebsiteUrl() {
		return websiteUrl;
	}

	/**
	 * The website from which the purchase was made. The '+' character is not allowed in this property for transactions that are processed by TechProcess Payment Platform.
	 */
	public void setWebsiteUrl(String value) {
		this.websiteUrl = value;
	}
}
