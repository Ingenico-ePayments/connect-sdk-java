/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

public class DecryptedPaymentData {

	private String cardholderName = null;

	private String cryptogram = null;

	private String dpan = null;

	private Integer eci = null;

	private String expiryDate = null;

	private String pan = null;

	private String paymentMethod = null;

	/**
	 * Card holder's name on the card.
	 * <ul class="paragraph-width">
	 * <li>For Apple Pay, maps to the cardholderName property in the encrypted payment data.
	 * <li>For Google Pay this is not available in the encrypted payment data, and can be omitted.
	 * </ul>
	 */
	public String getCardholderName() {
		return cardholderName;
	}

	/**
	 * Card holder's name on the card.
	 * <ul class="paragraph-width">
	 * <li>For Apple Pay, maps to the cardholderName property in the encrypted payment data.
	 * <li>For Google Pay this is not available in the encrypted payment data, and can be omitted.
	 * </ul>
	 */
	public void setCardholderName(String value) {
		this.cardholderName = value;
	}

	/**
	 * The 3D secure online payment cryptogram.
	 * <ul class="paragraph-width">
	 * <li>For Apple Pay, maps to the paymentData.onlinePaymentCryptogram property in the encrypted payment data.
	 * <li>For Google Pay, maps to the paymentMethodDetails.3dsCryptogram property in the encrypted payment data.
	 * </ul>
	 * Not allowed for Google Pay if the authMethod in the response of Google is PAN_ONLY.
	 */
	public String getCryptogram() {
		return cryptogram;
	}

	/**
	 * The 3D secure online payment cryptogram.
	 * <ul class="paragraph-width">
	 * <li>For Apple Pay, maps to the paymentData.onlinePaymentCryptogram property in the encrypted payment data.
	 * <li>For Google Pay, maps to the paymentMethodDetails.3dsCryptogram property in the encrypted payment data.
	 * </ul>
	 * Not allowed for Google Pay if the authMethod in the response of Google is PAN_ONLY.
	 */
	public void setCryptogram(String value) {
		this.cryptogram = value;
	}

	/**
	 * The device specific PAN.
	 * <ul class="paragraph-width">
	 * <li>For Apple Pay, maps to the applicationPrimaryAccountNumber property in the encrypted payment data.
	 * <li>For Google Pay, maps to the paymentMethodDetails.dpan property in the encrypted payment data.
	 * </ul>
	 * Not allowed for Google Pay if the authMethod in the response of Google is PAN_ONLY.
	 */
	public String getDpan() {
		return dpan;
	}

	/**
	 * The device specific PAN.
	 * <ul class="paragraph-width">
	 * <li>For Apple Pay, maps to the applicationPrimaryAccountNumber property in the encrypted payment data.
	 * <li>For Google Pay, maps to the paymentMethodDetails.dpan property in the encrypted payment data.
	 * </ul>
	 * Not allowed for Google Pay if the authMethod in the response of Google is PAN_ONLY.
	 */
	public void setDpan(String value) {
		this.dpan = value;
	}

	/**
	 * Electronic Commerce Indicator.
	 * <ul class="paragraph-width">
	 * <li>For Apple Pay, maps to the paymentData.eciIndicator property in the encrypted payment data.
	 * <li>For Google Pay, maps to the paymentMethodDetails.3dsEciIndicator property in the encryted payment data.
	 * </ul>
	 * Not allowed for Google Pay if the authMethod in the response of Google is PAN_ONLY.
	 */
	public Integer getEci() {
		return eci;
	}

	/**
	 * Electronic Commerce Indicator.
	 * <ul class="paragraph-width">
	 * <li>For Apple Pay, maps to the paymentData.eciIndicator property in the encrypted payment data.
	 * <li>For Google Pay, maps to the paymentMethodDetails.3dsEciIndicator property in the encryted payment data.
	 * </ul>
	 * Not allowed for Google Pay if the authMethod in the response of Google is PAN_ONLY.
	 */
	public void setEci(Integer value) {
		this.eci = value;
	}

	/**
	 * Expiry date of the card<br>
	 * Format: MMYY.
	 * <ul class="paragraph-width">
	 * <li>For Apple Pay, maps to the applicationExpirationDate property in the encrypted payment data. This property is formatted as YYMMDD, so this needs to be converted to get a correctly formatted expiry date.
	 * <li>For Google Pay, maps to the paymentMethodDetails.expirationMonth and paymentMethodDetails.expirationYear properties in the encrypted payment data. These need to be combined to get a correctly formatted expiry date.
	 * </ul>
	 */
	public String getExpiryDate() {
		return expiryDate;
	}

	/**
	 * Expiry date of the card<br>
	 * Format: MMYY.
	 * <ul class="paragraph-width">
	 * <li>For Apple Pay, maps to the applicationExpirationDate property in the encrypted payment data. This property is formatted as YYMMDD, so this needs to be converted to get a correctly formatted expiry date.
	 * <li>For Google Pay, maps to the paymentMethodDetails.expirationMonth and paymentMethodDetails.expirationYear properties in the encrypted payment data. These need to be combined to get a correctly formatted expiry date.
	 * </ul>
	 */
	public void setExpiryDate(String value) {
		this.expiryDate = value;
	}

	/**
	 * The non-device specific complete credit/debit card number (also know as the PAN).
	 * <ul class="paragraph-width">
	 * <li>For Apple Pay this is not available in the encrypted payment data, and must be omitted.
	 * <li>For Google Pay, maps to the paymentMethodDetails.pan property in the encrypted payment data.
	 * </ul>
	 * Not allowed for Google Pay if the authMethod in the response of Google is CRYPTOGRAM_3DS.
	 */
	public String getPan() {
		return pan;
	}

	/**
	 * The non-device specific complete credit/debit card number (also know as the PAN).
	 * <ul class="paragraph-width">
	 * <li>For Apple Pay this is not available in the encrypted payment data, and must be omitted.
	 * <li>For Google Pay, maps to the paymentMethodDetails.pan property in the encrypted payment data.
	 * </ul>
	 * Not allowed for Google Pay if the authMethod in the response of Google is CRYPTOGRAM_3DS.
	 */
	public void setPan(String value) {
		this.pan = value;
	}

	/**
	 * <ul class="paragraph-width">
	 * <li>In case Google provides in the response as authMethod: CRYPTOGRAM_3DS send in as value of this property TOKENIZED_CARD.
	 * <li>In case Google provides in the response as authMethod: PAN_ONLY send in as value of this property CARD.
	 * </ul>For Apple Pay this is not available in the encrypted payment data, and must be omitted.
	 */
	public String getPaymentMethod() {
		return paymentMethod;
	}

	/**
	 * <ul class="paragraph-width">
	 * <li>In case Google provides in the response as authMethod: CRYPTOGRAM_3DS send in as value of this property TOKENIZED_CARD.
	 * <li>In case Google provides in the response as authMethod: PAN_ONLY send in as value of this property CARD.
	 * </ul>For Apple Pay this is not available in the encrypted payment data, and must be omitted.
	 */
	public void setPaymentMethod(String value) {
		this.paymentMethod = value;
	}
}
