package com.globalcollect.gateway.sdk.java.riskassessments;

import java.net.URISyntaxException;

import com.globalcollect.gateway.sdk.java.ExampleBase;
import com.globalcollect.gateway.sdk.java.gc.GcClient;
import com.globalcollect.gateway.sdk.java.gc.fei.definitions.Address;
import com.globalcollect.gateway.sdk.java.gc.fei.definitions.AmountOfMoney;
import com.globalcollect.gateway.sdk.java.gc.fei.definitions.BankAccountBban;
import com.globalcollect.gateway.sdk.java.gc.riskassessments.RiskAssessmentBankAccount;
import com.globalcollect.gateway.sdk.java.gc.riskassessments.RiskAssessmentResponse;
import com.globalcollect.gateway.sdk.java.gc.riskassessments.definitions.CustomerRiskAssessment;
import com.globalcollect.gateway.sdk.java.gc.riskassessments.definitions.OrderRiskAssessment;

public class RiskAssessmentBankAccountExample extends ExampleBase {

	public void example() throws URISyntaxException {
		GcClient client = getGcClient();

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

		Address billingAddress = new Address();
		billingAddress.setCountryCode("US");
		customer.setBillingAddress(billingAddress);

		order.setCustomer(customer);

		body.setOrder(order);

		RiskAssessmentResponse response = client.merchant("merchantId").riskassessments().bankaccounts(body);
	}
}
