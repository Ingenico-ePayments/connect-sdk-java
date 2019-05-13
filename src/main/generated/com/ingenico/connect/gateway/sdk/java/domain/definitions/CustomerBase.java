/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.definitions;

/**
 * Basic information of a customer
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
	 * Your identifier for the customer. It can be used as a search criteria in the GlobalCollect Payment Console and is also included in the GlobalCollect report files. It is used in the fraud-screening process for payments on the Ogone Payment Platform.
	 */
	public String getMerchantCustomerId() {
		return merchantCustomerId;
	}

	/**
	 * Your identifier for the customer. It can be used as a search criteria in the GlobalCollect Payment Console and is also included in the GlobalCollect report files. It is used in the fraud-screening process for payments on the Ogone Payment Platform.
	 */
	public void setMerchantCustomerId(String value) {
		this.merchantCustomerId = value;
	}

	/**
	 * Local VAT number of the company
	 *
	 * @deprecated Use companyInformation.vatNumber instead
	 */
	@Deprecated
	public String getVatNumber() {
		return vatNumber;
	}

	/**
	 * Local VAT number of the company
	 *
	 * @deprecated Use companyInformation.vatNumber instead
	 */
	@Deprecated
	public void setVatNumber(String value) {
		this.vatNumber = value;
	}
}
