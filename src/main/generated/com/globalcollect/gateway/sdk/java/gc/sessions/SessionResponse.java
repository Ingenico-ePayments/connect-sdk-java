package com.globalcollect.gateway.sdk.java.gc.sessions;

import java.util.List;

/**
 * class SessionResponse
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
