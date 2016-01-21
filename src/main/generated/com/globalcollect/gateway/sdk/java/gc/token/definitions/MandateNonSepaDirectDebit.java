package com.globalcollect.gateway.sdk.java.gc.token.definitions;

import com.globalcollect.gateway.sdk.java.gc.token.definitions.TokenNonSepaDirectDebitPaymentProduct705SpecificData;
import com.globalcollect.gateway.sdk.java.gc.token.definitions.TokenNonSepaDirectDebitPaymentProduct707SpecificData;

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
