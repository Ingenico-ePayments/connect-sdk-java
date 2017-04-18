/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.token.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.BankAccountIban;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_MandateSepaDirectDebitWithoutCreditor">MandateSepaDirectDebitWithoutCreditor</a>
 */
public class MandateSepaDirectDebitWithoutCreditor {

	private BankAccountIban bankAccountIban = null;

	private String customerContractIdentifier = null;

	private Debtor debtor = null;

	private Boolean isRecurring = null;

	private MandateApproval mandateApproval = null;

	private String preNotification = null;

	public BankAccountIban getBankAccountIban() {
		return bankAccountIban;
	}

	public void setBankAccountIban(BankAccountIban value) {
		this.bankAccountIban = value;
	}

	public String getCustomerContractIdentifier() {
		return customerContractIdentifier;
	}

	public void setCustomerContractIdentifier(String value) {
		this.customerContractIdentifier = value;
	}

	public Debtor getDebtor() {
		return debtor;
	}

	public void setDebtor(Debtor value) {
		this.debtor = value;
	}

	public Boolean getIsRecurring() {
		return isRecurring;
	}

	public void setIsRecurring(Boolean value) {
		this.isRecurring = value;
	}

	public MandateApproval getMandateApproval() {
		return mandateApproval;
	}

	public void setMandateApproval(MandateApproval value) {
		this.mandateApproval = value;
	}

	public String getPreNotification() {
		return preNotification;
	}

	public void setPreNotification(String value) {
		this.preNotification = value;
	}
}
