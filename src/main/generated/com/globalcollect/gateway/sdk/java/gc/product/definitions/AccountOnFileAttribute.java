package com.globalcollect.gateway.sdk.java.gc.product.definitions;

import com.globalcollect.gateway.sdk.java.gc.fei.definitions.KeyValuePair;

public class AccountOnFileAttribute extends KeyValuePair {

	private String mustWriteReason = null;

	private String status = null;

	public String getMustWriteReason() {
		return mustWriteReason;
	}

	public void setMustWriteReason(String value) {
		this.mustWriteReason = value;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String value) {
		this.status = value;
	}
}
