/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/
 */

package com.ingenico.connect.gateway.sdk.java.domain.hostedcheckout.definitions;

/**
 * The object containing the frequency and interval between recurring payments.
 */
public class Frequency {

	private String interval = null;

	private Integer intervalFrequency = null;

	/**
	 * The interval between recurring payments specified as days, weeks, quarters, or years.
	 */
	public String getInterval() {
		return interval;
	}

	/**
	 * The interval between recurring payments specified as days, weeks, quarters, or years.
	 */
	public void setInterval(String value) {
		this.interval = value;
	}

	/**
	 * The number of days, weeks, months, quarters, or years between recurring payments.
	 */
	public Integer getIntervalFrequency() {
		return intervalFrequency;
	}

	/**
	 * The number of days, weeks, months, quarters, or years between recurring payments.
	 */
	public void setIntervalFrequency(Integer value) {
		this.intervalFrequency = value;
	}
}
