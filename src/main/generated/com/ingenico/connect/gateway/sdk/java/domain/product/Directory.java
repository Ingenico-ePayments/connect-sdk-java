/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/
 */

package com.ingenico.connect.gateway.sdk.java.domain.product;

import java.util.List;

import com.ingenico.connect.gateway.sdk.java.domain.product.definitions.DirectoryEntry;

public class Directory {

	private List<DirectoryEntry> entries = null;

	/**
	 * List of entries in the directory
	 */
	public List<DirectoryEntry> getEntries() {
		return entries;
	}

	/**
	 * List of entries in the directory
	 */
	public void setEntries(List<DirectoryEntry> value) {
		this.entries = value;
	}
}
