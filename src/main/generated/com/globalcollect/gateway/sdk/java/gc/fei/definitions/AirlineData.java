package com.globalcollect.gateway.sdk.java.gc.fei.definitions;

import com.globalcollect.gateway.sdk.java.gc.fei.definitions.AirlineFlightLeg;
import java.util.List;

public class AirlineData {

	private String agentNumericCode = null;

	private String code = null;

	private String flightDate = null;

	private List<AirlineFlightLeg> flightLegs = null;

	private String invoiceNumber = null;

	private Boolean isETicket = null;

	private Boolean isRegisteredCustomer = null;

	private Boolean isRestrictedTicket = null;

	private Boolean isThirdParty = null;

	private String issueDate = null;

	private String merchantCustomerId = null;

	private String name = null;

	private String passengerName = null;

	private String placeOfIssue = null;

	private String pnr = null;

	private String pointOfSale = null;

	private String posCityCode = null;

	private String ticketDeliveryMethod = null;

	private String ticketNumber = null;

	public String getAgentNumericCode() {
		return agentNumericCode;
	}

	public void setAgentNumericCode(String value) {
		this.agentNumericCode = value;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String value) {
		this.code = value;
	}

	public String getFlightDate() {
		return flightDate;
	}

	public void setFlightDate(String value) {
		this.flightDate = value;
	}

	public List<AirlineFlightLeg> getFlightLegs() {
		return flightLegs;
	}

	public void setFlightLegs(List<AirlineFlightLeg> value) {
		this.flightLegs = value;
	}

	public String getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(String value) {
		this.invoiceNumber = value;
	}

	public Boolean getIsETicket() {
		return isETicket;
	}

	public void setIsETicket(Boolean value) {
		this.isETicket = value;
	}

	public Boolean getIsRegisteredCustomer() {
		return isRegisteredCustomer;
	}

	public void setIsRegisteredCustomer(Boolean value) {
		this.isRegisteredCustomer = value;
	}

	public Boolean getIsRestrictedTicket() {
		return isRestrictedTicket;
	}

	public void setIsRestrictedTicket(Boolean value) {
		this.isRestrictedTicket = value;
	}

	public Boolean getIsThirdParty() {
		return isThirdParty;
	}

	public void setIsThirdParty(Boolean value) {
		this.isThirdParty = value;
	}

	public String getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(String value) {
		this.issueDate = value;
	}

	public String getMerchantCustomerId() {
		return merchantCustomerId;
	}

	public void setMerchantCustomerId(String value) {
		this.merchantCustomerId = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String value) {
		this.name = value;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String value) {
		this.passengerName = value;
	}

	public String getPlaceOfIssue() {
		return placeOfIssue;
	}

	public void setPlaceOfIssue(String value) {
		this.placeOfIssue = value;
	}

	public String getPnr() {
		return pnr;
	}

	public void setPnr(String value) {
		this.pnr = value;
	}

	public String getPointOfSale() {
		return pointOfSale;
	}

	public void setPointOfSale(String value) {
		this.pointOfSale = value;
	}

	public String getPosCityCode() {
		return posCityCode;
	}

	public void setPosCityCode(String value) {
		this.posCityCode = value;
	}

	public String getTicketDeliveryMethod() {
		return ticketDeliveryMethod;
	}

	public void setTicketDeliveryMethod(String value) {
		this.ticketDeliveryMethod = value;
	}

	public String getTicketNumber() {
		return ticketNumber;
	}

	public void setTicketNumber(String value) {
		this.ticketNumber = value;
	}
}
