package com.globalcollect.gateway.sdk.java.gc.payment.definitions;

import com.globalcollect.gateway.sdk.java.gc.payment.definitions.PaymentCreationReferences;

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
