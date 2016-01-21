package com.globalcollect.gateway.sdk.java.gc.payment.definitions;


public class Level3SummaryData {

	private Long discountAmount = null;

	private Long dutyAmount = null;

	private Long shippingAmount = null;

	public Long getDiscountAmount() {
		return discountAmount;
	}

	public void setDiscountAmount(Long value) {
		this.discountAmount = value;
	}

	public Long getDutyAmount() {
		return dutyAmount;
	}

	public void setDutyAmount(Long value) {
		this.dutyAmount = value;
	}

	public Long getShippingAmount() {
		return shippingAmount;
	}

	public void setShippingAmount(Long value) {
		this.shippingAmount = value;
	}
}
