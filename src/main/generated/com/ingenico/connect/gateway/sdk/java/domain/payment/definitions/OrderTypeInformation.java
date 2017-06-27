/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

public class OrderTypeInformation {

	private String purchaseType = null;

	private String usageType = null;

	/**
	 * Possible values are:<ul>
	 * <li>good
	 * <li>service
	 * </ul>
	 */
	public String getPurchaseType() {
		return purchaseType;
	}

	/**
	 * Possible values are:<ul>
	 * <li>good
	 * <li>service
	 * </ul>
	 */
	public void setPurchaseType(String value) {
		this.purchaseType = value;
	}

	/**
	 * Possible values are:<ul>
	 * <li>private
	 * <li>commercial
	 * </ul>
	 */
	public String getUsageType() {
		return usageType;
	}

	/**
	 * Possible values are:<ul>
	 * <li>private
	 * <li>commercial
	 * </ul>
	 */
	public void setUsageType(String value) {
		this.usageType = value;
	}
}
