package com.globalcollect.gateway.sdk.java.gc.merchant.productgroups;

import com.globalcollect.gateway.sdk.java.GcParamRequest;
import com.globalcollect.gateway.sdk.java.RequestParam;
import java.util.LinkedList;
import java.util.List;

public class GetParams implements GcParamRequest {

	private Long amount;

	private List<String> hide;

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

	public List<String> getHide() {
		return hide;
	}

	public void setHide(List<String> value) {
		this.hide = value;
	}

	/**
	 * @deprecated Use {@link #setHide(List)} or {@link #addHide(String)} instead.
	 */
	@Deprecated
	public void setHide(String value) {
		this.hide = null;
		if (value != null) {
			addHide(value);
		}
	}

	public void addHide(String value) {
		if (this.hide == null) {
			this.hide = new LinkedList<String>();
		}
		this.hide.add(value);
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
			for (String value : hide) {
				if (value != null) {
					result.add(new RequestParam("hide", value.toString()));
				}
			}
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
