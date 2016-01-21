package com.globalcollect.gateway.sdk.java.gc.payment.definitions;


public class LineItemInvoiceData {

	private String description = null;

	private String merchantLinenumber = null;

	private String merchantPagenumber = null;

	private String nrOfItems = null;

	private Long pricePerItem = null;

	public String getDescription() {
		return description;
	}

	public void setDescription(String value) {
		this.description = value;
	}

	public String getMerchantLinenumber() {
		return merchantLinenumber;
	}

	public void setMerchantLinenumber(String value) {
		this.merchantLinenumber = value;
	}

	public String getMerchantPagenumber() {
		return merchantPagenumber;
	}

	public void setMerchantPagenumber(String value) {
		this.merchantPagenumber = value;
	}

	public String getNrOfItems() {
		return nrOfItems;
	}

	public void setNrOfItems(String value) {
		this.nrOfItems = value;
	}

	public Long getPricePerItem() {
		return pricePerItem;
	}

	public void setPricePerItem(Long value) {
		this.pricePerItem = value;
	}
}
