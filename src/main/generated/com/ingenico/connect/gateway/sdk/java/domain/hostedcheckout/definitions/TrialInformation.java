/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */

package com.ingenico.connect.gateway.sdk.java.domain.hostedcheckout.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.AmountOfMoney;

/**
 * The object containing data of the trial period: no-cost or discounted time-constrained trial subscription period.
 */
public class TrialInformation {

	private AmountOfMoney amountOfMoneyAfterTrial = null;

	private String endDate = null;

	private Boolean isRecurring = null;

	private TrialPeriod trialPeriod = null;

	private Frequency trialPeriodRecurring = null;

	/**
	 * The object containing the amount and ISO currency code attributes of money to be paid after the trial period ends.<br><br>Note:<br><br>The property order.amountOfMoney should be populated with the amount to be paid during or for the trial period (no-cost or discounted time-constrained trial subscription period).
	 */
	public AmountOfMoney getAmountOfMoneyAfterTrial() {
		return amountOfMoneyAfterTrial;
	}

	/**
	 * The object containing the amount and ISO currency code attributes of money to be paid after the trial period ends.<br><br>Note:<br><br>The property order.amountOfMoney should be populated with the amount to be paid during or for the trial period (no-cost or discounted time-constrained trial subscription period).
	 */
	public void setAmountOfMoneyAfterTrial(AmountOfMoney value) {
		this.amountOfMoneyAfterTrial = value;
	}

	/**
	 * The date that the trial period ends in YYYYMMDD format.
	 */
	public String getEndDate() {
		return endDate;
	}

	/**
	 * The date that the trial period ends in YYYYMMDD format.
	 */
	public void setEndDate(String value) {
		this.endDate = value;
	}

	/**
	 * The property specifying if there will be recurring charges throughout the trial period (when the trial period involves a temporary discounted rate).<br>True = there will be recurring charges during the trial period<br>False = there will not be recurring charges during the trial period
	 */
	public Boolean getIsRecurring() {
		return isRecurring;
	}

	/**
	 * The property specifying if there will be recurring charges throughout the trial period (when the trial period involves a temporary discounted rate).<br>True = there will be recurring charges during the trial period<br>False = there will not be recurring charges during the trial period
	 */
	public void setIsRecurring(Boolean value) {
		this.isRecurring = value;
	}

	/**
	 * The object containing information on the trial period duration and the interval between payments during that period.
	 */
	public TrialPeriod getTrialPeriod() {
		return trialPeriod;
	}

	/**
	 * The object containing information on the trial period duration and the interval between payments during that period.
	 */
	public void setTrialPeriod(TrialPeriod value) {
		this.trialPeriod = value;
	}

	/**
	 * The object containing the frequency and interval between recurring payments.<br><br>Note:<br><br>This object should only be populated if the frequency of recurring payments between the trial and regular periods is different.<br><br>If you do not populated this object, then the same interval frequency and interval of recurringPaymentsData.recurringInterval will be used
	 */
	public Frequency getTrialPeriodRecurring() {
		return trialPeriodRecurring;
	}

	/**
	 * The object containing the frequency and interval between recurring payments.<br><br>Note:<br><br>This object should only be populated if the frequency of recurring payments between the trial and regular periods is different.<br><br>If you do not populated this object, then the same interval frequency and interval of recurringPaymentsData.recurringInterval will be used
	 */
	public void setTrialPeriodRecurring(Frequency value) {
		this.trialPeriodRecurring = value;
	}
}
