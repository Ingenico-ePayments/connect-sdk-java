/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;


/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_LineItemLevel3InterchangeInformation">LineItemLevel3InterchangeInformation</a>
 */
public class LineItemLevel3InterchangeInformation {

	private Long discountAmount = null;

	private Long lineAmountTotal = null;

	private String productCode = null;

	private Long productPrice = null;

	private String productType = null;

	private Long quantity = null;

	private Long taxAmount = null;

	private String unit = null;

	public Long getDiscountAmount() {
		return discountAmount;
	}

	public void setDiscountAmount(Long value) {
		this.discountAmount = value;
	}

	public Long getLineAmountTotal() {
		return lineAmountTotal;
	}

	public void setLineAmountTotal(Long value) {
		this.lineAmountTotal = value;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String value) {
		this.productCode = value;
	}

	public Long getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(Long value) {
		this.productPrice = value;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String value) {
		this.productType = value;
	}

	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long value) {
		this.quantity = value;
	}

	public Long getTaxAmount() {
		return taxAmount;
	}

	public void setTaxAmount(Long value) {
		this.taxAmount = value;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String value) {
		this.unit = value;
	}
}
