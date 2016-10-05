/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.product.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.KeyValuePair;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_AccountOnFileAttribute">AccountOnFileAttribute</a>
 */
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
