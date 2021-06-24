/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

import java.util.List;

/**
 * Object containing rendering options of the device
 */
public class DeviceRenderOptions {

	private String sdkInterface = null;

	private String sdkUiType = null;

	private List<String> sdkUiTypes = null;

	/**
	 * Lists all of the SDK Interface types that the device supports for displaying specific challenge user interfaces within the SDK.<p></p><ul class="paragraph-width"><li>native = The app supports only a native user interface</li><li>html = The app supports only an HTML user interface</li><li>both = Both Native and HTML user interfaces are supported by the app</li></ul>
	 */
	public String getSdkInterface() {
		return sdkInterface;
	}

	/**
	 * Lists all of the SDK Interface types that the device supports for displaying specific challenge user interfaces within the SDK.<p></p><ul class="paragraph-width"><li>native = The app supports only a native user interface</li><li>html = The app supports only an HTML user interface</li><li>both = Both Native and HTML user interfaces are supported by the app</li></ul>
	 */
	public void setSdkInterface(String value) {
		this.sdkInterface = value;
	}

	/**
	 * Lists all UI types that the device supports for displaying specific challenge user interfaces within the SDK.<p></p><ul class="paragraph-width"><li>text = Text interface</li><li>single-select = Select a single option</li><li>multi-select = Select multiple options</li><li>oob = Out of ounds</li><li>html-other = HTML Other (only valid when cardPaymentMethodSpecificInput.threeDSecure.sdkData.deviceRenderOptions.sdkInterface is set to html)</li></ul>
	 *
	 * @deprecated Use deviceRenderOptions.sdkUiTypes instead
	 */
	@Deprecated
	public String getSdkUiType() {
		return sdkUiType;
	}

	/**
	 * Lists all UI types that the device supports for displaying specific challenge user interfaces within the SDK.<p></p><ul class="paragraph-width"><li>text = Text interface</li><li>single-select = Select a single option</li><li>multi-select = Select multiple options</li><li>oob = Out of ounds</li><li>html-other = HTML Other (only valid when cardPaymentMethodSpecificInput.threeDSecure.sdkData.deviceRenderOptions.sdkInterface is set to html)</li></ul>
	 *
	 * @deprecated Use deviceRenderOptions.sdkUiTypes instead
	 */
	@Deprecated
	public void setSdkUiType(String value) {
		this.sdkUiType = value;
	}

	/**
	 * Lists all UI types that the device supports for displaying specific challenge user interfaces within the SDK.<p></p><ul class="paragraph-width"><li>text = Text interface</li><li>single-select = Select a single option</li><li>multi-select = Select multiple options</li><li>oob = Out of ounds</li><li>html-other = HTML Other (only valid when cardPaymentMethodSpecificInput.threeDSecure.sdkData.deviceRenderOptions.sdkInterface is set to html)</li></ul>
	 */
	public List<String> getSdkUiTypes() {
		return sdkUiTypes;
	}

	/**
	 * Lists all UI types that the device supports for displaying specific challenge user interfaces within the SDK.<p></p><ul class="paragraph-width"><li>text = Text interface</li><li>single-select = Select a single option</li><li>multi-select = Select multiple options</li><li>oob = Out of ounds</li><li>html-other = HTML Other (only valid when cardPaymentMethodSpecificInput.threeDSecure.sdkData.deviceRenderOptions.sdkInterface is set to html)</li></ul>
	 */
	public void setSdkUiTypes(List<String> value) {
		this.sdkUiTypes = value;
	}
}
