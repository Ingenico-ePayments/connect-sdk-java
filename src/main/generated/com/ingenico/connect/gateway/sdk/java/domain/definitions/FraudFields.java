/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.definitions;

import java.util.List;

public class FraudFields {

	private Boolean addressesAreIdentical = null;

	private String blackListData = null;

	private Address cardOwnerAddress = null;

	private String customerIpAddress = null;

	private String defaultFormFill = null;

	private Boolean deviceFingerprintActivated = null;

	private String deviceFingerprintTransactionId = null;

	private String giftCardType = null;

	private String giftMessage = null;

	private Boolean hasForgottenPwd = null;

	private Boolean hasPassword = null;

	private Boolean isPreviousCustomer = null;

	private String orderTimezone = null;

	private String shipComments = null;

	private String shipmentTrackingNumber = null;

	@SuppressWarnings("deprecation")
	private FraudFieldsShippingDetails shippingDetails = null;

	private List<String> userData = null;

	private String website = null;

	/**
	 * Indicates that invoice and shipping addresses are equal.
	 *
	 * @deprecated For risk assessments there is no replacement. For other calls, use Order.shipping.addressIndicator instead
	 */
	@Deprecated
	public Boolean getAddressesAreIdentical() {
		return addressesAreIdentical;
	}

	/**
	 * Indicates that invoice and shipping addresses are equal.
	 *
	 * @deprecated For risk assessments there is no replacement. For other calls, use Order.shipping.addressIndicator instead
	 */
	@Deprecated
	public void setAddressesAreIdentical(Boolean value) {
		this.addressesAreIdentical = value;
	}

	/**
	 * Additional black list input
	 */
	public String getBlackListData() {
		return blackListData;
	}

	/**
	 * Additional black list input
	 */
	public void setBlackListData(String value) {
		this.blackListData = value;
	}

	/**
	 * The address that belongs to the owner of the card
	 *
	 * @deprecated This should be the same as Order.customer.billingAddress
	 */
	@Deprecated
	public Address getCardOwnerAddress() {
		return cardOwnerAddress;
	}

	/**
	 * The address that belongs to the owner of the card
	 *
	 * @deprecated This should be the same as Order.customer.billingAddress
	 */
	@Deprecated
	public void setCardOwnerAddress(Address value) {
		this.cardOwnerAddress = value;
	}

	/**
	 * The IP Address of the customer that is making the payment
	 */
	public String getCustomerIpAddress() {
		return customerIpAddress;
	}

	/**
	 * The IP Address of the customer that is making the payment
	 */
	public void setCustomerIpAddress(String value) {
		this.customerIpAddress = value;
	}

	/**
	 * Degree of default form fill, with the following possible values:
	 * <ul class="paragraph-width">
	 * <li>automatically - All fields filled automatically
	 * <li>automatically-but-modified - All fields filled automatically, but some fields were modified manually
	 * <li>manually - All fields were entered manually
	 * </ul>
	 *
	 * @deprecated Use Order.customer.device.defaultFormFill instead
	 */
	@Deprecated
	public String getDefaultFormFill() {
		return defaultFormFill;
	}

	/**
	 * Degree of default form fill, with the following possible values:
	 * <ul class="paragraph-width">
	 * <li>automatically - All fields filled automatically
	 * <li>automatically-but-modified - All fields filled automatically, but some fields were modified manually
	 * <li>manually - All fields were entered manually
	 * </ul>
	 *
	 * @deprecated Use Order.customer.device.defaultFormFill instead
	 */
	@Deprecated
	public void setDefaultFormFill(String value) {
		this.defaultFormFill = value;
	}

	/**
	 * Indicates that the device fingerprint has been used while processing the order.
	 *
	 * @deprecated No replacement
	 */
	@Deprecated
	public Boolean getDeviceFingerprintActivated() {
		return deviceFingerprintActivated;
	}

	/**
	 * Indicates that the device fingerprint has been used while processing the order.
	 *
	 * @deprecated No replacement
	 */
	@Deprecated
	public void setDeviceFingerprintActivated(Boolean value) {
		this.deviceFingerprintActivated = value;
	}

	/**
	 * One must set the deviceFingerprintTransactionId received by the response of the endpoint /{merchant}/products/{paymentProductId}/deviceFingerprint
	 *
	 * @deprecated Use Order.customer.device.deviceFingerprintTransactionId instead
	 */
	@Deprecated
	public String getDeviceFingerprintTransactionId() {
		return deviceFingerprintTransactionId;
	}

	/**
	 * One must set the deviceFingerprintTransactionId received by the response of the endpoint /{merchant}/products/{paymentProductId}/deviceFingerprint
	 *
	 * @deprecated Use Order.customer.device.deviceFingerprintTransactionId instead
	 */
	@Deprecated
	public void setDeviceFingerprintTransactionId(String value) {
		this.deviceFingerprintTransactionId = value;
	}

	/**
	 * One of the following gift card types:
	 * <ul class="paragraph-width">
	 * <li>celebrate-fall - Celebrate Fall
	 * <li>grandparents-day - Grandparent's Day
	 * <li>independence-day - Independence Day
	 * <li>anniversary - Anniversary
	 * <li>birthday - Birthday
	 * <li>congratulations - Congratulations
	 * <li>april-fools-day - April Fool's Day
	 * <li>easter - Easter
	 * <li>fathers-day - Father's Day
	 * <li>graduation - Graduation
	 * <li>holiday - Holiday
	 * <li>seasons-greetings - Season's Greetings
	 * <li>passover - Passover
	 * <li>kwanzaa - Kwanzaa
	 * <li>halloween - Halloween
	 * <li>mothers-day - Mother's Day
	 * <li>new-years-day - New Year's Day
	 * <li>bosses-day - Bosses' Day
	 * <li>st-patricks-day - St. Patrick's Day
	 * <li>sweetest-day - Sweetest Day
	 * <li>christmas - Christmas
	 * <li>baby-shower - Baby Shower
	 * <li>thanksgiving - Thanksgiving
	 * <li>other - Other
	 * <li>valentines-day - Valentine's Day
	 * <li>wedding - Wedding
	 * <li>secretarys-day - Secretary's Day
	 * <li>chinese-new-year - Chinese New Year
	 * <li>hanukkah - Hanukkah
	 * </ul>
	 */
	public String getGiftCardType() {
		return giftCardType;
	}

	/**
	 * One of the following gift card types:
	 * <ul class="paragraph-width">
	 * <li>celebrate-fall - Celebrate Fall
	 * <li>grandparents-day - Grandparent's Day
	 * <li>independence-day - Independence Day
	 * <li>anniversary - Anniversary
	 * <li>birthday - Birthday
	 * <li>congratulations - Congratulations
	 * <li>april-fools-day - April Fool's Day
	 * <li>easter - Easter
	 * <li>fathers-day - Father's Day
	 * <li>graduation - Graduation
	 * <li>holiday - Holiday
	 * <li>seasons-greetings - Season's Greetings
	 * <li>passover - Passover
	 * <li>kwanzaa - Kwanzaa
	 * <li>halloween - Halloween
	 * <li>mothers-day - Mother's Day
	 * <li>new-years-day - New Year's Day
	 * <li>bosses-day - Bosses' Day
	 * <li>st-patricks-day - St. Patrick's Day
	 * <li>sweetest-day - Sweetest Day
	 * <li>christmas - Christmas
	 * <li>baby-shower - Baby Shower
	 * <li>thanksgiving - Thanksgiving
	 * <li>other - Other
	 * <li>valentines-day - Valentine's Day
	 * <li>wedding - Wedding
	 * <li>secretarys-day - Secretary's Day
	 * <li>chinese-new-year - Chinese New Year
	 * <li>hanukkah - Hanukkah
	 * </ul>
	 */
	public void setGiftCardType(String value) {
		this.giftCardType = value;
	}

	/**
	 * Gift message
	 */
	public String getGiftMessage() {
		return giftMessage;
	}

	/**
	 * Gift message
	 */
	public void setGiftMessage(String value) {
		this.giftMessage = value;
	}

	/**
	 * Specifies if the customer (initially) had forgotten their password
	 * <ul class="paragraph-width">
	 * <li>true - The customer has forgotten their password
	 * <li>false - The customer has not forgotten their password
	 * </ul>
	 *
	 * @deprecated Use Order.customer.account.hasForgottenPassword instead
	 */
	@Deprecated
	public Boolean getHasForgottenPwd() {
		return hasForgottenPwd;
	}

	/**
	 * Specifies if the customer (initially) had forgotten their password
	 * <ul class="paragraph-width">
	 * <li>true - The customer has forgotten their password
	 * <li>false - The customer has not forgotten their password
	 * </ul>
	 *
	 * @deprecated Use Order.customer.account.hasForgottenPassword instead
	 */
	@Deprecated
	public void setHasForgottenPwd(Boolean value) {
		this.hasForgottenPwd = value;
	}

	/**
	 * Specifies if the customer entered a password to gain access to an account registered with the you
	 * <ul class="paragraph-width">
	 * <li>true - The customer has used a password to gain access
	 * <li>false - The customer has not used a password to gain access
	 * </ul>
	 *
	 * @deprecated Use Order.customer.account.hasPassword instead
	 */
	@Deprecated
	public Boolean getHasPassword() {
		return hasPassword;
	}

	/**
	 * Specifies if the customer entered a password to gain access to an account registered with the you
	 * <ul class="paragraph-width">
	 * <li>true - The customer has used a password to gain access
	 * <li>false - The customer has not used a password to gain access
	 * </ul>
	 *
	 * @deprecated Use Order.customer.account.hasPassword instead
	 */
	@Deprecated
	public void setHasPassword(Boolean value) {
		this.hasPassword = value;
	}

	/**
	 * Specifies if the customer has a history of online shopping with the merchant
	 * <ul class="paragraph-width">
	 * <li>true - The customer is a known returning customer
	 * <li>false - The customer is new/unknown customer
	 * </ul>
	 *
	 * @deprecated Use Order.customer.isPreviousCustomer instead
	 */
	@Deprecated
	public Boolean getIsPreviousCustomer() {
		return isPreviousCustomer;
	}

	/**
	 * Specifies if the customer has a history of online shopping with the merchant
	 * <ul class="paragraph-width">
	 * <li>true - The customer is a known returning customer
	 * <li>false - The customer is new/unknown customer
	 * </ul>
	 *
	 * @deprecated Use Order.customer.isPreviousCustomer instead
	 */
	@Deprecated
	public void setIsPreviousCustomer(Boolean value) {
		this.isPreviousCustomer = value;
	}

	/**
	 * Timezone in which the order was placed
	 */
	public String getOrderTimezone() {
		return orderTimezone;
	}

	/**
	 * Timezone in which the order was placed
	 */
	public void setOrderTimezone(String value) {
		this.orderTimezone = value;
	}

	/**
	 * Comments included during shipping
	 *
	 * @deprecated Use Order.shipping.comments instead
	 */
	@Deprecated
	public String getShipComments() {
		return shipComments;
	}

	/**
	 * Comments included during shipping
	 *
	 * @deprecated Use Order.shipping.comments instead
	 */
	@Deprecated
	public void setShipComments(String value) {
		this.shipComments = value;
	}

	/**
	 * Shipment tracking number
	 *
	 * @deprecated Use Order.shipping.trackingNumber instead
	 */
	@Deprecated
	public String getShipmentTrackingNumber() {
		return shipmentTrackingNumber;
	}

	/**
	 * Shipment tracking number
	 *
	 * @deprecated Use Order.shipping.trackingNumber instead
	 */
	@Deprecated
	public void setShipmentTrackingNumber(String value) {
		this.shipmentTrackingNumber = value;
	}

	/**
	 * Details on how the order is shipped to the customer
	 *
	 * @deprecated No replacement
	 */
	@Deprecated
	public FraudFieldsShippingDetails getShippingDetails() {
		return shippingDetails;
	}

	/**
	 * Details on how the order is shipped to the customer
	 *
	 * @deprecated No replacement
	 */
	@Deprecated
	public void setShippingDetails(FraudFieldsShippingDetails value) {
		this.shippingDetails = value;
	}

	/**
	 * Array of up to 16 userData properties, each with a max length of 256 characters, that can be used for fraudscreening
	 */
	public List<String> getUserData() {
		return userData;
	}

	/**
	 * Array of up to 16 userData properties, each with a max length of 256 characters, that can be used for fraudscreening
	 */
	public void setUserData(List<String> value) {
		this.userData = value;
	}

	/**
	 * The website from which the purchase was made
	 *
	 * @deprecated Use Merchant.websiteUrl instead
	 */
	@Deprecated
	public String getWebsite() {
		return website;
	}

	/**
	 * The website from which the purchase was made
	 *
	 * @deprecated Use Merchant.websiteUrl instead
	 */
	@Deprecated
	public void setWebsite(String value) {
		this.website = value;
	}
}
