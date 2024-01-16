/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/
 */

package com.ingenico.connect.gateway.sdk.java.merchant.riskassessments;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

import com.ingenico.connect.gateway.sdk.java.Client;
import com.ingenico.connect.gateway.sdk.java.CommunicatorConfiguration;
import com.ingenico.connect.gateway.sdk.java.Factory;
import com.ingenico.connect.gateway.sdk.java.domain.definitions.Address;
import com.ingenico.connect.gateway.sdk.java.domain.definitions.AmountOfMoney;
import com.ingenico.connect.gateway.sdk.java.domain.definitions.BankAccountBban;
import com.ingenico.connect.gateway.sdk.java.domain.riskassessments.RiskAssessmentBankAccount;
import com.ingenico.connect.gateway.sdk.java.domain.riskassessments.RiskAssessmentResponse;
import com.ingenico.connect.gateway.sdk.java.domain.riskassessments.definitions.CustomerRiskAssessment;
import com.ingenico.connect.gateway.sdk.java.domain.riskassessments.definitions.OrderRiskAssessment;

public class RiskAssessmentBankAccountExample {

	@SuppressWarnings("unused")
	public void example() throws URISyntaxException, IOException {
		Client client = getClient();
		try {
			BankAccountBban bankAccountBban = new BankAccountBban();
			bankAccountBban.setAccountNumber("0532013000");
			bankAccountBban.setBankCode("37040044");
			bankAccountBban.setCountryCode("DE");

			AmountOfMoney amountOfMoney = new AmountOfMoney();
			amountOfMoney.setAmount(100L);
			amountOfMoney.setCurrencyCode("EUR");

			Address billingAddress = new Address();
			billingAddress.setCountryCode("US");

			CustomerRiskAssessment customer = new CustomerRiskAssessment();
			customer.setBillingAddress(billingAddress);
			customer.setLocale("en_US");

			OrderRiskAssessment order = new OrderRiskAssessment();
			order.setAmountOfMoney(amountOfMoney);
			order.setCustomer(customer);

			RiskAssessmentBankAccount body = new RiskAssessmentBankAccount();
			body.setBankAccountBban(bankAccountBban);
			body.setOrder(order);

			RiskAssessmentResponse response = client.merchant("merchantId").riskassessments().bankaccounts(body);
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
