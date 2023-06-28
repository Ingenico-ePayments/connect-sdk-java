/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.Card;

public class CardPaymentMethodSpecificInput extends AbstractCardPaymentMethodSpecificInput {

	private Card card = null;

	private ExternalCardholderAuthenticationData externalCardholderAuthenticationData = null;

	private Boolean isRecurring = null;

	private String merchantInitiatedReasonIndicator = null;

	private SchemeTokenData networkTokenData = null;

	private String returnUrl = null;

	private ThreeDSecure threeDSecure = null;

	/**
	 * Object containing card details. The card details will be ignored in case the property <span class="property">networkTokenData is present.</span>
	 */
	public Card getCard() {
		return card;
	}

	/**
	 * Object containing card details. The card details will be ignored in case the property <span class="property">networkTokenData is present.</span>
	 */
	public void setCard(Card value) {
		this.card = value;
	}

	/**
	 * Object containing 3D secure details.
	 *
	 * @deprecated Use threeDSecure.externalCardholderAuthenticationData instead
	 */
	@Deprecated
	public ExternalCardholderAuthenticationData getExternalCardholderAuthenticationData() {
		return externalCardholderAuthenticationData;
	}

	/**
	 * Object containing 3D secure details.
	 *
	 * @deprecated Use threeDSecure.externalCardholderAuthenticationData instead
	 */
	@Deprecated
	public void setExternalCardholderAuthenticationData(ExternalCardholderAuthenticationData value) {
		this.externalCardholderAuthenticationData = value;
	}

	/**
	 * Indicates if this transaction is of a one-off or a recurring type
	 * <ul class="paragraph-width"><li>true - This is recurring
	 * <li>false - This is one-off
	 * </ul>
	 */
	public Boolean getIsRecurring() {
		return isRecurring;
	}

	/**
	 * Indicates if this transaction is of a one-off or a recurring type
	 * <ul class="paragraph-width"><li>true - This is recurring
	 * <li>false - This is one-off
	 * </ul>
	 */
	public void setIsRecurring(Boolean value) {
		this.isRecurring = value;
	}

	/**
	 * Indicates reason behind the merchant initiated transaction. These are industry specific.<br>
	 * Possible values:
	 * <ul class="paragraph-width"><li>delayedCharges - Delayed charges are performed to process a supplemental account charge after original services have been rendered and respective payment has been processed. This is typically used in hotel, cruise lines and vehicle rental environments to perform a supplemental payment after the original services are rendered.</li>
	 * <li>noShow - Cardholders can use their cards to make a guaranteed reservation with certain merchant segments. A guaranteed reservation ensures that the reservation will be honored and allows a merchant to perform a No Show transaction to charge the cardholder a penalty according to the merchant’s cancellation policy. For merchants that accept token-based payment credentials to guarantee a reservation, it is necessary to perform a customer initiated (Account Verification) at the time of reservation to be able perform a No Show transaction later.</li></ul>
	 */
	public String getMerchantInitiatedReasonIndicator() {
		return merchantInitiatedReasonIndicator;
	}

	/**
	 * Indicates reason behind the merchant initiated transaction. These are industry specific.<br>
	 * Possible values:
	 * <ul class="paragraph-width"><li>delayedCharges - Delayed charges are performed to process a supplemental account charge after original services have been rendered and respective payment has been processed. This is typically used in hotel, cruise lines and vehicle rental environments to perform a supplemental payment after the original services are rendered.</li>
	 * <li>noShow - Cardholders can use their cards to make a guaranteed reservation with certain merchant segments. A guaranteed reservation ensures that the reservation will be honored and allows a merchant to perform a No Show transaction to charge the cardholder a penalty according to the merchant’s cancellation policy. For merchants that accept token-based payment credentials to guarantee a reservation, it is necessary to perform a customer initiated (Account Verification) at the time of reservation to be able perform a No Show transaction later.</li></ul>
	 */
	public void setMerchantInitiatedReasonIndicator(String value) {
		this.merchantInitiatedReasonIndicator = value;
	}

	/**
	 * Object holding data that describes a network token
	 */
	public SchemeTokenData getNetworkTokenData() {
		return networkTokenData;
	}

	/**
	 * Object holding data that describes a network token
	 */
	public void setNetworkTokenData(SchemeTokenData value) {
		this.networkTokenData = value;
	}

	/**
	 * The URL that the customer is redirect to after the payment flow has finished. You can add any number of key value pairs in the query string that, for instance help you to identify the customer when they return to your site. Please note that we will also append some additional key value pairs that will also help you with this identification process.<br>
	 * Note: The provided URL should be absolute and contain the protocol to use, e.g. http:// or https://. For use on mobile devices a custom protocol can be used in the form of <i>protocol</i>://. This protocol must be registered on the device first.<br>
	 * URLs without a protocol will be rejected.
	 *
	 * @deprecated Use threeDSecure.redirectionData.returnUrl instead
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
	 * @deprecated Use threeDSecure.redirectionData.returnUrl instead
	 */
	@Deprecated
	public void setReturnUrl(String value) {
		this.returnUrl = value;
	}

	/**
	 * Object containing specific data regarding 3-D Secure
	 */
	public ThreeDSecure getThreeDSecure() {
		return threeDSecure;
	}

	/**
	 * Object containing specific data regarding 3-D Secure
	 */
	public void setThreeDSecure(ThreeDSecure value) {
		this.threeDSecure = value;
	}
}
