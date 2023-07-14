/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */

package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

public class LineItemLevel3InterchangeInformation {

	private Long discountAmount = null;

	private Long lineAmountTotal = null;

	private String productCode = null;

	private Long productPrice = null;

	private String productType = null;

	private Long quantity = null;

	private Long taxAmount = null;

	private String unit = null;

	/**
	 * Discount on the line item, with the last two digits are implied decimal places
	 */
	public Long getDiscountAmount() {
		return discountAmount;
	}

	/**
	 * Discount on the line item, with the last two digits are implied decimal places
	 */
	public void setDiscountAmount(Long value) {
		this.discountAmount = value;
	}

	/**
	 * Total amount for the line item
	 */
	public Long getLineAmountTotal() {
		return lineAmountTotal;
	}

	/**
	 * Total amount for the line item
	 */
	public void setLineAmountTotal(Long value) {
		this.lineAmountTotal = value;
	}

	/**
	 * Product or UPC Code, left justified<br>
	 * Note: Must not be all spaces or all zeros
	 */
	public String getProductCode() {
		return productCode;
	}

	/**
	 * Product or UPC Code, left justified<br>
	 * Note: Must not be all spaces or all zeros
	 */
	public void setProductCode(String value) {
		this.productCode = value;
	}

	/**
	 * The price of one unit of the product, the value should be zero or greater
	 */
	public Long getProductPrice() {
		return productPrice;
	}

	/**
	 * The price of one unit of the product, the value should be zero or greater
	 */
	public void setProductPrice(Long value) {
		this.productPrice = value;
	}

	/**
	 * Code used to classify items that are purchased<br>
	 * Note: Must not be all spaces or all zeros
	 */
	public String getProductType() {
		return productType;
	}

	/**
	 * Code used to classify items that are purchased<br>
	 * Note: Must not be all spaces or all zeros
	 */
	public void setProductType(String value) {
		this.productType = value;
	}

	/**
	 * Quantity of the units being purchased, should be greater than zero<br>
	 * Note: Must not be all spaces or all zeros
	 */
	public Long getQuantity() {
		return quantity;
	}

	/**
	 * Quantity of the units being purchased, should be greater than zero<br>
	 * Note: Must not be all spaces or all zeros
	 */
	public void setQuantity(Long value) {
		this.quantity = value;
	}

	/**
	 * Tax on the line item, with the last two digits are implied decimal places
	 */
	public Long getTaxAmount() {
		return taxAmount;
	}

	/**
	 * Tax on the line item, with the last two digits are implied decimal places
	 */
	public void setTaxAmount(Long value) {
		this.taxAmount = value;
	}

	/**
	 * Indicates the line item unit of measure; for example: each, kit, pair, gallon, month, etc.
	 */
	public String getUnit() {
		return unit;
	}

	/**
	 * Indicates the line item unit of measure; for example: each, kit, pair, gallon, month, etc.
	 */
	public void setUnit(String value) {
		this.unit = value;
	}
}
