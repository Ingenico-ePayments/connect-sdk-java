/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/
 */

package com.ingenico.connect.gateway.sdk.java.domain.hostedcheckout.definitions;

/**
 * The object containing reference data for the text that can be displayed on MyCheckout hosted payment page with subscription information.<br><br>Note:<br><br>The data in this object is only meant for displaying recurring payments-related data on your checkout page.<br>You still need to submit all the recurring payment-related data in the corresponding payment product-specific input. (example: cardPaymentMethodSpecificInput.recurring and cardPaymentMethodSpecificInput.isRecurring)
 */
public class RecurringPaymentsData {

	private Frequency recurringInterval = null;

	private TrialInformation trialInformation = null;

	/**
	 * The object containing the frequency and interval between recurring payments.
	 */
	public Frequency getRecurringInterval() {
		return recurringInterval;
	}

	/**
	 * The object containing the frequency and interval between recurring payments.
	 */
	public void setRecurringInterval(Frequency value) {
		this.recurringInterval = value;
	}

	/**
	 * The object containing data of the trial period: no-cost or discounted time-constrained trial subscription period. 
	 */
	public TrialInformation getTrialInformation() {
		return trialInformation;
	}

	/**
	 * The object containing data of the trial period: no-cost or discounted time-constrained trial subscription period. 
	 */
	public void setTrialInformation(TrialInformation value) {
		this.trialInformation = value;
	}
}
