/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.hostedcheckout;

import com.ingenico.connect.gateway.sdk.java.domain.hostedcheckout.definitions.CreatedPaymentOutput;

public class GetHostedCheckoutResponse {

	private CreatedPaymentOutput createdPaymentOutput = null;

	private String status = null;

	/**
	 * When a payment has been created during the hosted checkout session this object will return the details.
	 */
	public CreatedPaymentOutput getCreatedPaymentOutput() {
		return createdPaymentOutput;
	}

	/**
	 * When a payment has been created during the hosted checkout session this object will return the details.
	 */
	public void setCreatedPaymentOutput(CreatedPaymentOutput value) {
		this.createdPaymentOutput = value;
	}

	/**
	 * This is the status of the hosted checkout. Possible values are:
	 * <ul class="paragraph-width">
	 * <li>IN_PROGRESS - The checkout is still in progress and has not finished yet
	 * <li>PAYMENT_CREATED - A payment has been created
	 * <li>CANCELLED_BY_CONSUMER - If a consumer cancels the payment on the payment product detail page of the MyCheckout hosted payment pages, the status will change to IN_PROGRESS. Since we understand you want to be aware of a consumer cancelling the payment on the page we host for you, you can choose to receive the status CANCELLED_BY_CONSUMER instead of the status IN_PROGRESS. In order to receive the status CANCELLED_BY_CONSUMER, you need to have the <span class="property">returnCancelState</span> flag enabled in the <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/hostedcheckouts/create.html">Create hosted checkout</a> call.
	 * <li>CLIENT_NOT_ELIGIBLE_FOR_SELECTED_PAYMENT_PRODUCT - With some payment products it might occur that the device of the user is not capable to complete the payment. If the Hosted Checkout Session was restricted to a single project that is not compatible to the user's device you will receive this Hosted Checkout status. This scenario applies to: Google Pay (Payment Product ID: 320).</ul><br>
	 * Please see <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/statuses.html">Statuses</a> for a full overview of possible values.
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * This is the status of the hosted checkout. Possible values are:
	 * <ul class="paragraph-width">
	 * <li>IN_PROGRESS - The checkout is still in progress and has not finished yet
	 * <li>PAYMENT_CREATED - A payment has been created
	 * <li>CANCELLED_BY_CONSUMER - If a consumer cancels the payment on the payment product detail page of the MyCheckout hosted payment pages, the status will change to IN_PROGRESS. Since we understand you want to be aware of a consumer cancelling the payment on the page we host for you, you can choose to receive the status CANCELLED_BY_CONSUMER instead of the status IN_PROGRESS. In order to receive the status CANCELLED_BY_CONSUMER, you need to have the <span class="property">returnCancelState</span> flag enabled in the <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/hostedcheckouts/create.html">Create hosted checkout</a> call.
	 * <li>CLIENT_NOT_ELIGIBLE_FOR_SELECTED_PAYMENT_PRODUCT - With some payment products it might occur that the device of the user is not capable to complete the payment. If the Hosted Checkout Session was restricted to a single project that is not compatible to the user's device you will receive this Hosted Checkout status. This scenario applies to: Google Pay (Payment Product ID: 320).</ul><br>
	 * Please see <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/statuses.html">Statuses</a> for a full overview of possible values.
	 */
	public void setStatus(String value) {
		this.status = value;
	}
}
