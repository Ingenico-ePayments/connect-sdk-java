/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.refund.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.CompanyInformation;
import com.ingenico.connect.gateway.sdk.java.domain.definitions.ContactDetailsBase;
import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.AddressPersonal;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_RefundCustomer">RefundCustomer</a>
 */
public class RefundCustomer {

	private AddressPersonal address = null;

	private CompanyInformation companyInformation = null;

	private ContactDetailsBase contactDetails = null;

	public AddressPersonal getAddress() {
		return address;
	}

	public void setAddress(AddressPersonal value) {
		this.address = value;
	}

	public CompanyInformation getCompanyInformation() {
		return companyInformation;
	}

	public void setCompanyInformation(CompanyInformation value) {
		this.companyInformation = value;
	}

	public ContactDetailsBase getContactDetails() {
		return contactDetails;
	}

	public void setContactDetails(ContactDetailsBase value) {
		this.contactDetails = value;
	}
}
