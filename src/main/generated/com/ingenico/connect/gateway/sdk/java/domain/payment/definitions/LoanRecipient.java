/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */

package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

public class LoanRecipient {

	private String accountNumber = null;

	private String dateOfBirth = null;

	private String partialPan = null;

	private String surname = null;

	private String zip = null;

	/**
	 * Should be filled with the last 10 digits of the bank account number of the recipient of the loan.
	 */
	public String getAccountNumber() {
		return accountNumber;
	}

	/**
	 * Should be filled with the last 10 digits of the bank account number of the recipient of the loan.
	 */
	public void setAccountNumber(String value) {
		this.accountNumber = value;
	}

	/**
	 * The date of birth of the customer of the recipient of the loan.<br>Format: YYYYMMDD
	 */
	public String getDateOfBirth() {
		return dateOfBirth;
	}

	/**
	 * The date of birth of the customer of the recipient of the loan.<br>Format: YYYYMMDD
	 */
	public void setDateOfBirth(String value) {
		this.dateOfBirth = value;
	}

	/**
	 * Should be filled with the first 6 and last 4 digits of the PAN number of the recipient of the loan.
	 */
	public String getPartialPan() {
		return partialPan;
	}

	/**
	 * Should be filled with the first 6 and last 4 digits of the PAN number of the recipient of the loan.
	 */
	public void setPartialPan(String value) {
		this.partialPan = value;
	}

	/**
	 * Surname of the recipient of the loan.
	 */
	public String getSurname() {
		return surname;
	}

	/**
	 * Surname of the recipient of the loan.
	 */
	public void setSurname(String value) {
		this.surname = value;
	}

	/**
	 * Zip code of the recipient of the loan
	 */
	public String getZip() {
		return zip;
	}

	/**
	 * Zip code of the recipient of the loan
	 */
	public void setZip(String value) {
		this.zip = value;
	}
}
