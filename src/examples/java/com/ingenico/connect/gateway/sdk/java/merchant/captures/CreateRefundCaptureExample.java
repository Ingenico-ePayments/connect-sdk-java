/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/
 */

package com.ingenico.connect.gateway.sdk.java.merchant.captures;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;

import com.ingenico.connect.gateway.sdk.java.ApiException;
import com.ingenico.connect.gateway.sdk.java.Client;
import com.ingenico.connect.gateway.sdk.java.CommunicatorConfiguration;
import com.ingenico.connect.gateway.sdk.java.DeclinedRefundException;
import com.ingenico.connect.gateway.sdk.java.Factory;
import com.ingenico.connect.gateway.sdk.java.domain.definitions.AmountOfMoney;
import com.ingenico.connect.gateway.sdk.java.domain.errors.definitions.APIError;
import com.ingenico.connect.gateway.sdk.java.domain.refund.RefundRequest;
import com.ingenico.connect.gateway.sdk.java.domain.refund.RefundResponse;
import com.ingenico.connect.gateway.sdk.java.domain.refund.definitions.RefundReferences;
import com.ingenico.connect.gateway.sdk.java.domain.refund.definitions.RefundResult;

public class CreateRefundCaptureExample {

	@SuppressWarnings("unused")
	public void example() throws URISyntaxException, IOException {
		Client client = getClient();
		try {
			AmountOfMoney amountOfMoney = new AmountOfMoney();
			amountOfMoney.setAmount(500L);
			amountOfMoney.setCurrencyCode("EUR");

			RefundReferences refundReferences = new RefundReferences();
			refundReferences.setMerchantReference("AcmeOrder0001");

			RefundRequest body = new RefundRequest();
			body.setAmountOfMoney(amountOfMoney);
			body.setRefundReferences(refundReferences);

			try {
				RefundResponse response = client.merchant("merchantId").captures().refund("captureId", body);
			} catch (DeclinedRefundException e) {
				handleDeclinedRefund(e.getRefundResult());
			} catch (ApiException e) {
				handleApiErrors(e.getErrors());
			}
		} finally {
			client.close();
		}
	}

	private Client getClient() throws URISyntaxException {
		String apiKeyId = System.getProperty("connect.api.apiKeyId", "someKey");
		String secretApiKey = System.getProperty("connect.api.secretApiKey", "someSecret");

		URL propertiesUrl = getClass().getResource("/example-configuration.properties");
		CommunicatorConfiguration configuration = Factory.createConfiguration(propertiesUrl.toURI(), apiKeyId, secretApiKey);
		return Factory.createClient(configuration);
	}

	private void handleDeclinedRefund(RefundResult refundResult) {
		// handle the result here
	}

	private void handleApiErrors(List<APIError> errors) {
		// handle the errors here
	}
}
