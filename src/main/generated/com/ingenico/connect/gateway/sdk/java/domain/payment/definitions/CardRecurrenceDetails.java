/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */

package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

public class CardRecurrenceDetails {

	private String endDate = null;

	private Integer minFrequency = null;

	private String recurringPaymentSequenceIndicator = null;

	/**
	 * Date in YYYYMMDD after which there will be no further charges. If no value is provided we will set a default value of five years after we processed the first recurring transaction.
	 */
	public String getEndDate() {
		return endDate;
	}

	/**
	 * Date in YYYYMMDD after which there will be no further charges. If no value is provided we will set a default value of five years after we processed the first recurring transaction.
	 */
	public void setEndDate(String value) {
		this.endDate = value;
	}

	/**
	 * Minimum number of days between authorizations. If no value is provided we will set a default value of 30 days.
	 */
	public Integer getMinFrequency() {
		return minFrequency;
	}

	/**
	 * Minimum number of days between authorizations. If no value is provided we will set a default value of 30 days.
	 */
	public void setMinFrequency(Integer value) {
		this.minFrequency = value;
	}

	/**
	 * <ul class="paragraph-width"><li>first = This transaction is the first of a series of recurring transactions</li>
	 * <li>recurring = This transaction is a subsequent transaction in a series of recurring transactions</li>
	 * <li>last = This transaction is the last of a series of recurring transactions for payments that are processed by the WL Online Payment Acceptance platform</li>
	 * </ul><br>
	 * Note: For any first of a recurring the system will automatically create a token as you will need to use a token for any subsequent recurring transactions. In case a token already exists this is indicated in the response with a value of False for the isNewToken property in the response.
	 */
	public String getRecurringPaymentSequenceIndicator() {
		return recurringPaymentSequenceIndicator;
	}

	/**
	 * <ul class="paragraph-width"><li>first = This transaction is the first of a series of recurring transactions</li>
	 * <li>recurring = This transaction is a subsequent transaction in a series of recurring transactions</li>
	 * <li>last = This transaction is the last of a series of recurring transactions for payments that are processed by the WL Online Payment Acceptance platform</li>
	 * </ul><br>
	 * Note: For any first of a recurring the system will automatically create a token as you will need to use a token for any subsequent recurring transactions. In case a token already exists this is indicated in the response with a value of False for the isNewToken property in the response.
	 */
	public void setRecurringPaymentSequenceIndicator(String value) {
		this.recurringPaymentSequenceIndicator = value;
	}
}
