package com.globalcollect.gateway.sdk.java.gc.payment.definitions;

import com.globalcollect.gateway.sdk.java.gc.payment.definitions.RedirectPaymentProduct809SpecificInput;
import com.globalcollect.gateway.sdk.java.gc.payment.definitions.RedirectPaymentProduct816SpecificInput;
import com.globalcollect.gateway.sdk.java.gc.payment.definitions.RedirectPaymentProduct882SpecificInput;
import com.globalcollect.gateway.sdk.java.gc.payment.definitions.RedirectPaymentMethodSpecificInputBase;

public class RedirectPaymentMethodSpecificInput extends RedirectPaymentMethodSpecificInputBase {

	private Boolean isRecurring = null;

	private RedirectPaymentProduct809SpecificInput paymentProduct809SpecificInput = null;

	private RedirectPaymentProduct816SpecificInput paymentProduct816SpecificInput = null;

	private RedirectPaymentProduct882SpecificInput paymentProduct882SpecificInput = null;

	private String returnUrl = null;

	public Boolean getIsRecurring() {
		return isRecurring;
	}

	public void setIsRecurring(Boolean value) {
		this.isRecurring = value;
	}

	public RedirectPaymentProduct809SpecificInput getPaymentProduct809SpecificInput() {
		return paymentProduct809SpecificInput;
	}

	public void setPaymentProduct809SpecificInput(RedirectPaymentProduct809SpecificInput value) {
		this.paymentProduct809SpecificInput = value;
	}

	public RedirectPaymentProduct816SpecificInput getPaymentProduct816SpecificInput() {
		return paymentProduct816SpecificInput;
	}

	public void setPaymentProduct816SpecificInput(RedirectPaymentProduct816SpecificInput value) {
		this.paymentProduct816SpecificInput = value;
	}

	public RedirectPaymentProduct882SpecificInput getPaymentProduct882SpecificInput() {
		return paymentProduct882SpecificInput;
	}

	public void setPaymentProduct882SpecificInput(RedirectPaymentProduct882SpecificInput value) {
		this.paymentProduct882SpecificInput = value;
	}

	public String getReturnUrl() {
		return returnUrl;
	}

	public void setReturnUrl(String value) {
		this.returnUrl = value;
	}
}
