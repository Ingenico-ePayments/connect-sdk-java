/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.sessions;

import java.util.List;

public class SessionResponse {

	private String assetUrl = null;

	private String clientApiUrl = null;

	private String clientSessionId = null;

	private String customerId = null;

	private List<String> invalidTokens = null;

	private String region = null;

	/**
	 * The base url for assets.
	 */
	public String getAssetUrl() {
		return assetUrl;
	}

	/**
	 * The base url for assets.
	 */
	public void setAssetUrl(String value) {
		this.assetUrl = value;
	}

	/**
	 * The base url for client requests.
	 */
	public String getClientApiUrl() {
		return clientApiUrl;
	}

	/**
	 * The base url for client requests.
	 */
	public void setClientApiUrl(String value) {
		this.clientApiUrl = value;
	}

	/**
	 * The identifier of the session that has been created.
	 */
	public String getClientSessionId() {
		return clientSessionId;
	}

	/**
	 * The identifier of the session that has been created.
	 */
	public void setClientSessionId(String value) {
		this.clientSessionId = value;
	}

	/**
	 * The session is build up around the consumer in the form of the customerId. All of the Client APIs use this customerId in the URI to identify the consumer.
	 */
	public String getCustomerId() {
		return customerId;
	}

	/**
	 * The session is build up around the consumer in the form of the customerId. All of the Client APIs use this customerId in the URI to identify the consumer.
	 */
	public void setCustomerId(String value) {
		this.customerId = value;
	}

	/**
	 * Tokens that are submitted in the request are validated. In case any of the tokens can't be used anymore they are returned in this array. You should most likely remove those tokens from your system.
	 */
	public List<String> getInvalidTokens() {
		return invalidTokens;
	}

	/**
	 * Tokens that are submitted in the request are validated. In case any of the tokens can't be used anymore they are returned in this array. You should most likely remove those tokens from your system.
	 */
	public void setInvalidTokens(List<String> value) {
		this.invalidTokens = value;
	}

	/**
	 * Possible values:
	 * <ul><li>EU - datacenter located in Amsterdam
	 * <li>US - datacenter located in Miami
	 * <li>AMS - datacenter located in Amsterdam
	 * <li>PAR - datacenter located in Paris
	 * </ul>
	 * When a session is created it is created in a specific datacenter. Any subsequent calls using the Client API need to be datacenter specific. The region is identified by EU or AMS (datacenter located in Amsterdam), US (datacenter located in Miami) or PAR (datacenter located in Paris). This value needs to be passed to the a Client SDK to make sure that the client software connects to the right datacenter.
	 */
	public String getRegion() {
		return region;
	}

	/**
	 * Possible values:
	 * <ul><li>EU - datacenter located in Amsterdam
	 * <li>US - datacenter located in Miami
	 * <li>AMS - datacenter located in Amsterdam
	 * <li>PAR - datacenter located in Paris
	 * </ul>
	 * When a session is created it is created in a specific datacenter. Any subsequent calls using the Client API need to be datacenter specific. The region is identified by EU or AMS (datacenter located in Amsterdam), US (datacenter located in Miami) or PAR (datacenter located in Paris). This value needs to be passed to the a Client SDK to make sure that the client software connects to the right datacenter.
	 */
	public void setRegion(String value) {
		this.region = value;
	}
}
