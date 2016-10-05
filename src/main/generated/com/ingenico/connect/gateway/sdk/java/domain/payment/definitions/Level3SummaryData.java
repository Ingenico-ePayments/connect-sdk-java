/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;


/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_Level3SummaryData">Level3SummaryData</a>
 */
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
