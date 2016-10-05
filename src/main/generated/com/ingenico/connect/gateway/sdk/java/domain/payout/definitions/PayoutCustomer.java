/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payout.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.Address;
import com.ingenico.connect.gateway.sdk.java.domain.definitions.CompanyInformation;
import com.ingenico.connect.gateway.sdk.java.domain.definitions.ContactDetailsBase;
import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.PersonalName;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_PayoutCustomer">PayoutCustomer</a>
 */
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
