package com.globalcollect.gateway.sdk.java.gc.fei.definitions;

import com.globalcollect.gateway.sdk.java.gc.fei.definitions.CompanyInformation;

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
