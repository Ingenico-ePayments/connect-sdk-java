/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

/**
 * Please find below specific input fields for payment product 840 (PayPal)
 */
public class RedirectPaymentProduct840SpecificInput {

	private String custom = null;

	private Boolean isShortcut = null;

	/**
	 * A free text string that you can send to PayPal. With a special agreement between PayPal and you, PayPal uses the data in that field, for custom services they offer to you.
	 *
	 * @deprecated use order.references.descriptor instead.
	 */
	@Deprecated
	public String getCustom() {
		return custom;
	}

	/**
	 * A free text string that you can send to PayPal. With a special agreement between PayPal and you, PayPal uses the data in that field, for custom services they offer to you.
	 *
	 * @deprecated use order.references.descriptor instead.
	 */
	@Deprecated
	public void setCustom(String value) {
		this.custom = value;
	}

	/**
	 * Indicates whether to use PayPal Express Checkout. <ul><li>true = PayPal Express Checkout <li>false = Regular PayPal payment </ul>
	 */
	public Boolean getIsShortcut() {
		return isShortcut;
	}

	/**
	 * Indicates whether to use PayPal Express Checkout. <ul><li>true = PayPal Express Checkout <li>false = Regular PayPal payment </ul>
	 */
	public void setIsShortcut(Boolean value) {
		this.isShortcut = value;
	}
}
