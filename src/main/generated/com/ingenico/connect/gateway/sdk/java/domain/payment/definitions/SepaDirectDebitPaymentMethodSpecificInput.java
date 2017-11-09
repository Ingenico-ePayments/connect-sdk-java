/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

public class SepaDirectDebitPaymentMethodSpecificInput extends SepaDirectDebitPaymentMethodSpecificInputBase {

	private String dateCollect = null;

	private String directDebitText = null;

	private Boolean isRecurring = null;

	private String recurringPaymentSequenceIndicator = null;

	private String token = null;

	private Boolean tokenize = null;

	/**
	 * Changed date for direct debit collection. Only relevant for legacy SEPA Direct Debit.<br>
	 * Format: YYYYMMDD
	 */
	public String getDateCollect() {
		return dateCollect;
	}

	/**
	 * Changed date for direct debit collection. Only relevant for legacy SEPA Direct Debit.<br>
	 * Format: YYYYMMDD
	 */
	public void setDateCollect(String value) {
		this.dateCollect = value;
	}

	/**
	 * Description of the transaction that will appear on the consumer bank statement to aid the consumer in recognizing the transaction. Only relevant for legacy SEPA Direct Debit.
	 */
	public String getDirectDebitText() {
		return directDebitText;
	}

	/**
	 * Description of the transaction that will appear on the consumer bank statement to aid the consumer in recognizing the transaction. Only relevant for legacy SEPA Direct Debit.
	 */
	public void setDirectDebitText(String value) {
		this.directDebitText = value;
	}

	/**
	 * Indicates if this transaction is of a one-off or a recurring type. Only relevant for legacy SEPA Direct Debit.
	 * <ul><li>true - This is recurring
	 * <li>false - This is one-off
	 * </ul>
	 */
	public Boolean getIsRecurring() {
		return isRecurring;
	}

	/**
	 * Indicates if this transaction is of a one-off or a recurring type. Only relevant for legacy SEPA Direct Debit.
	 * <ul><li>true - This is recurring
	 * <li>false - This is one-off
	 * </ul>
	 */
	public void setIsRecurring(Boolean value) {
		this.isRecurring = value;
	}

	/**
	 * Only relevant for legacy SEPA Direct Debit.<ul><li>first = This transaction is the first of a series of recurring transactions
	 * <li>recurring = This transaction is a subsequent transaction in a series of recurring transactions
	 * <li>last = This transaction is the last transaction of a series of recurring transactions
	 * </ul>
	 */
	public String getRecurringPaymentSequenceIndicator() {
		return recurringPaymentSequenceIndicator;
	}

	/**
	 * Only relevant for legacy SEPA Direct Debit.<ul><li>first = This transaction is the first of a series of recurring transactions
	 * <li>recurring = This transaction is a subsequent transaction in a series of recurring transactions
	 * <li>last = This transaction is the last transaction of a series of recurring transactions
	 * </ul>
	 */
	public void setRecurringPaymentSequenceIndicator(String value) {
		this.recurringPaymentSequenceIndicator = value;
	}

	/**
	 * ID of the token that holds previously stored SEPA Direct Debit account and mandate data. Only relevant for legacy SEPA Direct Debit.
	 */
	public String getToken() {
		return token;
	}

	/**
	 * ID of the token that holds previously stored SEPA Direct Debit account and mandate data. Only relevant for legacy SEPA Direct Debit.
	 */
	public void setToken(String value) {
		this.token = value;
	}

	/**
	 * Indicates if this transaction should be tokenized. Only relevant for legacy SEPA Direct Debit.
	 * <ul><li>true - Tokenize the transaction
	 * <li>false - Do not tokenize the transaction, unless it would be tokenized by other means such as auto-tokenization of recurring payments.
	 * </ul>
	 */
	public Boolean getTokenize() {
		return tokenize;
	}

	/**
	 * Indicates if this transaction should be tokenized. Only relevant for legacy SEPA Direct Debit.
	 * <ul><li>true - Tokenize the transaction
	 * <li>false - Do not tokenize the transaction, unless it would be tokenized by other means such as auto-tokenization of recurring payments.
	 * </ul>
	 */
	public void setTokenize(Boolean value) {
		this.tokenize = value;
	}
}
