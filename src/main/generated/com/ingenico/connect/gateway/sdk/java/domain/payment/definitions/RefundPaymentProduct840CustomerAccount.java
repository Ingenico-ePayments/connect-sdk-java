/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

/**
 * PayPal account details
 */
public class RefundPaymentProduct840CustomerAccount {

	private String customerAccountStatus = null;

	private String customerAddressStatus = null;

	private String payerId = null;

	/**
	 * Status of the PayPal account.<br>
	 * Possible values are:
	 * <ul><li>verified - PayPal has verified the funding means for this account
	 * <li>unverified - PayPal has not verified the funding means for this account
	 * </ul>
	 */
	public String getCustomerAccountStatus() {
		return customerAccountStatus;
	}

	/**
	 * Status of the PayPal account.<br>
	 * Possible values are:
	 * <ul><li>verified - PayPal has verified the funding means for this account
	 * <li>unverified - PayPal has not verified the funding means for this account
	 * </ul>
	 */
	public void setCustomerAccountStatus(String value) {
		this.customerAccountStatus = value;
	}

	/**
	 * Status of the consumer's shipping address as registered by PayPal<br>
	 * Possible values are:
	 * <ul><li>none - Status is unknown at PayPal
	 * <li>confirmed - The address has been confirmed
	 * <li>unconfirmed - The address has not been confirmed
	 * </ul>
	 */
	public String getCustomerAddressStatus() {
		return customerAddressStatus;
	}

	/**
	 * Status of the consumer's shipping address as registered by PayPal<br>
	 * Possible values are:
	 * <ul><li>none - Status is unknown at PayPal
	 * <li>confirmed - The address has been confirmed
	 * <li>unconfirmed - The address has not been confirmed
	 * </ul>
	 */
	public void setCustomerAddressStatus(String value) {
		this.customerAddressStatus = value;
	}

	/**
	 * The unique identifier of a PayPal account and will never change in the life cycle of a PayPal account
	 */
	public String getPayerId() {
		return payerId;
	}

	/**
	 * The unique identifier of a PayPal account and will never change in the life cycle of a PayPal account
	 */
	public void setPayerId(String value) {
		this.payerId = value;
	}
}
