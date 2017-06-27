/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.AmountOfMoney;

public class LineItem {

	private AmountOfMoney amountOfMoney = null;

	private LineItemInvoiceData invoiceData = null;

	private LineItemLevel3InterchangeInformation level3InterchangeInformation = null;

	private OrderLineDetails orderLineDetails = null;

	/**
	 * Object containing amount and ISO currency code attributes<br>
	 * Note: make sure you submit the amount and currency code for each line item
	 */
	public AmountOfMoney getAmountOfMoney() {
		return amountOfMoney;
	}

	/**
	 * Object containing amount and ISO currency code attributes<br>
	 * Note: make sure you submit the amount and currency code for each line item
	 */
	public void setAmountOfMoney(AmountOfMoney value) {
		this.amountOfMoney = value;
	}

	/**
	 * Object containing the line items of the invoice or shopping cart
	 */
	public LineItemInvoiceData getInvoiceData() {
		return invoiceData;
	}

	/**
	 * Object containing the line items of the invoice or shopping cart
	 */
	public void setInvoiceData(LineItemInvoiceData value) {
		this.invoiceData = value;
	}

	/**
	 * Object containing additional informationthat when supplied can have a beneficial effect on the discountrates
	 *
	 * @deprecated Use orderLineDetails instead
	 */
	@Deprecated
	public LineItemLevel3InterchangeInformation getLevel3InterchangeInformation() {
		return level3InterchangeInformation;
	}

	/**
	 * Object containing additional informationthat when supplied can have a beneficial effect on the discountrates
	 *
	 * @deprecated Use orderLineDetails instead
	 */
	@Deprecated
	public void setLevel3InterchangeInformation(LineItemLevel3InterchangeInformation value) {
		this.level3InterchangeInformation = value;
	}

	/**
	 * Object containing additional information that when supplied can have a beneficial effect on the discountrates
	 */
	public OrderLineDetails getOrderLineDetails() {
		return orderLineDetails;
	}

	/**
	 * Object containing additional information that when supplied can have a beneficial effect on the discountrates
	 */
	public void setOrderLineDetails(OrderLineDetails value) {
		this.orderLineDetails = value;
	}
}
