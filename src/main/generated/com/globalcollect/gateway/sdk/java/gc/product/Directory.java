package com.globalcollect.gateway.sdk.java.gc.product;

import com.globalcollect.gateway.sdk.java.gc.product.definitions.DirectoryEntry;
import java.util.List;

/**
 * class Directory
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
