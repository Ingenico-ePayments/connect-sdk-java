/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/
 */

package com.ingenico.connect.gateway.sdk.java.domain.definitions;

import java.util.List;

import com.ingenico.connect.gateway.sdk.java.domain.errors.definitions.APIError;

public class OrderStatusOutput {

	private List<APIError> errors = null;

	private Boolean isCancellable = null;

	private Boolean isRetriable = null;

	private List<KeyValuePair> providerRawOutput = null;

	private String statusCategory = null;

	private Integer statusCode = null;

	private String statusCodeChangeDateTime = null;

	/**
	 * Custom object contains the set of errors
	 */
	public List<APIError> getErrors() {
		return errors;
	}

	/**
	 * Custom object contains the set of errors
	 */
	public void setErrors(List<APIError> value) {
		this.errors = value;
	}

	/**
	 * Flag indicating if the payment can be cancelled
	 * <ul class="paragraph-width"><li>true
	 * <li>false
	 * </ul>
	 */
	public Boolean getIsCancellable() {
		return isCancellable;
	}

	/**
	 * Flag indicating if the payment can be cancelled
	 * <ul class="paragraph-width"><li>true
	 * <li>false
	 * </ul>
	 */
	public void setIsCancellable(Boolean value) {
		this.isCancellable = value;
	}

	/**
	 * Flag indicating whether a rejected payment may be retried by the merchant without incurring a fee 
	 * <ul class="paragraph-width"><li>true
	 * <li>false
	 * </ul>
	 */
	public Boolean getIsRetriable() {
		return isRetriable;
	}

	/**
	 * Flag indicating whether a rejected payment may be retried by the merchant without incurring a fee 
	 * <ul class="paragraph-width"><li>true
	 * <li>false
	 * </ul>
	 */
	public void setIsRetriable(Boolean value) {
		this.isRetriable = value;
	}

	/**
	 * This is the raw response returned by the acquirer. This property contains unprocessed data directly returned by the acquirer. It's recommended for data analysis only due to its dynamic nature, which may undergo future changes.
	 */
	public List<KeyValuePair> getProviderRawOutput() {
		return providerRawOutput;
	}

	/**
	 * This is the raw response returned by the acquirer. This property contains unprocessed data directly returned by the acquirer. It's recommended for data analysis only due to its dynamic nature, which may undergo future changes.
	 */
	public void setProviderRawOutput(List<KeyValuePair> value) {
		this.providerRawOutput = value;
	}

	/**
	 * Highlevel status of the payment, payout or refund with the following possible values:
	 * <ul class="paragraph-width">
	 * <li>CREATED - The transaction has been created. This is the initial state once a new payment, payout or refund is created. This category groups the following statuses:
	 * <ul class="paragraph-width"><li>CREATED</ul>
	 * <li>PENDING_PAYMENT: The payment is waiting on customer action. This category groups the following statuses:
	 * <ul class="paragraph-width"><li>PENDING_PAYMENT
	 * <li>REDIRECTED</ul>
	 * <li>ACCOUNT_VERIFIED: The account has been verified. This category groups the following statuses:
	 * <ul class="paragraph-width"><li>ACCOUNT_VERIFIED</ul>
	 * <li>PENDING_MERCHANT: The transaction is awaiting approval to proceed with the payment, payout or refund. This category groups the following statuses:
	 * <ul class="paragraph-width"><li>PENDING_APPROVAL
	 * <li>PENDING_COMPLETION
	 * <li>PENDING_CAPTURE
	 * <li>PENDING_FRAUD_APPROVAL</ul>
	 * <li>PENDING_CONNECT_OR_3RD_PARTY: The transaction is in the queue to be processed. This category groups the following statuses:
	 * <ul class="paragraph-width"><li>AUTHORIZATION_REQUESTED
	 * <li>CAPTURE_REQUESTED
	 * <li>PAYOUT_REQUESTED
	 * <li>REFUND_REQUESTED</ul>
	 * <li>COMPLETED: The transaction has completed. This category groups the following statuses:
	 * <ul class="paragraph-width"><li>CAPTURED
	 * <li>PAID
	 * <li>ACCOUNT_CREDITED
	 * <li>CHARGEBACK_NOTIFICATION</ul>
	 * <li>REVERSED: The transaction has been reversed. This category groups the following statuses:
	 * <ul class="paragraph-width"><li>CHARGEBACKED
	 * <li>REVERSED</ul>
	 * <li>REFUNDED: The transaction has been refunded. This category groups the following statuses:
	 * <ul class="paragraph-width"><li>REFUNDED</ul>
	 * <li>UNSUCCESSFUL: The transaction has been rejected or is in such a state that it will never become successful. This category groups the following statuses:
	 * <ul class="paragraph-width"><li>CANCELLED
	 * <li>REJECTED
	 * <li>REJECTED_CAPTURE
	 * <li>REJECTED_CREDIT</ul>
	 * </ul><br>
	 * Please see <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/statuses.html">Statuses</a> for a full overview of possible values.
	 */
	public String getStatusCategory() {
		return statusCategory;
	}

	/**
	 * Highlevel status of the payment, payout or refund with the following possible values:
	 * <ul class="paragraph-width">
	 * <li>CREATED - The transaction has been created. This is the initial state once a new payment, payout or refund is created. This category groups the following statuses:
	 * <ul class="paragraph-width"><li>CREATED</ul>
	 * <li>PENDING_PAYMENT: The payment is waiting on customer action. This category groups the following statuses:
	 * <ul class="paragraph-width"><li>PENDING_PAYMENT
	 * <li>REDIRECTED</ul>
	 * <li>ACCOUNT_VERIFIED: The account has been verified. This category groups the following statuses:
	 * <ul class="paragraph-width"><li>ACCOUNT_VERIFIED</ul>
	 * <li>PENDING_MERCHANT: The transaction is awaiting approval to proceed with the payment, payout or refund. This category groups the following statuses:
	 * <ul class="paragraph-width"><li>PENDING_APPROVAL
	 * <li>PENDING_COMPLETION
	 * <li>PENDING_CAPTURE
	 * <li>PENDING_FRAUD_APPROVAL</ul>
	 * <li>PENDING_CONNECT_OR_3RD_PARTY: The transaction is in the queue to be processed. This category groups the following statuses:
	 * <ul class="paragraph-width"><li>AUTHORIZATION_REQUESTED
	 * <li>CAPTURE_REQUESTED
	 * <li>PAYOUT_REQUESTED
	 * <li>REFUND_REQUESTED</ul>
	 * <li>COMPLETED: The transaction has completed. This category groups the following statuses:
	 * <ul class="paragraph-width"><li>CAPTURED
	 * <li>PAID
	 * <li>ACCOUNT_CREDITED
	 * <li>CHARGEBACK_NOTIFICATION</ul>
	 * <li>REVERSED: The transaction has been reversed. This category groups the following statuses:
	 * <ul class="paragraph-width"><li>CHARGEBACKED
	 * <li>REVERSED</ul>
	 * <li>REFUNDED: The transaction has been refunded. This category groups the following statuses:
	 * <ul class="paragraph-width"><li>REFUNDED</ul>
	 * <li>UNSUCCESSFUL: The transaction has been rejected or is in such a state that it will never become successful. This category groups the following statuses:
	 * <ul class="paragraph-width"><li>CANCELLED
	 * <li>REJECTED
	 * <li>REJECTED_CAPTURE
	 * <li>REJECTED_CREDIT</ul>
	 * </ul><br>
	 * Please see <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/statuses.html">Statuses</a> for a full overview of possible values.
	 */
	public void setStatusCategory(String value) {
		this.statusCategory = value;
	}

	/**
	 * Numeric status code of the legacy API. It is returned to ease the migration from the legacy APIs to Worldline Connect. You should not write new business logic based on this property as it will be deprecated in a future version of the API. The value can also be found in the GlobalCollect Payment Console, in the Ogone BackOffice and in report files.
	 */
	public Integer getStatusCode() {
		return statusCode;
	}

	/**
	 * Numeric status code of the legacy API. It is returned to ease the migration from the legacy APIs to Worldline Connect. You should not write new business logic based on this property as it will be deprecated in a future version of the API. The value can also be found in the GlobalCollect Payment Console, in the Ogone BackOffice and in report files.
	 */
	public void setStatusCode(Integer value) {
		this.statusCode = value;
	}

	/**
	 * Date and time of payment<br>
	 * Format: YYYYMMDDHH24MISS
	 */
	public String getStatusCodeChangeDateTime() {
		return statusCodeChangeDateTime;
	}

	/**
	 * Date and time of payment<br>
	 * Format: YYYYMMDDHH24MISS
	 */
	public void setStatusCodeChangeDateTime(String value) {
		this.statusCodeChangeDateTime = value;
	}
}
