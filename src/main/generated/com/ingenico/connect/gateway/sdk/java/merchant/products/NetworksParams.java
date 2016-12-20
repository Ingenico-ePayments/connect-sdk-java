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
 * <a href="https://developer.globalcollect.com/documentation/api/server/#__merchantId__products__paymentProductId__networks_get">Get payment product networks</a>
 */
public class NetworksParams extends AbstractParamRequest {

	private String countryCode;

	private String currencyCode;

	private Long amount;

	private Boolean isRecurring;

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String value) {
		this.countryCode = value;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String value) {
		this.currencyCode = value;
	}

	public Long getAmount() {
		return amount;
	}

	public void setAmount(Long value) {
		this.amount = value;
	}

	public Boolean getIsRecurring() {
		return isRecurring;
	}

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
