/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

public class RedirectPaymentMethodSpecificInput extends RedirectPaymentMethodSpecificInputBase {

	private Boolean isRecurring = null;

	private RedirectPaymentProduct809SpecificInput paymentProduct809SpecificInput = null;

	private RedirectPaymentProduct816SpecificInput paymentProduct816SpecificInput = null;

	private RedirectPaymentProduct882SpecificInput paymentProduct882SpecificInput = null;

	private String returnUrl = null;

	/**
	 * <ul><li>true
	 * <li>false
	 * </ul>
	 */
	public Boolean getIsRecurring() {
		return isRecurring;
	}

	/**
	 * <ul><li>true
	 * <li>false
	 * </ul>
	 */
	public void setIsRecurring(Boolean value) {
		this.isRecurring = value;
	}

	/**
	 * Object containing specific input required for Dutch iDeal payments (Payment product ID 809)
	 */
	public RedirectPaymentProduct809SpecificInput getPaymentProduct809SpecificInput() {
		return paymentProduct809SpecificInput;
	}

	/**
	 * Object containing specific input required for Dutch iDeal payments (Payment product ID 809)
	 */
	public void setPaymentProduct809SpecificInput(RedirectPaymentProduct809SpecificInput value) {
		this.paymentProduct809SpecificInput = value;
	}

	/**
	 * Object containing specific input required for German giropay payments (Payment product ID 816)
	 */
	public RedirectPaymentProduct816SpecificInput getPaymentProduct816SpecificInput() {
		return paymentProduct816SpecificInput;
	}

	/**
	 * Object containing specific input required for German giropay payments (Payment product ID 816)
	 */
	public void setPaymentProduct816SpecificInput(RedirectPaymentProduct816SpecificInput value) {
		this.paymentProduct816SpecificInput = value;
	}

	/**
	 * Object containing specific input required for Indian Net Banking payments (Payment product ID 882)
	 */
	public RedirectPaymentProduct882SpecificInput getPaymentProduct882SpecificInput() {
		return paymentProduct882SpecificInput;
	}

	/**
	 * Object containing specific input required for Indian Net Banking payments (Payment product ID 882)
	 */
	public void setPaymentProduct882SpecificInput(RedirectPaymentProduct882SpecificInput value) {
		this.paymentProduct882SpecificInput = value;
	}

	/**
	 * The URL that the consumer is redirect to after the payment flow has finished. You can add any number of key value pairs in the query string that, for instance help you to identify the consumer when they return to your site. Please note that we will also append some additional key value pairs that will also help you with this identification process.<br>
	 * Note: The provided URL should be absolute and contain the protocol to use, e.g. http:// or https://. For use on mobile devices a custom protocol can be used in the form of <i>protocol</i>://. This protocol must be registered on the device first.<br>
	 * URLs without a protocol will be rejected.
	 */
	public String getReturnUrl() {
		return returnUrl;
	}

	/**
	 * The URL that the consumer is redirect to after the payment flow has finished. You can add any number of key value pairs in the query string that, for instance help you to identify the consumer when they return to your site. Please note that we will also append some additional key value pairs that will also help you with this identification process.<br>
	 * Note: The provided URL should be absolute and contain the protocol to use, e.g. http:// or https://. For use on mobile devices a custom protocol can be used in the form of <i>protocol</i>://. This protocol must be registered on the device first.<br>
	 * URLs without a protocol will be rejected.
	 */
	public void setReturnUrl(String value) {
		this.returnUrl = value;
	}
}
