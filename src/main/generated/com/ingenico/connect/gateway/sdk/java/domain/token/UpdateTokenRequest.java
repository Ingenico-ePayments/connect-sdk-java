/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.token;

import com.ingenico.connect.gateway.sdk.java.domain.token.definitions.TokenCard;
import com.ingenico.connect.gateway.sdk.java.domain.token.definitions.TokenEWallet;
import com.ingenico.connect.gateway.sdk.java.domain.token.definitions.TokenNonSepaDirectDebit;
import com.ingenico.connect.gateway.sdk.java.domain.token.definitions.TokenSepaDirectDebitWithoutCreditor;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_UpdateTokenRequest">UpdateTokenRequest</a>
 */
public class UpdateTokenRequest {

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
