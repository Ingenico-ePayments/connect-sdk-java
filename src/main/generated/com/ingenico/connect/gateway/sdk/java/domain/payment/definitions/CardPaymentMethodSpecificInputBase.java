/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.AbstractPaymentMethodSpecificInput;

public class CardPaymentMethodSpecificInputBase extends AbstractPaymentMethodSpecificInput {

	private String authorizationMode = null;

	private String customerReference = null;

	private String recurringPaymentSequenceIndicator = null;

	private Boolean requiresApproval = null;

	private Boolean skipAuthentication = null;

	private Boolean skipFraudService = null;

	private String token = null;

	private Boolean tokenize = null;

	private String transactionChannel = null;

	private String unscheduledCardOnFileIndicator = null;

	private String unscheduledCardOnFileRequestor = null;

	/**
	 * Determines the type of the authorization that will be used. Allowed values:
	 * <ul><li>FINAL_AUTHORIZATION - The payment creation results in an authorization that is ready for capture. Final authorizations can't be reversed and need to be captured for the full amount within 7 days.
	 * <li>PRE_AUTHORIZATION - The payment creation results in a pre-authorization that is ready for capture. Pre-authortizations can be reversed and can be captured within 30 days. The capture amount can be lower than the authorized amount.
	 * </ul>
	 * Only used with some acquirers, ingnored for acquirers that don't support this. In case the acquirer doesn't allow this to be specified the <span class="property">authorizationMode</span> is 'unspecified', which behaves similar to a final authorization.
	 */
	public String getAuthorizationMode() {
		return authorizationMode;
	}

	/**
	 * Determines the type of the authorization that will be used. Allowed values:
	 * <ul><li>FINAL_AUTHORIZATION - The payment creation results in an authorization that is ready for capture. Final authorizations can't be reversed and need to be captured for the full amount within 7 days.
	 * <li>PRE_AUTHORIZATION - The payment creation results in a pre-authorization that is ready for capture. Pre-authortizations can be reversed and can be captured within 30 days. The capture amount can be lower than the authorized amount.
	 * </ul>
	 * Only used with some acquirers, ingnored for acquirers that don't support this. In case the acquirer doesn't allow this to be specified the <span class="property">authorizationMode</span> is 'unspecified', which behaves similar to a final authorization.
	 */
	public void setAuthorizationMode(String value) {
		this.authorizationMode = value;
	}

	/**
	 * Reference of the consumer for the payment (purchase order #, etc.) Only used with some acquirers.
	 */
	public String getCustomerReference() {
		return customerReference;
	}

	/**
	 * Reference of the consumer for the payment (purchase order #, etc.) Only used with some acquirers.
	 */
	public void setCustomerReference(String value) {
		this.customerReference = value;
	}

	/**
	 * <ul><li>first = This transaction is the first of a series of recurring transactions
	 * <li>recurring = This transaction is a subsequent transaction in a series of recurring transactions
	 * </ul>
	 * Note: This field will default to first when isRecurring is set to true.<br>
	 * Note: For any first of a recurring the system will automatically create a token as you will need to use a token for any subsequent recurring transactions. In case a token already exists this is indicated in the response with a value of False for the <span class="property">isNewToken</span> property in the response.
	 */
	public String getRecurringPaymentSequenceIndicator() {
		return recurringPaymentSequenceIndicator;
	}

	/**
	 * <ul><li>first = This transaction is the first of a series of recurring transactions
	 * <li>recurring = This transaction is a subsequent transaction in a series of recurring transactions
	 * </ul>
	 * Note: This field will default to first when isRecurring is set to true.<br>
	 * Note: For any first of a recurring the system will automatically create a token as you will need to use a token for any subsequent recurring transactions. In case a token already exists this is indicated in the response with a value of False for the <span class="property">isNewToken</span> property in the response.
	 */
	public void setRecurringPaymentSequenceIndicator(String value) {
		this.recurringPaymentSequenceIndicator = value;
	}

	/**
	 * <ul><li>true = the payment requires approval before the funds will be captured
	 * <li>false = the payment does not require approval, and the funds will be captured automatically
	 * </ul>
	 * If true, payments with status PENDING_APPROVAL can be captured with the <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/payments/approve.html">Approve payment</a> API and payments with the status PENDING_CAPTURE can be captured using the <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/payments/capture.html">Capture payment</a> API
	 */
	public Boolean getRequiresApproval() {
		return requiresApproval;
	}

	/**
	 * <ul><li>true = the payment requires approval before the funds will be captured
	 * <li>false = the payment does not require approval, and the funds will be captured automatically
	 * </ul>
	 * If true, payments with status PENDING_APPROVAL can be captured with the <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/payments/approve.html">Approve payment</a> API and payments with the status PENDING_CAPTURE can be captured using the <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/payments/capture.html">Capture payment</a> API
	 */
	public void setRequiresApproval(Boolean value) {
		this.requiresApproval = value;
	}

	/**
	 * <ul><li>true = 3D Secure Authentication will be skipped for this transaction. This setting should be used when <span class="property">isRecurring</span> is set to true and <span class="property">recurringPaymentSequenceIndicator</span> is set to recurring.
	 * <li>false = 3D Secure Authentication will not be skipped for this transaction.
	 * </ul>
	 * Note: This is only possible if your account in our system is setup for 3D Secure authentication and if your configuration in our system allows you to override it per transaction.
	 */
	public Boolean getSkipAuthentication() {
		return skipAuthentication;
	}

	/**
	 * <ul><li>true = 3D Secure Authentication will be skipped for this transaction. This setting should be used when <span class="property">isRecurring</span> is set to true and <span class="property">recurringPaymentSequenceIndicator</span> is set to recurring.
	 * <li>false = 3D Secure Authentication will not be skipped for this transaction.
	 * </ul>
	 * Note: This is only possible if your account in our system is setup for 3D Secure authentication and if your configuration in our system allows you to override it per transaction.
	 */
	public void setSkipAuthentication(Boolean value) {
		this.skipAuthentication = value;
	}

	/**
	 * <ul><li>true = Fraud scoring will be skipped for this transaction
	 * <li>false = Fraud scoring will not be skipped for this transaction
	 * </ul>
	 * Note: This is only possible if your account in our system is setup for Fraud scoring and if your configuration in our system allows you to override it per transaction.
	 */
	public Boolean getSkipFraudService() {
		return skipFraudService;
	}

	/**
	 * <ul><li>true = Fraud scoring will be skipped for this transaction
	 * <li>false = Fraud scoring will not be skipped for this transaction
	 * </ul>
	 * Note: This is only possible if your account in our system is setup for Fraud scoring and if your configuration in our system allows you to override it per transaction.
	 */
	public void setSkipFraudService(Boolean value) {
		this.skipFraudService = value;
	}

	/**
	 * ID of the token that holds previously stored card data
	 */
	public String getToken() {
		return token;
	}

	/**
	 * ID of the token that holds previously stored card data
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

	/**
	 * Indicates the channel via which the payment is created. Allowed values:
	 * <ul><li>ECOMMERCE - The transaction is a regular E-Commerce transaction.
	 * <li>MOTO - The transaction is a Mail Order/Telephone Order.
	 * </ul>
	 */
	public String getTransactionChannel() {
		return transactionChannel;
	}

	/**
	 * Indicates the channel via which the payment is created. Allowed values:
	 * <ul><li>ECOMMERCE - The transaction is a regular E-Commerce transaction.
	 * <li>MOTO - The transaction is a Mail Order/Telephone Order.
	 * </ul>
	 */
	public void setTransactionChannel(String value) {
		this.transactionChannel = value;
	}

	/**
	 * <ul><li>first = This transaction is the first of a series of unscheduled recurring transactions
	 * <li>subsequent = This transaction is a subsequent transaction in a series of unscheduled recurring transactions
	 * </ul><br>
	 * Note: this field is not allowed if <span class="property">isRecurring</span> is true.
	 */
	public String getUnscheduledCardOnFileIndicator() {
		return unscheduledCardOnFileIndicator;
	}

	/**
	 * <ul><li>first = This transaction is the first of a series of unscheduled recurring transactions
	 * <li>subsequent = This transaction is a subsequent transaction in a series of unscheduled recurring transactions
	 * </ul><br>
	 * Note: this field is not allowed if <span class="property">isRecurring</span> is true.
	 */
	public void setUnscheduledCardOnFileIndicator(String value) {
		this.unscheduledCardOnFileIndicator = value;
	}

	/**
	 * Indicates which party initiated the unscheduled recurring transaction. Allowed values:
	 * <ul><li>merchantInitiated - Merchant Initiated Transaction.
	 * <li>cardholderInitiated - Cardholder Initiated Transaction.
	 * </ul><br>
	 * Note: this field is not allowed if <span class="property">isRecurring</span> is true.
	 */
	public String getUnscheduledCardOnFileRequestor() {
		return unscheduledCardOnFileRequestor;
	}

	/**
	 * Indicates which party initiated the unscheduled recurring transaction. Allowed values:
	 * <ul><li>merchantInitiated - Merchant Initiated Transaction.
	 * <li>cardholderInitiated - Cardholder Initiated Transaction.
	 * </ul><br>
	 * Note: this field is not allowed if <span class="property">isRecurring</span> is true.
	 */
	public void setUnscheduledCardOnFileRequestor(String value) {
		this.unscheduledCardOnFileRequestor = value;
	}
}
