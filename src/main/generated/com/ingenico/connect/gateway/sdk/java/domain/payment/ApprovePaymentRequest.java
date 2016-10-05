/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment;

import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.ApprovePaymentNonSepaDirectDebitPaymentMethodSpecificInput;
import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.ApprovePaymentSepaDirectDebitPaymentMethodSpecificInput;
import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.OrderApprovePayment;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_ApprovePaymentRequest">ApprovePaymentRequest</a>
 */
public class ApprovePaymentRequest {

	private Long amount = null;

	private ApprovePaymentNonSepaDirectDebitPaymentMethodSpecificInput directDebitPaymentMethodSpecificInput = null;

	private OrderApprovePayment order = null;

	private ApprovePaymentSepaDirectDebitPaymentMethodSpecificInput sepaDirectDebitPaymentMethodSpecificInput = null;

	public Long getAmount() {
		return amount;
	}

	public void setAmount(Long value) {
		this.amount = value;
	}

	public ApprovePaymentNonSepaDirectDebitPaymentMethodSpecificInput getDirectDebitPaymentMethodSpecificInput() {
		return directDebitPaymentMethodSpecificInput;
	}

	public void setDirectDebitPaymentMethodSpecificInput(ApprovePaymentNonSepaDirectDebitPaymentMethodSpecificInput value) {
		this.directDebitPaymentMethodSpecificInput = value;
	}

	public OrderApprovePayment getOrder() {
		return order;
	}

	public void setOrder(OrderApprovePayment value) {
		this.order = value;
	}

	public ApprovePaymentSepaDirectDebitPaymentMethodSpecificInput getSepaDirectDebitPaymentMethodSpecificInput() {
		return sepaDirectDebitPaymentMethodSpecificInput;
	}

	public void setSepaDirectDebitPaymentMethodSpecificInput(ApprovePaymentSepaDirectDebitPaymentMethodSpecificInput value) {
		this.sepaDirectDebitPaymentMethodSpecificInput = value;
	}
}
