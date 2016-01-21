package com.globalcollect.gateway.sdk.java.gc.payment.definitions;

import com.globalcollect.gateway.sdk.java.gc.payment.definitions.BankTransferPaymentMethodSpecificOutput;
import com.globalcollect.gateway.sdk.java.gc.payment.definitions.CardPaymentMethodSpecificOutput;
import com.globalcollect.gateway.sdk.java.gc.payment.definitions.CashPaymentMethodSpecificOutput;
import com.globalcollect.gateway.sdk.java.gc.payment.definitions.CheckPaymentMethodSpecificOutput;
import com.globalcollect.gateway.sdk.java.gc.payment.definitions.InvoicePaymentMethodSpecificOutput;
import com.globalcollect.gateway.sdk.java.gc.payment.definitions.NonSepaDirectDebitPaymentMethodSpecificOutput;
import com.globalcollect.gateway.sdk.java.gc.payment.definitions.RedirectPaymentMethodSpecificOutput;
import com.globalcollect.gateway.sdk.java.gc.payment.definitions.SepaDirectDebitPaymentMethodSpecificOutput;
import com.globalcollect.gateway.sdk.java.gc.payment.definitions.OrderOutput;

public class PaymentOutput extends OrderOutput {

	private Long amountPaid = null;

	private BankTransferPaymentMethodSpecificOutput bankTransferPaymentMethodSpecificOutput = null;

	private CardPaymentMethodSpecificOutput cardPaymentMethodSpecificOutput = null;

	private CashPaymentMethodSpecificOutput cashPaymentMethodSpecificOutput = null;

	private CheckPaymentMethodSpecificOutput checkPaymentMethodSpecificOutput = null;

	private NonSepaDirectDebitPaymentMethodSpecificOutput directDebitPaymentMethodSpecificOutput = null;

	private InvoicePaymentMethodSpecificOutput invoicePaymentMethodSpecificOutput = null;

	private String paymentMethod = null;

	private RedirectPaymentMethodSpecificOutput redirectPaymentMethodSpecificOutput = null;

	private SepaDirectDebitPaymentMethodSpecificOutput sepaDirectDebitPaymentMethodSpecificOutput = null;

	public Long getAmountPaid() {
		return amountPaid;
	}

	public void setAmountPaid(Long value) {
		this.amountPaid = value;
	}

	public BankTransferPaymentMethodSpecificOutput getBankTransferPaymentMethodSpecificOutput() {
		return bankTransferPaymentMethodSpecificOutput;
	}

	public void setBankTransferPaymentMethodSpecificOutput(BankTransferPaymentMethodSpecificOutput value) {
		this.bankTransferPaymentMethodSpecificOutput = value;
	}

	public CardPaymentMethodSpecificOutput getCardPaymentMethodSpecificOutput() {
		return cardPaymentMethodSpecificOutput;
	}

	public void setCardPaymentMethodSpecificOutput(CardPaymentMethodSpecificOutput value) {
		this.cardPaymentMethodSpecificOutput = value;
	}

	public CashPaymentMethodSpecificOutput getCashPaymentMethodSpecificOutput() {
		return cashPaymentMethodSpecificOutput;
	}

	public void setCashPaymentMethodSpecificOutput(CashPaymentMethodSpecificOutput value) {
		this.cashPaymentMethodSpecificOutput = value;
	}

	public CheckPaymentMethodSpecificOutput getCheckPaymentMethodSpecificOutput() {
		return checkPaymentMethodSpecificOutput;
	}

	public void setCheckPaymentMethodSpecificOutput(CheckPaymentMethodSpecificOutput value) {
		this.checkPaymentMethodSpecificOutput = value;
	}

	public NonSepaDirectDebitPaymentMethodSpecificOutput getDirectDebitPaymentMethodSpecificOutput() {
		return directDebitPaymentMethodSpecificOutput;
	}

	public void setDirectDebitPaymentMethodSpecificOutput(NonSepaDirectDebitPaymentMethodSpecificOutput value) {
		this.directDebitPaymentMethodSpecificOutput = value;
	}

	public InvoicePaymentMethodSpecificOutput getInvoicePaymentMethodSpecificOutput() {
		return invoicePaymentMethodSpecificOutput;
	}

	public void setInvoicePaymentMethodSpecificOutput(InvoicePaymentMethodSpecificOutput value) {
		this.invoicePaymentMethodSpecificOutput = value;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String value) {
		this.paymentMethod = value;
	}

	public RedirectPaymentMethodSpecificOutput getRedirectPaymentMethodSpecificOutput() {
		return redirectPaymentMethodSpecificOutput;
	}

	public void setRedirectPaymentMethodSpecificOutput(RedirectPaymentMethodSpecificOutput value) {
		this.redirectPaymentMethodSpecificOutput = value;
	}

	public SepaDirectDebitPaymentMethodSpecificOutput getSepaDirectDebitPaymentMethodSpecificOutput() {
		return sepaDirectDebitPaymentMethodSpecificOutput;
	}

	public void setSepaDirectDebitPaymentMethodSpecificOutput(SepaDirectDebitPaymentMethodSpecificOutput value) {
		this.sepaDirectDebitPaymentMethodSpecificOutput = value;
	}
}
