package com.globalcollect.gateway.sdk.java.gc.payment.definitions;


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
