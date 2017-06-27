/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

/**
 * @deprecated Use Order.shoppingCart instead
 */
@Deprecated
public class Level3SummaryData {

	private Long discountAmount = null;

	private Long dutyAmount = null;

	private Long shippingAmount = null;

	/**
	 * Discount on the entire transaction, with the last 2 digits are implied decimal places
	 *
	 * @deprecated Use ShoppingCart.amountbreakdown with type DISCOUNT instead
	 */
	@Deprecated
	public Long getDiscountAmount() {
		return discountAmount;
	}

	/**
	 * Discount on the entire transaction, with the last 2 digits are implied decimal places
	 *
	 * @deprecated Use ShoppingCart.amountbreakdown with type DISCOUNT instead
	 */
	@Deprecated
	public void setDiscountAmount(Long value) {
		this.discountAmount = value;
	}

	/**
	 * Duty on the entire transaction, with the last 2 digits are implied decimal places
	 *
	 * @deprecated Use ShoppingCart.amountbreakdown with type DUTY instead
	 */
	@Deprecated
	public Long getDutyAmount() {
		return dutyAmount;
	}

	/**
	 * Duty on the entire transaction, with the last 2 digits are implied decimal places
	 *
	 * @deprecated Use ShoppingCart.amountbreakdown with type DUTY instead
	 */
	@Deprecated
	public void setDutyAmount(Long value) {
		this.dutyAmount = value;
	}

	/**
	 * Shippingcost on the entire transaction, with the last 2 digits are implied decimal places
	 *
	 * @deprecated Use ShoppingCart.amountbreakdown with type SHIPPING instead
	 */
	@Deprecated
	public Long getShippingAmount() {
		return shippingAmount;
	}

	/**
	 * Shippingcost on the entire transaction, with the last 2 digits are implied decimal places
	 *
	 * @deprecated Use ShoppingCart.amountbreakdown with type SHIPPING instead
	 */
	@Deprecated
	public void setShippingAmount(Long value) {
		this.shippingAmount = value;
	}
}
