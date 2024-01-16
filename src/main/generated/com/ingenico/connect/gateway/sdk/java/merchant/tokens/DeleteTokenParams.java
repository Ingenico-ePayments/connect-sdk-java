/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/
 */

package com.ingenico.connect.gateway.sdk.java.merchant.tokens;

import java.util.LinkedList;
import java.util.List;

import com.ingenico.connect.gateway.sdk.java.ParamRequest;
import com.ingenico.connect.gateway.sdk.java.RequestParam;

/**
 * Query parameters for
 * <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/tokens/delete.html">Delete token</a>
 */
public class DeleteTokenParams implements ParamRequest {

	private String mandateCancelDate;

	/**
	 * Date of the mandate cancellation<br>
	 * Format: YYYYMMDD
	 */
	public String getMandateCancelDate() {
		return mandateCancelDate;
	}

	/**
	 * Date of the mandate cancellation<br>
	 * Format: YYYYMMDD
	 */
	public void setMandateCancelDate(String value) {
		this.mandateCancelDate = value;
	}

	@Override
	public List<RequestParam> toRequestParameters() {
		List<RequestParam> result = new LinkedList<RequestParam>();
		if (mandateCancelDate != null) {
			result.add(new RequestParam("mandateCancelDate", mandateCancelDate));
		}
		return result;
	}
}
