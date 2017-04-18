/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.merchant.tokens;

import java.util.LinkedList;
import java.util.List;

import com.ingenico.connect.gateway.sdk.java.AbstractParamRequest;
import com.ingenico.connect.gateway.sdk.java.RequestParam;

/**
 * Query parameters for
 * <a href="https://developer.globalcollect.com/documentation/api/server/#__merchantId__tokens__tokenId__delete">Delete token</a>
 */
public class DeleteTokenParams extends AbstractParamRequest {

	private String mandateCancelDate;

	public String getMandateCancelDate() {
		return mandateCancelDate;
	}

	public void setMandateCancelDate(String value) {
		this.mandateCancelDate = value;
	}

	@Override
	public List<RequestParam> toRequestParameters() {
		List<RequestParam> result = new LinkedList<RequestParam>();
		addParameter(result, "mandateCancelDate", mandateCancelDate);
		return result;
	}
}
