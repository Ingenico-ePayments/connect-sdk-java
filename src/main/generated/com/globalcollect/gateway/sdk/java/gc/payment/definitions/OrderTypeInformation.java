package com.globalcollect.gateway.sdk.java.gc.payment.definitions;


public class OrderTypeInformation {

	private String purchaseType = null;

	private String usageType = null;

	public String getPurchaseType() {
		return purchaseType;
	}

	public void setPurchaseType(String value) {
		this.purchaseType = value;
	}

	public String getUsageType() {
		return usageType;
	}

	public void setUsageType(String value) {
		this.usageType = value;
	}
}
