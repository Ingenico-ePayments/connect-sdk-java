/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.hostedcheckout.definitions;

import java.util.List;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.KeyValuePair;

public class DisplayedData {

	private String displayedDataType = null;

	private String renderingData = null;

	private List<KeyValuePair> showData = null;

	/**
	 * Action merchants needs to take in the online payment process. Possible values are:<br>
	 * <ul>
	 * <li>SHOW_INSTRUCTIONS - The consumer needs to be shown payment instruction using the details found in <span class="property">showData</span>. Alternatively the instructions can be rendered by us using the <span class="property">renderingData</span>
	 * <li>SHOW_TRANSACTION_RESULTS - The consumer needs to be shown the transaction results using the details found in <span class="property">showData</span>. Alternatively the instructions can be rendered by us using the <span class="property">renderingData</span>
	 * </ul>
	 */
	public String getDisplayedDataType() {
		return displayedDataType;
	}

	/**
	 * Action merchants needs to take in the online payment process. Possible values are:<br>
	 * <ul>
	 * <li>SHOW_INSTRUCTIONS - The consumer needs to be shown payment instruction using the details found in <span class="property">showData</span>. Alternatively the instructions can be rendered by us using the <span class="property">renderingData</span>
	 * <li>SHOW_TRANSACTION_RESULTS - The consumer needs to be shown the transaction results using the details found in <span class="property">showData</span>. Alternatively the instructions can be rendered by us using the <span class="property">renderingData</span>
	 * </ul>
	 */
	public void setDisplayedDataType(String value) {
		this.displayedDataType = value;
	}

	/**
	 * This field contains the blob with data for the instructions rendering service.
	 * <p>This service will be available at the following endpoint:
	 * http(s)://{{merchant specific subdomain}}.{{base MyCheckout hosted payment pages domain}}/instructions/{{merchantId}}/{{clientSessionId}}
	 * <p>This instructions page rendering service accepts the following parameters:
	 * <ul><li><span class="property">renderingData</span> (required, the content of this field)
	 * <li><span class="property">locale</span> (optional, if present overrides default locale, e.g. "en_GB")
	 * <li><span class="property">variant</span> (optional, code of a variant, if present overrides default variant, e.g. "100")
	 * </ul>
	 * You can offer a link to a consumer to see an instructions page for a payment done earlier. Because of the size of the renderingData this will need to be set in a web form as a value of a hidden field. Before presenting the link you need to obtain a clientSessionId by creating a session using the S2S API. You will need to use the MyCheckout hosted payment pages domain hosted in the same region as the API domain used for the createClientSession call.
	 * <p>The <span class="property">renderingData</span> is a String blob that is presented to you via the Server API as part of the <span class="property">merchantAction</span> (if available, and non-redirect) in the JSON return values for the createPayment call or the getHostedCheckoutStatus call (merchantAction inside createdPaymentOutput when available).
	 * You are responsible to store the <span class="property">renderingData</span> blob in order to be able to present the instructions page at a later time, when this information might no longer be available through Server API calls.
	 */
	public String getRenderingData() {
		return renderingData;
	}

	/**
	 * This field contains the blob with data for the instructions rendering service.
	 * <p>This service will be available at the following endpoint:
	 * http(s)://{{merchant specific subdomain}}.{{base MyCheckout hosted payment pages domain}}/instructions/{{merchantId}}/{{clientSessionId}}
	 * <p>This instructions page rendering service accepts the following parameters:
	 * <ul><li><span class="property">renderingData</span> (required, the content of this field)
	 * <li><span class="property">locale</span> (optional, if present overrides default locale, e.g. "en_GB")
	 * <li><span class="property">variant</span> (optional, code of a variant, if present overrides default variant, e.g. "100")
	 * </ul>
	 * You can offer a link to a consumer to see an instructions page for a payment done earlier. Because of the size of the renderingData this will need to be set in a web form as a value of a hidden field. Before presenting the link you need to obtain a clientSessionId by creating a session using the S2S API. You will need to use the MyCheckout hosted payment pages domain hosted in the same region as the API domain used for the createClientSession call.
	 * <p>The <span class="property">renderingData</span> is a String blob that is presented to you via the Server API as part of the <span class="property">merchantAction</span> (if available, and non-redirect) in the JSON return values for the createPayment call or the getHostedCheckoutStatus call (merchantAction inside createdPaymentOutput when available).
	 * You are responsible to store the <span class="property">renderingData</span> blob in order to be able to present the instructions page at a later time, when this information might no longer be available through Server API calls.
	 */
	public void setRenderingData(String value) {
		this.renderingData = value;
	}

	/**
	 * Array of key value pairs of data that needs to be shown to the consumer. This is returned for both the SHOW_INSTRUCTION as well as the SHOW_TRANSACTION_RESULTS <span class="property">actionType</span>.<br>
	 * Note: The returned value for the key <span class="property">BARCODE</span> is a base64 encoded gif image. By prepending 'data:image/gif;base64,' this value can be used as the source of an HTML inline image.
	 */
	public List<KeyValuePair> getShowData() {
		return showData;
	}

	/**
	 * Array of key value pairs of data that needs to be shown to the consumer. This is returned for both the SHOW_INSTRUCTION as well as the SHOW_TRANSACTION_RESULTS <span class="property">actionType</span>.<br>
	 * Note: The returned value for the key <span class="property">BARCODE</span> is a base64 encoded gif image. By prepending 'data:image/gif;base64,' this value can be used as the source of an HTML inline image.
	 */
	public void setShowData(List<KeyValuePair> value) {
		this.showData = value;
	}
}
