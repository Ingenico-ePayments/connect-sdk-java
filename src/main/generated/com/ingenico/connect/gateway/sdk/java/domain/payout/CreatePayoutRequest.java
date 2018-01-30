/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payout;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.AmountOfMoney;
import com.ingenico.connect.gateway.sdk.java.domain.definitions.BankAccountBban;
import com.ingenico.connect.gateway.sdk.java.domain.definitions.BankAccountIban;
import com.ingenico.connect.gateway.sdk.java.domain.payout.definitions.BankTransferPayoutMethodSpecificInput;
import com.ingenico.connect.gateway.sdk.java.domain.payout.definitions.CardPayoutMethodSpecificInput;
import com.ingenico.connect.gateway.sdk.java.domain.payout.definitions.PayoutCustomer;
import com.ingenico.connect.gateway.sdk.java.domain.payout.definitions.PayoutReferences;

public class CreatePayoutRequest {

	private AmountOfMoney amountOfMoney = null;

	private BankAccountBban bankAccountBban = null;

	private BankAccountIban bankAccountIban = null;

	private BankTransferPayoutMethodSpecificInput bankTransferPayoutMethodSpecificInput = null;

	private CardPayoutMethodSpecificInput cardPayoutMethodSpecificInput = null;

	private PayoutCustomer customer = null;

	private String payoutDate = null;

	private String payoutText = null;

	private PayoutReferences references = null;

	private String swiftCode = null;

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
	 * Object containing account holder name and bank account information. This field can only be used for payouts in the UK. Either a BBAN account or an IBAN account should be provided, but not both
	 *
	 * @deprecated Use bankTransferPayoutMethodSpecificInput.bankAccountBban instead
	 */
	@Deprecated
	public BankAccountBban getBankAccountBban() {
		return bankAccountBban;
	}

	/**
	 * Object containing account holder name and bank account information. This field can only be used for payouts in the UK. Either a BBAN account or an IBAN account should be provided, but not both
	 *
	 * @deprecated Use bankTransferPayoutMethodSpecificInput.bankAccountBban instead
	 */
	@Deprecated
	public void setBankAccountBban(BankAccountBban value) {
		this.bankAccountBban = value;
	}

	/**
	 * Object containing account holder and IBAN information. Either a BBAN account or an IBAN account should be provided, but not both
	 *
	 * @deprecated Use bankTransferPayoutMethodSpecificInput.bankAccountIban instead
	 */
	@Deprecated
	public BankAccountIban getBankAccountIban() {
		return bankAccountIban;
	}

	/**
	 * Object containing account holder and IBAN information. Either a BBAN account or an IBAN account should be provided, but not both
	 *
	 * @deprecated Use bankTransferPayoutMethodSpecificInput.bankAccountIban instead
	 */
	@Deprecated
	public void setBankAccountIban(BankAccountIban value) {
		this.bankAccountIban = value;
	}

	/**
	 * Object containing the specific input details for bank transfer payouts.
	 */
	public BankTransferPayoutMethodSpecificInput getBankTransferPayoutMethodSpecificInput() {
		return bankTransferPayoutMethodSpecificInput;
	}

	/**
	 * Object containing the specific input details for bank transfer payouts.
	 */
	public void setBankTransferPayoutMethodSpecificInput(BankTransferPayoutMethodSpecificInput value) {
		this.bankTransferPayoutMethodSpecificInput = value;
	}

	/**
	 * Object containing the specific input details for card payouts.
	 */
	public CardPayoutMethodSpecificInput getCardPayoutMethodSpecificInput() {
		return cardPayoutMethodSpecificInput;
	}

	/**
	 * Object containing the specific input details for card payouts.
	 */
	public void setCardPayoutMethodSpecificInput(CardPayoutMethodSpecificInput value) {
		this.cardPayoutMethodSpecificInput = value;
	}

	/**
	 * Object containing the details of the consumer.
	 *
	 * @deprecated Use bankTransferPayoutMethodSpecificInput.customer instead
	 */
	@Deprecated
	public PayoutCustomer getCustomer() {
		return customer;
	}

	/**
	 * Object containing the details of the consumer.
	 *
	 * @deprecated Use bankTransferPayoutMethodSpecificInput.customer instead
	 */
	@Deprecated
	public void setCustomer(PayoutCustomer value) {
		this.customer = value;
	}

	/**
	 * Date of the payout sent to the bank by us<br>
	 * Format: YYYYMMDD
	 *
	 * @deprecated Use bankTransferPayoutMethodSpecificInput.payoutDate instead
	 */
	@Deprecated
	public String getPayoutDate() {
		return payoutDate;
	}

	/**
	 * Date of the payout sent to the bank by us<br>
	 * Format: YYYYMMDD
	 *
	 * @deprecated Use bankTransferPayoutMethodSpecificInput.payoutDate instead
	 */
	@Deprecated
	public void setPayoutDate(String value) {
		this.payoutDate = value;
	}

	/**
	 * Text to be printed on the bank account statement of the beneficiary. The maximum allowed length might differ per country. The data will be automatically truncated to the maximum allowed length.
	 *
	 * @deprecated Use bankTransferPayoutMethodSpecificInput.payoutText instead
	 */
	@Deprecated
	public String getPayoutText() {
		return payoutText;
	}

	/**
	 * Text to be printed on the bank account statement of the beneficiary. The maximum allowed length might differ per country. The data will be automatically truncated to the maximum allowed length.
	 *
	 * @deprecated Use bankTransferPayoutMethodSpecificInput.payoutText instead
	 */
	@Deprecated
	public void setPayoutText(String value) {
		this.payoutText = value;
	}

	/**
	 * Object that holds all reference fields that are linked to this transaction
	 */
	public PayoutReferences getReferences() {
		return references;
	}

	/**
	 * Object that holds all reference fields that are linked to this transaction
	 */
	public void setReferences(PayoutReferences value) {
		this.references = value;
	}

	/**
	 * The BIC is the Business Identifier Code, also known as SWIFT or Bank Identifier code. It is a code with an internationally agreed format to Identify a specific bank. The BIC contains 8 or 11 positions: the first 4 contain the bank code, followed by the country code and location code.
	 *
	 * @deprecated Use bankTransferPayoutMethodSpecificInput.swiftCode instead
	 */
	@Deprecated
	public String getSwiftCode() {
		return swiftCode;
	}

	/**
	 * The BIC is the Business Identifier Code, also known as SWIFT or Bank Identifier code. It is a code with an internationally agreed format to Identify a specific bank. The BIC contains 8 or 11 positions: the first 4 contain the bank code, followed by the country code and location code.
	 *
	 * @deprecated Use bankTransferPayoutMethodSpecificInput.swiftCode instead
	 */
	@Deprecated
	public void setSwiftCode(String value) {
		this.swiftCode = value;
	}
}
