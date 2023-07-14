/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */

package com.ingenico.connect.gateway.sdk.java.domain.definitions;

/**
 * Object that holds lodging related room data
 */
public class LodgingRoom {

	private String dailyRoomRate = null;

	private String dailyRoomRateCurrencyCode = null;

	private String dailyRoomTaxAmount = null;

	private String dailyRoomTaxAmountCurrencyCode = null;

	private Integer numberOfNightsAtRoomRate = null;

	private String roomLocation = null;

	private String roomNumber = null;

	private String typeOfBed = null;

	private String typeOfRoom = null;

	/**
	 * Daily room rate exclusive of any taxes and fees<br>
	 * Note: The currencyCode is presumed to be identical to the order.amountOfMoney.currencyCode.
	 */
	public String getDailyRoomRate() {
		return dailyRoomRate;
	}

	/**
	 * Daily room rate exclusive of any taxes and fees<br>
	 * Note: The currencyCode is presumed to be identical to the order.amountOfMoney.currencyCode.
	 */
	public void setDailyRoomRate(String value) {
		this.dailyRoomRate = value;
	}

	/**
	 * Currency for Daily room rate. The code should be in 3 letter ISO format
	 */
	public String getDailyRoomRateCurrencyCode() {
		return dailyRoomRateCurrencyCode;
	}

	/**
	 * Currency for Daily room rate. The code should be in 3 letter ISO format
	 */
	public void setDailyRoomRateCurrencyCode(String value) {
		this.dailyRoomRateCurrencyCode = value;
	}

	/**
	 * Daily room tax<br>
	 * Note: The currencyCode is presumed to be identical to the order.amountOfMoney.currencyCode.
	 */
	public String getDailyRoomTaxAmount() {
		return dailyRoomTaxAmount;
	}

	/**
	 * Daily room tax<br>
	 * Note: The currencyCode is presumed to be identical to the order.amountOfMoney.currencyCode.
	 */
	public void setDailyRoomTaxAmount(String value) {
		this.dailyRoomTaxAmount = value;
	}

	/**
	 * Currency for Daily room tax. The code should be in 3 letter ISO format
	 */
	public String getDailyRoomTaxAmountCurrencyCode() {
		return dailyRoomTaxAmountCurrencyCode;
	}

	/**
	 * Currency for Daily room tax. The code should be in 3 letter ISO format
	 */
	public void setDailyRoomTaxAmountCurrencyCode(String value) {
		this.dailyRoomTaxAmountCurrencyCode = value;
	}

	/**
	 * Number of nights charged at the rate in the dailyRoomRate property
	 */
	public Integer getNumberOfNightsAtRoomRate() {
		return numberOfNightsAtRoomRate;
	}

	/**
	 * Number of nights charged at the rate in the dailyRoomRate property
	 */
	public void setNumberOfNightsAtRoomRate(Integer value) {
		this.numberOfNightsAtRoomRate = value;
	}

	/**
	 * Location of the room within the facility, e.g. Park or Garden etc.
	 */
	public String getRoomLocation() {
		return roomLocation;
	}

	/**
	 * Location of the room within the facility, e.g. Park or Garden etc.
	 */
	public void setRoomLocation(String value) {
		this.roomLocation = value;
	}

	/**
	 * Room number
	 */
	public String getRoomNumber() {
		return roomNumber;
	}

	/**
	 * Room number
	 */
	public void setRoomNumber(String value) {
		this.roomNumber = value;
	}

	/**
	 * Size of bed, e.g., king, queen, double.
	 */
	public String getTypeOfBed() {
		return typeOfBed;
	}

	/**
	 * Size of bed, e.g., king, queen, double.
	 */
	public void setTypeOfBed(String value) {
		this.typeOfBed = value;
	}

	/**
	 * Describes the type of room, e.g., standard, deluxe, suite.
	 */
	public String getTypeOfRoom() {
		return typeOfRoom;
	}

	/**
	 * Describes the type of room, e.g., standard, deluxe, suite.
	 */
	public void setTypeOfRoom(String value) {
		this.typeOfRoom = value;
	}
}
