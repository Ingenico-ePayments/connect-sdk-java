/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.product.definitions;

public class PaymentProductField {

	private PaymentProductFieldDataRestrictions dataRestrictions = null;

	private PaymentProductFieldDisplayHints displayHints = null;

	private String id = null;

	private String type = null;

	/**
	 * Object containing data restrictions that apply to this field, like minimum and/or maximum length
	 */
	public PaymentProductFieldDataRestrictions getDataRestrictions() {
		return dataRestrictions;
	}

	/**
	 * Object containing data restrictions that apply to this field, like minimum and/or maximum length
	 */
	public void setDataRestrictions(PaymentProductFieldDataRestrictions value) {
		this.dataRestrictions = value;
	}

	/**
	 * Object containing display hints for this field, like the order, mask, preferred keyboard
	 */
	public PaymentProductFieldDisplayHints getDisplayHints() {
		return displayHints;
	}

	/**
	 * Object containing display hints for this field, like the order, mask, preferred keyboard
	 */
	public void setDisplayHints(PaymentProductFieldDisplayHints value) {
		this.displayHints = value;
	}

	/**
	 * The ID of the field
	 */
	public String getId() {
		return id;
	}

	/**
	 * The ID of the field
	 */
	public void setId(String value) {
		this.id = value;
	}

	/**
	 * The type of field, possible values are:
	 * <ul>
	 * <li>string - Any UTF-8 chracter
	 * <li>numericstring - A string that consisting only of numbers. Note that you should strip out anything that is not a digit, but leading zeros are allowed
	 * <li>date - Date in the format DDMMYYYY
	 * <li>expirydate - Expiration date in the format MMYY
	 * <li>integer - An integer
	 * </ul>
	 */
	public String getType() {
		return type;
	}

	/**
	 * The type of field, possible values are:
	 * <ul>
	 * <li>string - Any UTF-8 chracter
	 * <li>numericstring - A string that consisting only of numbers. Note that you should strip out anything that is not a digit, but leading zeros are allowed
	 * <li>date - Date in the format DDMMYYYY
	 * <li>expirydate - Expiration date in the format MMYY
	 * <li>integer - An integer
	 * </ul>
	 */
	public void setType(String value) {
		this.type = value;
	}
}
