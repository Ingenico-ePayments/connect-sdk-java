/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/
 */

package com.ingenico.connect.gateway.sdk.java.domain.product;

import java.util.List;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.KeyValuePair;

/**
 * Input for the retrieval of a customer's details.
 */
public class GetCustomerDetailsRequest {

	private String countryCode = null;

	private List<KeyValuePair> values = null;

	/**
	 * The code of the country where the customer should reside.
	 */
	public String getCountryCode() {
		return countryCode;
	}

	/**
	 * The code of the country where the customer should reside.
	 */
	public void setCountryCode(String value) {
		this.countryCode = value;
	}

	/**
	 * A list of keys with a value used to retrieve the details of a customer. Depending on the country code, different keys are required. These can be determined with a getPaymentProduct call and using payment product properties with the property usedForLookup set to true.
	 */
	public List<KeyValuePair> getValues() {
		return values;
	}

	/**
	 * A list of keys with a value used to retrieve the details of a customer. Depending on the country code, different keys are required. These can be determined with a getPaymentProduct call and using payment product properties with the property usedForLookup set to true.
	 */
	public void setValues(List<KeyValuePair> value) {
		this.values = value;
	}
}
