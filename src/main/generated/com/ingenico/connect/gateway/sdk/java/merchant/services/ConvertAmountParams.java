/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.merchant.services;

import java.util.LinkedList;
import java.util.List;

import com.ingenico.connect.gateway.sdk.java.AbstractParamRequest;
import com.ingenico.connect.gateway.sdk.java.RequestParam;

/**
 * Query parameters for
 * <a href="https://developer.globalcollect.com/documentation/api/server/#__merchantId__services_convert_amount_get">Convert amount</a>
 */
public class ConvertAmountParams extends AbstractParamRequest {

	private String source;

	private String target;

	private Long amount;

	public String getSource() {
		return source;
	}

	public void setSource(String value) {
		this.source = value;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String value) {
		this.target = value;
	}

	public Long getAmount() {
		return amount;
	}

	public void setAmount(Long value) {
		this.amount = value;
	}

	@Override
	public List<RequestParam> toRequestParameters() {
		List<RequestParam> result = new LinkedList<RequestParam>();
		addParameter(result, "source", source);
		addParameter(result, "target", target);
		addParameter(result, "amount", amount);
		return result;
	}
}
