/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.sessions;

import java.util.List;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_SessionResponse">SessionResponse</a>
 */
public class SessionResponse {

	private String clientSessionId = null;

	private String customerId = null;

	private List<String> invalidTokens = null;

	private String region = null;

	public String getClientSessionId() {
		return clientSessionId;
	}

	public void setClientSessionId(String value) {
		this.clientSessionId = value;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String value) {
		this.customerId = value;
	}

	public List<String> getInvalidTokens() {
		return invalidTokens;
	}

	public void setInvalidTokens(List<String> value) {
		this.invalidTokens = value;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String value) {
		this.region = value;
	}
}
