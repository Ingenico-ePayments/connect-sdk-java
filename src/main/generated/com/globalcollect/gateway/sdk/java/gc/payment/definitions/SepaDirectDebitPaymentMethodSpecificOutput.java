package com.globalcollect.gateway.sdk.java.gc.payment.definitions;

import com.globalcollect.gateway.sdk.java.gc.fei.definitions.FraudResults;
import com.globalcollect.gateway.sdk.java.gc.payment.definitions.AbstractPaymentMethodSpecificOutput;

public class SepaDirectDebitPaymentMethodSpecificOutput extends AbstractPaymentMethodSpecificOutput {

	private FraudResults fraudResults = null;

	public FraudResults getFraudResults() {
		return fraudResults;
	}

	public void setFraudResults(FraudResults value) {
		this.fraudResults = value;
	}
}
