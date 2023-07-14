/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */

package com.ingenico.connect.gateway.sdk.java.domain.refund.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.CompanyInformation;
import com.ingenico.connect.gateway.sdk.java.domain.definitions.ContactDetailsBase;
import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.AddressPersonal;

public class RefundCustomer {

	private AddressPersonal address = null;

	private CompanyInformation companyInformation = null;

	private ContactDetailsBase contactDetails = null;

	private String fiscalNumber = null;

	/**
	 * Object containing address details
	 */
	public AddressPersonal getAddress() {
		return address;
	}

	/**
	 * Object containing address details
	 */
	public void setAddress(AddressPersonal value) {
		this.address = value;
	}

	/**
	 * Object containing company information
	 */
	public CompanyInformation getCompanyInformation() {
		return companyInformation;
	}

	/**
	 * Object containing company information
	 */
	public void setCompanyInformation(CompanyInformation value) {
		this.companyInformation = value;
	}

	/**
	 * Object containing contact details like email address and phone number
	 */
	public ContactDetailsBase getContactDetails() {
		return contactDetails;
	}

	/**
	 * Object containing contact details like email address and phone number
	 */
	public void setContactDetails(ContactDetailsBase value) {
		this.contactDetails = value;
	}

	/**
	 * The fiscal registration number of the customer or the tax registration number of the company in case of a business customer. Please find below specifics per country:
	 * <ul class="paragraph-width">
	 * <li>Argentina - Consumer (DNI) with a length of 7 or 8 digits
	 * <li>Argentina - Company (CUIT) with a length of 11 digits
	 * <li>Brazil - Consumer (CPF) with a length of 11 digits
	 * <li>Brazil - Company (CNPJ) with a length of 14 digits
	 * <li>Chile - Consumer (RUT) with a length of 9 digits
	 * <li>Colombia - Consumer (NIT) with a length of 8, 9 or 10 digits
	 * <li>Denmark - Consumer (CPR-nummer or personnummer) with a length of 10 digits
	 * <li>Dominican Republic - Consumer (RNC) with a length of 11 digits
	 * <li>Finland - Consumer (Finnish: henkilötunnus (abbreviated as HETU)) with a length of 11 characters
	 * <li>India - Consumer (PAN) with a length of 10 characters
	 * <li>Mexico - Consumer (RFC) with a length of 13 digits
	 * <li>Mexico - Company (RFC) with a length of 12 digits
	 * <li>Norway - Consumer (fødselsnummer) with a length of 11 digits
	 * <li>Peru - Consumer (RUC) with a length of 11 digits
	 * <li>Sweden - Consumer (personnummer) with a length of 10 or 12 digits
	 * <li>Uruguay - Consumer (CI) with a length of 8 digits
	 * <li>Uruguay - Consumer (NIE) with a length of 9 digits
	 * <li>Uruguay - Company (RUT) with a length of 12 digits
	 * </ul>
	 */
	public String getFiscalNumber() {
		return fiscalNumber;
	}

	/**
	 * The fiscal registration number of the customer or the tax registration number of the company in case of a business customer. Please find below specifics per country:
	 * <ul class="paragraph-width">
	 * <li>Argentina - Consumer (DNI) with a length of 7 or 8 digits
	 * <li>Argentina - Company (CUIT) with a length of 11 digits
	 * <li>Brazil - Consumer (CPF) with a length of 11 digits
	 * <li>Brazil - Company (CNPJ) with a length of 14 digits
	 * <li>Chile - Consumer (RUT) with a length of 9 digits
	 * <li>Colombia - Consumer (NIT) with a length of 8, 9 or 10 digits
	 * <li>Denmark - Consumer (CPR-nummer or personnummer) with a length of 10 digits
	 * <li>Dominican Republic - Consumer (RNC) with a length of 11 digits
	 * <li>Finland - Consumer (Finnish: henkilötunnus (abbreviated as HETU)) with a length of 11 characters
	 * <li>India - Consumer (PAN) with a length of 10 characters
	 * <li>Mexico - Consumer (RFC) with a length of 13 digits
	 * <li>Mexico - Company (RFC) with a length of 12 digits
	 * <li>Norway - Consumer (fødselsnummer) with a length of 11 digits
	 * <li>Peru - Consumer (RUC) with a length of 11 digits
	 * <li>Sweden - Consumer (personnummer) with a length of 10 or 12 digits
	 * <li>Uruguay - Consumer (CI) with a length of 8 digits
	 * <li>Uruguay - Consumer (NIE) with a length of 9 digits
	 * <li>Uruguay - Company (RUT) with a length of 12 digits
	 * </ul>
	 */
	public void setFiscalNumber(String value) {
		this.fiscalNumber = value;
	}
}
