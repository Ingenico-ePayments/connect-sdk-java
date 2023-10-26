/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */

package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.Address;

/**
 * Object containing specific data regarding the recipient of an account funding transaction
 */
public class AccountFundingRecipient {

	private String accountNumber = null;

	private String accountNumberType = null;

	private Address address = null;

	private String dateOfBirth = null;

	private AfrName name = null;

	private String partialPan = null;

	/**
	 * Should be populated with the value of the corresponding accountNumberType of the recipient.
	 */
	public String getAccountNumber() {
		return accountNumber;
	}

	/**
	 * Should be populated with the value of the corresponding accountNumberType of the recipient.
	 */
	public void setAccountNumber(String value) {
		this.accountNumber = value;
	}

	/**
	 * Defines the account number type of the recipient. Possible values are:
	 * <ul class="paragraph-width">
	 * <li>cash = Mode of payment is cash to the recipient.
	 * <li>walletId = Digital wallet ID.
	 * <li>routingNumber = Routing Transit Number is a code used by financial institutions to identify other financial institutions.
	 * <li>iban = International Bank Account Number, is a standard international numbering system for identifying bank accounts.
	 * <li>bicNumber = Bank Identification Code is a number that is used to identify a specific bank.
	 * </ul>
	 */
	public String getAccountNumberType() {
		return accountNumberType;
	}

	/**
	 * Defines the account number type of the recipient. Possible values are:
	 * <ul class="paragraph-width">
	 * <li>cash = Mode of payment is cash to the recipient.
	 * <li>walletId = Digital wallet ID.
	 * <li>routingNumber = Routing Transit Number is a code used by financial institutions to identify other financial institutions.
	 * <li>iban = International Bank Account Number, is a standard international numbering system for identifying bank accounts.
	 * <li>bicNumber = Bank Identification Code is a number that is used to identify a specific bank.
	 * </ul>
	 */
	public void setAccountNumberType(String value) {
		this.accountNumberType = value;
	}

	/**
	 * Object containing the address details of the recipient of an account funding transaction.
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * Object containing the address details of the recipient of an account funding transaction.
	 */
	public void setAddress(Address value) {
		this.address = value;
	}

	/**
	 * The date of birth of the recipient<br>
	 * Format: YYYYMMDD
	 */
	public String getDateOfBirth() {
		return dateOfBirth;
	}

	/**
	 * The date of birth of the recipient<br>
	 * Format: YYYYMMDD
	 */
	public void setDateOfBirth(String value) {
		this.dateOfBirth = value;
	}

	/**
	 * Object containing the name details of the recipient of an account funding transaction.
	 */
	public AfrName getName() {
		return name;
	}

	/**
	 * Object containing the name details of the recipient of an account funding transaction.
	 */
	public void setName(AfrName value) {
		this.name = value;
	}

	/**
	 * Either partialPan or accountnumber is required for merchants that use Merchant Category Code (MCC) 6012 for transactions involving UK costumers.
	 */
	public String getPartialPan() {
		return partialPan;
	}

	/**
	 * Either partialPan or accountnumber is required for merchants that use Merchant Category Code (MCC) 6012 for transactions involving UK costumers.
	 */
	public void setPartialPan(String value) {
		this.partialPan = value;
	}
}
