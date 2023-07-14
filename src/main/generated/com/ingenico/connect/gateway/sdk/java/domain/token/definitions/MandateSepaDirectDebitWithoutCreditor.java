/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */

package com.ingenico.connect.gateway.sdk.java.domain.token.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.BankAccountIban;

public class MandateSepaDirectDebitWithoutCreditor {

	private BankAccountIban bankAccountIban = null;

	private String customerContractIdentifier = null;

	private Debtor debtor = null;

	private Boolean isRecurring = null;

	private MandateApproval mandateApproval = null;

	private String preNotification = null;

	/**
	 * Object containing Account holder and IBAN information
	 */
	public BankAccountIban getBankAccountIban() {
		return bankAccountIban;
	}

	/**
	 * Object containing Account holder and IBAN information
	 */
	public void setBankAccountIban(BankAccountIban value) {
		this.bankAccountIban = value;
	}

	/**
	 * Identifies the contract between customer and merchant
	 */
	public String getCustomerContractIdentifier() {
		return customerContractIdentifier;
	}

	/**
	 * Identifies the contract between customer and merchant
	 */
	public void setCustomerContractIdentifier(String value) {
		this.customerContractIdentifier = value;
	}

	/**
	 * Object containing information on the debtor
	 */
	public Debtor getDebtor() {
		return debtor;
	}

	/**
	 * Object containing information on the debtor
	 */
	public void setDebtor(Debtor value) {
		this.debtor = value;
	}

	/**
	 * <ul class="paragraph-width"><li>true
	 * <li>false
	 * </ul>
	 */
	public Boolean getIsRecurring() {
		return isRecurring;
	}

	/**
	 * <ul class="paragraph-width"><li>true
	 * <li>false
	 * </ul>
	 */
	public void setIsRecurring(Boolean value) {
		this.isRecurring = value;
	}

	/**
	 * Object containing the details of the mandate approval
	 */
	public MandateApproval getMandateApproval() {
		return mandateApproval;
	}

	/**
	 * Object containing the details of the mandate approval
	 */
	public void setMandateApproval(MandateApproval value) {
		this.mandateApproval = value;
	}

	/**
	 * Indicates whether a pre-notification should be sent to the customer.<br>
	 * <ul class="paragraph-width">
	 * <li>do-not-send - Do not send a pre-notification
	 * <li>send-on-first-collection - Send a pre-notification
	 * </ul>
	 */
	public String getPreNotification() {
		return preNotification;
	}

	/**
	 * Indicates whether a pre-notification should be sent to the customer.<br>
	 * <ul class="paragraph-width">
	 * <li>do-not-send - Do not send a pre-notification
	 * <li>send-on-first-collection - Send a pre-notification
	 * </ul>
	 */
	public void setPreNotification(String value) {
		this.preNotification = value;
	}
}
