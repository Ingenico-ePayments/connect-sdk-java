/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

public class RedirectPaymentMethodSpecificInput extends AbstractRedirectPaymentMethodSpecificInput {

	private Boolean isRecurring = null;

	private RedirectPaymentProduct809SpecificInput paymentProduct809SpecificInput = null;

	private RedirectPaymentProduct816SpecificInput paymentProduct816SpecificInput = null;

	private RedirectPaymentProduct840SpecificInput paymentProduct840SpecificInput = null;

	private RedirectPaymentProduct861SpecificInput paymentProduct861SpecificInput = null;

	private RedirectPaymentProduct863SpecificInput paymentProduct863SpecificInput = null;

	private RedirectPaymentProduct882SpecificInput paymentProduct882SpecificInput = null;

	private RedirectionData redirectionData = null;

	private String returnUrl = null;

	/**
	 * <ul class="paragraph-width"><li>true
	 * <li>false
	 * </ul>
	 */
	public Boolean getIsRecurring() {
		return isRecurring;
	}

	/**
	 * <ul class="paragraph-width"><li>true
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
	 * Object containing specific input required for PayPal payments (Payment product ID 840)
	 */
	public RedirectPaymentProduct840SpecificInput getPaymentProduct840SpecificInput() {
		return paymentProduct840SpecificInput;
	}

	/**
	 * Object containing specific input required for PayPal payments (Payment product ID 840)
	 */
	public void setPaymentProduct840SpecificInput(RedirectPaymentProduct840SpecificInput value) {
		this.paymentProduct840SpecificInput = value;
	}

	/**
	 * Object containing specific input required for AliPay payments (Payment product ID 861)
	 */
	public RedirectPaymentProduct861SpecificInput getPaymentProduct861SpecificInput() {
		return paymentProduct861SpecificInput;
	}

	/**
	 * Object containing specific input required for AliPay payments (Payment product ID 861)
	 */
	public void setPaymentProduct861SpecificInput(RedirectPaymentProduct861SpecificInput value) {
		this.paymentProduct861SpecificInput = value;
	}

	/**
	 * Object containing specific input required for We Chat Pay payments (Payment product ID 863)
	 */
	public RedirectPaymentProduct863SpecificInput getPaymentProduct863SpecificInput() {
		return paymentProduct863SpecificInput;
	}

	/**
	 * Object containing specific input required for We Chat Pay payments (Payment product ID 863)
	 */
	public void setPaymentProduct863SpecificInput(RedirectPaymentProduct863SpecificInput value) {
		this.paymentProduct863SpecificInput = value;
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
	 * Object containing browser specific redirection related data
	 */
	public RedirectionData getRedirectionData() {
		return redirectionData;
	}

	/**
	 * Object containing browser specific redirection related data
	 */
	public void setRedirectionData(RedirectionData value) {
		this.redirectionData = value;
	}

	/**
	 * The URL that the customer is redirect to after the payment flow has finished. You can add any number of key value pairs in the query string that, for instance help you to identify the customer when they return to your site. Please note that we will also append some additional key value pairs that will also help you with this identification process.<br>
	 * Note: The provided URL should be absolute and contain the protocol to use, e.g. http:// or https://. For use on mobile devices a custom protocol can be used in the form of <i>protocol</i>://. This protocol must be registered on the device first.<br>
	 * URLs without a protocol will be rejected.
	 *
	 * @deprecated Use redirectionData.returnUrl instead
	 */
	@Deprecated
	public String getReturnUrl() {
		return returnUrl;
	}

	/**
	 * The URL that the customer is redirect to after the payment flow has finished. You can add any number of key value pairs in the query string that, for instance help you to identify the customer when they return to your site. Please note that we will also append some additional key value pairs that will also help you with this identification process.<br>
	 * Note: The provided URL should be absolute and contain the protocol to use, e.g. http:// or https://. For use on mobile devices a custom protocol can be used in the form of <i>protocol</i>://. This protocol must be registered on the device first.<br>
	 * URLs without a protocol will be rejected.
	 *
	 * @deprecated Use redirectionData.returnUrl instead
	 */
	@Deprecated
	public void setReturnUrl(String value) {
		this.returnUrl = value;
	}
}
