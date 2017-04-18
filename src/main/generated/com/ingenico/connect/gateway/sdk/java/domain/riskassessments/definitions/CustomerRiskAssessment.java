/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.riskassessments.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.Address;
import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.AddressPersonal;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_CustomerRiskAssessment">CustomerRiskAssessment</a>
 */
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
