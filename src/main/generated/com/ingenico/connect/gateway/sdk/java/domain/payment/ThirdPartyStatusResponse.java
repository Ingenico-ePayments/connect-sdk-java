/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment;

public class ThirdPartyStatusResponse {

	private String thirdPartyStatus = null;

	/**
	 * The status returned by the third party.
	 * 
	 * Possible values:
	 * <ul><li>WAITING - The customer has not connected to the third party</li>
	 * <li>INITIALIZED - Authentication in progress</li>
	 * <li>AUTHORIZED - Payment in progress</li>
	 * <li>COMPLETED - The customer has completed the payment at the third party</li></ul>
	 */
	public String getThirdPartyStatus() {
		return thirdPartyStatus;
	}

	/**
	 * The status returned by the third party.
	 * 
	 * Possible values:
	 * <ul><li>WAITING - The customer has not connected to the third party</li>
	 * <li>INITIALIZED - Authentication in progress</li>
	 * <li>AUTHORIZED - Payment in progress</li>
	 * <li>COMPLETED - The customer has completed the payment at the third party</li></ul>
	 */
	public void setThirdPartyStatus(String value) {
		this.thirdPartyStatus = value;
	}
}
