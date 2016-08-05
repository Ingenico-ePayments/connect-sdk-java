package com.globalcollect.gateway.sdk.java.gc.services;

import com.globalcollect.gateway.sdk.java.gc.services.definitions.IINDetail;
import java.util.List;

/**
 * class GetIINDetailsResponse
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
