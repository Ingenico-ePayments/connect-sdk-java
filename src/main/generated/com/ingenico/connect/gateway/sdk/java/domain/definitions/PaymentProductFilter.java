/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.definitions;

import java.util.List;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_PaymentProductFilter">PaymentProductFilter</a>
 */
public class PaymentProductFilter {

	private List<String> groups = null;

	private List<Integer> products = null;

	public List<String> getGroups() {
		return groups;
	}

	public void setGroups(List<String> value) {
		this.groups = value;
	}

	public List<Integer> getProducts() {
		return products;
	}

	public void setProducts(List<Integer> value) {
		this.products = value;
	}
}
