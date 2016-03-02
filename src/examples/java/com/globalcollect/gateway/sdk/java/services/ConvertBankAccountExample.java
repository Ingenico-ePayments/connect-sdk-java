package com.globalcollect.gateway.sdk.java.services;

import java.net.URISyntaxException;

import com.globalcollect.gateway.sdk.java.ExampleBase;
import com.globalcollect.gateway.sdk.java.gc.GcClient;
import com.globalcollect.gateway.sdk.java.gc.fei.definitions.BankAccountBban;
import com.globalcollect.gateway.sdk.java.gc.services.BankDetailsRequest;
import com.globalcollect.gateway.sdk.java.gc.services.BankDetailsResponse;

public class ConvertBankAccountExample extends ExampleBase {

	public void example() throws URISyntaxException {
		GcClient client = getGcClient();

		BankDetailsRequest body = new BankDetailsRequest();

		BankAccountBban bankAccountBban = new BankAccountBban();
		bankAccountBban.setCountryCode("DE");
		bankAccountBban.setAccountNumber("053201300");
		bankAccountBban.setBankCode("37040044");
		body.setBankAccountBban(bankAccountBban);

		BankDetailsResponse response = client.merchant("merchantId").services().bankaccount(body);
	}
}
