/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

/**
 * Object containing data related to the account the customer has with you
 */
public class CustomerAccount {

	private CustomerAccountAuthentication authentication = null;

	private String changeDate = null;

	private Boolean changedDuringCheckout = null;

	private String createDate = null;

	private Boolean hadSuspiciousActivity = null;

	private Boolean hasForgottenPassword = null;

	private Boolean hasPassword = null;

	private String passwordChangeDate = null;

	private Boolean passwordChangedDuringCheckout = null;

	private PaymentAccountOnFile paymentAccountOnFile = null;

	private String paymentAccountOnFileType = null;

	private CustomerPaymentActivity paymentActivity = null;

	/**
	 * Object containing data on the authentication used by the customer to access their account
	 */
	public CustomerAccountAuthentication getAuthentication() {
		return authentication;
	}

	/**
	 * Object containing data on the authentication used by the customer to access their account
	 */
	public void setAuthentication(CustomerAccountAuthentication value) {
		this.authentication = value;
	}

	/**
	 * The last date (YYYYMMDD) on which the customer made changes to their account with you. These are changes to billing &amp; shipping address details, new payment account (tokens), or new users(s) added.
	 */
	public String getChangeDate() {
		return changeDate;
	}

	/**
	 * The last date (YYYYMMDD) on which the customer made changes to their account with you. These are changes to billing &amp; shipping address details, new payment account (tokens), or new users(s) added.
	 */
	public void setChangeDate(String value) {
		this.changeDate = value;
	}

	/**
	 * true = the customer made changes to their account during this checkout
	 * <p>false = the customer didn't change anything to their account during this checkout/n<p>The changes ment here are changes to billing &amp; shipping address details, new payment account (tokens), or new users(s) added.
	 */
	public Boolean getChangedDuringCheckout() {
		return changedDuringCheckout;
	}

	/**
	 * true = the customer made changes to their account during this checkout
	 * <p>false = the customer didn't change anything to their account during this checkout/n<p>The changes ment here are changes to billing &amp; shipping address details, new payment account (tokens), or new users(s) added.
	 */
	public void setChangedDuringCheckout(Boolean value) {
		this.changedDuringCheckout = value;
	}

	/**
	 * The date (YYYYMMDD) on which the customer created their account with you
	 */
	public String getCreateDate() {
		return createDate;
	}

	/**
	 * The date (YYYYMMDD) on which the customer created their account with you
	 */
	public void setCreateDate(String value) {
		this.createDate = value;
	}

	/**
	 * Specifies if you have experienced suspicious activity on the account of the customer
	 * <p>true = you have experienced suspicious activity (including previous fraud) on the customer account used for this transaction
	 * <p>false = you have experienced no suspicious activity (including previous fraud) on the customer account used for this transaction
	 */
	public Boolean getHadSuspiciousActivity() {
		return hadSuspiciousActivity;
	}

	/**
	 * Specifies if you have experienced suspicious activity on the account of the customer
	 * <p>true = you have experienced suspicious activity (including previous fraud) on the customer account used for this transaction
	 * <p>false = you have experienced no suspicious activity (including previous fraud) on the customer account used for this transaction
	 */
	public void setHadSuspiciousActivity(Boolean value) {
		this.hadSuspiciousActivity = value;
	}

	/**
	 * Specifies if the customer (initially) had forgotten their password
	 * <ul class="paragraph-width">
	 * <li>true - The customer has forgotten their password
	 * <li>false - The customer has not forgotten their password
	 * </ul>
	 */
	public Boolean getHasForgottenPassword() {
		return hasForgottenPassword;
	}

	/**
	 * Specifies if the customer (initially) had forgotten their password
	 * <ul class="paragraph-width">
	 * <li>true - The customer has forgotten their password
	 * <li>false - The customer has not forgotten their password
	 * </ul>
	 */
	public void setHasForgottenPassword(Boolean value) {
		this.hasForgottenPassword = value;
	}

	/**
	 * Specifies if the customer entered a password to gain access to an account registered with the you
	 * <ul class="paragraph-width">
	 * <li>true - The customer has used a password to gain access
	 * <li>false - The customer has not used a password to gain access
	 * </ul>
	 */
	public Boolean getHasPassword() {
		return hasPassword;
	}

	/**
	 * Specifies if the customer entered a password to gain access to an account registered with the you
	 * <ul class="paragraph-width">
	 * <li>true - The customer has used a password to gain access
	 * <li>false - The customer has not used a password to gain access
	 * </ul>
	 */
	public void setHasPassword(Boolean value) {
		this.hasPassword = value;
	}

	/**
	 * The last date (YYYYMMDD) on which the customer changed their password for the account used in this transaction
	 */
	public String getPasswordChangeDate() {
		return passwordChangeDate;
	}

	/**
	 * The last date (YYYYMMDD) on which the customer changed their password for the account used in this transaction
	 */
	public void setPasswordChangeDate(String value) {
		this.passwordChangeDate = value;
	}

	/**
	 * Indicates if the password of an account is changed during this checkout
	 * <p>true = the customer made changes to their password of the account used during this checkout
	 * <p>alse = the customer didn't change anything to their password of the account used during this checkout
	 */
	public Boolean getPasswordChangedDuringCheckout() {
		return passwordChangedDuringCheckout;
	}

	/**
	 * Indicates if the password of an account is changed during this checkout
	 * <p>true = the customer made changes to their password of the account used during this checkout
	 * <p>alse = the customer didn't change anything to their password of the account used during this checkout
	 */
	public void setPasswordChangedDuringCheckout(Boolean value) {
		this.passwordChangedDuringCheckout = value;
	}

	/**
	 * Object containing information on the payment account data on file (tokens)
	 */
	public PaymentAccountOnFile getPaymentAccountOnFile() {
		return paymentAccountOnFile;
	}

	/**
	 * Object containing information on the payment account data on file (tokens)
	 */
	public void setPaymentAccountOnFile(PaymentAccountOnFile value) {
		this.paymentAccountOnFile = value;
	}

	/**
	 * Indicates the type of account. For example, for a multi-account card product. 
	 * <ul class="paragraph-width"><li>not-applicable = the card used doesn't support multiple card products
	 * <li>credit = the card used is a credit card
	 * <li>debit = the card used is a debit card</ul>
	 */
	public String getPaymentAccountOnFileType() {
		return paymentAccountOnFileType;
	}

	/**
	 * Indicates the type of account. For example, for a multi-account card product. 
	 * <ul class="paragraph-width"><li>not-applicable = the card used doesn't support multiple card products
	 * <li>credit = the card used is a credit card
	 * <li>debit = the card used is a debit card</ul>
	 */
	public void setPaymentAccountOnFileType(String value) {
		this.paymentAccountOnFileType = value;
	}

	/**
	 * Object containing data on the purchase history of the customer with you
	 */
	public CustomerPaymentActivity getPaymentActivity() {
		return paymentActivity;
	}

	/**
	 * Object containing data on the purchase history of the customer with you
	 */
	public void setPaymentActivity(CustomerPaymentActivity value) {
		this.paymentActivity = value;
	}
}
