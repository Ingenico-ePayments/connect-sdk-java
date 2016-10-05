/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.CardWithoutCvv;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_Card">Card</a>
 */
public class Card extends CardWithoutCvv {

	private String cvv = null;

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String value) {
		this.cvv = value;
	}
}
