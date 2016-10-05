/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.product.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.product.definitions.EmptyValidator;
import com.ingenico.connect.gateway.sdk.java.domain.product.definitions.FixedListValidator;
import com.ingenico.connect.gateway.sdk.java.domain.product.definitions.LengthValidator;
import com.ingenico.connect.gateway.sdk.java.domain.product.definitions.RangeValidator;
import com.ingenico.connect.gateway.sdk.java.domain.product.definitions.RegularExpressionValidator;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_PaymentProductFieldValidators">PaymentProductFieldValidators</a>
 */
public class PaymentProductFieldValidators {

	private EmptyValidator emailAddress = null;

	private EmptyValidator expirationDate = null;

	private FixedListValidator fixedList = null;

	private LengthValidator length = null;

	private EmptyValidator luhn = null;

	private RangeValidator range = null;

	private RegularExpressionValidator regularExpression = null;

	public EmptyValidator getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(EmptyValidator value) {
		this.emailAddress = value;
	}

	public EmptyValidator getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(EmptyValidator value) {
		this.expirationDate = value;
	}

	public FixedListValidator getFixedList() {
		return fixedList;
	}

	public void setFixedList(FixedListValidator value) {
		this.fixedList = value;
	}

	public LengthValidator getLength() {
		return length;
	}

	public void setLength(LengthValidator value) {
		this.length = value;
	}

	public EmptyValidator getLuhn() {
		return luhn;
	}

	public void setLuhn(EmptyValidator value) {
		this.luhn = value;
	}

	public RangeValidator getRange() {
		return range;
	}

	public void setRange(RangeValidator value) {
		this.range = value;
	}

	public RegularExpressionValidator getRegularExpression() {
		return regularExpression;
	}

	public void setRegularExpression(RegularExpressionValidator value) {
		this.regularExpression = value;
	}
}
