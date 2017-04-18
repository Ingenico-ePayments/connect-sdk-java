/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.token;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_CreateTokenResponse">CreateTokenResponse</a>
 */
public class CreateTokenResponse {

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
