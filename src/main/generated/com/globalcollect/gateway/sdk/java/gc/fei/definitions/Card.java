package com.globalcollect.gateway.sdk.java.gc.fei.definitions;

import com.globalcollect.gateway.sdk.java.gc.fei.definitions.CardWithoutCvv;

public class Card extends CardWithoutCvv {

	private String cvv = null;

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String value) {
		this.cvv = value;
	}
}
