package com.globalcollect.gateway.sdk.java.gc.payment;

import com.globalcollect.gateway.sdk.java.gc.fei.definitions.FraudFields;
import com.globalcollect.gateway.sdk.java.gc.payment.definitions.BankTransferPaymentMethodSpecificInput;
import com.globalcollect.gateway.sdk.java.gc.payment.definitions.CardPaymentMethodSpecificInput;
import com.globalcollect.gateway.sdk.java.gc.payment.definitions.CashPaymentMethodSpecificInput;
import com.globalcollect.gateway.sdk.java.gc.payment.definitions.CheckPaymentMethodSpecificInput;
import com.globalcollect.gateway.sdk.java.gc.payment.definitions.InvoicePaymentMethodSpecificInput;
import com.globalcollect.gateway.sdk.java.gc.payment.definitions.NonSepaDirectDebitPaymentMethodSpecificInput;
import com.globalcollect.gateway.sdk.java.gc.payment.definitions.Order;
import com.globalcollect.gateway.sdk.java.gc.payment.definitions.RedirectPaymentMethodSpecificInput;
import com.globalcollect.gateway.sdk.java.gc.payment.definitions.SepaDirectDebitPaymentMethodSpecificInput;

/**
 * class CreatePaymentRequest
 */
public class CreatePaymentRequest {

	private BankTransferPaymentMethodSpecificInput bankTransferPaymentMethodSpecificInput = null;

	private CardPaymentMethodSpecificInput cardPaymentMethodSpecificInput = null;

	private CashPaymentMethodSpecificInput cashPaymentMethodSpecificInput = null;

	private CheckPaymentMethodSpecificInput checkPaymentMethodSpecificInput = null;

	private NonSepaDirectDebitPaymentMethodSpecificInput directDebitPaymentMethodSpecificInput = null;

	private String encryptedCustomerInput = null;

	private FraudFields fraudFields = null;

	private InvoicePaymentMethodSpecificInput invoicePaymentMethodSpecificInput = null;

	private Order order = null;

	private RedirectPaymentMethodSpecificInput redirectPaymentMethodSpecificInput = null;

	private SepaDirectDebitPaymentMethodSpecificInput sepaDirectDebitPaymentMethodSpecificInput = null;

	public BankTransferPaymentMethodSpecificInput getBankTransferPaymentMethodSpecificInput() {
		return bankTransferPaymentMethodSpecificInput;
	}

	public void setBankTransferPaymentMethodSpecificInput(BankTransferPaymentMethodSpecificInput value) {
		this.bankTransferPaymentMethodSpecificInput = value;
	}

	public CardPaymentMethodSpecificInput getCardPaymentMethodSpecificInput() {
		return cardPaymentMethodSpecificInput;
	}

	public void setCardPaymentMethodSpecificInput(CardPaymentMethodSpecificInput value) {
		this.cardPaymentMethodSpecificInput = value;
	}

	public CashPaymentMethodSpecificInput getCashPaymentMethodSpecificInput() {
		return cashPaymentMethodSpecificInput;
	}

	public void setCashPaymentMethodSpecificInput(CashPaymentMethodSpecificInput value) {
		this.cashPaymentMethodSpecificInput = value;
	}

	public CheckPaymentMethodSpecificInput getCheckPaymentMethodSpecificInput() {
		return checkPaymentMethodSpecificInput;
	}

	public void setCheckPaymentMethodSpecificInput(CheckPaymentMethodSpecificInput value) {
		this.checkPaymentMethodSpecificInput = value;
	}

	public NonSepaDirectDebitPaymentMethodSpecificInput getDirectDebitPaymentMethodSpecificInput() {
		return directDebitPaymentMethodSpecificInput;
	}

	public void setDirectDebitPaymentMethodSpecificInput(NonSepaDirectDebitPaymentMethodSpecificInput value) {
		this.directDebitPaymentMethodSpecificInput = value;
	}

	public String getEncryptedCustomerInput() {
		return encryptedCustomerInput;
	}

	public void setEncryptedCustomerInput(String value) {
		this.encryptedCustomerInput = value;
	}

	public FraudFields getFraudFields() {
		return fraudFields;
	}

	public void setFraudFields(FraudFields value) {
		this.fraudFields = value;
	}

	public InvoicePaymentMethodSpecificInput getInvoicePaymentMethodSpecificInput() {
		return invoicePaymentMethodSpecificInput;
	}

	public void setInvoicePaymentMethodSpecificInput(InvoicePaymentMethodSpecificInput value) {
		this.invoicePaymentMethodSpecificInput = value;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order value) {
		this.order = value;
	}

	public RedirectPaymentMethodSpecificInput getRedirectPaymentMethodSpecificInput() {
		return redirectPaymentMethodSpecificInput;
	}

	public void setRedirectPaymentMethodSpecificInput(RedirectPaymentMethodSpecificInput value) {
		this.redirectPaymentMethodSpecificInput = value;
	}

	public SepaDirectDebitPaymentMethodSpecificInput getSepaDirectDebitPaymentMethodSpecificInput() {
		return sepaDirectDebitPaymentMethodSpecificInput;
	}

	public void setSepaDirectDebitPaymentMethodSpecificInput(SepaDirectDebitPaymentMethodSpecificInput value) {
		this.sepaDirectDebitPaymentMethodSpecificInput = value;
	}
}
