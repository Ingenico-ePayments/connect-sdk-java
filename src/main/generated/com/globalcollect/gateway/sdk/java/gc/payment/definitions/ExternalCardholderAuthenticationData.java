package com.globalcollect.gateway.sdk.java.gc.payment.definitions;


public class ExternalCardholderAuthenticationData {

	private String cavv = null;

	private String cavvAlgorithm = null;

	private Integer eci = null;

	private String validationResult = null;

	private String xid = null;

	public String getCavv() {
		return cavv;
	}

	public void setCavv(String value) {
		this.cavv = value;
	}

	public String getCavvAlgorithm() {
		return cavvAlgorithm;
	}

	public void setCavvAlgorithm(String value) {
		this.cavvAlgorithm = value;
	}

	public Integer getEci() {
		return eci;
	}

	public void setEci(Integer value) {
		this.eci = value;
	}

	public String getValidationResult() {
		return validationResult;
	}

	public void setValidationResult(String value) {
		this.validationResult = value;
	}

	public String getXid() {
		return xid;
	}

	public void setXid(String value) {
		this.xid = value;
	}
}
