/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.AbstractPaymentMethodSpecificInput;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_MobilePaymentMethodSpecificInput">MobilePaymentMethodSpecificInput</a>
 */
public class MobilePaymentMethodSpecificInput extends AbstractPaymentMethodSpecificInput {

	private String authorizationMode = null;

	private DecryptedPaymentData decryptedPaymentData = null;

	private String encryptedPaymentData = null;

	private MobilePaymentProduct320SpecificInput paymentProduct320SpecificInput = null;

	private Boolean requiresApproval = null;

	private Boolean skipFraudService = null;

	private String transactionId = null;

	public String getAuthorizationMode() {
		return authorizationMode;
	}

	public void setAuthorizationMode(String value) {
		this.authorizationMode = value;
	}

	public DecryptedPaymentData getDecryptedPaymentData() {
		return decryptedPaymentData;
	}

	public void setDecryptedPaymentData(DecryptedPaymentData value) {
		this.decryptedPaymentData = value;
	}

	public String getEncryptedPaymentData() {
		return encryptedPaymentData;
	}

	public void setEncryptedPaymentData(String value) {
		this.encryptedPaymentData = value;
	}

	public MobilePaymentProduct320SpecificInput getPaymentProduct320SpecificInput() {
		return paymentProduct320SpecificInput;
	}

	public void setPaymentProduct320SpecificInput(MobilePaymentProduct320SpecificInput value) {
		this.paymentProduct320SpecificInput = value;
	}

	public Boolean getRequiresApproval() {
		return requiresApproval;
	}

	public void setRequiresApproval(Boolean value) {
		this.requiresApproval = value;
	}

	public Boolean getSkipFraudService() {
		return skipFraudService;
	}

	public void setSkipFraudService(Boolean value) {
		this.skipFraudService = value;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String value) {
		this.transactionId = value;
	}
}
