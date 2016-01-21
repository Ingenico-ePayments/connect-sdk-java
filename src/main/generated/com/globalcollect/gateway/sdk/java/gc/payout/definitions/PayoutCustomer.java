package com.globalcollect.gateway.sdk.java.gc.payout.definitions;

import com.globalcollect.gateway.sdk.java.gc.fei.definitions.Address;
import com.globalcollect.gateway.sdk.java.gc.fei.definitions.CompanyInformation;
import com.globalcollect.gateway.sdk.java.gc.fei.definitions.ContactDetailsBase;
import com.globalcollect.gateway.sdk.java.gc.payment.definitions.PersonalName;

public class PayoutCustomer {

	private Address address = null;

	private CompanyInformation companyInformation = null;

	private ContactDetailsBase contactDetails = null;

	private String merchantCustomerId = null;

	private PersonalName name = null;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address value) {
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

	public String getMerchantCustomerId() {
		return merchantCustomerId;
	}

	public void setMerchantCustomerId(String value) {
		this.merchantCustomerId = value;
	}

	public PersonalName getName() {
		return name;
	}

	public void setName(PersonalName value) {
		this.name = value;
	}
}
