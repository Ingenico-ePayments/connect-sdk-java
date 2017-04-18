/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_PaymentOutput">PaymentOutput</a>
 */
public class PaymentOutput extends OrderOutput {

	private Long amountPaid = null;

	private BankTransferPaymentMethodSpecificOutput bankTransferPaymentMethodSpecificOutput = null;

	private CardPaymentMethodSpecificOutput cardPaymentMethodSpecificOutput = null;

	private CashPaymentMethodSpecificOutput cashPaymentMethodSpecificOutput = null;

	private NonSepaDirectDebitPaymentMethodSpecificOutput directDebitPaymentMethodSpecificOutput = null;

	private InvoicePaymentMethodSpecificOutput invoicePaymentMethodSpecificOutput = null;

	private MobilePaymentMethodSpecificOutput mobilePaymentMethodSpecificOutput = null;

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

	public MobilePaymentMethodSpecificOutput getMobilePaymentMethodSpecificOutput() {
		return mobilePaymentMethodSpecificOutput;
	}

	public void setMobilePaymentMethodSpecificOutput(MobilePaymentMethodSpecificOutput value) {
		this.mobilePaymentMethodSpecificOutput = value;
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
