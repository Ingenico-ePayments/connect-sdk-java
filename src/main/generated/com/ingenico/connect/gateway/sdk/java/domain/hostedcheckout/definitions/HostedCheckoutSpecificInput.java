/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.hostedcheckout.definitions;

public class HostedCheckoutSpecificInput {

	private Boolean isRecurring = null;

	private String locale = null;

	private PaymentProductFiltersHostedCheckout paymentProductFilters = null;

	private Boolean returnCancelState = null;

	private String returnUrl = null;

	private Boolean showResultPage = null;

	private String tokens = null;

	private Boolean validateShoppingCart = null;

	private String variant = null;

	/**
	 * <ul class="paragraph-width"><li>true - Only payment products that support recurring payments will be shown. Any transactions created will also be tagged as being a first of a recurring sequence.
	 * <li>false - Only payment products that support one-off payments will be shown.
	 * </ul>
	 * The default value for this field is false.
	 */
	public Boolean getIsRecurring() {
		return isRecurring;
	}

	/**
	 * <ul class="paragraph-width"><li>true - Only payment products that support recurring payments will be shown. Any transactions created will also be tagged as being a first of a recurring sequence.
	 * <li>false - Only payment products that support one-off payments will be shown.
	 * </ul>
	 * The default value for this field is false.
	 */
	public void setIsRecurring(Boolean value) {
		this.isRecurring = value;
	}

	/**
	 * Locale to use to present the MyCheckout payment pages to the consumer. Please make sure that a language pack is configured for the locale you are submitting. If you submit a locale that is not setup on your account we will use the default language pack for your account. You can easily upload additional language packs and set the default language pack in the Configuration Center.
	 */
	public String getLocale() {
		return locale;
	}

	/**
	 * Locale to use to present the MyCheckout payment pages to the consumer. Please make sure that a language pack is configured for the locale you are submitting. If you submit a locale that is not setup on your account we will use the default language pack for your account. You can easily upload additional language packs and set the default language pack in the Configuration Center.
	 */
	public void setLocale(String value) {
		this.locale = value;
	}

	/**
	 * Contains the payment product ids and payment product groups that will be used for manipulating the payment products available for the payment to the consumer.
	 */
	public PaymentProductFiltersHostedCheckout getPaymentProductFilters() {
		return paymentProductFilters;
	}

	/**
	 * Contains the payment product ids and payment product groups that will be used for manipulating the payment products available for the payment to the consumer.
	 */
	public void setPaymentProductFilters(PaymentProductFiltersHostedCheckout value) {
		this.paymentProductFilters = value;
	}

	/**
	 * This flag affects the status of a Hosted Checkout when a consumer presses the cancel button and is returned to you as a result.<br>If set to true, then the status will be CANCELLED_BY_CONSUMER. If set to false, then the status will be IN_PROGRESS.<br>The default value is false. This flag was added to introduce the additional CANCELLED_BY_CONSUMER state as a non-breaking change.
	 */
	public Boolean getReturnCancelState() {
		return returnCancelState;
	}

	/**
	 * This flag affects the status of a Hosted Checkout when a consumer presses the cancel button and is returned to you as a result.<br>If set to true, then the status will be CANCELLED_BY_CONSUMER. If set to false, then the status will be IN_PROGRESS.<br>The default value is false. This flag was added to introduce the additional CANCELLED_BY_CONSUMER state as a non-breaking change.
	 */
	public void setReturnCancelState(Boolean value) {
		this.returnCancelState = value;
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

	/**
	 * <ul class="paragraph-width"><li>true - MyCheckout will show a result page to the consumer when applicable. Default.
	 * <li>false - MyCheckout will redirect the consumer back to the provided returnUrl when this is possible.
	 * </ul>
	 * The default value for this field is true.
	 */
	public Boolean getShowResultPage() {
		return showResultPage;
	}

	/**
	 * <ul class="paragraph-width"><li>true - MyCheckout will show a result page to the consumer when applicable. Default.
	 * <li>false - MyCheckout will redirect the consumer back to the provided returnUrl when this is possible.
	 * </ul>
	 * The default value for this field is true.
	 */
	public void setShowResultPage(Boolean value) {
		this.showResultPage = value;
	}

	/**
	 * String containing comma separated tokens (no spaces) associated with the consumer of this hosted checkout. Valid tokens will be used to present the consumer the option to re-use previously used payment details. This means the consumer for instance does not have to re-enter their card details again, which a big plus when the consumer is using his/her mobile phone to complete the checkout.
	 */
	public String getTokens() {
		return tokens;
	}

	/**
	 * String containing comma separated tokens (no spaces) associated with the consumer of this hosted checkout. Valid tokens will be used to present the consumer the option to re-use previously used payment details. This means the consumer for instance does not have to re-enter their card details again, which a big plus when the consumer is using his/her mobile phone to complete the checkout.
	 */
	public void setTokens(String value) {
		this.tokens = value;
	}

	/**
	 * By default, validation is done for all the information required to display the shopping cart. Set this value to false if you would like to turn that feature off for the Ogone Payment Platform, in which case the rendering of the shopping cart will be skipped if any required information is missing. By default the value is true.<br>
	 * Note: This field is only supported by the Ogone Payment Platform.
	 */
	public Boolean getValidateShoppingCart() {
		return validateShoppingCart;
	}

	/**
	 * By default, validation is done for all the information required to display the shopping cart. Set this value to false if you would like to turn that feature off for the Ogone Payment Platform, in which case the rendering of the shopping cart will be skipped if any required information is missing. By default the value is true.<br>
	 * Note: This field is only supported by the Ogone Payment Platform.
	 */
	public void setValidateShoppingCart(Boolean value) {
		this.validateShoppingCart = value;
	}

	/**
	 * Using the Configuration Center it is possible to create multiple variations of your MyCheckout payment pages. By specifying a specific variant you can force the use of another variant then the default. This allows you to test out the effect of certain changes to your MyCheckout payment pages in a controlled manner. Please note that you need to specify the ID of the variant.
	 */
	public String getVariant() {
		return variant;
	}

	/**
	 * Using the Configuration Center it is possible to create multiple variations of your MyCheckout payment pages. By specifying a specific variant you can force the use of another variant then the default. This allows you to test out the effect of certain changes to your MyCheckout payment pages in a controlled manner. Please note that you need to specify the ID of the variant.
	 */
	public void setVariant(String value) {
		this.variant = value;
	}
}
