/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.merchant.productgroups;

import java.util.LinkedList;
import java.util.List;

import com.ingenico.connect.gateway.sdk.java.AbstractParamRequest;
import com.ingenico.connect.gateway.sdk.java.RequestParam;

/**
 * Query parameters for
 * <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/productgroups/get.html">Get payment product group</a>
 */
public class GetProductgroupParams extends AbstractParamRequest {

	private String countryCode;

	private String currencyCode;

	private String locale;

	private Long amount;

	private Boolean isRecurring;

	private List<String> hide;

	/**
	 * ISO 3166-1 alpha-2 country code of the transaction
	 */
	public String getCountryCode() {
		return countryCode;
	}

	/**
	 * ISO 3166-1 alpha-2 country code of the transaction
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
	 * Locale used in the GUI towards the consumer. Please make sure that a language pack is configured for the locale you are submitting. If you submit a locale that is not setup on your account we will use the default language pack for your account. You can easily upload additional language packs and set the default language pack in the Configuration Center.
	 */
	public String getLocale() {
		return locale;
	}

	/**
	 * Locale used in the GUI towards the consumer. Please make sure that a language pack is configured for the locale you are submitting. If you submit a locale that is not setup on your account we will use the default language pack for your account. You can easily upload additional language packs and set the default language pack in the Configuration Center.
	 */
	public void setLocale(String value) {
		this.locale = value;
	}

	/**
	 * Amount  of the transaction in cents and always having 2 decimals.
	 */
	public Long getAmount() {
		return amount;
	}

	/**
	 * Amount  of the transaction in cents and always having 2 decimals.
	 */
	public void setAmount(Long value) {
		this.amount = value;
	}

	/**
	 * Toggles filtering on support for recurring payments. Default value is false.
	 * <ul>
	 * <li>true - filter out groups that do not support recurring payments, where a group supports recurring payments if it has at least one payment product that supports recurring.
	 * <li>false - do not filter
	 * </ul>
	 */
	public Boolean getIsRecurring() {
		return isRecurring;
	}

	/**
	 * Toggles filtering on support for recurring payments. Default value is false.
	 * <ul>
	 * <li>true - filter out groups that do not support recurring payments, where a group supports recurring payments if it has at least one payment product that supports recurring.
	 * <li>false - do not filter
	 * </ul>
	 */
	public void setIsRecurring(Boolean value) {
		this.isRecurring = value;
	}

	/**
	 * Allows you to hide elements from the response, reducing the amount of data that needs to be returned to your client. Possible options are:
	 * <ul>
	 * <li>fields - Don't return any data on fields of the payment product
	 * <li>accountsOnFile - Don't return any accounts on file data
	 * <li>translations - Don't return any label texts associated with the payment products
	 * </ul>
	 */
	public List<String> getHide() {
		return hide;
	}

	/**
	 * Allows you to hide elements from the response, reducing the amount of data that needs to be returned to your client. Possible options are:
	 * <ul>
	 * <li>fields - Don't return any data on fields of the payment product
	 * <li>accountsOnFile - Don't return any accounts on file data
	 * <li>translations - Don't return any label texts associated with the payment products
	 * </ul>
	 */
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

	/**
	 * Allows you to hide elements from the response, reducing the amount of data that needs to be returned to your client. Possible options are:
	 * <ul>
	 * <li>fields - Don't return any data on fields of the payment product
	 * <li>accountsOnFile - Don't return any accounts on file data
	 * <li>translations - Don't return any label texts associated with the payment products
	 * </ul>
	 */
	public void addHide(String value) {
		if (this.hide == null) {
			this.hide = new LinkedList<String>();
		}
		this.hide.add(value);
	}

	@Override
	public List<RequestParam> toRequestParameters() {
		List<RequestParam> result = new LinkedList<RequestParam>();
		addParameter(result, "countryCode", countryCode);
		addParameter(result, "currencyCode", currencyCode);
		addParameter(result, "locale", locale);
		addParameter(result, "amount", amount);
		addParameter(result, "isRecurring", isRecurring);
		addParameter(result, "hide", hide);
		return result;
	}
}
