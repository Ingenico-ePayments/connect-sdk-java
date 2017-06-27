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
}
