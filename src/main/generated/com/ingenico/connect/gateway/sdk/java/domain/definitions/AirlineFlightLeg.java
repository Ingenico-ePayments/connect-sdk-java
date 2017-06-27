/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.definitions;

public class AirlineFlightLeg {

	private String airlineClass = null;

	private String arrivalAirport = null;

	private String carrierCode = null;

	private String date = null;

	private String departureTime = null;

	private String fare = null;

	private String fareBasis = null;

	private String flightNumber = null;

	private Integer number = null;

	private String originAirport = null;

	private String stopoverCode = null;

	/**
	 * Reservation Booking Designator
	 */
	public String getAirlineClass() {
		return airlineClass;
	}

	/**
	 * Reservation Booking Designator
	 */
	public void setAirlineClass(String value) {
		this.airlineClass = value;
	}

	/**
	 * Arrival airport/city code
	 */
	public String getArrivalAirport() {
		return arrivalAirport;
	}

	/**
	 * Arrival airport/city code
	 */
	public void setArrivalAirport(String value) {
		this.arrivalAirport = value;
	}

	/**
	 * IATA carrier code
	 */
	public String getCarrierCode() {
		return carrierCode;
	}

	/**
	 * IATA carrier code
	 */
	public void setCarrierCode(String value) {
		this.carrierCode = value;
	}

	/**
	 * Date of the leg<br>
	 * Format: YYYYMMDD
	 */
	public String getDate() {
		return date;
	}

	/**
	 * Date of the leg<br>
	 * Format: YYYYMMDD
	 */
	public void setDate(String value) {
		this.date = value;
	}

	/**
	 * The departure time in the local time at the departure airport<br>
	 * Format: HH:MM
	 */
	public String getDepartureTime() {
		return departureTime;
	}

	/**
	 * The departure time in the local time at the departure airport<br>
	 * Format: HH:MM
	 */
	public void setDepartureTime(String value) {
		this.departureTime = value;
	}

	/**
	 * Fare of this leg
	 */
	public String getFare() {
		return fare;
	}

	/**
	 * Fare of this leg
	 */
	public void setFare(String value) {
		this.fare = value;
	}

	/**
	 * Fare Basis/Ticket Designator
	 */
	public String getFareBasis() {
		return fareBasis;
	}

	/**
	 * Fare Basis/Ticket Designator
	 */
	public void setFareBasis(String value) {
		this.fareBasis = value;
	}

	/**
	 * The flight number assigned by the airline carrier with no leading spaces<br>
	 * Should be a numeric string
	 */
	public String getFlightNumber() {
		return flightNumber;
	}

	/**
	 * The flight number assigned by the airline carrier with no leading spaces<br>
	 * Should be a numeric string
	 */
	public void setFlightNumber(String value) {
		this.flightNumber = value;
	}

	/**
	 * Sequence number of the flight leg
	 */
	public Integer getNumber() {
		return number;
	}

	/**
	 * Sequence number of the flight leg
	 */
	public void setNumber(Integer value) {
		this.number = value;
	}

	/**
	 * Origin airport/city code
	 */
	public String getOriginAirport() {
		return originAirport;
	}

	/**
	 * Origin airport/city code
	 */
	public void setOriginAirport(String value) {
		this.originAirport = value;
	}

	/**
	 * Possible values are:
	 * <ul><li>permitted = Stopover permitted
	 * <li>non-permitted = Stopover not permitted
	 * </ul>
	 */
	public String getStopoverCode() {
		return stopoverCode;
	}

	/**
	 * Possible values are:
	 * <ul><li>permitted = Stopover permitted
	 * <li>non-permitted = Stopover not permitted
	 * </ul>
	 */
	public void setStopoverCode(String value) {
		this.stopoverCode = value;
	}
}
