/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.dispute;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.AmountOfMoney;

public class CreateDisputeRequest {

	private AmountOfMoney amountOfMoney = null;

	private String contactPerson = null;

	private String emailAddress = null;

	private String replyTo = null;

	private String requestMessage = null;

	/**
	 * The amount of money that is to be disputed.
	 */
	public AmountOfMoney getAmountOfMoney() {
		return amountOfMoney;
	}

	/**
	 * The amount of money that is to be disputed.
	 */
	public void setAmountOfMoney(AmountOfMoney value) {
		this.amountOfMoney = value;
	}

	/**
	 * The name of the person on your side who can be contacted regarding this dispute.
	 */
	public String getContactPerson() {
		return contactPerson;
	}

	/**
	 * The name of the person on your side who can be contacted regarding this dispute.
	 */
	public void setContactPerson(String value) {
		this.contactPerson = value;
	}

	/**
	 * The email address of the contact person.
	 */
	public String getEmailAddress() {
		return emailAddress;
	}

	/**
	 * The email address of the contact person.
	 */
	public void setEmailAddress(String value) {
		this.emailAddress = value;
	}

	/**
	 * The email address to which the reply message will be sent.
	 */
	public String getReplyTo() {
		return replyTo;
	}

	/**
	 * The email address to which the reply message will be sent.
	 */
	public void setReplyTo(String value) {
		this.replyTo = value;
	}

	/**
	 * The message sent from you to Ingenico ePayments.
	 */
	public String getRequestMessage() {
		return requestMessage;
	}

	/**
	 * The message sent from you to Ingenico ePayments.
	 */
	public void setRequestMessage(String value) {
		this.requestMessage = value;
	}
}
