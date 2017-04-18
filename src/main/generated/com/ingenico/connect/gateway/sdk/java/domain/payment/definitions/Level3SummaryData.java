/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_Level3SummaryData">Level3SummaryData</a>
 *
 * @deprecated Use ShoppingCart instead
 */
@Deprecated
public class Level3SummaryData {

	private Long discountAmount = null;

	private Long dutyAmount = null;

	private Long shippingAmount = null;

	/**
	 * @deprecated Use ShoppingCart.discountAmount instead
	 */
	@Deprecated
	public Long getDiscountAmount() {
		return discountAmount;
	}

	/**
	 * @deprecated Use ShoppingCart.discountAmount instead
	 */
	@Deprecated
	public void setDiscountAmount(Long value) {
		this.discountAmount = value;
	}

	/**
	 * @deprecated Use ShoppingCart.dutyAmount instead
	 */
	@Deprecated
	public Long getDutyAmount() {
		return dutyAmount;
	}

	/**
	 * @deprecated Use ShoppingCart.dutyAmount instead
	 */
	@Deprecated
	public void setDutyAmount(Long value) {
		this.dutyAmount = value;
	}

	/**
	 * @deprecated Use ShoppingCart.shippingAmount instead
	 */
	@Deprecated
	public Long getShippingAmount() {
		return shippingAmount;
	}

	/**
	 * @deprecated Use ShoppingCart.shippingAmount instead
	 */
	@Deprecated
	public void setShippingAmount(Long value) {
		this.shippingAmount = value;
	}
}
