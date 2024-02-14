/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/
 */

package com.ingenico.connect.gateway.sdk.java.merchant.productgroups;

import java.util.LinkedList;
import java.util.List;

import com.ingenico.connect.gateway.sdk.java.ParamRequest;
import com.ingenico.connect.gateway.sdk.java.RequestParam;

/**
 * Query parameters for
 * <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/productgroups/find.html">Get payment product groups</a>
 */
public class FindProductgroupsParams implements ParamRequest {

	private String countryCode;

	private String currencyCode;

	private String locale;

	private Long amount;

	private Boolean isRecurring;

	private Boolean isInstallments;

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
	 * Locale used in the GUI towards the consumer. Please make sure that a language pack is configured for the locale you are submitting. If you submit a locale that is not set up on your account, we will use the default language pack for your account. You can easily upload additional language packs and set the default language pack in the Configuration Center.
	 */
	public String getLocale() {
		return locale;
	}

	/**
	 * Locale used in the GUI towards the consumer. Please make sure that a language pack is configured for the locale you are submitting. If you submit a locale that is not set up on your account, we will use the default language pack for your account. You can easily upload additional language packs and set the default language pack in the Configuration Center.
	 */
	public void setLocale(String value) {
		this.locale = value;
	}

	/**
	 * Amount of the transaction in cents and always having 2 decimals
	 */
	public Long getAmount() {
		return amount;
	}

	/**
	 * Amount of the transaction in cents and always having 2 decimals
	 */
	public void setAmount(Long value) {
		this.amount = value;
	}

	/**
	 * This allows you to filter groups based on their support for recurring, where a group supports recurring if it has at least one payment product that supports recurring
	 * <ul class="paragraph-width"><li>true
	 * <li>false
	 * </ul>
	 */
	public Boolean getIsRecurring() {
		return isRecurring;
	}

	/**
	 * This allows you to filter groups based on their support for recurring, where a group supports recurring if it has at least one payment product that supports recurring
	 * <ul class="paragraph-width"><li>true
	 * <li>false
	 * </ul>
	 */
	public void setIsRecurring(Boolean value) {
		this.isRecurring = value;
	}

	/**
	 * This allows you to filter payment products based on their support for installments or not
	 * <ul class="paragraph-width"><li>true
	 * <li>false
	 * </ul>
	 * If this is omitted all payment products are returned.
	 */
	public Boolean getIsInstallments() {
		return isInstallments;
	}

	/**
	 * This allows you to filter payment products based on their support for installments or not
	 * <ul class="paragraph-width"><li>true
	 * <li>false
	 * </ul>
	 * If this is omitted all payment products are returned.
	 */
	public void setIsInstallments(Boolean value) {
		this.isInstallments = value;
	}

	/**
	 * Allows you to hide elements from the response, reducing the amount of data that needs to be returned to your client. Possible options are:
	 * <ul class="paragraph-width">
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
	 * <ul class="paragraph-width">
	 * <li>fields - Don't return any data on fields of the payment product
	 * <li>accountsOnFile - Don't return any accounts on file data
	 * <li>translations - Don't return any label texts associated with the payment products
	 * </ul>
	 */
	public void setHide(List<String> value) {
		this.hide = value;
	}

	/**
	 * Allows you to hide elements from the response, reducing the amount of data that needs to be returned to your client. Possible options are:
	 * <ul class="paragraph-width">
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
		if (countryCode != null) {
			result.add(new RequestParam("countryCode", countryCode));
		}
		if (currencyCode != null) {
			result.add(new RequestParam("currencyCode", currencyCode));
		}
		if (locale != null) {
			result.add(new RequestParam("locale", locale));
		}
		if (amount != null) {
			result.add(new RequestParam("amount", amount.toString()));
		}
		if (isRecurring != null) {
			result.add(new RequestParam("isRecurring", isRecurring.toString()));
		}
		if (isInstallments != null) {
			result.add(new RequestParam("isInstallments", isInstallments.toString()));
		}
		if (hide != null) {
			for (String hideElement : hide) {
				if (hideElement != null) {
					result.add(new RequestParam("hide", hideElement));
				}
			}
		}
		return result;
	}
}
