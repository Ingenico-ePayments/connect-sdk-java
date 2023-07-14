/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */

package com.ingenico.connect.gateway.sdk.java.domain.product.definitions;

import java.util.List;

public class DirectoryEntry {

	private List<String> countryNames = null;

	private String issuerId = null;

	private String issuerList = null;

	private String issuerName = null;

	/**
	 * Country name of the issuer, used to group issuers per country<br>
	 * Note: this is only filled if supported by the payment product.
	 */
	public List<String> getCountryNames() {
		return countryNames;
	}

	/**
	 * Country name of the issuer, used to group issuers per country<br>
	 * Note: this is only filled if supported by the payment product.
	 */
	public void setCountryNames(List<String> value) {
		this.countryNames = value;
	}

	/**
	 * Unique ID of the issuing bank of the customer
	 */
	public String getIssuerId() {
		return issuerId;
	}

	/**
	 * Unique ID of the issuing bank of the customer
	 */
	public void setIssuerId(String value) {
		this.issuerId = value;
	}

	/**
	 * To be used to sort the issuers.
	 * <ul class="paragraph-width"><li>short - These issuers should be presented at the top of the list
	 * <li>long - These issuers should be presented after the issuers marked as short
	 * </ul>
	 * Note: this is only filled if supported by the payment product. Currently only iDeal (809) support this. Sorting within the groups should be done alphabetically.
	 */
	public String getIssuerList() {
		return issuerList;
	}

	/**
	 * To be used to sort the issuers.
	 * <ul class="paragraph-width"><li>short - These issuers should be presented at the top of the list
	 * <li>long - These issuers should be presented after the issuers marked as short
	 * </ul>
	 * Note: this is only filled if supported by the payment product. Currently only iDeal (809) support this. Sorting within the groups should be done alphabetically.
	 */
	public void setIssuerList(String value) {
		this.issuerList = value;
	}

	/**
	 * Name of the issuing bank, as it should be presented to the customer
	 */
	public String getIssuerName() {
		return issuerName;
	}

	/**
	 * Name of the issuing bank, as it should be presented to the customer
	 */
	public void setIssuerName(String value) {
		this.issuerName = value;
	}
}
