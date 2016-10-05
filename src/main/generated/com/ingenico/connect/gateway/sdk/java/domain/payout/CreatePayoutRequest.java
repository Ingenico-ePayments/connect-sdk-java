/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payout;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.AmountOfMoney;
import com.ingenico.connect.gateway.sdk.java.domain.definitions.BankAccountBban;
import com.ingenico.connect.gateway.sdk.java.domain.definitions.BankAccountIban;
import com.ingenico.connect.gateway.sdk.java.domain.payout.definitions.PayoutCustomer;
import com.ingenico.connect.gateway.sdk.java.domain.payout.definitions.PayoutReferences;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_CreatePayoutRequest">CreatePayoutRequest</a>
 */
public class CreatePayoutRequest {

	private AmountOfMoney amountOfMoney = null;

	private BankAccountBban bankAccountBban = null;

	private BankAccountIban bankAccountIban = null;

	private PayoutCustomer customer = null;

	private String payoutDate = null;

	private String payoutText = null;

	private PayoutReferences references = null;

	private String swiftCode = null;

	public AmountOfMoney getAmountOfMoney() {
		return amountOfMoney;
	}

	public void setAmountOfMoney(AmountOfMoney value) {
		this.amountOfMoney = value;
	}

	public BankAccountBban getBankAccountBban() {
		return bankAccountBban;
	}

	public void setBankAccountBban(BankAccountBban value) {
		this.bankAccountBban = value;
	}

	public BankAccountIban getBankAccountIban() {
		return bankAccountIban;
	}

	public void setBankAccountIban(BankAccountIban value) {
		this.bankAccountIban = value;
	}

	public PayoutCustomer getCustomer() {
		return customer;
	}

	public void setCustomer(PayoutCustomer value) {
		this.customer = value;
	}

	public String getPayoutDate() {
		return payoutDate;
	}

	public void setPayoutDate(String value) {
		this.payoutDate = value;
	}

	public String getPayoutText() {
		return payoutText;
	}

	public void setPayoutText(String value) {
		this.payoutText = value;
	}

	public PayoutReferences getReferences() {
		return references;
	}

	public void setReferences(PayoutReferences value) {
		this.references = value;
	}

	public String getSwiftCode() {
		return swiftCode;
	}

	public void setSwiftCode(String value) {
		this.swiftCode = value;
	}
}
