/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */

package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

import java.util.List;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.KeyValuePair;
import com.ingenico.connect.gateway.sdk.java.domain.product.definitions.PaymentProductField;

public class MerchantAction {

	private String actionType = null;

	private List<PaymentProductField> formFields = null;

	private MobileThreeDSecureChallengeParameters mobileThreeDSecureChallengeParameters = null;

	private RedirectData redirectData = null;

	private String renderingData = null;

	private List<KeyValuePair> showData = null;

	private ThirdPartyData thirdPartyData = null;

	/**
	 * Action merchants needs to take in the online payment process. Possible values are:<br>
	 * <ul class="paragraph-width"><li>REDIRECT - The customer needs to be redirected using the details found in redirectData
	 * <li>SHOW_FORM - The customer needs to be shown a form with the fields found in formFields. You can submit the data entered by the user in a <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/payments/complete.html">Complete payment</a> request. Additionally:
	 * <ul class="paragraph-width">
	 * <li>for payment product 3012 (Bancontact), to support payments via the Bancontact app, showData contains a QR code and URL intent.
	 * <li>for payment product 863 (WeChat Pay), to support payments via the WeChat app, showData contains a QR code, URL intent, or signature and nonce combination. The showData property describes when each of these values can be returned.<br>
	 * Note that WeChat Pay does not support completing payments.
	 * </ul>
	 * <li>SHOW_INSTRUCTIONS - The customer needs to be shown payment instruction using the details found in showData. Alternatively the instructions can be rendered by us using the instructionsRenderingData
	 * <li>SHOW_TRANSACTION_RESULTS - The customer needs to be shown the transaction results using the details found in showData
	 * <li>MOBILE_THREEDS_CHALLENGE - The customer needs to complete a challenge as part of the 3D Secure authentication inside your mobile app. The details contained in mobileThreeDSecureChallengeParameters need to be provided to the EMVco certified Mobile SDK as a challengeParameters object.
	 * <li>CALL_THIRD_PARTY - The merchant needs to call a third party using the data found in thirdPartyData
	 * </ul>
	 */
	public String getActionType() {
		return actionType;
	}

	/**
	 * Action merchants needs to take in the online payment process. Possible values are:<br>
	 * <ul class="paragraph-width"><li>REDIRECT - The customer needs to be redirected using the details found in redirectData
	 * <li>SHOW_FORM - The customer needs to be shown a form with the fields found in formFields. You can submit the data entered by the user in a <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/payments/complete.html">Complete payment</a> request. Additionally:
	 * <ul class="paragraph-width">
	 * <li>for payment product 3012 (Bancontact), to support payments via the Bancontact app, showData contains a QR code and URL intent.
	 * <li>for payment product 863 (WeChat Pay), to support payments via the WeChat app, showData contains a QR code, URL intent, or signature and nonce combination. The showData property describes when each of these values can be returned.<br>
	 * Note that WeChat Pay does not support completing payments.
	 * </ul>
	 * <li>SHOW_INSTRUCTIONS - The customer needs to be shown payment instruction using the details found in showData. Alternatively the instructions can be rendered by us using the instructionsRenderingData
	 * <li>SHOW_TRANSACTION_RESULTS - The customer needs to be shown the transaction results using the details found in showData
	 * <li>MOBILE_THREEDS_CHALLENGE - The customer needs to complete a challenge as part of the 3D Secure authentication inside your mobile app. The details contained in mobileThreeDSecureChallengeParameters need to be provided to the EMVco certified Mobile SDK as a challengeParameters object.
	 * <li>CALL_THIRD_PARTY - The merchant needs to call a third party using the data found in thirdPartyData
	 * </ul>
	 */
	public void setActionType(String value) {
		this.actionType = value;
	}

	/**
	 * Populated only when the actionType of the merchantAction is SHOW_FORM. In this case, this property contains the list of fields to render, in the format that is also used in the response of <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/products/get.html">Get payment product</a>.
	 */
	public List<PaymentProductField> getFormFields() {
		return formFields;
	}

	/**
	 * Populated only when the actionType of the merchantAction is SHOW_FORM. In this case, this property contains the list of fields to render, in the format that is also used in the response of <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/products/get.html">Get payment product</a>.
	 */
	public void setFormFields(List<PaymentProductField> value) {
		this.formFields = value;
	}

	/**
	 * Populated only when the actionType of the merchantAction is MOBILE_THREEDS_CHALLENGE. In this case, this object contains the list of properties to provide to the EMVco certified Mobile SDK as a challengeParameters object.
	 */
	public MobileThreeDSecureChallengeParameters getMobileThreeDSecureChallengeParameters() {
		return mobileThreeDSecureChallengeParameters;
	}

	/**
	 * Populated only when the actionType of the merchantAction is MOBILE_THREEDS_CHALLENGE. In this case, this object contains the list of properties to provide to the EMVco certified Mobile SDK as a challengeParameters object.
	 */
	public void setMobileThreeDSecureChallengeParameters(MobileThreeDSecureChallengeParameters value) {
		this.mobileThreeDSecureChallengeParameters = value;
	}

	/**
	 * Object containing all data needed to redirect the customer
	 */
	public RedirectData getRedirectData() {
		return redirectData;
	}

	/**
	 * Object containing all data needed to redirect the customer
	 */
	public void setRedirectData(RedirectData value) {
		this.redirectData = value;
	}

	/**
	 * This property contains the blob with data for the instructions rendering service.
	 * <p>This service will be available at the following endpoint:
	 * http(s)://{{merchant specific subdomain}}.{{base MyCheckout hosted payment pages domain}}/instructions/{{merchantId}}/{{clientSessionId}}
	 * <p>This instructions page rendering service accepts the following parameters:
	 * <ul class="paragraph-width"><li>instructionsRenderingData (required, the content of this property)
	 * <li>locale (optional, if present overrides default locale, e.g. "en_GB")
	 * <li>variant (optional, code of a variant, if present overrides default variant, e.g. "100")
	 * <li>customerId (required for Pix, otherwise optional, the customerId from a client session)
	 * </ul>
	 * You can offer a link to a customer to see an instructions page for a payment done earlier. Because of the size of the instructionsRenderingData this will need to be set in a web form as a value of a hidden field. Before presenting the link you need to obtain a clientSessionId by creating a session using the S2S API. You will need to use the MyCheckout hosted payment pages domain hosted in the same region as the API domain used for the createClientSession call.
	 * <p>The instructionsRenderingData is a String blob that is presented to you via the Server API as part of the merchantAction (if available, and non-redirect) in the JSON return values for the createPayment call or the getHostedCheckoutStatus call (merchantAction inside createdPaymentOutput when available).
	 * You are responsible to store the instructionsRenderingData blob in order to be able to present the instructions page at a later time, when this information might no longer be available through Server API calls.
	 */
	public String getRenderingData() {
		return renderingData;
	}

	/**
	 * This property contains the blob with data for the instructions rendering service.
	 * <p>This service will be available at the following endpoint:
	 * http(s)://{{merchant specific subdomain}}.{{base MyCheckout hosted payment pages domain}}/instructions/{{merchantId}}/{{clientSessionId}}
	 * <p>This instructions page rendering service accepts the following parameters:
	 * <ul class="paragraph-width"><li>instructionsRenderingData (required, the content of this property)
	 * <li>locale (optional, if present overrides default locale, e.g. "en_GB")
	 * <li>variant (optional, code of a variant, if present overrides default variant, e.g. "100")
	 * <li>customerId (required for Pix, otherwise optional, the customerId from a client session)
	 * </ul>
	 * You can offer a link to a customer to see an instructions page for a payment done earlier. Because of the size of the instructionsRenderingData this will need to be set in a web form as a value of a hidden field. Before presenting the link you need to obtain a clientSessionId by creating a session using the S2S API. You will need to use the MyCheckout hosted payment pages domain hosted in the same region as the API domain used for the createClientSession call.
	 * <p>The instructionsRenderingData is a String blob that is presented to you via the Server API as part of the merchantAction (if available, and non-redirect) in the JSON return values for the createPayment call or the getHostedCheckoutStatus call (merchantAction inside createdPaymentOutput when available).
	 * You are responsible to store the instructionsRenderingData blob in order to be able to present the instructions page at a later time, when this information might no longer be available through Server API calls.
	 */
	public void setRenderingData(String value) {
		this.renderingData = value;
	}

	/**
	 * This is returned for the SHOW_INSTRUCTION, the SHOW_TRANSACTION_RESULTS and the SHOW_FORM actionType.<br>
	 * When returned for SHOW_TRANSACTION_RESULTS or SHOW_FORM, this contains an array of key value pairs of data that needs to be shown to the customer.<br>
	 * Note: The returned value for the key BARCODE is a base64 encoded gif image. By prepending 'data:image/gif;base64,' this value can be used as the source of an HTML inline image.<br>
	 * <br>
	 * For SHOW_FORM, for payment product 3012 (Bancontact), this contains a QR code and a URL intent that can be used to complete the payment in the Bancontact app.<br>
	 * In this case, the key QRCODE contains a base64 encoded PNG image. By prepending 'data:image/png;base64,' this value can be used as the source of an HTML inline image on a desktop or tablet (intended to be scanned by an Android device with the Bancontact app). The key URLINTENT contains a URL intent that can be used as the link of an 'open the app' button on an Android device.
	 * <br>
	 * <br>
	 * For SHOW_FORM, for payment product 863 (WeChat Pay), this contains the PaymentId that WeChat has assigned to the payment. In this case, the key WECHAT_PAYMENTID contains this PaymentId. In addition, this can contain different values depending on the integration type:
	 * <ul class="paragraph-width">
	 * <li>desktopQRCode - contains a QR code that can be used to complete the payment in the WeChat app. In this case, the key QRCODE contains a base64 encoded PNG image. By prepending 'data:image/png;base64,' this value can be used as the source of an HTML inline image on a desktop or tablet (intended to be scanned by a mobile device with the WeChat app).
	 * <li>urlIntent - contains a URL intent that can be used to complete the payment in the WeChat app. In this case, the key URLINTENT contains a URL intent that can be used as the link of an 'open the app' button on a mobile device.
	 * </ul>
	 */
	public List<KeyValuePair> getShowData() {
		return showData;
	}

	/**
	 * This is returned for the SHOW_INSTRUCTION, the SHOW_TRANSACTION_RESULTS and the SHOW_FORM actionType.<br>
	 * When returned for SHOW_TRANSACTION_RESULTS or SHOW_FORM, this contains an array of key value pairs of data that needs to be shown to the customer.<br>
	 * Note: The returned value for the key BARCODE is a base64 encoded gif image. By prepending 'data:image/gif;base64,' this value can be used as the source of an HTML inline image.<br>
	 * <br>
	 * For SHOW_FORM, for payment product 3012 (Bancontact), this contains a QR code and a URL intent that can be used to complete the payment in the Bancontact app.<br>
	 * In this case, the key QRCODE contains a base64 encoded PNG image. By prepending 'data:image/png;base64,' this value can be used as the source of an HTML inline image on a desktop or tablet (intended to be scanned by an Android device with the Bancontact app). The key URLINTENT contains a URL intent that can be used as the link of an 'open the app' button on an Android device.
	 * <br>
	 * <br>
	 * For SHOW_FORM, for payment product 863 (WeChat Pay), this contains the PaymentId that WeChat has assigned to the payment. In this case, the key WECHAT_PAYMENTID contains this PaymentId. In addition, this can contain different values depending on the integration type:
	 * <ul class="paragraph-width">
	 * <li>desktopQRCode - contains a QR code that can be used to complete the payment in the WeChat app. In this case, the key QRCODE contains a base64 encoded PNG image. By prepending 'data:image/png;base64,' this value can be used as the source of an HTML inline image on a desktop or tablet (intended to be scanned by a mobile device with the WeChat app).
	 * <li>urlIntent - contains a URL intent that can be used to complete the payment in the WeChat app. In this case, the key URLINTENT contains a URL intent that can be used as the link of an 'open the app' button on a mobile device.
	 * </ul>
	 */
	public void setShowData(List<KeyValuePair> value) {
		this.showData = value;
	}

	/**
	 * This is returned for the CALL_THIRD_PARTY actionType.<br>
	 * The payment product specific field of the payment product used for the payment will be populated with the third party data that should be used when calling the third party.
	 */
	public ThirdPartyData getThirdPartyData() {
		return thirdPartyData;
	}

	/**
	 * This is returned for the CALL_THIRD_PARTY actionType.<br>
	 * The payment product specific field of the payment product used for the payment will be populated with the third party data that should be used when calling the third party.
	 */
	public void setThirdPartyData(ThirdPartyData value) {
		this.thirdPartyData = value;
	}
}
