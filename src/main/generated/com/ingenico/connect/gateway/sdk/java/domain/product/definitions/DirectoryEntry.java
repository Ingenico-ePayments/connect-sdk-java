/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.product.definitions;

import java.util.List;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_DirectoryEntry">DirectoryEntry</a>
 */
public class DirectoryEntry {

	private List<String> countryNames = null;

	private String issuerId = null;

	private String issuerList = null;

	private String issuerName = null;

	public List<String> getCountryNames() {
		return countryNames;
	}

	public void setCountryNames(List<String> value) {
		this.countryNames = value;
	}

	public String getIssuerId() {
		return issuerId;
	}

	public void setIssuerId(String value) {
		this.issuerId = value;
	}

	public String getIssuerList() {
		return issuerList;
	}

	public void setIssuerList(String value) {
		this.issuerList = value;
	}

	public String getIssuerName() {
		return issuerName;
	}

	public void setIssuerName(String value) {
		this.issuerName = value;
	}
}
