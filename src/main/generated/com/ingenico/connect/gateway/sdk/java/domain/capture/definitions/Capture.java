/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */

package com.ingenico.connect.gateway.sdk.java.domain.capture.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.AbstractOrderStatus;

public class Capture extends AbstractOrderStatus {

	private CaptureOutput captureOutput = null;

	private String status = null;

	private CaptureStatusOutput statusOutput = null;

	/**
	 * Object containing capture details
	 */
	public CaptureOutput getCaptureOutput() {
		return captureOutput;
	}

	/**
	 * Object containing capture details
	 */
	public void setCaptureOutput(CaptureOutput value) {
		this.captureOutput = value;
	}

	/**
	 * Current high-level status of the payment in a human-readable form. Possible values are :
	 * <ul class="paragraph-width">
	 * <li>CAPTURE_REQUESTED - The transaction is in the queue to be captured.
	 * <li>CAPTURED - The transaction has been captured and we have received online confirmation.
	 * <li>CANCELLED - You have cancelled the transaction.
	 * <li>REJECTED_CAPTURE - We or one of our downstream acquirers/providers have rejected the capture request.
	 * <li>REVERSED - The transaction has been reversed.
	 * </ul><br>
	 * Please see <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/statuses.html">Statuses</a> for a full overview of possible values.
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Current high-level status of the payment in a human-readable form. Possible values are :
	 * <ul class="paragraph-width">
	 * <li>CAPTURE_REQUESTED - The transaction is in the queue to be captured.
	 * <li>CAPTURED - The transaction has been captured and we have received online confirmation.
	 * <li>CANCELLED - You have cancelled the transaction.
	 * <li>REJECTED_CAPTURE - We or one of our downstream acquirers/providers have rejected the capture request.
	 * <li>REVERSED - The transaction has been reversed.
	 * </ul><br>
	 * Please see <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/statuses.html">Statuses</a> for a full overview of possible values.
	 */
	public void setStatus(String value) {
		this.status = value;
	}

	/**
	 * This object has the numeric representation of the current capture status, timestamp of last status change and performable action on the current payment resource.
	 * In case of failed payments and negative scenarios, detailed error information is listed.
	 */
	public CaptureStatusOutput getStatusOutput() {
		return statusOutput;
	}

	/**
	 * This object has the numeric representation of the current capture status, timestamp of last status change and performable action on the current payment resource.
	 * In case of failed payments and negative scenarios, detailed error information is listed.
	 */
	public void setStatusOutput(CaptureStatusOutput value) {
		this.statusOutput = value;
	}
}
