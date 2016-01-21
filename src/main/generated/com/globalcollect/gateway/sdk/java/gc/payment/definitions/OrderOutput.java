package com.globalcollect.gateway.sdk.java.gc.payment.definitions;

import com.globalcollect.gateway.sdk.java.gc.fei.definitions.AmountOfMoney;
import com.globalcollect.gateway.sdk.java.gc.payment.definitions.PaymentReferences;

public class OrderOutput {

	private AmountOfMoney amountOfMoney = null;

	private PaymentReferences references = null;

	public AmountOfMoney getAmountOfMoney() {
		return amountOfMoney;
	}

	public void setAmountOfMoney(AmountOfMoney value) {
		this.amountOfMoney = value;
	}

	public PaymentReferences getReferences() {
		return references;
	}

	public void setReferences(PaymentReferences value) {
		this.references = value;
	}
}
