/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/
 */

package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

public class PaymentOutput extends OrderOutput {

	private Long amountPaid = null;

	private Long amountReversed = null;

	private BankTransferPaymentMethodSpecificOutput bankTransferPaymentMethodSpecificOutput = null;

	private CardPaymentMethodSpecificOutput cardPaymentMethodSpecificOutput = null;

	private CashPaymentMethodSpecificOutput cashPaymentMethodSpecificOutput = null;

	private NonSepaDirectDebitPaymentMethodSpecificOutput directDebitPaymentMethodSpecificOutput = null;

	private EInvoicePaymentMethodSpecificOutput eInvoicePaymentMethodSpecificOutput = null;

	private InvoicePaymentMethodSpecificOutput invoicePaymentMethodSpecificOutput = null;

	private MobilePaymentMethodSpecificOutput mobilePaymentMethodSpecificOutput = null;

	private String paymentMethod = null;

	private RedirectPaymentMethodSpecificOutput redirectPaymentMethodSpecificOutput = null;

	private String reversalReason = null;

	private SepaDirectDebitPaymentMethodSpecificOutput sepaDirectDebitPaymentMethodSpecificOutput = null;

	/**
	 * Amount that has been paid
	 */
	public Long getAmountPaid() {
		return amountPaid;
	}

	/**
	 * Amount that has been paid
	 */
	public void setAmountPaid(Long value) {
		this.amountPaid = value;
	}

	/**
	 * Amount that has been reversed
	 */
	public Long getAmountReversed() {
		return amountReversed;
	}

	/**
	 * Amount that has been reversed
	 */
	public void setAmountReversed(Long value) {
		this.amountReversed = value;
	}

	/**
	 * Object containing the bank transfer payment method details
	 */
	public BankTransferPaymentMethodSpecificOutput getBankTransferPaymentMethodSpecificOutput() {
		return bankTransferPaymentMethodSpecificOutput;
	}

	/**
	 * Object containing the bank transfer payment method details
	 */
	public void setBankTransferPaymentMethodSpecificOutput(BankTransferPaymentMethodSpecificOutput value) {
		this.bankTransferPaymentMethodSpecificOutput = value;
	}

	/**
	 * Object containing the card payment method details
	 */
	public CardPaymentMethodSpecificOutput getCardPaymentMethodSpecificOutput() {
		return cardPaymentMethodSpecificOutput;
	}

	/**
	 * Object containing the card payment method details
	 */
	public void setCardPaymentMethodSpecificOutput(CardPaymentMethodSpecificOutput value) {
		this.cardPaymentMethodSpecificOutput = value;
	}

	/**
	 * Object containing the cash payment method details
	 */
	public CashPaymentMethodSpecificOutput getCashPaymentMethodSpecificOutput() {
		return cashPaymentMethodSpecificOutput;
	}

	/**
	 * Object containing the cash payment method details
	 */
	public void setCashPaymentMethodSpecificOutput(CashPaymentMethodSpecificOutput value) {
		this.cashPaymentMethodSpecificOutput = value;
	}

	/**
	 * Object containing the non SEPA direct debit payment method details
	 */
	public NonSepaDirectDebitPaymentMethodSpecificOutput getDirectDebitPaymentMethodSpecificOutput() {
		return directDebitPaymentMethodSpecificOutput;
	}

	/**
	 * Object containing the non SEPA direct debit payment method details
	 */
	public void setDirectDebitPaymentMethodSpecificOutput(NonSepaDirectDebitPaymentMethodSpecificOutput value) {
		this.directDebitPaymentMethodSpecificOutput = value;
	}

	/**
	 * Object containing the e-invoice payment method details
	 */
	public EInvoicePaymentMethodSpecificOutput getEInvoicePaymentMethodSpecificOutput() {
		return eInvoicePaymentMethodSpecificOutput;
	}

	/**
	 * Object containing the e-invoice payment method details
	 */
	public void setEInvoicePaymentMethodSpecificOutput(EInvoicePaymentMethodSpecificOutput value) {
		this.eInvoicePaymentMethodSpecificOutput = value;
	}

	/**
	 * Object containing the invoice payment method details
	 */
	public InvoicePaymentMethodSpecificOutput getInvoicePaymentMethodSpecificOutput() {
		return invoicePaymentMethodSpecificOutput;
	}

	/**
	 * Object containing the invoice payment method details
	 */
	public void setInvoicePaymentMethodSpecificOutput(InvoicePaymentMethodSpecificOutput value) {
		this.invoicePaymentMethodSpecificOutput = value;
	}

	/**
	 * Object containing the mobile payment method details
	 */
	public MobilePaymentMethodSpecificOutput getMobilePaymentMethodSpecificOutput() {
		return mobilePaymentMethodSpecificOutput;
	}

	/**
	 * Object containing the mobile payment method details
	 */
	public void setMobilePaymentMethodSpecificOutput(MobilePaymentMethodSpecificOutput value) {
		this.mobilePaymentMethodSpecificOutput = value;
	}

	/**
	 * Payment method identifier used by the our payment engine with the following possible values:
	 * <ul class="paragraph-width">
	 * <li>bankRefund
	 * <li>bankTransfer
	 * <li>card
	 * <li>cash
	 * <li>directDebit
	 * <li>eInvoice
	 * <li>invoice
	 * <li>redirect
	 * </ul>
	 */
	public String getPaymentMethod() {
		return paymentMethod;
	}

	/**
	 * Payment method identifier used by the our payment engine with the following possible values:
	 * <ul class="paragraph-width">
	 * <li>bankRefund
	 * <li>bankTransfer
	 * <li>card
	 * <li>cash
	 * <li>directDebit
	 * <li>eInvoice
	 * <li>invoice
	 * <li>redirect
	 * </ul>
	 */
	public void setPaymentMethod(String value) {
		this.paymentMethod = value;
	}

	/**
	 * Object containing the redirect payment product details
	 */
	public RedirectPaymentMethodSpecificOutput getRedirectPaymentMethodSpecificOutput() {
		return redirectPaymentMethodSpecificOutput;
	}

	/**
	 * Object containing the redirect payment product details
	 */
	public void setRedirectPaymentMethodSpecificOutput(RedirectPaymentMethodSpecificOutput value) {
		this.redirectPaymentMethodSpecificOutput = value;
	}

	/**
	 * The reason description given for the reversedAmount property.
	 */
	public String getReversalReason() {
		return reversalReason;
	}

	/**
	 * The reason description given for the reversedAmount property.
	 */
	public void setReversalReason(String value) {
		this.reversalReason = value;
	}

	/**
	 * Object containing the SEPA direct debit details
	 */
	public SepaDirectDebitPaymentMethodSpecificOutput getSepaDirectDebitPaymentMethodSpecificOutput() {
		return sepaDirectDebitPaymentMethodSpecificOutput;
	}

	/**
	 * Object containing the SEPA direct debit details
	 */
	public void setSepaDirectDebitPaymentMethodSpecificOutput(SepaDirectDebitPaymentMethodSpecificOutput value) {
		this.sepaDirectDebitPaymentMethodSpecificOutput = value;
	}
}
