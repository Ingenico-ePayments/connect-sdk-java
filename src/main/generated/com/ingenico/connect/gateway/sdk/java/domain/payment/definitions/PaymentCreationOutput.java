/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.PaymentCreationReferences;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_PaymentCreationOutput">PaymentCreationOutput</a>
 */
public class PaymentCreationOutput extends PaymentCreationReferences {

	private Boolean isNewToken = null;

	private String token = null;

	public Boolean getIsNewToken() {
		return isNewToken;
	}

	public void setIsNewToken(Boolean value) {
		this.isNewToken = value;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String value) {
		this.token = value;
	}
}
