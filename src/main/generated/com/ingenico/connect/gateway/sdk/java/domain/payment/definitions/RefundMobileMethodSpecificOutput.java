/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.RefundMethodSpecificOutput;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_RefundMobileMethodSpecificOutput">RefundMobileMethodSpecificOutput</a>
 */
public class RefundMobileMethodSpecificOutput extends RefundMethodSpecificOutput {

	private String network = null;

	public String getNetwork() {
		return network;
	}

	public void setNetwork(String value) {
		this.network = value;
	}
}
