/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/
 */

package com.ingenico.connect.gateway.sdk.java.domain.payment;

import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.ApprovePaymentNonSepaDirectDebitPaymentMethodSpecificInput;
import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.ApprovePaymentSepaDirectDebitPaymentMethodSpecificInput;
import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.OrderApprovePayment;

public class ApprovePaymentRequest {

	private Long amount = null;

	private ApprovePaymentNonSepaDirectDebitPaymentMethodSpecificInput directDebitPaymentMethodSpecificInput = null;

	private OrderApprovePayment order = null;

	private ApprovePaymentSepaDirectDebitPaymentMethodSpecificInput sepaDirectDebitPaymentMethodSpecificInput = null;

	/**
	 * In case you want to approve the capture of a different lower amount you can specify this here (specified in cents, where single digit currencies are presumed to have 2 digits)
	 */
	public Long getAmount() {
		return amount;
	}

	/**
	 * In case you want to approve the capture of a different lower amount you can specify this here (specified in cents, where single digit currencies are presumed to have 2 digits)
	 */
	public void setAmount(Long value) {
		this.amount = value;
	}

	/**
	 * Object that holds non-SEPA Direct Debit specific input data
	 */
	public ApprovePaymentNonSepaDirectDebitPaymentMethodSpecificInput getDirectDebitPaymentMethodSpecificInput() {
		return directDebitPaymentMethodSpecificInput;
	}

	/**
	 * Object that holds non-SEPA Direct Debit specific input data
	 */
	public void setDirectDebitPaymentMethodSpecificInput(ApprovePaymentNonSepaDirectDebitPaymentMethodSpecificInput value) {
		this.directDebitPaymentMethodSpecificInput = value;
	}

	/**
	 * Object that holds the order data
	 */
	public OrderApprovePayment getOrder() {
		return order;
	}

	/**
	 * Object that holds the order data
	 */
	public void setOrder(OrderApprovePayment value) {
		this.order = value;
	}

	/**
	 * Object that holds SEPA Direct Debit specific input data
	 */
	public ApprovePaymentSepaDirectDebitPaymentMethodSpecificInput getSepaDirectDebitPaymentMethodSpecificInput() {
		return sepaDirectDebitPaymentMethodSpecificInput;
	}

	/**
	 * Object that holds SEPA Direct Debit specific input data
	 */
	public void setSepaDirectDebitPaymentMethodSpecificInput(ApprovePaymentSepaDirectDebitPaymentMethodSpecificInput value) {
		this.sepaDirectDebitPaymentMethodSpecificInput = value;
	}
}
