/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/
 */

package com.ingenico.connect.gateway.sdk.java.domain.hostedcheckout;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.FraudFields;
import com.ingenico.connect.gateway.sdk.java.domain.hostedcheckout.definitions.HostedCheckoutSpecificInput;
import com.ingenico.connect.gateway.sdk.java.domain.hostedcheckout.definitions.MobilePaymentMethodSpecificInputHostedCheckout;
import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.BankTransferPaymentMethodSpecificInputBase;
import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.CardPaymentMethodSpecificInputBase;
import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.CashPaymentMethodSpecificInputBase;
import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.EInvoicePaymentMethodSpecificInputBase;
import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.Merchant;
import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.Order;
import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.RedirectPaymentMethodSpecificInputBase;
import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.SepaDirectDebitPaymentMethodSpecificInputBase;

public class CreateHostedCheckoutRequest {

	private BankTransferPaymentMethodSpecificInputBase bankTransferPaymentMethodSpecificInput = null;

	private CardPaymentMethodSpecificInputBase cardPaymentMethodSpecificInput = null;

	private CashPaymentMethodSpecificInputBase cashPaymentMethodSpecificInput = null;

	private EInvoicePaymentMethodSpecificInputBase eInvoicePaymentMethodSpecificInput = null;

	private FraudFields fraudFields = null;

	private HostedCheckoutSpecificInput hostedCheckoutSpecificInput = null;

	private Merchant merchant = null;

	private MobilePaymentMethodSpecificInputHostedCheckout mobilePaymentMethodSpecificInput = null;

	private Order order = null;

	private RedirectPaymentMethodSpecificInputBase redirectPaymentMethodSpecificInput = null;

	private SepaDirectDebitPaymentMethodSpecificInputBase sepaDirectDebitPaymentMethodSpecificInput = null;

	/**
	 * Object containing the specific input details for bank transfer payments
	 */
	public BankTransferPaymentMethodSpecificInputBase getBankTransferPaymentMethodSpecificInput() {
		return bankTransferPaymentMethodSpecificInput;
	}

	/**
	 * Object containing the specific input details for bank transfer payments
	 */
	public void setBankTransferPaymentMethodSpecificInput(BankTransferPaymentMethodSpecificInputBase value) {
		this.bankTransferPaymentMethodSpecificInput = value;
	}

	/**
	 * Object containing the specific input details for card payments
	 */
	public CardPaymentMethodSpecificInputBase getCardPaymentMethodSpecificInput() {
		return cardPaymentMethodSpecificInput;
	}

	/**
	 * Object containing the specific input details for card payments
	 */
	public void setCardPaymentMethodSpecificInput(CardPaymentMethodSpecificInputBase value) {
		this.cardPaymentMethodSpecificInput = value;
	}

	/**
	 * Object containing the specific input details for cash payments
	 */
	public CashPaymentMethodSpecificInputBase getCashPaymentMethodSpecificInput() {
		return cashPaymentMethodSpecificInput;
	}

	/**
	 * Object containing the specific input details for cash payments
	 */
	public void setCashPaymentMethodSpecificInput(CashPaymentMethodSpecificInputBase value) {
		this.cashPaymentMethodSpecificInput = value;
	}

	/**
	 * Object containing the specific input details for eInvoice payments
	 */
	public EInvoicePaymentMethodSpecificInputBase getEInvoicePaymentMethodSpecificInput() {
		return eInvoicePaymentMethodSpecificInput;
	}

	/**
	 * Object containing the specific input details for eInvoice payments
	 */
	public void setEInvoicePaymentMethodSpecificInput(EInvoicePaymentMethodSpecificInputBase value) {
		this.eInvoicePaymentMethodSpecificInput = value;
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
	 * Object containing hosted checkout specific data
	 */
	public HostedCheckoutSpecificInput getHostedCheckoutSpecificInput() {
		return hostedCheckoutSpecificInput;
	}

	/**
	 * Object containing hosted checkout specific data
	 */
	public void setHostedCheckoutSpecificInput(HostedCheckoutSpecificInput value) {
		this.hostedCheckoutSpecificInput = value;
	}

	/**
	 * Object containing information on you, the merchant
	 */
	public Merchant getMerchant() {
		return merchant;
	}

	/**
	 * Object containing information on you, the merchant
	 */
	public void setMerchant(Merchant value) {
		this.merchant = value;
	}

	/**
	 * Object containing reference data for Google Pay (paymentProductId 320) and Apple Pay (paymentProductID 302).
	 */
	public MobilePaymentMethodSpecificInputHostedCheckout getMobilePaymentMethodSpecificInput() {
		return mobilePaymentMethodSpecificInput;
	}

	/**
	 * Object containing reference data for Google Pay (paymentProductId 320) and Apple Pay (paymentProductID 302).
	 */
	public void setMobilePaymentMethodSpecificInput(MobilePaymentMethodSpecificInputHostedCheckout value) {
		this.mobilePaymentMethodSpecificInput = value;
	}

	/**
	 * Order object containing order related data
	 */
	public Order getOrder() {
		return order;
	}

	/**
	 * Order object containing order related data
	 */
	public void setOrder(Order value) {
		this.order = value;
	}

	/**
	 * Object containing the specific input details for payments that involve redirects to 3rd parties to complete, like iDeal and PayPal
	 */
	public RedirectPaymentMethodSpecificInputBase getRedirectPaymentMethodSpecificInput() {
		return redirectPaymentMethodSpecificInput;
	}

	/**
	 * Object containing the specific input details for payments that involve redirects to 3rd parties to complete, like iDeal and PayPal
	 */
	public void setRedirectPaymentMethodSpecificInput(RedirectPaymentMethodSpecificInputBase value) {
		this.redirectPaymentMethodSpecificInput = value;
	}

	/**
	 * Object containing the specific input details for SEPA direct debit payments
	 */
	public SepaDirectDebitPaymentMethodSpecificInputBase getSepaDirectDebitPaymentMethodSpecificInput() {
		return sepaDirectDebitPaymentMethodSpecificInput;
	}

	/**
	 * Object containing the specific input details for SEPA direct debit payments
	 */
	public void setSepaDirectDebitPaymentMethodSpecificInput(SepaDirectDebitPaymentMethodSpecificInputBase value) {
		this.sepaDirectDebitPaymentMethodSpecificInput = value;
	}
}
