/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

public class RefundMethodSpecificOutput {

	private Long totalAmountPaid = null;

	private Long totalAmountRefunded = null;

	/**
	 * Total paid amount (in cents and always with 2 decimals)
	 */
	public Long getTotalAmountPaid() {
		return totalAmountPaid;
	}

	/**
	 * Total paid amount (in cents and always with 2 decimals)
	 */
	public void setTotalAmountPaid(Long value) {
		this.totalAmountPaid = value;
	}

	public Long getTotalAmountRefunded() {
		return totalAmountRefunded;
	}

	public void setTotalAmountRefunded(Long value) {
		this.totalAmountRefunded = value;
	}
}
