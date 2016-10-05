/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.token.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.token.definitions.TokenNonSepaDirectDebitPaymentProduct705SpecificData;
import com.ingenico.connect.gateway.sdk.java.domain.token.definitions.TokenNonSepaDirectDebitPaymentProduct707SpecificData;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_MandateNonSepaDirectDebit">MandateNonSepaDirectDebit</a>
 */
public class MandateNonSepaDirectDebit {

	private TokenNonSepaDirectDebitPaymentProduct705SpecificData paymentProduct705SpecificData = null;

	private TokenNonSepaDirectDebitPaymentProduct707SpecificData paymentProduct707SpecificData = null;

	public TokenNonSepaDirectDebitPaymentProduct705SpecificData getPaymentProduct705SpecificData() {
		return paymentProduct705SpecificData;
	}

	public void setPaymentProduct705SpecificData(TokenNonSepaDirectDebitPaymentProduct705SpecificData value) {
		this.paymentProduct705SpecificData = value;
	}

	public TokenNonSepaDirectDebitPaymentProduct707SpecificData getPaymentProduct707SpecificData() {
		return paymentProduct707SpecificData;
	}

	public void setPaymentProduct707SpecificData(TokenNonSepaDirectDebitPaymentProduct707SpecificData value) {
		this.paymentProduct707SpecificData = value;
	}
}
