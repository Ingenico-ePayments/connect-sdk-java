/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.merchant.products;

import java.util.LinkedList;
import java.util.List;

import com.ingenico.connect.gateway.sdk.java.AbstractParamRequest;
import com.ingenico.connect.gateway.sdk.java.RequestParam;

/**
 * Query parameters for
 * <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/products/networks.html">Get payment product networks</a>
 */
public class NetworksParams extends AbstractParamRequest {

	private String countryCode;

	private String currencyCode;

	private Long amount;

	private Boolean isRecurring;

	/**
	 * ISO 3166-1 alpha-2 country code
	 */
	public String getCountryCode() {
		return countryCode;
	}

	/**
	 * ISO 3166-1 alpha-2 country code
	 */
	public void setCountryCode(String value) {
		this.countryCode = value;
	}

	/**
	 * Three-letter ISO currency code representing the currency for the amount
	 */
	public String getCurrencyCode() {
		return currencyCode;
	}

	/**
	 * Three-letter ISO currency code representing the currency for the amount
	 */
	public void setCurrencyCode(String value) {
		this.currencyCode = value;
	}

	/**
	 * Amount in cents and always having 2 decimals
	 */
	public Long getAmount() {
		return amount;
	}

	/**
	 * Amount in cents and always having 2 decimals
	 */
	public void setAmount(Long value) {
		this.amount = value;
	}

	/**
	 * This allows you to filter networks based on their support for recurring or not
	 * <ul class="paragraph-width"><li>true
	 * <li>false
	 * </ul>
	 */
	public Boolean getIsRecurring() {
		return isRecurring;
	}

	/**
	 * This allows you to filter networks based on their support for recurring or not
	 * <ul class="paragraph-width"><li>true
	 * <li>false
	 * </ul>
	 */
	public void setIsRecurring(Boolean value) {
		this.isRecurring = value;
	}

	@Override
	public List<RequestParam> toRequestParameters() {
		List<RequestParam> result = new LinkedList<RequestParam>();
		addParameter(result, "countryCode", countryCode);
		addParameter(result, "currencyCode", currencyCode);
		addParameter(result, "amount", amount);
		addParameter(result, "isRecurring", isRecurring);
		return result;
	}
}
