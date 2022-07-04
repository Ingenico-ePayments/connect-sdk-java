/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.Address;

public class Seller {

	private Address address = null;

	private String channelCode = null;

	private String description = null;

	private String externalReferenceId = null;

	private String geocode = null;

	private String id = null;

	private String invoiceNumber = null;

	private String mcc = null;

	private String name = null;

	private String phoneNumber = null;

	private String type = null;

	/**
	 * Object containing the seller address details
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * Object containing the seller address details
	 */
	public void setAddress(Address value) {
		this.address = value;
	}

	/**
	 * This property is specific to Visa Argentina. Channelcode according to Prisma. Please contact the acquirer to get the full list you need to use.
	 */
	public String getChannelCode() {
		return channelCode;
	}

	/**
	 * This property is specific to Visa Argentina. Channelcode according to Prisma. Please contact the acquirer to get the full list you need to use.
	 */
	public void setChannelCode(String value) {
		this.channelCode = value;
	}

	/**
	 * Description of the seller
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Description of the seller
	 */
	public void setDescription(String value) {
		this.description = value;
	}

	/**
	 * Seller ID assigned by the Merchant Aggregator
	 */
	public String getExternalReferenceId() {
		return externalReferenceId;
	}

	/**
	 * Seller ID assigned by the Merchant Aggregator
	 */
	public void setExternalReferenceId(String value) {
		this.externalReferenceId = value;
	}

	/**
	 * The sellers geocode
	 */
	public String getGeocode() {
		return geocode;
	}

	/**
	 * The sellers geocode
	 */
	public void setGeocode(String value) {
		this.geocode = value;
	}

	/**
	 * The sellers identifier
	 */
	public String getId() {
		return id;
	}

	/**
	 * The sellers identifier
	 */
	public void setId(String value) {
		this.id = value;
	}

	/**
	 * Invoice number of the payment
	 */
	public String getInvoiceNumber() {
		return invoiceNumber;
	}

	/**
	 * Invoice number of the payment
	 */
	public void setInvoiceNumber(String value) {
		this.invoiceNumber = value;
	}

	/**
	 * Merchant category code
	 */
	public String getMcc() {
		return mcc;
	}

	/**
	 * Merchant category code
	 */
	public void setMcc(String value) {
		this.mcc = value;
	}

	/**
	 * Name of the seller
	 */
	public String getName() {
		return name;
	}

	/**
	 * Name of the seller
	 */
	public void setName(String value) {
		this.name = value;
	}

	/**
	 * Main Phone Number
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * Main Phone Number
	 */
	public void setPhoneNumber(String value) {
		this.phoneNumber = value;
	}

	/**
	 * Seller type. Possible values:
	 * <ul class="paragraph-width"><li>passport
	 * <li>dni
	 * <li>arg-identity-card
	 * <li>civic-notebook
	 * <li>enrollment-book
	 * <li>cuil
	 * <li>cuit
	 * <li>general-register
	 * <li>election-title
	 * <li>cpf
	 * <li>cnpj
	 * <li>ssn
	 * <li>citizen-ship
	 * <li>col-identity-card
	 * <li>alien-registration
	 * </ul>
	 */
	public String getType() {
		return type;
	}

	/**
	 * Seller type. Possible values:
	 * <ul class="paragraph-width"><li>passport
	 * <li>dni
	 * <li>arg-identity-card
	 * <li>civic-notebook
	 * <li>enrollment-book
	 * <li>cuil
	 * <li>cuit
	 * <li>general-register
	 * <li>election-title
	 * <li>cpf
	 * <li>cnpj
	 * <li>ssn
	 * <li>citizen-ship
	 * <li>col-identity-card
	 * <li>alien-registration
	 * </ul>
	 */
	public void setType(String value) {
		this.type = value;
	}
}
