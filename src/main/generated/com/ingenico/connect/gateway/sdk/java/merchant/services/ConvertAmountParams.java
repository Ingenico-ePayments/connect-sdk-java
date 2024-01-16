/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/
 */

package com.ingenico.connect.gateway.sdk.java.merchant.services;

import java.util.LinkedList;
import java.util.List;

import com.ingenico.connect.gateway.sdk.java.ParamRequest;
import com.ingenico.connect.gateway.sdk.java.RequestParam;

/**
 * Query parameters for
 * <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/services/convertAmount.html">Convert amount</a>
 */
public class ConvertAmountParams implements ParamRequest {

	private String source;

	private String target;

	private Long amount;

	/**
	 * Three-letter ISO currency code representing the source currency
	 */
	public String getSource() {
		return source;
	}

	/**
	 * Three-letter ISO currency code representing the source currency
	 */
	public void setSource(String value) {
		this.source = value;
	}

	/**
	 * Three-letter ISO currency code representing the target currency
	 */
	public String getTarget() {
		return target;
	}

	/**
	 * Three-letter ISO currency code representing the target currency
	 */
	public void setTarget(String value) {
		this.target = value;
	}

	/**
	 * Amount to be converted in cents and always having 2 decimals
	 */
	public Long getAmount() {
		return amount;
	}

	/**
	 * Amount to be converted in cents and always having 2 decimals
	 */
	public void setAmount(Long value) {
		this.amount = value;
	}

	@Override
	public List<RequestParam> toRequestParameters() {
		List<RequestParam> result = new LinkedList<RequestParam>();
		if (source != null) {
			result.add(new RequestParam("source", source));
		}
		if (target != null) {
			result.add(new RequestParam("target", target));
		}
		if (amount != null) {
			result.add(new RequestParam("amount", amount.toString()));
		}
		return result;
	}
}
