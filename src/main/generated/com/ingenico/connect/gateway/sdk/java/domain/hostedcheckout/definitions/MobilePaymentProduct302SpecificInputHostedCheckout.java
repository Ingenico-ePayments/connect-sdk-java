/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.hostedcheckout.definitions;

public class MobilePaymentProduct302SpecificInputHostedCheckout {

	private String businessName = null;

	/**
	 * Used as an input for the Apple Pay payment button. Your default business name is configured in the Configuration Center. In case you want to use another business name than the one configured in the Configuration Center, provide your company name in a human readable form.
	 */
	public String getBusinessName() {
		return businessName;
	}

	/**
	 * Used as an input for the Apple Pay payment button. Your default business name is configured in the Configuration Center. In case you want to use another business name than the one configured in the Configuration Center, provide your company name in a human readable form.
	 */
	public void setBusinessName(String value) {
		this.businessName = value;
	}
}
