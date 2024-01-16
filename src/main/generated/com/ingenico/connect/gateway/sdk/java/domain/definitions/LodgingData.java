/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/
 */

package com.ingenico.connect.gateway.sdk.java.domain.definitions;

import java.util.List;

/**
 * Object that holds lodging specific data
 */
public class LodgingData {

	private List<LodgingCharge> charges = null;

	private String checkInDate = null;

	private String checkOutDate = null;

	private String folioNumber = null;

	private Boolean isConfirmedReservation = null;

	private Boolean isFacilityFireSafetyConform = null;

	private Boolean isNoShow = null;

	private Boolean isPreferenceSmokingRoom = null;

	private Integer numberOfAdults = null;

	private Integer numberOfNights = null;

	private Integer numberOfRooms = null;

	private String programCode = null;

	private String propertyCustomerServicePhoneNumber = null;

	private String propertyPhoneNumber = null;

	private String renterName = null;

	private List<LodgingRoom> rooms = null;

	/**
	 * Object that holds lodging related charges
	 */
	public List<LodgingCharge> getCharges() {
		return charges;
	}

	/**
	 * Object that holds lodging related charges
	 */
	public void setCharges(List<LodgingCharge> value) {
		this.charges = value;
	}

	/**
	 * The date the guest checks into (or plans to check in to) the facility. <br>
	 * Format: YYYYMMDD
	 */
	public String getCheckInDate() {
		return checkInDate;
	}

	/**
	 * The date the guest checks into (or plans to check in to) the facility. <br>
	 * Format: YYYYMMDD
	 */
	public void setCheckInDate(String value) {
		this.checkInDate = value;
	}

	/**
	 * The date the guest checks out of (or plans to check out of) the facility. <br>
	 * Format: YYYYMMDD
	 */
	public String getCheckOutDate() {
		return checkOutDate;
	}

	/**
	 * The date the guest checks out of (or plans to check out of) the facility. <br>
	 * Format: YYYYMMDD
	 */
	public void setCheckOutDate(String value) {
		this.checkOutDate = value;
	}

	/**
	 * The Lodging Folio Number assigned to the itemized statement of charges and credits associated with this lodging stay, which can be any combination of characters and numerals defined by the Merchant or authorized Third Party Processor.
	 */
	public String getFolioNumber() {
		return folioNumber;
	}

	/**
	 * The Lodging Folio Number assigned to the itemized statement of charges and credits associated with this lodging stay, which can be any combination of characters and numerals defined by the Merchant or authorized Third Party Processor.
	 */
	public void setFolioNumber(String value) {
		this.folioNumber = value;
	}

	/**
	 * Indicates whether the room reservation is confirmed.
	 * <ul class="paragraph-width"><li>true - The room reservation is confirmed</li>
	 * <li>false - The room reservation is not confirmed</li></ul>
	 */
	public Boolean getIsConfirmedReservation() {
		return isConfirmedReservation;
	}

	/**
	 * Indicates whether the room reservation is confirmed.
	 * <ul class="paragraph-width"><li>true - The room reservation is confirmed</li>
	 * <li>false - The room reservation is not confirmed</li></ul>
	 */
	public void setIsConfirmedReservation(Boolean value) {
		this.isConfirmedReservation = value;
	}

	/**
	 * Defines whether or not the facility conforms to the requirements of the Hotel and Motel Fire Safety Act of 1990, or similar legislation.
	 * <ul class="paragraph-width"><li>true - The facility conform to the requirements</li>
	 * <li>false - The facility doesn't conform to the requirements</li></ul>
	 */
	public Boolean getIsFacilityFireSafetyConform() {
		return isFacilityFireSafetyConform;
	}

	/**
	 * Defines whether or not the facility conforms to the requirements of the Hotel and Motel Fire Safety Act of 1990, or similar legislation.
	 * <ul class="paragraph-width"><li>true - The facility conform to the requirements</li>
	 * <li>false - The facility doesn't conform to the requirements</li></ul>
	 */
	public void setIsFacilityFireSafetyConform(Boolean value) {
		this.isFacilityFireSafetyConform = value;
	}

	/**
	 * Indicate if this the customer is a no show case. In such case, the lodging property can charge a no show fee.
	 * <ul class="paragraph-width"><li>true - The customer is a no show</li>
	 * <li>false - Not applicable</li></ul>
	 */
	public Boolean getIsNoShow() {
		return isNoShow;
	}

	/**
	 * Indicate if this the customer is a no show case. In such case, the lodging property can charge a no show fee.
	 * <ul class="paragraph-width"><li>true - The customer is a no show</li>
	 * <li>false - Not applicable</li></ul>
	 */
	public void setIsNoShow(Boolean value) {
		this.isNoShow = value;
	}

	/**
	 * Indicated the preference of the customer for a smoking or non-smoking room.
	 * <ul class="paragraph-width"><li>true - A smoking room is preferred</li>
	 * <li>false - A non-smoking room is preferred</li></ul>
	 */
	public Boolean getIsPreferenceSmokingRoom() {
		return isPreferenceSmokingRoom;
	}

	/**
	 * Indicated the preference of the customer for a smoking or non-smoking room.
	 * <ul class="paragraph-width"><li>true - A smoking room is preferred</li>
	 * <li>false - A non-smoking room is preferred</li></ul>
	 */
	public void setIsPreferenceSmokingRoom(Boolean value) {
		this.isPreferenceSmokingRoom = value;
	}

	/**
	 * The total number of adult guests staying (or planning to stay) at the facility (i.e., all booked rooms)
	 */
	public Integer getNumberOfAdults() {
		return numberOfAdults;
	}

	/**
	 * The total number of adult guests staying (or planning to stay) at the facility (i.e., all booked rooms)
	 */
	public void setNumberOfAdults(Integer value) {
		this.numberOfAdults = value;
	}

	/**
	 * The number of nights for the lodging stay
	 */
	public Integer getNumberOfNights() {
		return numberOfNights;
	}

	/**
	 * The number of nights for the lodging stay
	 */
	public void setNumberOfNights(Integer value) {
		this.numberOfNights = value;
	}

	/**
	 * The number of rooms rented for the lodging stay
	 */
	public Integer getNumberOfRooms() {
		return numberOfRooms;
	}

	/**
	 * The number of rooms rented for the lodging stay
	 */
	public void setNumberOfRooms(Integer value) {
		this.numberOfRooms = value;
	}

	/**
	 * Code that corresponds to the category of lodging charges detailed in this message.
	 * 
	 * Allowed values:
	 * <ul class="paragraph-width"><li>lodging - (Default) Submitted charges are for lodging</li>
	 * <li>noShow - Submitted charges are for the failure of the guest(s) to check in for reserved a room</li>
	 * <li>advancedDeposit - Submitted charges are for an Advanced Deposit to reserve one or more rooms</li></ul>
	 * 
	 * If no value is submitted the default value lodging is used.
	 */
	public String getProgramCode() {
		return programCode;
	}

	/**
	 * Code that corresponds to the category of lodging charges detailed in this message.
	 * 
	 * Allowed values:
	 * <ul class="paragraph-width"><li>lodging - (Default) Submitted charges are for lodging</li>
	 * <li>noShow - Submitted charges are for the failure of the guest(s) to check in for reserved a room</li>
	 * <li>advancedDeposit - Submitted charges are for an Advanced Deposit to reserve one or more rooms</li></ul>
	 * 
	 * If no value is submitted the default value lodging is used.
	 */
	public void setProgramCode(String value) {
		this.programCode = value;
	}

	/**
	 * The international customer service phone number of the facility
	 */
	public String getPropertyCustomerServicePhoneNumber() {
		return propertyCustomerServicePhoneNumber;
	}

	/**
	 * The international customer service phone number of the facility
	 */
	public void setPropertyCustomerServicePhoneNumber(String value) {
		this.propertyCustomerServicePhoneNumber = value;
	}

	/**
	 * The local phone number of the facility in an international phone number format
	 */
	public String getPropertyPhoneNumber() {
		return propertyPhoneNumber;
	}

	/**
	 * The local phone number of the facility in an international phone number format
	 */
	public void setPropertyPhoneNumber(String value) {
		this.propertyPhoneNumber = value;
	}

	/**
	 * Name of the person or business entity charged for the reservation and/or lodging stay
	 */
	public String getRenterName() {
		return renterName;
	}

	/**
	 * Name of the person or business entity charged for the reservation and/or lodging stay
	 */
	public void setRenterName(String value) {
		this.renterName = value;
	}

	/**
	 * Object that holds lodging related room data
	 */
	public List<LodgingRoom> getRooms() {
		return rooms;
	}

	/**
	 * Object that holds lodging related room data
	 */
	public void setRooms(List<LodgingRoom> value) {
		this.rooms = value;
	}
}
