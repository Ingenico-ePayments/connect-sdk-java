package com.ingenico.connect.gateway.sdk.it;

import java.io.IOException;
import java.net.URISyntaxException;

import org.junit.Assert;
import org.junit.Test;

import com.ingenico.connect.gateway.sdk.java.Client;
import com.ingenico.connect.gateway.sdk.java.domain.definitions.AmountOfMoney;
import com.ingenico.connect.gateway.sdk.java.domain.definitions.BankAccountBban;
import com.ingenico.connect.gateway.sdk.java.domain.riskassessments.RiskAssessmentBankAccount;
import com.ingenico.connect.gateway.sdk.java.domain.riskassessments.RiskAssessmentResponse;
import com.ingenico.connect.gateway.sdk.java.domain.riskassessments.definitions.CustomerRiskAssessment;
import com.ingenico.connect.gateway.sdk.java.domain.riskassessments.definitions.OrderRiskAssessment;

public class RiskAssessmentsTest extends ItTest {

	/**
	 * Smoke test for risk assessments service.
	 */
	@Test
	public void test() throws URISyntaxException, IOException {

		RiskAssessmentBankAccount body = new RiskAssessmentBankAccount();

		BankAccountBban bankAccountBban = new BankAccountBban();
		bankAccountBban.setCountryCode("DE");
		bankAccountBban.setAccountNumber("0532013000");
		bankAccountBban.setBankCode("37040044");
		body.setBankAccountBban(bankAccountBban);

		OrderRiskAssessment order = new OrderRiskAssessment();

		AmountOfMoney amountOfMoney = new AmountOfMoney();
		amountOfMoney.setAmount(100L);
		amountOfMoney.setCurrencyCode("EUR");
		order.setAmountOfMoney(amountOfMoney);

		CustomerRiskAssessment customer = new CustomerRiskAssessment();
		customer.setLocale("en_GB");
		order.setCustomer(customer);

		body.setOrder(order);

		Client client = getClient();
		try {
			RiskAssessmentResponse riskAssessmentResponse = client.merchant(getMerchantId()).riskassessments().bankaccounts(body);
			Assert.assertTrue(riskAssessmentResponse.getResults().size() > 0);

		} finally {
			client.close();
		}
	}
}
