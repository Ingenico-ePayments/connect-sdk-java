/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */

package com.ingenico.connect.gateway.sdk.java.domain.product.definitions;

import java.util.List;

public class PaymentProduct302SpecificData {

	private List<String> networks = null;

	/**
	 * The networks that can be used in the current payment context. The strings that represent the networks in the array are identical to the strings that Apple uses in their <a href="https://developer.apple.com/reference/passkit/pkpaymentnetwork" target="_blank">documentation</a>.
	 * For instance: "Visa".
	 */
	public List<String> getNetworks() {
		return networks;
	}

	/**
	 * The networks that can be used in the current payment context. The strings that represent the networks in the array are identical to the strings that Apple uses in their <a href="https://developer.apple.com/reference/passkit/pkpaymentnetwork" target="_blank">documentation</a>.
	 * For instance: "Visa".
	 */
	public void setNetworks(List<String> value) {
		this.networks = value;
	}
}
