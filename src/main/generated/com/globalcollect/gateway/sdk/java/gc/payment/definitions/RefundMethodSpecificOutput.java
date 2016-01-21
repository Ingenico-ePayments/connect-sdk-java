package com.globalcollect.gateway.sdk.java.gc.payment.definitions;


public class RefundMethodSpecificOutput {

	private Long totalAmountPaid = null;

	private Long totalAmountRefunded = null;

	public Long getTotalAmountPaid() {
		return totalAmountPaid;
	}

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
