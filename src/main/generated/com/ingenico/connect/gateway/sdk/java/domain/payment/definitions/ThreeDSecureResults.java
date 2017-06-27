/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

public class ThreeDSecureResults {

	private String cavv = null;

	private String eci = null;

	private String xid = null;

	/**
	 * CAVV or AVV result indicating authentication validation value
	 */
	public String getCavv() {
		return cavv;
	}

	/**
	 * CAVV or AVV result indicating authentication validation value
	 */
	public void setCavv(String value) {
		this.cavv = value;
	}

	/**
	 * Indicates Authentication validation results returned after AuthenticationValidation
	 */
	public String getEci() {
		return eci;
	}

	/**
	 * Indicates Authentication validation results returned after AuthenticationValidation
	 */
	public void setEci(String value) {
		this.eci = value;
	}

	/**
	 * Transaction ID for the Authentication
	 */
	public String getXid() {
		return xid;
	}

	/**
	 * Transaction ID for the Authentication
	 */
	public void setXid(String value) {
		this.xid = value;
	}
}
