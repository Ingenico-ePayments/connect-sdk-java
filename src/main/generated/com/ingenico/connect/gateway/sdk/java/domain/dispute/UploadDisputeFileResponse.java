/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.dispute;

/**
 * Response of a file upload request
 */
public class UploadDisputeFileResponse {

	private String disputeId = null;

	private String fileId = null;

	/**
	 * Dispute ID that is associated with the created dispute.
	 */
	public String getDisputeId() {
		return disputeId;
	}

	/**
	 * Dispute ID that is associated with the created dispute.
	 */
	public void setDisputeId(String value) {
		this.disputeId = value;
	}

	/**
	 * The file ID that is associated with the uploaded file. This ID can be used for further communication regarding the file and retrieval of aforementioned property.
	 */
	public String getFileId() {
		return fileId;
	}

	/**
	 * The file ID that is associated with the uploaded file. This ID can be used for further communication regarding the file and retrieval of aforementioned property.
	 */
	public void setFileId(String value) {
		this.fileId = value;
	}
}
