package com.globalcollect.gateway.sdk.java.gc.merchant.products;

import com.globalcollect.gateway.sdk.java.GcParamRequest;
import com.globalcollect.gateway.sdk.java.RequestParam;
import java.util.LinkedList;
import java.util.List;

public class DirectoryParams implements GcParamRequest {

	private String currencyCode;

	private String countryCode;

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String value) {
		this.currencyCode = value;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String value) {
		this.countryCode = value;
	}

	@Override
	public List<RequestParam> toRequestParameters() {
		List<RequestParam> result = new LinkedList<RequestParam>();
		if (currencyCode != null) {
			result.add(new RequestParam("currencyCode", currencyCode.toString()));
		}
		if (countryCode != null) {
			result.add(new RequestParam("countryCode", countryCode.toString()));
		}
		return result;
	}
}
