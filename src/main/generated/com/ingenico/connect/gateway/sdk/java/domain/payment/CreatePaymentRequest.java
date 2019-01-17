/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.FraudFields;
import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.BankTransferPaymentMethodSpecificInput;
import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.CardPaymentMethodSpecificInput;
import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.CashPaymentMethodSpecificInput;
import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.EInvoicePaymentMethodSpecificInput;
import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.InvoicePaymentMethodSpecificInput;
import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.MobilePaymentMethodSpecificInput;
import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.NonSepaDirectDebitPaymentMethodSpecificInput;
import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.Order;
import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.RedirectPaymentMethodSpecificInput;
import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.SepaDirectDebitPaymentMethodSpecificInput;

public class CreatePaymentRequest {

	private BankTransferPaymentMethodSpecificInput bankTransferPaymentMethodSpecificInput = null;

	private CardPaymentMethodSpecificInput cardPaymentMethodSpecificInput = null;

	private CashPaymentMethodSpecificInput cashPaymentMethodSpecificInput = null;

	private NonSepaDirectDebitPaymentMethodSpecificInput directDebitPaymentMethodSpecificInput = null;

	private EInvoicePaymentMethodSpecificInput eInvoicePaymentMethodSpecificInput = null;

	private String encryptedCustomerInput = null;

	private FraudFields fraudFields = null;

	private InvoicePaymentMethodSpecificInput invoicePaymentMethodSpecificInput = null;

	private MobilePaymentMethodSpecificInput mobilePaymentMethodSpecificInput = null;

	private Order order = null;

	private RedirectPaymentMethodSpecificInput redirectPaymentMethodSpecificInput = null;

	private SepaDirectDebitPaymentMethodSpecificInput sepaDirectDebitPaymentMethodSpecificInput = null;

	/**
	 * Object containing the specific input details for bank transfer payments
	 */
	public BankTransferPaymentMethodSpecificInput getBankTransferPaymentMethodSpecificInput() {
		return bankTransferPaymentMethodSpecificInput;
	}

	/**
	 * Object containing the specific input details for bank transfer payments
	 */
	public void setBankTransferPaymentMethodSpecificInput(BankTransferPaymentMethodSpecificInput value) {
		this.bankTransferPaymentMethodSpecificInput = value;
	}

	/**
	 * Object containing the specific input details for card payments
	 */
	public CardPaymentMethodSpecificInput getCardPaymentMethodSpecificInput() {
		return cardPaymentMethodSpecificInput;
	}

	/**
	 * Object containing the specific input details for card payments
	 */
	public void setCardPaymentMethodSpecificInput(CardPaymentMethodSpecificInput value) {
		this.cardPaymentMethodSpecificInput = value;
	}

	/**
	 * Object containing the specific input details for cash payments
	 */
	public CashPaymentMethodSpecificInput getCashPaymentMethodSpecificInput() {
		return cashPaymentMethodSpecificInput;
	}

	/**
	 * Object containing the specific input details for cash payments
	 */
	public void setCashPaymentMethodSpecificInput(CashPaymentMethodSpecificInput value) {
		this.cashPaymentMethodSpecificInput = value;
	}

	/**
	 * Object containing the specific input details for direct debit payments
	 */
	public NonSepaDirectDebitPaymentMethodSpecificInput getDirectDebitPaymentMethodSpecificInput() {
		return directDebitPaymentMethodSpecificInput;
	}

	/**
	 * Object containing the specific input details for direct debit payments
	 */
	public void setDirectDebitPaymentMethodSpecificInput(NonSepaDirectDebitPaymentMethodSpecificInput value) {
		this.directDebitPaymentMethodSpecificInput = value;
	}

	/**
	 * Object containing the specific input details for e-invoice payments.
	 */
	public EInvoicePaymentMethodSpecificInput getEInvoicePaymentMethodSpecificInput() {
		return eInvoicePaymentMethodSpecificInput;
	}

	/**
	 * Object containing the specific input details for e-invoice payments.
	 */
	public void setEInvoicePaymentMethodSpecificInput(EInvoicePaymentMethodSpecificInput value) {
		this.eInvoicePaymentMethodSpecificInput = value;
	}

	/**
	 * Data that was encrypted client side containing all consumer entered data elements like card data.<br>
	 * Note: Because this data can only be submitted once to our system and contains encrypted card data you should not store it. As the data was captured within the context of a client session you also need to submit it to us before the session has expired.
	 */
	public String getEncryptedCustomerInput() {
		return encryptedCustomerInput;
	}

	/**
	 * Data that was encrypted client side containing all consumer entered data elements like card data.<br>
	 * Note: Because this data can only be submitted once to our system and contains encrypted card data you should not store it. As the data was captured within the context of a client session you also need to submit it to us before the session has expired.
	 */
	public void setEncryptedCustomerInput(String value) {
		this.encryptedCustomerInput = value;
	}

	/**
	 * Object containing additional data that will be used to assess the risk of fraud
	 */
	public FraudFields getFraudFields() {
		return fraudFields;
	}

	/**
	 * Object containing additional data that will be used to assess the risk of fraud
	 */
	public void setFraudFields(FraudFields value) {
		this.fraudFields = value;
	}

	/**
	 * Object containing the specific input details for invoice payments
	 */
	public InvoicePaymentMethodSpecificInput getInvoicePaymentMethodSpecificInput() {
		return invoicePaymentMethodSpecificInput;
	}

	/**
	 * Object containing the specific input details for invoice payments
	 */
	public void setInvoicePaymentMethodSpecificInput(InvoicePaymentMethodSpecificInput value) {
		this.invoicePaymentMethodSpecificInput = value;
	}

	/**
	 * Object containing the specific input details for mobile payments.
	 * <p>Mobile payments produce the required payment data in encrypted form.
	 * <ul class="paragraph-width">
	 * <li>For Apple Pay, the encrypted payment data can be found in field <span class="property">data</span> of the <span class="property"><a href="https://developer.apple.com/documentation/passkit/pkpayment" target="_blank">PKPayment</a>.token.paymentData</span> property.
	 * <li>For Google Pay, the encrypted payment data can be found in field <span class="property">paymentMethodData.tokenizationData.token</span> of the <span class="property"><a href="https://developers.google.com/android/reference/com/google/android/gms/wallet/PaymentData" target="_blank">PaymentData</a>.toJson()</span> result.
	 * </ul>
	 */
	public MobilePaymentMethodSpecificInput getMobilePaymentMethodSpecificInput() {
		return mobilePaymentMethodSpecificInput;
	}

	/**
	 * Object containing the specific input details for mobile payments.
	 * <p>Mobile payments produce the required payment data in encrypted form.
	 * <ul class="paragraph-width">
	 * <li>For Apple Pay, the encrypted payment data can be found in field <span class="property">data</span> of the <span class="property"><a href="https://developer.apple.com/documentation/passkit/pkpayment" target="_blank">PKPayment</a>.token.paymentData</span> property.
	 * <li>For Google Pay, the encrypted payment data can be found in field <span class="property">paymentMethodData.tokenizationData.token</span> of the <span class="property"><a href="https://developers.google.com/android/reference/com/google/android/gms/wallet/PaymentData" target="_blank">PaymentData</a>.toJson()</span> result.
	 * </ul>
	 */
	public void setMobilePaymentMethodSpecificInput(MobilePaymentMethodSpecificInput value) {
		this.mobilePaymentMethodSpecificInput = value;
	}

	/**
	 * Order object containing order related data<br>
	 * Please note that this object is required to be able to submit the amount.
	 */
	public Order getOrder() {
		return order;
	}

	/**
	 * Order object containing order related data<br>
	 * Please note that this object is required to be able to submit the amount.
	 */
	public void setOrder(Order value) {
		this.order = value;
	}

	/**
	 * Object containing the specific input details for payments that involve redirects to 3rd parties to complete, like iDeal and PayPal
	 */
	public RedirectPaymentMethodSpecificInput getRedirectPaymentMethodSpecificInput() {
		return redirectPaymentMethodSpecificInput;
	}

	/**
	 * Object containing the specific input details for payments that involve redirects to 3rd parties to complete, like iDeal and PayPal
	 */
	public void setRedirectPaymentMethodSpecificInput(RedirectPaymentMethodSpecificInput value) {
		this.redirectPaymentMethodSpecificInput = value;
	}

	/**
	 * Object containing the specific input details for SEPA direct debit payments
	 */
	public SepaDirectDebitPaymentMethodSpecificInput getSepaDirectDebitPaymentMethodSpecificInput() {
		return sepaDirectDebitPaymentMethodSpecificInput;
	}

	/**
	 * Object containing the specific input details for SEPA direct debit payments
	 */
	public void setSepaDirectDebitPaymentMethodSpecificInput(SepaDirectDebitPaymentMethodSpecificInput value) {
		this.sepaDirectDebitPaymentMethodSpecificInput = value;
	}
}
