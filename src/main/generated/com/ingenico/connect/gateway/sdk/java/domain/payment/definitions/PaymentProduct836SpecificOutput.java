/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */

package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

public class PaymentProduct836SpecificOutput {

	private String securityIndicator = null;

	/**
	 * Indicates if SofortBank could estabilish if the transaction could successfully be processed.
	 * <ul class="paragraph-width">
	 * <li>0 - You should wait for the transaction to be reported as paid before shipping any goods.
	 * <li>1 - You can ship the goods. In case the transaction is not reported as paid you can initiate a claims process with SofortBank.
	 * </ul>
	 */
	public String getSecurityIndicator() {
		return securityIndicator;
	}

	/**
	 * Indicates if SofortBank could estabilish if the transaction could successfully be processed.
	 * <ul class="paragraph-width">
	 * <li>0 - You should wait for the transaction to be reported as paid before shipping any goods.
	 * <li>1 - You can ship the goods. In case the transaction is not reported as paid you can initiate a claims process with SofortBank.
	 * </ul>
	 */
	public void setSecurityIndicator(String value) {
		this.securityIndicator = value;
	}
}
