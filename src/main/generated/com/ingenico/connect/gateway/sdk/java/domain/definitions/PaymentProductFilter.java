/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/
 */

package com.ingenico.connect.gateway.sdk.java.domain.definitions;

import java.util.List;

public class PaymentProductFilter {

	private List<String> groups = null;

	private List<Integer> products = null;

	/**
	 * List containing all payment product groups that should either be restricted to in or excluded from the payment context. Currently, there is only one group, called 'cards'.
	 */
	public List<String> getGroups() {
		return groups;
	}

	/**
	 * List containing all payment product groups that should either be restricted to in or excluded from the payment context. Currently, there is only one group, called 'cards'.
	 */
	public void setGroups(List<String> value) {
		this.groups = value;
	}

	/**
	 * List containing all payment product ids that should either be restricted to in or excluded from the payment context.
	 */
	public List<Integer> getProducts() {
		return products;
	}

	/**
	 * List containing all payment product ids that should either be restricted to in or excluded from the payment context.
	 */
	public void setProducts(List<Integer> value) {
		this.products = value;
	}
}
