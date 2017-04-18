/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_AmountBreakdown">AmountBreakdown</a>
 */
public class AmountBreakdown {

	private Long amount = null;

	private String type = null;

	public Long getAmount() {
		return amount;
	}

	public void setAmount(Long value) {
		this.amount = value;
	}

	public String getType() {
		return type;
	}

	public void setType(String value) {
		this.type = value;
	}
}
