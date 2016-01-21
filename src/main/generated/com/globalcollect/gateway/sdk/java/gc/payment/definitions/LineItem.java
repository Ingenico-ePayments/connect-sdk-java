package com.globalcollect.gateway.sdk.java.gc.payment.definitions;

import com.globalcollect.gateway.sdk.java.gc.fei.definitions.AmountOfMoney;
import com.globalcollect.gateway.sdk.java.gc.payment.definitions.LineItemInvoiceData;
import com.globalcollect.gateway.sdk.java.gc.payment.definitions.LineItemLevel3InterchangeInformation;

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
