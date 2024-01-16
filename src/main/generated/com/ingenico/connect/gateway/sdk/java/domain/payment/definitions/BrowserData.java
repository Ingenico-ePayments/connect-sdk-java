/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/
 */

package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

/**
 * Object containing information regarding the browser of the customer
 */
public class BrowserData {

	private Integer colorDepth = null;

	private String innerHeight = null;

	private String innerWidth = null;

	private Boolean javaEnabled = null;

	private Boolean javaScriptEnabled = null;

	private String screenHeight = null;

	private String screenWidth = null;

	/**
	 * ColorDepth in bits. Value is returned from the screen.colorDepth property.
	 * <p>
	 * If you use the latest version of our JavaScript Client SDK, we will collect this data and include it in the encryptedCustomerInput property. We will then automatically populate this data if available.
	 * <p>Note: This data can only be collected if JavaScript is enabled in the browser. This means that 3-D Secure version 2.1 requires the use of JavaScript to enabled. In the upcoming version 2.2 of the specification this is no longer a requirement. As we currently support version 2.1 it means that this property is required when cardPaymentMethodSpecifInput.threeDSecure.authenticationFlow is set to "browser".
	 */
	public Integer getColorDepth() {
		return colorDepth;
	}

	/**
	 * ColorDepth in bits. Value is returned from the screen.colorDepth property.
	 * <p>
	 * If you use the latest version of our JavaScript Client SDK, we will collect this data and include it in the encryptedCustomerInput property. We will then automatically populate this data if available.
	 * <p>Note: This data can only be collected if JavaScript is enabled in the browser. This means that 3-D Secure version 2.1 requires the use of JavaScript to enabled. In the upcoming version 2.2 of the specification this is no longer a requirement. As we currently support version 2.1 it means that this property is required when cardPaymentMethodSpecifInput.threeDSecure.authenticationFlow is set to "browser".
	 */
	public void setColorDepth(Integer value) {
		this.colorDepth = value;
	}

	/**
	 * The innerHeight of the frame in case you are capturing your payments in a frame. We will use this to validate if the height provided in the cardPaymentMethodSpecifInput.threeDSecure.challengeCanvasSize will actually fit in the iFrame you use.
	 */
	public String getInnerHeight() {
		return innerHeight;
	}

	/**
	 * The innerHeight of the frame in case you are capturing your payments in a frame. We will use this to validate if the height provided in the cardPaymentMethodSpecifInput.threeDSecure.challengeCanvasSize will actually fit in the iFrame you use.
	 */
	public void setInnerHeight(String value) {
		this.innerHeight = value;
	}

	/**
	 * The innerWidth of the frame in case you are capturing your payments in a frame. We will use this to validate if the width provided in the cardPaymentMethodSpecifInput.threeDSecure.challengeCanvasSize will actually fit in the iFrame you use.
	 */
	public String getInnerWidth() {
		return innerWidth;
	}

	/**
	 * The innerWidth of the frame in case you are capturing your payments in a frame. We will use this to validate if the width provided in the cardPaymentMethodSpecifInput.threeDSecure.challengeCanvasSize will actually fit in the iFrame you use.
	 */
	public void setInnerWidth(String value) {
		this.innerWidth = value;
	}

	/**
	 * true =Java is enabled in the browser
	 * <p>false = Java is not enabled in the browser
	 * <p>Value is returned from the navigator.javaEnabled property.
	 * <p>If you use the latest version of our JavaScript Client SDK, we will collect this data and include it in the encryptedCustomerInput property. We will then automatically populate this data if available.
	 * <p>Note: This data can only be collected if JavaScript is enabled in the browser. This means that 3-D Secure version 2.1 requires the use of JavaScript to enabled. In the upcoming version 2.2 of the specification this is no longer a requirement. As we currently support version 2.1 it means that this property is required when cardPaymentMethodSpecifInput.threeDSecure.authenticationFlow is set to "browser".
	 */
	public Boolean getJavaEnabled() {
		return javaEnabled;
	}

	/**
	 * true =Java is enabled in the browser
	 * <p>false = Java is not enabled in the browser
	 * <p>Value is returned from the navigator.javaEnabled property.
	 * <p>If you use the latest version of our JavaScript Client SDK, we will collect this data and include it in the encryptedCustomerInput property. We will then automatically populate this data if available.
	 * <p>Note: This data can only be collected if JavaScript is enabled in the browser. This means that 3-D Secure version 2.1 requires the use of JavaScript to enabled. In the upcoming version 2.2 of the specification this is no longer a requirement. As we currently support version 2.1 it means that this property is required when cardPaymentMethodSpecifInput.threeDSecure.authenticationFlow is set to "browser".
	 */
	public void setJavaEnabled(Boolean value) {
		this.javaEnabled = value;
	}

	/**
	 * true = JavaScript is enabled in the browser
	 * <p>false = JavaScript is not enabled in the browser
	 * <p>Note: Required in future 3-D Secure version 2.2.
	 */
	public Boolean getJavaScriptEnabled() {
		return javaScriptEnabled;
	}

	/**
	 * true = JavaScript is enabled in the browser
	 * <p>false = JavaScript is not enabled in the browser
	 * <p>Note: Required in future 3-D Secure version 2.2.
	 */
	public void setJavaScriptEnabled(Boolean value) {
		this.javaScriptEnabled = value;
	}

	/**
	 * Height of the screen in pixels. Value is returned from the screen.height property.
	 * <p>If you use the latest version of our JavaScript Client SDK, we will collect this data and include it in the encryptedCustomerInput property. We will then automatically populate this data if available.
	 * <p>Note: This data can only be collected if JavaScript is enabled in the browser. This means that 3-D Secure version 2.1 requires the use of JavaScript to enabled. In the upcoming version 2.2 of the specification this is no longer a requirement. As we currently support version 2.1 it means that this property is required when cardPaymentMethodSpecifInput.threeDSecure.authenticationFlow is set to "browser".
	 */
	public String getScreenHeight() {
		return screenHeight;
	}

	/**
	 * Height of the screen in pixels. Value is returned from the screen.height property.
	 * <p>If you use the latest version of our JavaScript Client SDK, we will collect this data and include it in the encryptedCustomerInput property. We will then automatically populate this data if available.
	 * <p>Note: This data can only be collected if JavaScript is enabled in the browser. This means that 3-D Secure version 2.1 requires the use of JavaScript to enabled. In the upcoming version 2.2 of the specification this is no longer a requirement. As we currently support version 2.1 it means that this property is required when cardPaymentMethodSpecifInput.threeDSecure.authenticationFlow is set to "browser".
	 */
	public void setScreenHeight(String value) {
		this.screenHeight = value;
	}

	/**
	 * Width of the screen in pixels. Value is returned from the screen.width property.
	 * <p>If you use the latest version of our JavaScript Client SDK, we will collect this data and include it in the encryptedCustomerInput property. We will then automatically populate this data if available.
	 * <p>Note: This data can only be collected if JavaScript is enabled in the browser. This means that 3-D Secure version 2.1 requires the use of JavaScript to enabled. In the upcoming version 2.2 of the specification this is no longer a requirement. As we currently support version 2.1 it means that this property is required when cardPaymentMethodSpecifInput.threeDSecure.authenticationFlow is set to "browser".
	 */
	public String getScreenWidth() {
		return screenWidth;
	}

	/**
	 * Width of the screen in pixels. Value is returned from the screen.width property.
	 * <p>If you use the latest version of our JavaScript Client SDK, we will collect this data and include it in the encryptedCustomerInput property. We will then automatically populate this data if available.
	 * <p>Note: This data can only be collected if JavaScript is enabled in the browser. This means that 3-D Secure version 2.1 requires the use of JavaScript to enabled. In the upcoming version 2.2 of the specification this is no longer a requirement. As we currently support version 2.1 it means that this property is required when cardPaymentMethodSpecifInput.threeDSecure.authenticationFlow is set to "browser".
	 */
	public void setScreenWidth(String value) {
		this.screenWidth = value;
	}
}
