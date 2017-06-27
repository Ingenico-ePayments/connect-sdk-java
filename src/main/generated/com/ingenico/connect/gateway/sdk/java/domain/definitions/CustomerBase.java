/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.definitions;

/**
 * Basic information of a consumer
 */
public class CustomerBase {

	private CompanyInformation companyInformation = null;

	private String merchantCustomerId = null;

	private String vatNumber = null;

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
	 * Your identifier for the consumer that can be used as a search criteria in the Global Collect Payment Console and is also included in the Global Collect report files. For Ingenco's Ogone Payment Platform this field is used in the fraud-screening process.
	 */
	public String getMerchantCustomerId() {
		return merchantCustomerId;
	}

	/**
	 * Your identifier for the consumer that can be used as a search criteria in the Global Collect Payment Console and is also included in the Global Collect report files. For Ingenco's Ogone Payment Platform this field is used in the fraud-screening process.
	 */
	public void setMerchantCustomerId(String value) {
		this.merchantCustomerId = value;
	}

	/**
	 * Local VAT number of the consumer
	 */
	public String getVatNumber() {
		return vatNumber;
	}

	/**
	 * Local VAT number of the consumer
	 */
	public void setVatNumber(String value) {
		this.vatNumber = value;
	}
}
