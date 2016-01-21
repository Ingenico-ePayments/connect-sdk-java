package com.globalcollect.gateway.sdk.java.gc.token.definitions;

import com.globalcollect.gateway.sdk.java.gc.fei.definitions.BankAccountIban;
import com.globalcollect.gateway.sdk.java.gc.token.definitions.Debtor;
import com.globalcollect.gateway.sdk.java.gc.token.definitions.MandateApproval;

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
