package com.globalcollect.gateway.sdk.java.gc.token;

import com.globalcollect.gateway.sdk.java.gc.token.definitions.TokenCard;
import com.globalcollect.gateway.sdk.java.gc.token.definitions.TokenEWallet;
import com.globalcollect.gateway.sdk.java.gc.token.definitions.TokenNonSepaDirectDebit;
import com.globalcollect.gateway.sdk.java.gc.token.definitions.TokenSepaDirectDebit;

/**
 * class TokenResponse
 */
public class TokenResponse {

	private TokenCard card = null;

	private TokenEWallet eWallet = null;

	private TokenNonSepaDirectDebit nonSepaDirectDebit = null;

	private Integer paymentProductId = null;

	private TokenSepaDirectDebit sepaDirectDebit = null;

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

	public TokenSepaDirectDebit getSepaDirectDebit() {
		return sepaDirectDebit;
	}

	public void setSepaDirectDebit(TokenSepaDirectDebit value) {
		this.sepaDirectDebit = value;
	}
}
