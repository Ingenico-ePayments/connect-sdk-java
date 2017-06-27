/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.definitions;

public class AbstractOrderStatus {

	private String id = null;

	/**
	 * Every payment entity resource has an identifier or pointer associated with it. This id can be used to uniquely reach the resource.
	 */
	public String getId() {
		return id;
	}

	/**
	 * Every payment entity resource has an identifier or pointer associated with it. This id can be used to uniquely reach the resource.
	 */
	public void setId(String value) {
		this.id = value;
	}
}
