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

	/**
	 * Card holder's name on the card. This maps to the following field in the vendor's encrypted payment data:
	 * <ul>
	 * <li>Apple Pay: PKPayment.token.paymentData.data.cardholderName
	 * <li>Android Pay: Not Available
	 * </ul>
	 */
	public String getCardholderName() {
		return cardholderName;
	}

	/**
	 * Card holder's name on the card. This maps to the following field in the vendor's encrypted payment data:
	 * <ul>
	 * <li>Apple Pay: PKPayment.token.paymentData.data.cardholderName
	 * <li>Android Pay: Not Available
	 * </ul>
	 */
	public void setCardholderName(String value) {
		this.cardholderName = value;
	}

	/**
	 * The 3D secure online payment cryptogram. This maps to the following field in the vendor's encrypted payment data:
	 * <ul>
	 * <li>Apple Pay: PKPayment.token.paymentData.data.paymentData.onlinePaymentCryptogram
	 * <li>Android Pay: FullWallet.paymentMethodToken.token.encryptedMessage.3dsCryptogram
	 * </ul>
	 */
	public String getCryptogram() {
		return cryptogram;
	}

	/**
	 * The 3D secure online payment cryptogram. This maps to the following field in the vendor's encrypted payment data:
	 * <ul>
	 * <li>Apple Pay: PKPayment.token.paymentData.data.paymentData.onlinePaymentCryptogram
	 * <li>Android Pay: FullWallet.paymentMethodToken.token.encryptedMessage.3dsCryptogram
	 * </ul>
	 */
	public void setCryptogram(String value) {
		this.cryptogram = value;
	}

	/**
	 * The device specific PAN. This maps to the following field in the vendor's encrypted payment data:
	 * <ul>
	 * <li>Apple Pay: PKPayment.token.paymentData.data.applicationPrimaryAccountNumber
	 * <li>Android Pay: FullWallet.paymentMethodToken.token.encryptedMessage.dpan
	 * </ul>
	 */
	public String getDpan() {
		return dpan;
	}

	/**
	 * The device specific PAN. This maps to the following field in the vendor's encrypted payment data:
	 * <ul>
	 * <li>Apple Pay: PKPayment.token.paymentData.data.applicationPrimaryAccountNumber
	 * <li>Android Pay: FullWallet.paymentMethodToken.token.encryptedMessage.dpan
	 * </ul>
	 */
	public void setDpan(String value) {
		this.dpan = value;
	}

	/**
	 * Electronic Commerce Indicator. This maps to the following field in the vendor's encrypted payment data:
	 * <ul>
	 * <li>Apple Pay: PKPayment.token.paymentData.data.paymentData.eciIndicator
	 * <li>Android Pay: FullWallet.paymentMethodToken.token.encryptedMessage.3dsEciIndicator
	 * </ul>
	 */
	public Integer getEci() {
		return eci;
	}

	/**
	 * Electronic Commerce Indicator. This maps to the following field in the vendor's encrypted payment data:
	 * <ul>
	 * <li>Apple Pay: PKPayment.token.paymentData.data.paymentData.eciIndicator
	 * <li>Android Pay: FullWallet.paymentMethodToken.token.encryptedMessage.3dsEciIndicator
	 * </ul>
	 */
	public void setEci(Integer value) {
		this.eci = value;
	}

	/**
	 * Expiry date of the card<br>
	 * Format: MMYY. This maps to the following field in the vendor's encrypted payment data:
	 * <ul>
	 * <li>Apple Pay: PKPayment.token.paymentData.data.applicationExpirationDate
	 * <li>Android Pay:FullWallet.paymentMethodToken.token.encryptedMessage.expirationMonth and FullWallet.paymentMethodToken.token.encryptedMessage.expirationYear
	 * </ul>
	 */
	public String getExpiryDate() {
		return expiryDate;
	}

	/**
	 * Expiry date of the card<br>
	 * Format: MMYY. This maps to the following field in the vendor's encrypted payment data:
	 * <ul>
	 * <li>Apple Pay: PKPayment.token.paymentData.data.applicationExpirationDate
	 * <li>Android Pay:FullWallet.paymentMethodToken.token.encryptedMessage.expirationMonth and FullWallet.paymentMethodToken.token.encryptedMessage.expirationYear
	 * </ul>
	 */
	public void setExpiryDate(String value) {
		this.expiryDate = value;
	}
}
