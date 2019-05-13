/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

/**
 * Please find below specific input fields for payment product 840 (PayPal)
 */
public class RedirectPaymentProduct840SpecificInput extends AbstractRedirectPaymentProduct840SpecificInput {

	private String custom = null;

	private Boolean isShortcut = null;

	/**
	 * A free text string that you can send to PayPal. With a special agreement between PayPal and you, PayPal uses the data in that property, for custom services they offer to you.
	 *
	 * @deprecated Use Order.references.descriptor instead
	 */
	@Deprecated
	public String getCustom() {
		return custom;
	}

	/**
	 * A free text string that you can send to PayPal. With a special agreement between PayPal and you, PayPal uses the data in that property, for custom services they offer to you.
	 *
	 * @deprecated Use Order.references.descriptor instead
	 */
	@Deprecated
	public void setCustom(String value) {
		this.custom = value;
	}

	/**
	 * <div class="deprecated-wrapper depends-wrapper">Deprecated: If your PayPal payments are processed by Ingenico's Ogone Payment Platform, please use the property addressSelectionAtPayPal instead.</div><br>Indicates whether to use PayPal Express Checkout for payments processed by Ingenico's GlobalCollect Payment Platform. <ul class="paragraph-width"><li>true = PayPal Express Checkout <li>false = Regular PayPal payment </ul>
	 * For payments processed by Ingenico's Ogone Payment Platform, please see the addressSelectionAtPayPal property for more information.
	 */
	public Boolean getIsShortcut() {
		return isShortcut;
	}

	/**
	 * <div class="deprecated-wrapper depends-wrapper">Deprecated: If your PayPal payments are processed by Ingenico's Ogone Payment Platform, please use the property addressSelectionAtPayPal instead.</div><br>Indicates whether to use PayPal Express Checkout for payments processed by Ingenico's GlobalCollect Payment Platform. <ul class="paragraph-width"><li>true = PayPal Express Checkout <li>false = Regular PayPal payment </ul>
	 * For payments processed by Ingenico's Ogone Payment Platform, please see the addressSelectionAtPayPal property for more information.
	 */
	public void setIsShortcut(Boolean value) {
		this.isShortcut = value;
	}
}
