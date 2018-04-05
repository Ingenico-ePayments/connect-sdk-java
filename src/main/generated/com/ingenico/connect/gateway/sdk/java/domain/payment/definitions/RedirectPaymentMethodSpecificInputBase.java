/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.AbstractPaymentMethodSpecificInput;

public class RedirectPaymentMethodSpecificInputBase extends AbstractPaymentMethodSpecificInput {

	private Integer expirationPeriod = null;

	private String recurringPaymentSequenceIndicator = null;

	private Boolean requiresApproval = null;

	private String token = null;

	private Boolean tokenize = null;

	/**
	 * This sets the maximum amount of minutes a consumer has to complete the payment at the bank. After this period has expired it is impossible for the consumer to make a payment and in case no payment has been made the transaction will be marked as unsuccessful and expired by the bank. Setting the expirationPeriod is convenient if you want to maximise the time a consumer has to complete the payment. Please note that it is normal for a consumer to take up to 5 minutes to complete a payment. Setting this value below 10 minutes is not advised.
	 * <br>You can set this value in minutes with a maximum value of 60 minutes. If no input is provided the default value of 60 is used for the transaction.
	 * <br>This value can be set for the following payment products
	 * <ul><li>809 - iDeal</li>
	 * <li>402 - eCard Poland</li>
	 * </ul>
	 */
	public Integer getExpirationPeriod() {
		return expirationPeriod;
	}

	/**
	 * This sets the maximum amount of minutes a consumer has to complete the payment at the bank. After this period has expired it is impossible for the consumer to make a payment and in case no payment has been made the transaction will be marked as unsuccessful and expired by the bank. Setting the expirationPeriod is convenient if you want to maximise the time a consumer has to complete the payment. Please note that it is normal for a consumer to take up to 5 minutes to complete a payment. Setting this value below 10 minutes is not advised.
	 * <br>You can set this value in minutes with a maximum value of 60 minutes. If no input is provided the default value of 60 is used for the transaction.
	 * <br>This value can be set for the following payment products
	 * <ul><li>809 - iDeal</li>
	 * <li>402 - eCard Poland</li>
	 * </ul>
	 */
	public void setExpirationPeriod(Integer value) {
		this.expirationPeriod = value;
	}

	/**
	 * <ul><li>first = This transaction is the first of a series of recurring transactions
	 * <li>recurring = This transaction is a subsequent transaction in a series of recurring transactions
	 * </ul>
	 * Note: Will default to first when isRecurring is set to true, with the following exception that it is set to recurring when the consumer is making the payment using a PayPal token.<br>
	 * Note: For any first of a recurring the system will automatically create a token as you will need to use a token for any subsequent recurring transactions. In case a token already exists this is indicated in the response with a value of False for the <span class="property">isNewToken</span> property in the response.
	 */
	public String getRecurringPaymentSequenceIndicator() {
		return recurringPaymentSequenceIndicator;
	}

	/**
	 * <ul><li>first = This transaction is the first of a series of recurring transactions
	 * <li>recurring = This transaction is a subsequent transaction in a series of recurring transactions
	 * </ul>
	 * Note: Will default to first when isRecurring is set to true, with the following exception that it is set to recurring when the consumer is making the payment using a PayPal token.<br>
	 * Note: For any first of a recurring the system will automatically create a token as you will need to use a token for any subsequent recurring transactions. In case a token already exists this is indicated in the response with a value of False for the <span class="property">isNewToken</span> property in the response.
	 */
	public void setRecurringPaymentSequenceIndicator(String value) {
		this.recurringPaymentSequenceIndicator = value;
	}

	/**
	 * <ul><li>true = the payment requires approval before the funds will be captured using the <a href='https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/payments/approve.html'>Approve payment</a> or <a href='https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/payments/capture.html'>Capture payment</a> API
	 * <li>false = the payment does not require approval, and the funds will be captured automatically
	 * </ul>
	 */
	public Boolean getRequiresApproval() {
		return requiresApproval;
	}

	/**
	 * <ul><li>true = the payment requires approval before the funds will be captured using the <a href='https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/payments/approve.html'>Approve payment</a> or <a href='https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/payments/capture.html'>Capture payment</a> API
	 * <li>false = the payment does not require approval, and the funds will be captured automatically
	 * </ul>
	 */
	public void setRequiresApproval(Boolean value) {
		this.requiresApproval = value;
	}

	/**
	 * ID of the token
	 */
	public String getToken() {
		return token;
	}

	/**
	 * ID of the token
	 */
	public void setToken(String value) {
		this.token = value;
	}

	/**
	 * Indicates if this transaction should be tokenized
	 * <ul><li>true - Tokenize the transaction. Note that a payment on the GlobalCollect platform that results in a status REDIRECTED cannot be tokenized in this way. In this case, use the <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/payments/tokenize.html">'Create a token from payment'</a> functionality after your customer succesfully completes the redirection.
	 * <li>false - Do not tokenize the transaction, unless it would be tokenized by other means such as auto-tokenization of recurring payments.
	 * </ul>
	 */
	public Boolean getTokenize() {
		return tokenize;
	}

	/**
	 * Indicates if this transaction should be tokenized
	 * <ul><li>true - Tokenize the transaction. Note that a payment on the GlobalCollect platform that results in a status REDIRECTED cannot be tokenized in this way. In this case, use the <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/payments/tokenize.html">'Create a token from payment'</a> functionality after your customer succesfully completes the redirection.
	 * <li>false - Do not tokenize the transaction, unless it would be tokenized by other means such as auto-tokenization of recurring payments.
	 * </ul>
	 */
	public void setTokenize(Boolean value) {
		this.tokenize = value;
	}
}
