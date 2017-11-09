/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.mandates;

import com.ingenico.connect.gateway.sdk.java.domain.mandates.definitions.MandateMerchantAction;
import com.ingenico.connect.gateway.sdk.java.domain.mandates.definitions.MandateResponse;

public class CreateMandateResponse {

	private MandateResponse mandate = null;

	private MandateMerchantAction merchantAction = null;

	/**
	 * Object containing information on a mandate
	 */
	public MandateResponse getMandate() {
		return mandate;
	}

	/**
	 * Object containing information on a mandate
	 */
	public void setMandate(MandateResponse value) {
		this.mandate = value;
	}

	/**
	 * Object that contains the action, including the needed data, that you should perform next, showing the redirect to a third party to complete the payment or like showing instructions
	 */
	public MandateMerchantAction getMerchantAction() {
		return merchantAction;
	}

	/**
	 * Object that contains the action, including the needed data, that you should perform next, showing the redirect to a third party to complete the payment or like showing instructions
	 */
	public void setMerchantAction(MandateMerchantAction value) {
		this.merchantAction = value;
	}
}
