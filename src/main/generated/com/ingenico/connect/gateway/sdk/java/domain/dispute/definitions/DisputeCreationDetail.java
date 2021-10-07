/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.dispute.definitions;

public class DisputeCreationDetail {

	private String disputeCreationDate = null;

	private String disputeOriginator = null;

	private String userName = null;

	/**
	 * The date and time of creation of this dispute, in yyyyMMddHHmmss format.
	 */
	public String getDisputeCreationDate() {
		return disputeCreationDate;
	}

	/**
	 * The date and time of creation of this dispute, in yyyyMMddHHmmss format.
	 */
	public void setDisputeCreationDate(String value) {
		this.disputeCreationDate = value;
	}

	/**
	 * The originator of this dispute, which is either Worldline or you as our client.
	 */
	public String getDisputeOriginator() {
		return disputeOriginator;
	}

	/**
	 * The originator of this dispute, which is either Worldline or you as our client.
	 */
	public void setDisputeOriginator(String value) {
		this.disputeOriginator = value;
	}

	/**
	 * The user account name of the dispute creator.
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * The user account name of the dispute creator.
	 */
	public void setUserName(String value) {
		this.userName = value;
	}
}
