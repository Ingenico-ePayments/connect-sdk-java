/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

import java.util.List;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.AmountOfMoney;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_Order">Order</a>
 */
public class Order {

	private AdditionalOrderInput additionalInput = null;

	private AmountOfMoney amountOfMoney = null;

	private Customer customer = null;

	private List<LineItem> items = null;

	private OrderReferences references = null;

	private ShoppingCart shoppingCart = null;

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

	public ShoppingCart getShoppingCart() {
		return shoppingCart;
	}

	public void setShoppingCart(ShoppingCart value) {
		this.shoppingCart = value;
	}
}
