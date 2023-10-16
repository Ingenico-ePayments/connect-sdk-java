/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */

package com.ingenico.connect.gateway.sdk.java.domain.installments;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.AmountOfMoney;

/**
 * Using the Installment Service API you can ask us to provide you with information related to the available installment options, based on the country, amount and optionally payment productId and bin number.  
 */
public class GetInstallmentRequest {

	private AmountOfMoney amountOfMoney = null;

	private String bin = null;

	private String countryCode = null;

	private Integer paymentProductId = null;

	/**
	 * Object containing amount and ISO currency code attributes
	 */
	public AmountOfMoney getAmountOfMoney() {
		return amountOfMoney;
	}

	/**
	 * Object containing amount and ISO currency code attributes
	 */
	public void setAmountOfMoney(AmountOfMoney value) {
		this.amountOfMoney = value;
	}

	/**
	 * The first digits of the card number from left to right with a minimum of 6 digits
	 */
	public String getBin() {
		return bin;
	}

	/**
	 * The first digits of the card number from left to right with a minimum of 6 digits
	 */
	public void setBin(String value) {
		this.bin = value;
	}

	/**
	 * ISO 3166-1 alpha-2 country code
	 */
	public String getCountryCode() {
		return countryCode;
	}

	/**
	 * ISO 3166-1 alpha-2 country code
	 */
	public void setCountryCode(String value) {
		this.countryCode = value;
	}

	/**
	 * Payment product identifier <br>
	 * Please see <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/paymentproducts.html">payment products</a> for a full overview of possible values.
	 */
	public Integer getPaymentProductId() {
		return paymentProductId;
	}

	/**
	 * Payment product identifier <br>
	 * Please see <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/paymentproducts.html">payment products</a> for a full overview of possible values.
	 */
	public void setPaymentProductId(Integer value) {
		this.paymentProductId = value;
	}
}
