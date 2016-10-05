/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.AmountOfMoney;
import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.PaymentReferences;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_OrderOutput">OrderOutput</a>
 */
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
