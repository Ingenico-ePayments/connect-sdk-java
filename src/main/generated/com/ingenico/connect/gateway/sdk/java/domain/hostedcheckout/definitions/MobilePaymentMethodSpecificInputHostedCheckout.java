/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.hostedcheckout.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.AbstractPaymentMethodSpecificInput;

public class MobilePaymentMethodSpecificInputHostedCheckout extends AbstractPaymentMethodSpecificInput {

	private String authorizationMode = null;

	private String customerReference = null;

	private MobilePaymentProduct302SpecificInputHostedCheckout paymentProduct302SpecificInput = null;

	private MobilePaymentProduct320SpecificInputHostedCheckout paymentProduct320SpecificInput = null;

	private Boolean requiresApproval = null;

	private Boolean skipFraudService = null;

	/**
	 * Determines the type of the authorization that will be used. Allowed values:
	 * <ul class="paragraph-width"><li>FINAL_AUTHORIZATION - The payment creation results in an authorization that is ready for capture. Final authorizations can't be reversed and need to be captured for the full amount within 7 days.
	 * <li>PRE_AUTHORIZATION - The payment creation results in a pre-authorization that is ready for capture. Pre-authortizations can be reversed and can be captured within 30 days. The capture amount can be lower than the authorized amount.
	 * <li>SALE - The payment creation results in an authorization that is already captured at the moment of approval.
	 * </ul>
	 * Only used with some acquirers, ingnored for acquirers that don't support this. In case the acquirer doesn't allow this to be specified the authorizationMode is 'unspecified', which behaves similar to a final authorization.
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
	 * Only used with some acquirers, ingnored for acquirers that don't support this. In case the acquirer doesn't allow this to be specified the authorizationMode is 'unspecified', which behaves similar to a final authorization.
	 */
	public void setAuthorizationMode(String value) {
		this.authorizationMode = value;
	}

	/**
	 * Reference of the customer for the payment (purchase order #, etc.). Only used with some acquirers.
	 */
	public String getCustomerReference() {
		return customerReference;
	}

	/**
	 * Reference of the customer for the payment (purchase order #, etc.). Only used with some acquirers.
	 */
	public void setCustomerReference(String value) {
		this.customerReference = value;
	}

	/**
	 * Object containing information specific to Apple Pay
	 */
	public MobilePaymentProduct302SpecificInputHostedCheckout getPaymentProduct302SpecificInput() {
		return paymentProduct302SpecificInput;
	}

	/**
	 * Object containing information specific to Apple Pay
	 */
	public void setPaymentProduct302SpecificInput(MobilePaymentProduct302SpecificInputHostedCheckout value) {
		this.paymentProduct302SpecificInput = value;
	}

	/**
	 * Object containing information specific to Google Pay (paymentProductId 320)
	 */
	public MobilePaymentProduct320SpecificInputHostedCheckout getPaymentProduct320SpecificInput() {
		return paymentProduct320SpecificInput;
	}

	/**
	 * Object containing information specific to Google Pay (paymentProductId 320)
	 */
	public void setPaymentProduct320SpecificInput(MobilePaymentProduct320SpecificInputHostedCheckout value) {
		this.paymentProduct320SpecificInput = value;
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
