package com.globalcollect.gateway.sdk.java.gc.refund.definitions;

import com.globalcollect.gateway.sdk.java.gc.fei.definitions.CompanyInformation;
import com.globalcollect.gateway.sdk.java.gc.fei.definitions.ContactDetailsBase;
import com.globalcollect.gateway.sdk.java.gc.payment.definitions.AddressPersonal;

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
