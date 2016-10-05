/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.CompanyInformation;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_CustomerBase">CustomerBase</a>
 */
public class CustomerBase {

	private CompanyInformation companyInformation = null;

	private String merchantCustomerId = null;

	private String vatNumber = null;

	public CompanyInformation getCompanyInformation() {
		return companyInformation;
	}

	public void setCompanyInformation(CompanyInformation value) {
		this.companyInformation = value;
	}

	public String getMerchantCustomerId() {
		return merchantCustomerId;
	}

	public void setMerchantCustomerId(String value) {
		this.merchantCustomerId = value;
	}

	public String getVatNumber() {
		return vatNumber;
	}

	public void setVatNumber(String value) {
		this.vatNumber = value;
	}
}
