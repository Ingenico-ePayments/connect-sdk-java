package com.globalcollect.gateway.sdk.java.payments;

import java.net.URISyntaxException;

import com.globalcollect.gateway.sdk.java.ExampleBase;
import com.globalcollect.gateway.sdk.java.gc.GcClient;
import com.globalcollect.gateway.sdk.java.gc.payment.ApprovePaymentRequest;
import com.globalcollect.gateway.sdk.java.gc.payment.PaymentApprovalResponse;
import com.globalcollect.gateway.sdk.java.gc.payment.definitions.ApprovePaymentNonSepaDirectDebitPaymentMethodSpecificInput;
import com.globalcollect.gateway.sdk.java.gc.payment.definitions.OrderApprovePayment;
import com.globalcollect.gateway.sdk.java.gc.payment.definitions.OrderReferencesApprovePayment;

public class ApprovePaymentExample extends ExampleBase {

	public void example() throws URISyntaxException {
		GcClient client = getGcClient();
		ApprovePaymentRequest body = new ApprovePaymentRequest();

		ApprovePaymentNonSepaDirectDebitPaymentMethodSpecificInput directDebitPaymentMethodSpecificInput = new ApprovePaymentNonSepaDirectDebitPaymentMethodSpecificInput();
		directDebitPaymentMethodSpecificInput.setDateCollect("20150201");
		directDebitPaymentMethodSpecificInput.setToken("bfa8a7e4-4530-455a-858d-204ba2afb77e");
		body.setDirectDebitPaymentMethodSpecificInput(directDebitPaymentMethodSpecificInput);

		OrderApprovePayment order = new OrderApprovePayment();
		OrderReferencesApprovePayment references = new OrderReferencesApprovePayment();
		references.setMerchantReference("AcmeOrder0001");
		order.setReferences(references);
		body.setOrder(order);

		body.setAmount(2980L);

		PaymentApprovalResponse response = client.merchant("merchantId").payments().approve("paymentId", body);
	}
}
