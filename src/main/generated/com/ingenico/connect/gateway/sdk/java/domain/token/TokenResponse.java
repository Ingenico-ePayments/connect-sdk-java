/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.token;

import com.ingenico.connect.gateway.sdk.java.domain.token.definitions.TokenCard;
import com.ingenico.connect.gateway.sdk.java.domain.token.definitions.TokenEWallet;
import com.ingenico.connect.gateway.sdk.java.domain.token.definitions.TokenNonSepaDirectDebit;
import com.ingenico.connect.gateway.sdk.java.domain.token.definitions.TokenSepaDirectDebit;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_TokenResponse">TokenResponse</a>
 */
public class TokenResponse {

	private TokenCard card = null;

	private TokenEWallet eWallet = null;

	private String id = null;

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

	public String getId() {
		return id;
	}

	public void setId(String value) {
		this.id = value;
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
