package com.globalcollect.gateway.sdk.java.gc.payment;

import com.globalcollect.gateway.sdk.java.gc.payment.definitions.ApprovePaymentNonSepaDirectDebitPaymentMethodSpecificInput;
import com.globalcollect.gateway.sdk.java.gc.payment.definitions.ApprovePaymentSepaDirectDebitPaymentMethodSpecificInput;
import com.globalcollect.gateway.sdk.java.gc.payment.definitions.OrderApprovePayment;

/**
 * class ApprovePaymentRequest
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
