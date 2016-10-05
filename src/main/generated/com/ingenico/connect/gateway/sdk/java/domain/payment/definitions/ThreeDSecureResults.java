/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;


/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_ThreeDSecureResults">ThreeDSecureResults</a>
 */
public class ThreeDSecureResults {

	private String cavv = null;

	private String eci = null;

	private String xid = null;

	public String getCavv() {
		return cavv;
	}

	public void setCavv(String value) {
		this.cavv = value;
	}

	public String getEci() {
		return eci;
	}

	public void setEci(String value) {
		this.eci = value;
	}

	public String getXid() {
		return xid;
	}

	public void setXid(String value) {
		this.xid = value;
	}
}
