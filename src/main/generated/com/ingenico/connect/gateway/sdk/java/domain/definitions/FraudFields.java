/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.definitions;

import java.util.List;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_FraudFields">FraudFields</a>
 */
public class FraudFields {

	private String customerIpAddress = null;

	private String defaultFormFill = null;

	private String giftCardType = null;

	private String giftMessage = null;

	private Boolean hasForgottenPwd = null;

	private Boolean hasPassword = null;

	private Boolean isPreviousCustomer = null;

	private String orderTimezone = null;

	private String shipComments = null;

	private String shipmentTrackingNumber = null;

	private List<String> userData = null;

	private String website = null;

	public String getCustomerIpAddress() {
		return customerIpAddress;
	}

	public void setCustomerIpAddress(String value) {
		this.customerIpAddress = value;
	}

	public String getDefaultFormFill() {
		return defaultFormFill;
	}

	public void setDefaultFormFill(String value) {
		this.defaultFormFill = value;
	}

	public String getGiftCardType() {
		return giftCardType;
	}

	public void setGiftCardType(String value) {
		this.giftCardType = value;
	}

	public String getGiftMessage() {
		return giftMessage;
	}

	public void setGiftMessage(String value) {
		this.giftMessage = value;
	}

	public Boolean getHasForgottenPwd() {
		return hasForgottenPwd;
	}

	public void setHasForgottenPwd(Boolean value) {
		this.hasForgottenPwd = value;
	}

	public Boolean getHasPassword() {
		return hasPassword;
	}

	public void setHasPassword(Boolean value) {
		this.hasPassword = value;
	}

	public Boolean getIsPreviousCustomer() {
		return isPreviousCustomer;
	}

	public void setIsPreviousCustomer(Boolean value) {
		this.isPreviousCustomer = value;
	}

	public String getOrderTimezone() {
		return orderTimezone;
	}

	public void setOrderTimezone(String value) {
		this.orderTimezone = value;
	}

	public String getShipComments() {
		return shipComments;
	}

	public void setShipComments(String value) {
		this.shipComments = value;
	}

	public String getShipmentTrackingNumber() {
		return shipmentTrackingNumber;
	}

	public void setShipmentTrackingNumber(String value) {
		this.shipmentTrackingNumber = value;
	}

	public List<String> getUserData() {
		return userData;
	}

	public void setUserData(List<String> value) {
		this.userData = value;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String value) {
		this.website = value;
	}
}
