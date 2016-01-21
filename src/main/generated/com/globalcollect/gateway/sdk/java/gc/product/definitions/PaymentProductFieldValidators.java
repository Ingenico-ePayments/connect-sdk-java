package com.globalcollect.gateway.sdk.java.gc.product.definitions;

import com.globalcollect.gateway.sdk.java.gc.product.definitions.EmptyValidator;
import com.globalcollect.gateway.sdk.java.gc.product.definitions.FixedListValidator;
import com.globalcollect.gateway.sdk.java.gc.product.definitions.LengthValidator;
import com.globalcollect.gateway.sdk.java.gc.product.definitions.RangeValidator;
import com.globalcollect.gateway.sdk.java.gc.product.definitions.RegularExpressionValidator;

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
