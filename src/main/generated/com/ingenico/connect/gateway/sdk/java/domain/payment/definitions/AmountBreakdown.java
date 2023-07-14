/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */

package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

public class AmountBreakdown {

	private Long amount = null;

	private String type = null;

	/**
	 * Amount in cents and always having 2 decimals
	 */
	public Long getAmount() {
		return amount;
	}

	/**
	 * Amount in cents and always having 2 decimals
	 */
	public void setAmount(Long value) {
		this.amount = value;
	}

	/**
	 * Type of the amount. Each type is only allowed to be provided once. Allowed values:
	 * <ul class="paragraph-width">
	 * <li>AIRPORT_TAX - The amount of tax paid for the airport, with the last 2 digits implied as decimal places.</li>
	 * <li>CONSUMPTION_TAX - The amount of consumption tax paid by the customer, with the last 2 digits implied as decimal places.</li>
	 * <li>DISCOUNT - Discount on the entire transaction, with the last 2 digits implied as decimal places.</li>
	 * <li>DUTY - Duty on the entire transaction, with the last 2 digits implied as decimal places.</li>
	 * <li>HANDLING - Handling cost on the entire transaction, with the last 2 digits implied as decimal places.</li>
	 * <li>SHIPPING - Shipping cost on the entire transaction, with the last 2 digits implied as decimal places.</li>
	 * <li>TAX - Total tax paid on the entire transaction, with the last 2 digits implied as decimal places.</li>
	 * <li>VAT - Total amount of VAT paid on the transaction, with the last 2 digits implied as decimal places.</li>
	 * <li>BASE_AMOUNT - Order amount excluding all taxes, discount &amp; shipping costs, with the last 2 digits implied as decimal places.
	 * Note: BASE_AMOUNT is only supported by the GlobalCollect and Ogone Payment Platforms.</li>
	 * </ul>
	 */
	public String getType() {
		return type;
	}

	/**
	 * Type of the amount. Each type is only allowed to be provided once. Allowed values:
	 * <ul class="paragraph-width">
	 * <li>AIRPORT_TAX - The amount of tax paid for the airport, with the last 2 digits implied as decimal places.</li>
	 * <li>CONSUMPTION_TAX - The amount of consumption tax paid by the customer, with the last 2 digits implied as decimal places.</li>
	 * <li>DISCOUNT - Discount on the entire transaction, with the last 2 digits implied as decimal places.</li>
	 * <li>DUTY - Duty on the entire transaction, with the last 2 digits implied as decimal places.</li>
	 * <li>HANDLING - Handling cost on the entire transaction, with the last 2 digits implied as decimal places.</li>
	 * <li>SHIPPING - Shipping cost on the entire transaction, with the last 2 digits implied as decimal places.</li>
	 * <li>TAX - Total tax paid on the entire transaction, with the last 2 digits implied as decimal places.</li>
	 * <li>VAT - Total amount of VAT paid on the transaction, with the last 2 digits implied as decimal places.</li>
	 * <li>BASE_AMOUNT - Order amount excluding all taxes, discount &amp; shipping costs, with the last 2 digits implied as decimal places.
	 * Note: BASE_AMOUNT is only supported by the GlobalCollect and Ogone Payment Platforms.</li>
	 * </ul>
	 */
	public void setType(String value) {
		this.type = value;
	}
}
