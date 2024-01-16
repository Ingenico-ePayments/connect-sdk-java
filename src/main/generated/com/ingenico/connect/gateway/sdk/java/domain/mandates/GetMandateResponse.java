/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/
 */

package com.ingenico.connect.gateway.sdk.java.domain.mandates;

import com.ingenico.connect.gateway.sdk.java.domain.mandates.definitions.MandateResponse;

public class GetMandateResponse {

	private MandateResponse mandate = null;

	/**
	 * Object containing information on a mandate.
	 */
	public MandateResponse getMandate() {
		return mandate;
	}

	/**
	 * Object containing information on a mandate.
	 */
	public void setMandate(MandateResponse value) {
		this.mandate = value;
	}
}
