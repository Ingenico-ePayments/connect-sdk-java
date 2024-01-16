/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/
 */

package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

/**
 * Mobile payment specific response data
 */
public class ApprovePaymentMobilePaymentMethodSpecificOutput {

	private String voidResponseId = null;

	/**
	 * Result of the authorization reversal request
	 * <p>Possible values are:
	 * <ul class="paragraph-width">
	 * <li>00 - Successful reversal
	 * <li>0, 8 or 11 - Reversal request submitted
	 * <li>5 or 55 - Reversal request declined or referred
	 * <li>empty or 98 - The provider did not provide a response
	 * </ul>
	 */
	public String getVoidResponseId() {
		return voidResponseId;
	}

	/**
	 * Result of the authorization reversal request
	 * <p>Possible values are:
	 * <ul class="paragraph-width">
	 * <li>00 - Successful reversal
	 * <li>0, 8 or 11 - Reversal request submitted
	 * <li>5 or 55 - Reversal request declined or referred
	 * <li>empty or 98 - The provider did not provide a response
	 * </ul>
	 */
	public void setVoidResponseId(String value) {
		this.voidResponseId = value;
	}
}
