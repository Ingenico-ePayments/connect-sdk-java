package com.globalcollect.gateway.sdk.java.gc.merchant.products;

import com.globalcollect.gateway.sdk.java.GcParamRequest;
import com.globalcollect.gateway.sdk.java.RequestParam;
import java.util.LinkedList;
import java.util.List;

public class FindParams implements GcParamRequest {

	private Long amount;

	private String hide;

	private Boolean isRecurring;

	private String countryCode;

	private String locale;

	private String currencyCode;

	public Long getAmount() {
		return amount;
	}

	public void setAmount(Long value) {
		this.amount = value;
	}

	public String getHide() {
		return hide;
	}

	public void setHide(String value) {
		this.hide = value;
	}

	public Boolean getIsRecurring() {
		return isRecurring;
	}

	public void setIsRecurring(Boolean value) {
		this.isRecurring = value;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String value) {
		this.countryCode = value;
	}

	public String getLocale() {
		return locale;
	}

	public void setLocale(String value) {
		this.locale = value;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String value) {
		this.currencyCode = value;
	}

	@Override
	public List<RequestParam> toRequestParameters() {
		List<RequestParam> result = new LinkedList<RequestParam>();
		if (amount != null) {
			result.add(new RequestParam("amount", amount.toString()));
		}
		if (hide != null) {
			result.add(new RequestParam("hide", hide.toString()));
		}
		if (isRecurring != null) {
			result.add(new RequestParam("isRecurring", isRecurring.toString()));
		}
		if (countryCode != null) {
			result.add(new RequestParam("countryCode", countryCode.toString()));
		}
		if (locale != null) {
			result.add(new RequestParam("locale", locale.toString()));
		}
		if (currencyCode != null) {
			result.add(new RequestParam("currencyCode", currencyCode.toString()));
		}
		return result;
	}
}
