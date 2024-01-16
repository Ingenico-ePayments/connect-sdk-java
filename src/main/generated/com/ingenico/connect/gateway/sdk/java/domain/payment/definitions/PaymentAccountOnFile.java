/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/
 */

package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

/**
 * Object containing information on the payment account data on file (tokens)
 */
public class PaymentAccountOnFile {

	private String createDate = null;

	private Integer numberOfCardOnFileCreationAttemptsLast24Hours = null;

	/**
	 * The date (YYYYMMDD) when the payment account on file was first created.
	 * <p>In case a token is used for the transaction we will use the creation date of the token in our system in case you leave this property empty.
	 */
	public String getCreateDate() {
		return createDate;
	}

	/**
	 * The date (YYYYMMDD) when the payment account on file was first created.
	 * <p>In case a token is used for the transaction we will use the creation date of the token in our system in case you leave this property empty.
	 */
	public void setCreateDate(String value) {
		this.createDate = value;
	}

	/**
	 * Number of attempts made to add new card to the customer account in the last 24 hours
	 */
	public Integer getNumberOfCardOnFileCreationAttemptsLast24Hours() {
		return numberOfCardOnFileCreationAttemptsLast24Hours;
	}

	/**
	 * Number of attempts made to add new card to the customer account in the last 24 hours
	 */
	public void setNumberOfCardOnFileCreationAttemptsLast24Hours(Integer value) {
		this.numberOfCardOnFileCreationAttemptsLast24Hours = value;
	}
}
