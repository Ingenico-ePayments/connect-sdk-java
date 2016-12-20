/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;


/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_DecryptedPaymentData">DecryptedPaymentData</a>
 */
public class DecryptedPaymentData {

	private String cardholderName = null;

	private String cryptogram = null;

	private String dpan = null;

	private Integer eci = null;

	private String expiryDate = null;

	public String getCardholderName() {
		return cardholderName;
	}

	public void setCardholderName(String value) {
		this.cardholderName = value;
	}

	public String getCryptogram() {
		return cryptogram;
	}

	public void setCryptogram(String value) {
		this.cryptogram = value;
	}

	public String getDpan() {
		return dpan;
	}

	public void setDpan(String value) {
		this.dpan = value;
	}

	public Integer getEci() {
		return eci;
	}

	public void setEci(Integer value) {
		this.eci = value;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String value) {
		this.expiryDate = value;
	}
}
