/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

public class PaymentProduct863ThirdPartyData {

	private String appId = null;

	private String nonceStr = null;

	private String packageSign = null;

	private String paySign = null;

	private String prepayId = null;

	private String signType = null;

	private String timeStamp = null;

	/**
	 * The appId to use in third party calls to WeChat.
	 */
	public String getAppId() {
		return appId;
	}

	/**
	 * The appId to use in third party calls to WeChat.
	 */
	public void setAppId(String value) {
		this.appId = value;
	}

	/**
	 * The nonceStr to use in third party calls to WeChat
	 */
	public String getNonceStr() {
		return nonceStr;
	}

	/**
	 * The nonceStr to use in third party calls to WeChat
	 */
	public void setNonceStr(String value) {
		this.nonceStr = value;
	}

	/**
	 * The packageSign to use in third party calls to WeChat
	 */
	public String getPackageSign() {
		return packageSign;
	}

	/**
	 * The packageSign to use in third party calls to WeChat
	 */
	public void setPackageSign(String value) {
		this.packageSign = value;
	}

	/**
	 * The paySign to use in third party calls to WeChat
	 */
	public String getPaySign() {
		return paySign;
	}

	/**
	 * The paySign to use in third party calls to WeChat
	 */
	public void setPaySign(String value) {
		this.paySign = value;
	}

	/**
	 * The prepayId to use in third party calls to WeChat.
	 */
	public String getPrepayId() {
		return prepayId;
	}

	/**
	 * The prepayId to use in third party calls to WeChat.
	 */
	public void setPrepayId(String value) {
		this.prepayId = value;
	}

	/**
	 * The signType to use in third party calls to WeChat
	 */
	public String getSignType() {
		return signType;
	}

	/**
	 * The signType to use in third party calls to WeChat
	 */
	public void setSignType(String value) {
		this.signType = value;
	}

	/**
	 * The timeStamp to use in third party calls to WeChat
	 */
	public String getTimeStamp() {
		return timeStamp;
	}

	/**
	 * The timeStamp to use in third party calls to WeChat
	 */
	public void setTimeStamp(String value) {
		this.timeStamp = value;
	}
}
