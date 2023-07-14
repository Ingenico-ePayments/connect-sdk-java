/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */

package com.ingenico.connect.gateway.sdk.java.domain.product.definitions;

import java.util.List;

public class PaymentProduct863SpecificData {

	private List<String> integrationTypes = null;

	/**
	 * The WeChat Pay integration types that can be used in the current payment context. Possible values:
	 * <ul class="paragraph-width"><li>desktopQRCode - used on desktops, the customer opens the WeChat app by scanning a QR code.
	 * <li>urlIntent - used in mobile apps or on mobile web pages, the customer opens the WeChat app using a URL intent.
	 * <li>nativeInApp - used in mobile apps that use the WeChat Pay SDK.
	 * </ul>
	 */
	public List<String> getIntegrationTypes() {
		return integrationTypes;
	}

	/**
	 * The WeChat Pay integration types that can be used in the current payment context. Possible values:
	 * <ul class="paragraph-width"><li>desktopQRCode - used on desktops, the customer opens the WeChat app by scanning a QR code.
	 * <li>urlIntent - used in mobile apps or on mobile web pages, the customer opens the WeChat app using a URL intent.
	 * <li>nativeInApp - used in mobile apps that use the WeChat Pay SDK.
	 * </ul>
	 */
	public void setIntegrationTypes(List<String> value) {
		this.integrationTypes = value;
	}
}
