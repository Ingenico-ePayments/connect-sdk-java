package com.globalcollect.gateway.sdk.it;

import java.io.IOException;
import java.net.URISyntaxException;

import org.junit.Assert;
import org.junit.Test;

import com.globalcollect.gateway.sdk.java.gc.GcClient;
import com.globalcollect.gateway.sdk.java.gc.fei.definitions.AmountOfMoney;
import com.globalcollect.gateway.sdk.java.gc.fei.definitions.BankAccountBban;
import com.globalcollect.gateway.sdk.java.gc.riskassessments.RiskAssessmentBankAccount;
import com.globalcollect.gateway.sdk.java.gc.riskassessments.RiskAssessmentResponse;
import com.globalcollect.gateway.sdk.java.gc.riskassessments.definitions.CustomerRiskAssessment;
import com.globalcollect.gateway.sdk.java.gc.riskassessments.definitions.OrderRiskAssessment;

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

		GcClient client = getGcClient();
		try {
			RiskAssessmentResponse riskAssessmentResponse = client.merchant("8500").riskassessments().bankaccounts(body);
			Assert.assertTrue(riskAssessmentResponse.getResults().size() > 0);

		} finally {
			client.close();
		}
	}
}
