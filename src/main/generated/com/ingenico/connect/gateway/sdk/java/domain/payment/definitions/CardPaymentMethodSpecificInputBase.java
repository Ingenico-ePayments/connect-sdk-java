/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.AbstractPaymentMethodSpecificInput;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_CardPaymentMethodSpecificInputBase">CardPaymentMethodSpecificInputBase</a>
 */
public class CardPaymentMethodSpecificInputBase extends AbstractPaymentMethodSpecificInput {

	private String authorizationMode = null;

	private String customerReference = null;

	private String recurringPaymentSequenceIndicator = null;

	private Boolean requiresApproval = null;

	private Boolean skipAuthentication = null;

	private Boolean skipFraudService = null;

	private String token = null;

	public String getAuthorizationMode() {
		return authorizationMode;
	}

	public void setAuthorizationMode(String value) {
		this.authorizationMode = value;
	}

	public String getCustomerReference() {
		return customerReference;
	}

	public void setCustomerReference(String value) {
		this.customerReference = value;
	}

	public String getRecurringPaymentSequenceIndicator() {
		return recurringPaymentSequenceIndicator;
	}

	public void setRecurringPaymentSequenceIndicator(String value) {
		this.recurringPaymentSequenceIndicator = value;
	}

	public Boolean getRequiresApproval() {
		return requiresApproval;
	}

	public void setRequiresApproval(Boolean value) {
		this.requiresApproval = value;
	}

	public Boolean getSkipAuthentication() {
		return skipAuthentication;
	}

	public void setSkipAuthentication(Boolean value) {
		this.skipAuthentication = value;
	}

	public Boolean getSkipFraudService() {
		return skipFraudService;
	}

	public void setSkipFraudService(Boolean value) {
		this.skipFraudService = value;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String value) {
		this.token = value;
	}
}
