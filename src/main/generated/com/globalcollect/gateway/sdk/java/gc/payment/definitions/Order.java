package com.globalcollect.gateway.sdk.java.gc.payment.definitions;

import com.globalcollect.gateway.sdk.java.gc.fei.definitions.AmountOfMoney;
import com.globalcollect.gateway.sdk.java.gc.payment.definitions.AdditionalOrderInput;
import com.globalcollect.gateway.sdk.java.gc.payment.definitions.Customer;
import com.globalcollect.gateway.sdk.java.gc.payment.definitions.LineItem;
import com.globalcollect.gateway.sdk.java.gc.payment.definitions.OrderReferences;
import java.util.List;

public class Order {

	private AdditionalOrderInput additionalInput = null;

	private AmountOfMoney amountOfMoney = null;

	private Customer customer = null;

	private List<LineItem> items = null;

	private OrderReferences references = null;

	public AdditionalOrderInput getAdditionalInput() {
		return additionalInput;
	}

	public void setAdditionalInput(AdditionalOrderInput value) {
		this.additionalInput = value;
	}

	public AmountOfMoney getAmountOfMoney() {
		return amountOfMoney;
	}

	public void setAmountOfMoney(AmountOfMoney value) {
		this.amountOfMoney = value;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer value) {
		this.customer = value;
	}

	public List<LineItem> getItems() {
		return items;
	}

	public void setItems(List<LineItem> value) {
		this.items = value;
	}

	public OrderReferences getReferences() {
		return references;
	}

	public void setReferences(OrderReferences value) {
		this.references = value;
	}
}
