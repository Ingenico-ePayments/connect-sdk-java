/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/
 */

package com.ingenico.connect.gateway.sdk.java.domain.installments.definitions;

/**
 * Object containing information for the client on how best to display this options
 */
public class InstallmentDisplayHints {

	private Integer displayOrder = null;

	private String label = null;

	private String logo = null;

	/**
	 * Determines the order in which the installment options should be shown (sorted ascending). In countries like Turkey there are multiple loyalty programs that offer installments
	 */
	public Integer getDisplayOrder() {
		return displayOrder;
	}

	/**
	 * Determines the order in which the installment options should be shown (sorted ascending). In countries like Turkey there are multiple loyalty programs that offer installments
	 */
	public void setDisplayOrder(Integer value) {
		this.displayOrder = value;
	}

	/**
	 * Name of the installment option
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * Name of the installment option
	 */
	public void setLabel(String value) {
		this.label = value;
	}

	/**
	 * Partial URL that you can reference for the image of this installment provider. You can use our server-side resize functionality by appending '?size={{width}}x{{height}}' to the full URL, where width and height are specified in pixels. The resized image will always keep its correct aspect ratio.
	 */
	public String getLogo() {
		return logo;
	}

	/**
	 * Partial URL that you can reference for the image of this installment provider. You can use our server-side resize functionality by appending '?size={{width}}x{{height}}' to the full URL, where width and height are specified in pixels. The resized image will always keep its correct aspect ratio.
	 */
	public void setLogo(String value) {
		this.logo = value;
	}
}
