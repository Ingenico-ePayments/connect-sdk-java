package com.globalcollect.gateway.sdk.java.gc.token;

import com.globalcollect.gateway.sdk.java.gc.token.definitions.TokenCard;
import com.globalcollect.gateway.sdk.java.gc.token.definitions.TokenEWallet;
import com.globalcollect.gateway.sdk.java.gc.token.definitions.TokenNonSepaDirectDebit;
import com.globalcollect.gateway.sdk.java.gc.token.definitions.TokenSepaDirectDebitWithoutCreditor;

/**
 * class CreateTokenRequest
 */
public class CreateTokenRequest {

	private TokenCard card = null;

	private TokenEWallet eWallet = null;

	private TokenNonSepaDirectDebit nonSepaDirectDebit = null;

	private Integer paymentProductId = null;

	private TokenSepaDirectDebitWithoutCreditor sepaDirectDebit = null;

	public TokenCard getCard() {
		return card;
	}

	public void setCard(TokenCard value) {
		this.card = value;
	}

	public TokenEWallet getEWallet() {
		return eWallet;
	}

	public void setEWallet(TokenEWallet value) {
		this.eWallet = value;
	}

	public TokenNonSepaDirectDebit getNonSepaDirectDebit() {
		return nonSepaDirectDebit;
	}

	public void setNonSepaDirectDebit(TokenNonSepaDirectDebit value) {
		this.nonSepaDirectDebit = value;
	}

	public Integer getPaymentProductId() {
		return paymentProductId;
	}

	public void setPaymentProductId(Integer value) {
		this.paymentProductId = value;
	}

	public TokenSepaDirectDebitWithoutCreditor getSepaDirectDebit() {
		return sepaDirectDebit;
	}

	public void setSepaDirectDebit(TokenSepaDirectDebitWithoutCreditor value) {
		this.sepaDirectDebit = value;
	}
}
