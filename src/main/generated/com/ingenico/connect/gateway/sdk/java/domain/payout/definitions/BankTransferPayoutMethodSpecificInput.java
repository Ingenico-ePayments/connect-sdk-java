/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payout.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.BankAccountBban;
import com.ingenico.connect.gateway.sdk.java.domain.definitions.BankAccountIban;

public class BankTransferPayoutMethodSpecificInput extends AbstractPayoutMethodSpecificInput {

	private BankAccountBban bankAccountBban = null;

	private BankAccountIban bankAccountIban = null;

	private PayoutCustomer customer = null;

	private String payoutDate = null;

	private String payoutText = null;

	private String swiftCode = null;

	/**
	 * Object containing account holder name and bank account information. This field can only be used for payouts in the UK.
	 */
	public BankAccountBban getBankAccountBban() {
		return bankAccountBban;
	}

	/**
	 * Object containing account holder name and bank account information. This field can only be used for payouts in the UK.
	 */
	public void setBankAccountBban(BankAccountBban value) {
		this.bankAccountBban = value;
	}

	/**
	 * Object containing account holder and IBAN information.
	 */
	public BankAccountIban getBankAccountIban() {
		return bankAccountIban;
	}

	/**
	 * Object containing account holder and IBAN information.
	 */
	public void setBankAccountIban(BankAccountIban value) {
		this.bankAccountIban = value;
	}

	/**
	 * Object containing the details of the consumer.
	 */
	public PayoutCustomer getCustomer() {
		return customer;
	}

	/**
	 * Object containing the details of the consumer.
	 */
	public void setCustomer(PayoutCustomer value) {
		this.customer = value;
	}

	/**
	 * Date of the payout sent to the bank by us.<br>
	 * Format: YYYYMMDD
	 */
	public String getPayoutDate() {
		return payoutDate;
	}

	/**
	 * Date of the payout sent to the bank by us.<br>
	 * Format: YYYYMMDD
	 */
	public void setPayoutDate(String value) {
		this.payoutDate = value;
	}

	/**
	 * Text to be printed on the bank account statement of the beneficiary. The maximum allowed length might differ per country. The data will be automatically truncated to the maximum allowed length.
	 */
	public String getPayoutText() {
		return payoutText;
	}

	/**
	 * Text to be printed on the bank account statement of the beneficiary. The maximum allowed length might differ per country. The data will be automatically truncated to the maximum allowed length.
	 */
	public void setPayoutText(String value) {
		this.payoutText = value;
	}

	/**
	 * The BIC is the Business Identifier Code, also known as SWIFT or Bank Identifier code. It is a code with an internationally agreed format to Identify a specific bank. The BIC contains 8 or 11 positions: the first 4 contain the bank code, followed by the country code and location code.
	 */
	public String getSwiftCode() {
		return swiftCode;
	}

	/**
	 * The BIC is the Business Identifier Code, also known as SWIFT or Bank Identifier code. It is a code with an internationally agreed format to Identify a specific bank. The BIC contains 8 or 11 positions: the first 4 contain the bank code, followed by the country code and location code.
	 */
	public void setSwiftCode(String value) {
		this.swiftCode = value;
	}
}
