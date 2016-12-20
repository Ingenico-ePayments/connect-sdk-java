/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.FraudFields;
import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.BankTransferPaymentMethodSpecificInput;
import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.CardPaymentMethodSpecificInput;
import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.CashPaymentMethodSpecificInput;
import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.InvoicePaymentMethodSpecificInput;
import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.MobilePaymentMethodSpecificInput;
import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.NonSepaDirectDebitPaymentMethodSpecificInput;
import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.Order;
import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.RedirectPaymentMethodSpecificInput;
import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.SepaDirectDebitPaymentMethodSpecificInput;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_CreatePaymentRequest">CreatePaymentRequest</a>
 */
public class CreatePaymentRequest {

	private BankTransferPaymentMethodSpecificInput bankTransferPaymentMethodSpecificInput = null;

	private CardPaymentMethodSpecificInput cardPaymentMethodSpecificInput = null;

	private CashPaymentMethodSpecificInput cashPaymentMethodSpecificInput = null;

	private NonSepaDirectDebitPaymentMethodSpecificInput directDebitPaymentMethodSpecificInput = null;

	private String encryptedCustomerInput = null;

	private FraudFields fraudFields = null;

	private InvoicePaymentMethodSpecificInput invoicePaymentMethodSpecificInput = null;

	private MobilePaymentMethodSpecificInput mobilePaymentMethodSpecificInput = null;

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

	public MobilePaymentMethodSpecificInput getMobilePaymentMethodSpecificInput() {
		return mobilePaymentMethodSpecificInput;
	}

	public void setMobilePaymentMethodSpecificInput(MobilePaymentMethodSpecificInput value) {
		this.mobilePaymentMethodSpecificInput = value;
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
