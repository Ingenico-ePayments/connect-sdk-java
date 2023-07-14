/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */

package com.ingenico.connect.gateway.sdk.java.domain.product.definitions;

public class PaymentProductFieldTooltip {

	private String image = null;

	private String label = null;

	/**
	 * Relative URL that can be used to retrieve an image for the tooltip image. You can use our server-side resize functionality by appending '?size={{width}}x{{height}}' to the full URL, where width and height are specified in pixels. The resized image will always keep its correct aspect ratio.
	 */
	public String getImage() {
		return image;
	}

	/**
	 * Relative URL that can be used to retrieve an image for the tooltip image. You can use our server-side resize functionality by appending '?size={{width}}x{{height}}' to the full URL, where width and height are specified in pixels. The resized image will always keep its correct aspect ratio.
	 */
	public void setImage(String value) {
		this.image = value;
	}

	/**
	 * A text explaining the field in more detail. This is meant to be used for displaying to the customer.
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * A text explaining the field in more detail. This is meant to be used for displaying to the customer.
	 */
	public void setLabel(String value) {
		this.label = value;
	}
}
