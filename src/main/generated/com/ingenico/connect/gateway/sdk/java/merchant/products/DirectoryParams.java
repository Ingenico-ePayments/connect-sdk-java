/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.merchant.products;

import com.ingenico.connect.gateway.sdk.java.AbstractParamRequest;
import com.ingenico.connect.gateway.sdk.java.RequestParam;
import java.util.LinkedList;
import java.util.List;

/**
 * Query parameters for
 * <a href="https://developer.globalcollect.com/documentation/api/server/#__merchantId__products__paymentProductId__directory_get">Get payment product directory</a>
 */
public class DirectoryParams extends AbstractParamRequest {

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
		addParameter(result, "currencyCode", currencyCode);
		addParameter(result, "countryCode", countryCode);
		return result;
	}
}
