package com.globalcollect.gateway.sdk.java.gc.services.definitions;


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
