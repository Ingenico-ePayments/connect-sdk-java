/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_OrderTypeInformation">OrderTypeInformation</a>
 */
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
