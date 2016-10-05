/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.services.definitions;


/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_IINDetail">IINDetail</a>
 */
public class IINDetail {

	private Boolean isAllowedInContext = null;

	private Integer paymentProductId = null;

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
