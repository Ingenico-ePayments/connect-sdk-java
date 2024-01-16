/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/
 */

package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

/**
 * PayPal account details as returned by PayPal
 */
public class PaymentProduct840CustomerAccount {

	private String accountId = null;

	private String billingAgreementId = null;

	private String companyName = null;

	private String contactPhone = null;

	private String countryCode = null;

	private String customerAccountStatus = null;

	private String customerAddressStatus = null;

	private String firstName = null;

	private String payerId = null;

	private String surname = null;

	/**
	 * Username with which the PayPal account holder has registered at PayPal
	 */
	public String getAccountId() {
		return accountId;
	}

	/**
	 * Username with which the PayPal account holder has registered at PayPal
	 */
	public void setAccountId(String value) {
		this.accountId = value;
	}

	/**
	 * Identification of the PayPal recurring billing agreement
	 */
	public String getBillingAgreementId() {
		return billingAgreementId;
	}

	/**
	 * Identification of the PayPal recurring billing agreement
	 */
	public void setBillingAgreementId(String value) {
		this.billingAgreementId = value;
	}

	/**
	 * Name of the company in case the PayPal account is owned by a business
	 */
	public String getCompanyName() {
		return companyName;
	}

	/**
	 * Name of the company in case the PayPal account is owned by a business
	 */
	public void setCompanyName(String value) {
		this.companyName = value;
	}

	/**
	 * The phone number of the PayPal account holder
	 */
	public String getContactPhone() {
		return contactPhone;
	}

	/**
	 * The phone number of the PayPal account holder
	 */
	public void setContactPhone(String value) {
		this.contactPhone = value;
	}

	/**
	 * Country where the PayPal account is located
	 */
	public String getCountryCode() {
		return countryCode;
	}

	/**
	 * Country where the PayPal account is located
	 */
	public void setCountryCode(String value) {
		this.countryCode = value;
	}

	/**
	 * Status of the PayPal account.<br>
	 * Possible values are:
	 * <ul class="paragraph-width"><li>verified - PayPal has verified the funding means for this account
	 * <li>unverified - PayPal has not verified the funding means for this account
	 * </ul>
	 */
	public String getCustomerAccountStatus() {
		return customerAccountStatus;
	}

	/**
	 * Status of the PayPal account.<br>
	 * Possible values are:
	 * <ul class="paragraph-width"><li>verified - PayPal has verified the funding means for this account
	 * <li>unverified - PayPal has not verified the funding means for this account
	 * </ul>
	 */
	public void setCustomerAccountStatus(String value) {
		this.customerAccountStatus = value;
	}

	/**
	 * Status of the customer's shipping address as registered by PayPal<br>
	 * Possible values are:
	 * <ul class="paragraph-width"><li>none - Status is unknown at PayPal
	 * <li>confirmed - The address has been confirmed
	 * <li>unconfirmed - The address has not been confirmed
	 * </ul>
	 */
	public String getCustomerAddressStatus() {
		return customerAddressStatus;
	}

	/**
	 * Status of the customer's shipping address as registered by PayPal<br>
	 * Possible values are:
	 * <ul class="paragraph-width"><li>none - Status is unknown at PayPal
	 * <li>confirmed - The address has been confirmed
	 * <li>unconfirmed - The address has not been confirmed
	 * </ul>
	 */
	public void setCustomerAddressStatus(String value) {
		this.customerAddressStatus = value;
	}

	/**
	 * First name of the PayPal account holder
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * First name of the PayPal account holder
	 */
	public void setFirstName(String value) {
		this.firstName = value;
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

	/**
	 * Surname of the PayPal account holder
	 */
	public String getSurname() {
		return surname;
	}

	/**
	 * Surname of the PayPal account holder
	 */
	public void setSurname(String value) {
		this.surname = value;
	}
}
