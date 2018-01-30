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

	private MobilePaymentProduct320SpecificInput paymentProduct320SpecificInput = null;

	private Boolean requiresApproval = null;

	private Boolean skipFraudService = null;

	private String transactionId = null;

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
	 * The payment data if you want to do the decryption of the vendor's encrypted payment data yourself.<br>
	 * Typically you'd use <span class="property">encryptedCustomerInput</span> in the root of the create payment request to provide the payment data for mobile payment methods.
	 * Only when you do not do this you need to use either this field or <span class="property">encryptedPaymentData</span>, depending on who should do the decryption of the vendor's encrypted payment data.
	 */
	public DecryptedPaymentData getDecryptedPaymentData() {
		return decryptedPaymentData;
	}

	/**
	 * The payment data if you want to do the decryption of the vendor's encrypted payment data yourself.<br>
	 * Typically you'd use <span class="property">encryptedCustomerInput</span> in the root of the create payment request to provide the payment data for mobile payment methods.
	 * Only when you do not do this you need to use either this field or <span class="property">encryptedPaymentData</span>, depending on who should do the decryption of the vendor's encrypted payment data.
	 */
	public void setDecryptedPaymentData(DecryptedPaymentData value) {
		this.decryptedPaymentData = value;
	}

	/**
	 * The payment data if you want to let us do the decryption of the vendor's encrypted payment data.<br>
	 * Typically you'd use <span class="property">encryptedCustomerInput</span> in the root of the create payment request to provide the payment data for mobile payment methods.
	 * Only when you do not do this you need to use either this field or <span class="property">decryptedPaymentData</span>, depending on who should do the decryption of the vendor's encrypted payment data.
	 * This maps to the following field in the vendor's encrypted payment data:
	 * <ul>
	 * <li>Apple Pay: PKPayment.token.paymentData
	 * <li>Android Pay: FullWallet.paymentMethodToken.token
	 * </ul>
	 */
	public String getEncryptedPaymentData() {
		return encryptedPaymentData;
	}

	/**
	 * The payment data if you want to let us do the decryption of the vendor's encrypted payment data.<br>
	 * Typically you'd use <span class="property">encryptedCustomerInput</span> in the root of the create payment request to provide the payment data for mobile payment methods.
	 * Only when you do not do this you need to use either this field or <span class="property">decryptedPaymentData</span>, depending on who should do the decryption of the vendor's encrypted payment data.
	 * This maps to the following field in the vendor's encrypted payment data:
	 * <ul>
	 * <li>Apple Pay: PKPayment.token.paymentData
	 * <li>Android Pay: FullWallet.paymentMethodToken.token
	 * </ul>
	 */
	public void setEncryptedPaymentData(String value) {
		this.encryptedPaymentData = value;
	}

	/**
	 * Android Pay (payment product 320) specific details.
	 */
	public MobilePaymentProduct320SpecificInput getPaymentProduct320SpecificInput() {
		return paymentProduct320SpecificInput;
	}

	/**
	 * Android Pay (payment product 320) specific details.
	 */
	public void setPaymentProduct320SpecificInput(MobilePaymentProduct320SpecificInput value) {
		this.paymentProduct320SpecificInput = value;
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
	 * The vendor's transaction id. This maps to the following field in the vendor's encrypted payment data:
	 * <ul>
	 * <li>Apple Pay: PKPayment.token.transactionIdentifier
	 * <li>Android Pay: FullWallet.googleTransactionId
	 * </ul>
	 */
	public String getTransactionId() {
		return transactionId;
	}

	/**
	 * The vendor's transaction id. This maps to the following field in the vendor's encrypted payment data:
	 * <ul>
	 * <li>Apple Pay: PKPayment.token.transactionIdentifier
	 * <li>Android Pay: FullWallet.googleTransactionId
	 * </ul>
	 */
	public void setTransactionId(String value) {
		this.transactionId = value;
	}
}
