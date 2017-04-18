/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.product;

import java.util.List;

import com.ingenico.connect.gateway.sdk.java.domain.product.definitions.DirectoryEntry;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_Directory">Directory</a>
 */
public class Directory {

	private List<DirectoryEntry> entries = null;

	public List<DirectoryEntry> getEntries() {
		return entries;
	}

	public void setEntries(List<DirectoryEntry> value) {
		this.entries = value;
	}
}
