/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.riskassessments.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.AddressPersonal;

/**
 * Object containing information regarding shipping / delivery
 */
public class ShippingRiskAssessment {

	private AddressPersonal address = null;

	private String comments = null;

	private String trackingNumber = null;

	/**
	 * Object containing address information
	 */
	public AddressPersonal getAddress() {
		return address;
	}

	/**
	 * Object containing address information
	 */
	public void setAddress(AddressPersonal value) {
		this.address = value;
	}

	/**
	 * Comments included during shipping
	 */
	public String getComments() {
		return comments;
	}

	/**
	 * Comments included during shipping
	 */
	public void setComments(String value) {
		this.comments = value;
	}

	/**
	 * Shipment tracking number
	 */
	public String getTrackingNumber() {
		return trackingNumber;
	}

	/**
	 * Shipment tracking number
	 */
	public void setTrackingNumber(String value) {
		this.trackingNumber = value;
	}
}
