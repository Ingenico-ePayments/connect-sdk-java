/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.AbstractPaymentMethodSpecificInput;

public class MobilePaymentMethodSpecificInput extends AbstractPaymentMethodSpecificInput {

	private String authorizationMode = null;

	private DecryptedPaymentData decryptedPaymentData = null;

	private String encryptedPaymentData = null;

	private Boolean requiresApproval = null;

	private Boolean skipFraudService = null;

	/**
	 * Determines the type of the authorization that will be used. Allowed values:
	 * <ul class="paragraph-width"><li>FINAL_AUTHORIZATION - The payment creation results in an authorization that is ready for capture. Final authorizations can't be reversed and need to be captured for the full amount within 7 days.
	 * <li>PRE_AUTHORIZATION - The payment creation results in a pre-authorization that is ready for capture. Pre-authortizations can be reversed and can be captured within 30 days. The capture amount can be lower than the authorized amount.
	 * <li>SALE - The payment creation results in an authorization that is already captured at the moment of approval.
	 * </ul>
	 * Only used with some acquirers, ingnored for acquirers that don't support this. In case the acquirer doesn't allow this to be specified the <span class="property">authorizationMode</span> is 'unspecified', which behaves similar to a final authorization.
	 */
	public String getAuthorizationMode() {
		return authorizationMode;
	}

	/**
	 * Determines the type of the authorization that will be used. Allowed values:
	 * <ul class="paragraph-width"><li>FINAL_AUTHORIZATION - The payment creation results in an authorization that is ready for capture. Final authorizations can't be reversed and need to be captured for the full amount within 7 days.
	 * <li>PRE_AUTHORIZATION - The payment creation results in a pre-authorization that is ready for capture. Pre-authortizations can be reversed and can be captured within 30 days. The capture amount can be lower than the authorized amount.
	 * <li>SALE - The payment creation results in an authorization that is already captured at the moment of approval.
	 * </ul>
	 * Only used with some acquirers, ingnored for acquirers that don't support this. In case the acquirer doesn't allow this to be specified the <span class="property">authorizationMode</span> is 'unspecified', which behaves similar to a final authorization.
	 */
	public void setAuthorizationMode(String value) {
		this.authorizationMode = value;
	}

	/**
	 * The payment data if you do the decryption of the encrypted payment data yourself.
	 */
	public DecryptedPaymentData getDecryptedPaymentData() {
		return decryptedPaymentData;
	}

	/**
	 * The payment data if you do the decryption of the encrypted payment data yourself.
	 */
	public void setDecryptedPaymentData(DecryptedPaymentData value) {
		this.decryptedPaymentData = value;
	}

	/**
	 * The payment data if we will do the decryption of the encrypted payment data.<br>
	 * <p>Typically you'd use <span class="property">encryptedCustomerInput</span> in the root of the create payment request to provide the encrypted payment data instead.
	 * <ul class="paragraph-width">
	 * <li>For Apple Pay, the encrypted payment data can be found in field <span class="property">data</span> of the <span class="property"><a href="https://developer.apple.com/documentation/passkit/pkpayment" target="_blank">PKPayment</a>.token.paymentData</span> property.
	 * <li>For Google Pay, the encrypted payment data can be found in field <span class="property">paymentMethodData.tokenizationData.token</span> of the <span class="property"><a href="https://developers.google.com/android/reference/com/google/android/gms/wallet/PaymentData" target="_blank">PaymentData</a>.toJson()</span> result.
	 * </ul>
	 */
	public String getEncryptedPaymentData() {
		return encryptedPaymentData;
	}

	/**
	 * The payment data if we will do the decryption of the encrypted payment data.<br>
	 * <p>Typically you'd use <span class="property">encryptedCustomerInput</span> in the root of the create payment request to provide the encrypted payment data instead.
	 * <ul class="paragraph-width">
	 * <li>For Apple Pay, the encrypted payment data can be found in field <span class="property">data</span> of the <span class="property"><a href="https://developer.apple.com/documentation/passkit/pkpayment" target="_blank">PKPayment</a>.token.paymentData</span> property.
	 * <li>For Google Pay, the encrypted payment data can be found in field <span class="property">paymentMethodData.tokenizationData.token</span> of the <span class="property"><a href="https://developers.google.com/android/reference/com/google/android/gms/wallet/PaymentData" target="_blank">PaymentData</a>.toJson()</span> result.
	 * </ul>
	 */
	public void setEncryptedPaymentData(String value) {
		this.encryptedPaymentData = value;
	}

	/**
	 * <ul class="paragraph-width"><li>true = the payment requires approval before the funds will be captured using the <a href='https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/payments/approve.html'>Approve payment</a> or <a href='https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/payments/capture.html'>Capture payment</a> API
	 * <li>false = the payment does not require approval, and the funds will be captured automatically
	 * </ul>
	 */
	public Boolean getRequiresApproval() {
		return requiresApproval;
	}

	/**
	 * <ul class="paragraph-width"><li>true = the payment requires approval before the funds will be captured using the <a href='https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/payments/approve.html'>Approve payment</a> or <a href='https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/payments/capture.html'>Capture payment</a> API
	 * <li>false = the payment does not require approval, and the funds will be captured automatically
	 * </ul>
	 */
	public void setRequiresApproval(Boolean value) {
		this.requiresApproval = value;
	}

	/**
	 * <ul class="paragraph-width"><li>true = Fraud scoring will be skipped for this transaction
	 * <li>false = Fraud scoring will not be skipped for this transaction
	 * </ul>
	 * Note: This is only possible if your account in our system is setup for Fraud scoring and if your configuration in our system allows you to override it per transaction.
	 */
	public Boolean getSkipFraudService() {
		return skipFraudService;
	}

	/**
	 * <ul class="paragraph-width"><li>true = Fraud scoring will be skipped for this transaction
	 * <li>false = Fraud scoring will not be skipped for this transaction
	 * </ul>
	 * Note: This is only possible if your account in our system is setup for Fraud scoring and if your configuration in our system allows you to override it per transaction.
	 */
	public void setSkipFraudService(Boolean value) {
		this.skipFraudService = value;
	}
}
