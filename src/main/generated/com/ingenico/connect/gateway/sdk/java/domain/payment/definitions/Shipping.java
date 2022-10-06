/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

/**
 * Object containing information regarding shipping / delivery
 */
public class Shipping {

	private AddressPersonal address = null;

	private String addressIndicator = null;

	private String comments = null;

	private String emailAddress = null;

	private String firstUsageDate = null;

	private Boolean isFirstUsage = null;

	private String trackingNumber = null;

	private String type = null;

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
	 * Indicates shipping method chosen for the transaction. Possible values:
	 * <ul class="paragraph-width"><li>same-as-billing = the shipping address is the same as the billing address
	 * <li>another-verified-address-on-file-with-merchant = the address used for shipping is another verified address of the customer that is on file with you
	 * <li>different-than-billing = shipping address is different from the billing address
	 * <li>ship-to-store = goods are shipped to a store (shipping address = store address)
	 * <li>digital-goods = electronic delivery of digital goods
	 * <li>travel-and-event-tickets-not-shipped = travel and/or event tickets that are not shipped
	 * <li>other = other means of delivery</ul>
	 */
	public String getAddressIndicator() {
		return addressIndicator;
	}

	/**
	 * Indicates shipping method chosen for the transaction. Possible values:
	 * <ul class="paragraph-width"><li>same-as-billing = the shipping address is the same as the billing address
	 * <li>another-verified-address-on-file-with-merchant = the address used for shipping is another verified address of the customer that is on file with you
	 * <li>different-than-billing = shipping address is different from the billing address
	 * <li>ship-to-store = goods are shipped to a store (shipping address = store address)
	 * <li>digital-goods = electronic delivery of digital goods
	 * <li>travel-and-event-tickets-not-shipped = travel and/or event tickets that are not shipped
	 * <li>other = other means of delivery</ul>
	 */
	public void setAddressIndicator(String value) {
		this.addressIndicator = value;
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
	 * Email address linked to the shipping
	 */
	public String getEmailAddress() {
		return emailAddress;
	}

	/**
	 * Email address linked to the shipping
	 */
	public void setEmailAddress(String value) {
		this.emailAddress = value;
	}

	/**
	 * Date (YYYYMMDD) when the shipping details for this transaction were first used.
	 */
	public String getFirstUsageDate() {
		return firstUsageDate;
	}

	/**
	 * Date (YYYYMMDD) when the shipping details for this transaction were first used.
	 */
	public void setFirstUsageDate(String value) {
		this.firstUsageDate = value;
	}

	/**
	 * Indicator if this shipping address is used for the first time to ship an order
	 * <p>true = the shipping details are used for the first time with this transaction
	 * <p>false = the shipping details have been used for other transactions in the past
	 */
	public Boolean getIsFirstUsage() {
		return isFirstUsage;
	}

	/**
	 * Indicator if this shipping address is used for the first time to ship an order
	 * <p>true = the shipping details are used for the first time with this transaction
	 * <p>false = the shipping details have been used for other transactions in the past
	 */
	public void setIsFirstUsage(Boolean value) {
		this.isFirstUsage = value;
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

	/**
	 * Indicates the merchandise delivery timeframe. Possible values:
	 * <ul class="paragraph-width"><li>electronic = For electronic delivery (services or digital goods)</li>
	 * <li>same-day = For same day deliveries</li>
	 * <li>overnight = For overnight deliveries</li>
	 * <li>2-day-or-more = For two day or more delivery time for payments that are processed by the GlobalCollect platform</li>
	 * <li>2-day-or-more = For two day or more delivery time for payments that are processed by the Ogone platform</li>
	 * <li>priority = For prioritized deliveries for payments that are processed by the WL Online Payment Acceptance platform</li>
	 * <li>ground = For deliveries via ground for payments that are processed by the WL Online Payment Acceptance platform</li>
	 * <li>to-store = For deliveries to a store for payments that are processed by the WL Online Payment Acceptance platform</li>
	 * </ul>
	 */
	public String getType() {
		return type;
	}

	/**
	 * Indicates the merchandise delivery timeframe. Possible values:
	 * <ul class="paragraph-width"><li>electronic = For electronic delivery (services or digital goods)</li>
	 * <li>same-day = For same day deliveries</li>
	 * <li>overnight = For overnight deliveries</li>
	 * <li>2-day-or-more = For two day or more delivery time for payments that are processed by the GlobalCollect platform</li>
	 * <li>2-day-or-more = For two day or more delivery time for payments that are processed by the Ogone platform</li>
	 * <li>priority = For prioritized deliveries for payments that are processed by the WL Online Payment Acceptance platform</li>
	 * <li>ground = For deliveries via ground for payments that are processed by the WL Online Payment Acceptance platform</li>
	 * <li>to-store = For deliveries to a store for payments that are processed by the WL Online Payment Acceptance platform</li>
	 * </ul>
	 */
	public void setType(String value) {
		this.type = value;
	}
}
