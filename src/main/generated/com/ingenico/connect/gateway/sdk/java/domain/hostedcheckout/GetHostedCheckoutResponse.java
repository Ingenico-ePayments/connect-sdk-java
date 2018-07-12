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
	 * <ul>
	 * <li>IN_PROGRESS - The checkout is still in progress and has not finished yet
	 * <li>PAYMENT_CREATED - A payment has been created
	 * <li>CANCELLED_BY_CONSUMER - If a consumer cancels the payment on the payment product detail page of the MyCheckout hosted payment pages, the status will change to IN_PROGRESS. Since we understand you want to be aware of a consumer cancelling the payment on the page we host for you, you can choose to get the status CANCELLED_BY_CONSUMER back instead of the status IN_PROGRESS. In order to get the status CANCELLED_BY_CONSUMER back, you need to have the <span class="property">returnCancelState</span> flag enabled in the <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/hostedcheckouts/create.html">Create hosted checkout</a> call
	 * </ul><br>
	 * Please see <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/statuses.html">Statuses</a> for a full overview of possible values.
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * This is the status of the hosted checkout. Possible values are:
	 * <ul>
	 * <li>IN_PROGRESS - The checkout is still in progress and has not finished yet
	 * <li>PAYMENT_CREATED - A payment has been created
	 * <li>CANCELLED_BY_CONSUMER - If a consumer cancels the payment on the payment product detail page of the MyCheckout hosted payment pages, the status will change to IN_PROGRESS. Since we understand you want to be aware of a consumer cancelling the payment on the page we host for you, you can choose to get the status CANCELLED_BY_CONSUMER back instead of the status IN_PROGRESS. In order to get the status CANCELLED_BY_CONSUMER back, you need to have the <span class="property">returnCancelState</span> flag enabled in the <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/hostedcheckouts/create.html">Create hosted checkout</a> call
	 * </ul><br>
	 * Please see <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/statuses.html">Statuses</a> for a full overview of possible values.
	 */
	public void setStatus(String value) {
		this.status = value;
	}
}
