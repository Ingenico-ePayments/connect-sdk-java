/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */

package com.ingenico.connect.gateway.sdk.java.domain.hostedcheckout.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.GPayThreeDSecure;

public class MobilePaymentProduct320SpecificInputHostedCheckout {

	private String merchantName = null;

	private String merchantOrigin = null;

	private GPayThreeDSecure threeDSecure = null;

	/**
	 * Used as an input for the Google Pay payment sheet. Provide your company name in a human readable form.
	 */
	public String getMerchantName() {
		return merchantName;
	}

	/**
	 * Used as an input for the Google Pay payment sheet. Provide your company name in a human readable form.
	 */
	public void setMerchantName(String value) {
		this.merchantName = value;
	}

	/**
	 * Used as an input for the Google Pay payment sheet. Provide the url of your webshop. For international (non-ASCII) domains, please use <a href="https://en.wikipedia.org/wiki/Punycode">Punycode</a>.
	 */
	public String getMerchantOrigin() {
		return merchantOrigin;
	}

	/**
	 * Used as an input for the Google Pay payment sheet. Provide the url of your webshop. For international (non-ASCII) domains, please use <a href="https://en.wikipedia.org/wiki/Punycode">Punycode</a>.
	 */
	public void setMerchantOrigin(String value) {
		this.merchantOrigin = value;
	}

	/**
	 * Object containing specific data regarding 3-D Secure
	 */
	public GPayThreeDSecure getThreeDSecure() {
		return threeDSecure;
	}

	/**
	 * Object containing specific data regarding 3-D Secure
	 */
	public void setThreeDSecure(GPayThreeDSecure value) {
		this.threeDSecure = value;
	}
}
