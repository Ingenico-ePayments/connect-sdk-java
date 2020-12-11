/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.definitions;

/**
 * Object that holds lodging related charges
 */
public class LodgingCharge {

	private Long chargeAmount = null;

	private String chargeAmountCurrencyCode = null;

	private String chargeType = null;

	/**
	 * Amount of additional charges associated with the stay of the guest.<br>
	 * Note: The currencyCode is presumed to be identical to the order.amountOfMoney.currencyCode.
	 */
	public Long getChargeAmount() {
		return chargeAmount;
	}

	/**
	 * Amount of additional charges associated with the stay of the guest.<br>
	 * Note: The currencyCode is presumed to be identical to the order.amountOfMoney.currencyCode.
	 */
	public void setChargeAmount(Long value) {
		this.chargeAmount = value;
	}

	/**
	 * Currency for Charge amount. The code should be in 3 letter ISO format.
	 */
	public String getChargeAmountCurrencyCode() {
		return chargeAmountCurrencyCode;
	}

	/**
	 * Currency for Charge amount. The code should be in 3 letter ISO format.
	 */
	public void setChargeAmountCurrencyCode(String value) {
		this.chargeAmountCurrencyCode = value;
	}

	/**
	 * Type of additional charges associated with the stay of the guest.
	 * 
	 * Allowed values:
	 * <ul class="paragraph-width"><li>lodging</li>
	 * <li>telephone</li>
	 * <li>restaurant</li>
	 * <li>minibar</li>
	 * <li>giftshop</li>
	 * <li>laundry</li>
	 * <li>transport</li>
	 * <li>gratuity</li>
	 * <li>conferenceRoom</li>
	 * <li>audiovisual</li>
	 * <li>banquet</li>
	 * <li>internet</li>
	 * <li>earlyDeparture</li>
	 * <li>roomService</li>
	 * <li>loungeBar</li>
	 * <li>other</li></ul>
	 */
	public String getChargeType() {
		return chargeType;
	}

	/**
	 * Type of additional charges associated with the stay of the guest.
	 * 
	 * Allowed values:
	 * <ul class="paragraph-width"><li>lodging</li>
	 * <li>telephone</li>
	 * <li>restaurant</li>
	 * <li>minibar</li>
	 * <li>giftshop</li>
	 * <li>laundry</li>
	 * <li>transport</li>
	 * <li>gratuity</li>
	 * <li>conferenceRoom</li>
	 * <li>audiovisual</li>
	 * <li>banquet</li>
	 * <li>internet</li>
	 * <li>earlyDeparture</li>
	 * <li>roomService</li>
	 * <li>loungeBar</li>
	 * <li>other</li></ul>
	 */
	public void setChargeType(String value) {
		this.chargeType = value;
	}
}
