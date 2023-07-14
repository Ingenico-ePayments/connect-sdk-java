/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */

package com.ingenico.connect.gateway.sdk.java.domain.definitions;

public class InAuth {

	private String deviceCategory = null;

	private String deviceId = null;

	private String riskScore = null;

	private String trueIpAddress = null;

	private String trueIpAddressCountry = null;

	/**
	 * The type of device used by the customer. Example values:
	 * <ul class="paragraph-width">
	 * <li>SMARTPHONE</li><li>PERSONAL_COMPUTER</li> <li>TABLET</li> <li>WEARABLE_COMPUTER</li> <li>GAME_CONSOLE</li> <li>SMART_TV</li> <li>PDA</li> <li>OTHER</li> <li>UNKNOWN</li></ul>
	 */
	public String getDeviceCategory() {
		return deviceCategory;
	}

	/**
	 * The type of device used by the customer. Example values:
	 * <ul class="paragraph-width">
	 * <li>SMARTPHONE</li><li>PERSONAL_COMPUTER</li> <li>TABLET</li> <li>WEARABLE_COMPUTER</li> <li>GAME_CONSOLE</li> <li>SMART_TV</li> <li>PDA</li> <li>OTHER</li> <li>UNKNOWN</li></ul>
	 */
	public void setDeviceCategory(String value) {
		this.deviceCategory = value;
	}

	/**
	 * This is the device fingerprint value. Based on the amount of data that the device fingerprint collector script was able to collect, this will be a proxy ID for the device used by the customer.
	 */
	public String getDeviceId() {
		return deviceId;
	}

	/**
	 * This is the device fingerprint value. Based on the amount of data that the device fingerprint collector script was able to collect, this will be a proxy ID for the device used by the customer.
	 */
	public void setDeviceId(String value) {
		this.deviceId = value;
	}

	/**
	 * The score calculated on the basis of Anomalies, Velocity, Location, Integrity, List-Based, and Device Reputation. Range of the score is between 0 and 100. A lower value is better.
	 */
	public String getRiskScore() {
		return riskScore;
	}

	/**
	 * The score calculated on the basis of Anomalies, Velocity, Location, Integrity, List-Based, and Device Reputation. Range of the score is between 0 and 100. A lower value is better.
	 */
	public void setRiskScore(String value) {
		this.riskScore = value;
	}

	/**
	 * The true IP address as determined by inAuth. This might be different from the IP address that you are seeing on your side due to the proxy piercing technology deployed by inAuth.
	 */
	public String getTrueIpAddress() {
		return trueIpAddress;
	}

	/**
	 * The true IP address as determined by inAuth. This might be different from the IP address that you are seeing on your side due to the proxy piercing technology deployed by inAuth.
	 */
	public void setTrueIpAddress(String value) {
		this.trueIpAddress = value;
	}

	/**
	 * The country of the customer based on the location of the True IP Address determined by inAuth.
	 */
	public String getTrueIpAddressCountry() {
		return trueIpAddressCountry;
	}

	/**
	 * The country of the customer based on the location of the True IP Address determined by inAuth.
	 */
	public void setTrueIpAddressCountry(String value) {
		this.trueIpAddressCountry = value;
	}
}
