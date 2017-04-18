/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.services;

import java.util.List;

import com.ingenico.connect.gateway.sdk.java.domain.services.definitions.IINDetail;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_GetIINDetailsResponse">GetIINDetailsResponse</a>
 */
public class GetIINDetailsResponse {

	private List<IINDetail> coBrands = null;

	private String countryCode = null;

	private Boolean isAllowedInContext = null;

	private Integer paymentProductId = null;

	public List<IINDetail> getCoBrands() {
		return coBrands;
	}

	public void setCoBrands(List<IINDetail> value) {
		this.coBrands = value;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String value) {
		this.countryCode = value;
	}

	public Boolean getIsAllowedInContext() {
		return isAllowedInContext;
	}

	public void setIsAllowedInContext(Boolean value) {
		this.isAllowedInContext = value;
	}

	public Integer getPaymentProductId() {
		return paymentProductId;
	}

	public void setPaymentProductId(Integer value) {
		this.paymentProductId = value;
	}
}
