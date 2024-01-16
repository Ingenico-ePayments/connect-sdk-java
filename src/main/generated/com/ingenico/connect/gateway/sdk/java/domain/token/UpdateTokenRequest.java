/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/
 */

package com.ingenico.connect.gateway.sdk.java.domain.token;

import com.ingenico.connect.gateway.sdk.java.domain.token.definitions.TokenCard;
import com.ingenico.connect.gateway.sdk.java.domain.token.definitions.TokenEWallet;
import com.ingenico.connect.gateway.sdk.java.domain.token.definitions.TokenNonSepaDirectDebit;
import com.ingenico.connect.gateway.sdk.java.domain.token.definitions.TokenSepaDirectDebitWithoutCreditor;

public class UpdateTokenRequest {

	private TokenCard card = null;

	private TokenEWallet eWallet = null;

	private TokenNonSepaDirectDebit nonSepaDirectDebit = null;

	private Integer paymentProductId = null;

	private TokenSepaDirectDebitWithoutCreditor sepaDirectDebit = null;

	/**
	 * Object containing card details
	 */
	public TokenCard getCard() {
		return card;
	}

	/**
	 * Object containing card details
	 */
	public void setCard(TokenCard value) {
		this.card = value;
	}

	/**
	 * Object containing eWallet details
	 */
	public TokenEWallet getEWallet() {
		return eWallet;
	}

	/**
	 * Object containing eWallet details
	 */
	public void setEWallet(TokenEWallet value) {
		this.eWallet = value;
	}

	/**
	 * Object containing the non SEPA Direct Debit details
	 */
	public TokenNonSepaDirectDebit getNonSepaDirectDebit() {
		return nonSepaDirectDebit;
	}

	/**
	 * Object containing the non SEPA Direct Debit details
	 */
	public void setNonSepaDirectDebit(TokenNonSepaDirectDebit value) {
		this.nonSepaDirectDebit = value;
	}

	/**
	 * Payment product identifier<br>
	 * Please see <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/paymentproducts.html">payment products</a> for a full overview of possible values.
	 */
	public Integer getPaymentProductId() {
		return paymentProductId;
	}

	/**
	 * Payment product identifier<br>
	 * Please see <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/paymentproducts.html">payment products</a> for a full overview of possible values.
	 */
	public void setPaymentProductId(Integer value) {
		this.paymentProductId = value;
	}

	/**
	 * Object containing the SEPA Direct Debit details
	 */
	public TokenSepaDirectDebitWithoutCreditor getSepaDirectDebit() {
		return sepaDirectDebit;
	}

	/**
	 * Object containing the SEPA Direct Debit details
	 */
	public void setSepaDirectDebit(TokenSepaDirectDebitWithoutCreditor value) {
		this.sepaDirectDebit = value;
	}
}
