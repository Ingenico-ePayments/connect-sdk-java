/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.AmountOfMoney;
import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.LineItemInvoiceData;
import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.LineItemLevel3InterchangeInformation;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_LineItem">LineItem</a>
 */
public class LineItem {

	private AmountOfMoney amountOfMoney = null;

	private LineItemInvoiceData invoiceData = null;

	private LineItemLevel3InterchangeInformation level3InterchangeInformation = null;

	public AmountOfMoney getAmountOfMoney() {
		return amountOfMoney;
	}

	public void setAmountOfMoney(AmountOfMoney value) {
		this.amountOfMoney = value;
	}

	public LineItemInvoiceData getInvoiceData() {
		return invoiceData;
	}

	public void setInvoiceData(LineItemInvoiceData value) {
		this.invoiceData = value;
	}

	public LineItemLevel3InterchangeInformation getLevel3InterchangeInformation() {
		return level3InterchangeInformation;
	}

	public void setLevel3InterchangeInformation(LineItemLevel3InterchangeInformation value) {
		this.level3InterchangeInformation = value;
	}
}
