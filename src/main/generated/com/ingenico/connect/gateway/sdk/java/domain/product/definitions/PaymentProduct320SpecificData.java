/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.product.definitions;

import java.util.List;

public class PaymentProduct320SpecificData {

	private String gateway = null;

	private List<String> networks = null;

	/**
	 * The GlobalCollect gateway identifier. You should use this when creating a <a href="https://developers.google.com/pay/api/android/reference/object#Gateway" target="_blank">tokenization specification</a>.
	 */
	public String getGateway() {
		return gateway;
	}

	/**
	 * The GlobalCollect gateway identifier. You should use this when creating a <a href="https://developers.google.com/pay/api/android/reference/object#Gateway" target="_blank">tokenization specification</a>.
	 */
	public void setGateway(String value) {
		this.gateway = value;
	}

	/**
	 * The networks that can be used in the current payment context. The strings that represent the networks in the array are identical to the strings that Google uses in their <a href="https://developers.google.com/pay/api/android/reference/object#CardParameters" target="_blank">documentation</a>.
	 * For instance: "VISA".
	 */
	public List<String> getNetworks() {
		return networks;
	}

	/**
	 * The networks that can be used in the current payment context. The strings that represent the networks in the array are identical to the strings that Google uses in their <a href="https://developers.google.com/pay/api/android/reference/object#CardParameters" target="_blank">documentation</a>.
	 * For instance: "VISA".
	 */
	public void setNetworks(List<String> value) {
		this.networks = value;
	}
}
