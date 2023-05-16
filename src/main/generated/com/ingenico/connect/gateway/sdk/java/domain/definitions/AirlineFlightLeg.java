/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.definitions;

public class AirlineFlightLeg {

	private String airlineClass = null;

	private String arrivalAirport = null;

	private String arrivalTime = null;

	private String carrierCode = null;

	private String conjunctionTicket = null;

	private String couponNumber = null;

	private String date = null;

	private String departureTime = null;

	private String endorsementOrRestriction = null;

	private String exchangeTicket = null;

	private String fare = null;

	private String fareBasis = null;

	private Integer fee = null;

	private String flightNumber = null;

	private Integer number = null;

	private String originAirport = null;

	private String passengerClass = null;

	private String serviceClass = null;

	private String stopoverCode = null;

	private Integer taxes = null;

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
	 * The arrival time in the local time zone <br>
	 * Format: HH:MM
	 */
	public String getArrivalTime() {
		return arrivalTime;
	}

	/**
	 * The arrival time in the local time zone <br>
	 * Format: HH:MM
	 */
	public void setArrivalTime(String value) {
		this.arrivalTime = value;
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
	 * Identifying number of a ticket issued to a passenger in conjunction with this ticket and that constitutes a single contract of carriage
	 */
	public String getConjunctionTicket() {
		return conjunctionTicket;
	}

	/**
	 * Identifying number of a ticket issued to a passenger in conjunction with this ticket and that constitutes a single contract of carriage
	 */
	public void setConjunctionTicket(String value) {
		this.conjunctionTicket = value;
	}

	/**
	 * The coupon number associated with this leg of the trip. A ticket can contain several legs of travel, and each leg of travel requires a separate coupon
	 */
	public String getCouponNumber() {
		return couponNumber;
	}

	/**
	 * The coupon number associated with this leg of the trip. A ticket can contain several legs of travel, and each leg of travel requires a separate coupon
	 */
	public void setCouponNumber(String value) {
		this.couponNumber = value;
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
	 * An endorsement can be an agency-added notation or a mandatory government required notation, such as value-added tax. A restriction is a limitation based on the type of fare, such as a ticket with a 3-day minimum stay
	 */
	public String getEndorsementOrRestriction() {
		return endorsementOrRestriction;
	}

	/**
	 * An endorsement can be an agency-added notation or a mandatory government required notation, such as value-added tax. A restriction is a limitation based on the type of fare, such as a ticket with a 3-day minimum stay
	 */
	public void setEndorsementOrRestriction(String value) {
		this.endorsementOrRestriction = value;
	}

	/**
	 * New ticket number that is issued when a ticket is exchanged
	 */
	public String getExchangeTicket() {
		return exchangeTicket;
	}

	/**
	 * New ticket number that is issued when a ticket is exchanged
	 */
	public void setExchangeTicket(String value) {
		this.exchangeTicket = value;
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
	 * Fee for this leg of the trip
	 */
	public Integer getFee() {
		return fee;
	}

	/**
	 * Fee for this leg of the trip
	 */
	public void setFee(Integer value) {
		this.fee = value;
	}

	/**
	 * The flight number assigned by the airline carrier with no leading spaces <br>
	 * Should be a numeric string
	 */
	public String getFlightNumber() {
		return flightNumber;
	}

	/**
	 * The flight number assigned by the airline carrier with no leading spaces <br>
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
	 * PassengerClass if this leg
	 */
	public String getPassengerClass() {
		return passengerClass;
	}

	/**
	 * PassengerClass if this leg
	 */
	public void setPassengerClass(String value) {
		this.passengerClass = value;
	}

	/**
	 * ServiceClass of this leg (this property is used for fraud screening on the Ogone Payment Platform).
	 * <p>Possible values are:
	 * <ul class="paragraph-width">
	 * <li>economy
	 * <li>premium-economy
	 * <li>business
	 * <li>first
	 * </ul>
	 *
	 * @deprecated Use passengerClass instead
	 */
	@Deprecated
	public String getServiceClass() {
		return serviceClass;
	}

	/**
	 * ServiceClass of this leg (this property is used for fraud screening on the Ogone Payment Platform).
	 * <p>Possible values are:
	 * <ul class="paragraph-width">
	 * <li>economy
	 * <li>premium-economy
	 * <li>business
	 * <li>first
	 * </ul>
	 *
	 * @deprecated Use passengerClass instead
	 */
	@Deprecated
	public void setServiceClass(String value) {
		this.serviceClass = value;
	}

	/**
	 * Possible values are:
	 * <ul class="paragraph-width"><li>permitted = Stopover permitted
	 * <li>non-permitted = Stopover not permitted
	 * </ul>
	 */
	public String getStopoverCode() {
		return stopoverCode;
	}

	/**
	 * Possible values are:
	 * <ul class="paragraph-width"><li>permitted = Stopover permitted
	 * <li>non-permitted = Stopover not permitted
	 * </ul>
	 */
	public void setStopoverCode(String value) {
		this.stopoverCode = value;
	}

	/**
	 * Taxes for this leg of the trip
	 */
	public Integer getTaxes() {
		return taxes;
	}

	/**
	 * Taxes for this leg of the trip
	 */
	public void setTaxes(Integer value) {
		this.taxes = value;
	}
}
