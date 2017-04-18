/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.merchant.payments;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

import com.ingenico.connect.gateway.sdk.java.Client;
import com.ingenico.connect.gateway.sdk.java.CommunicatorConfiguration;
import com.ingenico.connect.gateway.sdk.java.Factory;
import com.ingenico.connect.gateway.sdk.java.domain.payment.ApprovePaymentRequest;
import com.ingenico.connect.gateway.sdk.java.domain.payment.PaymentApprovalResponse;
import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.ApprovePaymentNonSepaDirectDebitPaymentMethodSpecificInput;
import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.OrderApprovePayment;
import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.OrderReferencesApprovePayment;

public class ApprovePaymentExample {

	@SuppressWarnings("unused")
	public void example() throws URISyntaxException, IOException {
		Client client = getClient();
		try {
			ApprovePaymentNonSepaDirectDebitPaymentMethodSpecificInput directDebitPaymentMethodSpecificInput = new ApprovePaymentNonSepaDirectDebitPaymentMethodSpecificInput();
			directDebitPaymentMethodSpecificInput.setDateCollect("20150201");
			directDebitPaymentMethodSpecificInput.setToken("bfa8a7e4-4530-455a-858d-204ba2afb77e");

			OrderReferencesApprovePayment references = new OrderReferencesApprovePayment();
			references.setMerchantReference("AcmeOrder0001");

			OrderApprovePayment order = new OrderApprovePayment();
			order.setReferences(references);

			ApprovePaymentRequest body = new ApprovePaymentRequest();
			body.setAmount(2980L);
			body.setDirectDebitPaymentMethodSpecificInput(directDebitPaymentMethodSpecificInput);
			body.setOrder(order);

			PaymentApprovalResponse response = client.merchant("merchantId").payments().approve("paymentId", body);
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
}
