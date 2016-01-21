package com.globalcollect.gateway.sdk.java.gc.riskassessments.definitions;

import com.globalcollect.gateway.sdk.java.gc.fei.definitions.Address;
import com.globalcollect.gateway.sdk.java.gc.payment.definitions.AddressPersonal;
import com.globalcollect.gateway.sdk.java.gc.riskassessments.definitions.PersonalInformationRiskAssessment;

public class CustomerRiskAssessment {

	private Address billingAddress = null;

	private String locale = null;

	private PersonalInformationRiskAssessment personalInformation = null;

	private AddressPersonal shippingAddress = null;

	public Address getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(Address value) {
		this.billingAddress = value;
	}

	public String getLocale() {
		return locale;
	}

	public void setLocale(String value) {
		this.locale = value;
	}

	public PersonalInformationRiskAssessment getPersonalInformation() {
		return personalInformation;
	}

	public void setPersonalInformation(PersonalInformationRiskAssessment value) {
		this.personalInformation = value;
	}

	public AddressPersonal getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(AddressPersonal value) {
		this.shippingAddress = value;
	}
}
