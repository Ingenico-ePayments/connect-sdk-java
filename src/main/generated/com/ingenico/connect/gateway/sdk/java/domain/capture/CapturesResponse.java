/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/
 */

package com.ingenico.connect.gateway.sdk.java.domain.capture;

import java.util.List;

import com.ingenico.connect.gateway.sdk.java.domain.capture.definitions.Capture;

public class CapturesResponse {

	private List<Capture> captures = null;

	/**
	 * The list of all captures performed on the requested payment.
	 */
	public List<Capture> getCaptures() {
		return captures;
	}

	/**
	 * The list of all captures performed on the requested payment.
	 */
	public void setCaptures(List<Capture> value) {
		this.captures = value;
	}
}
