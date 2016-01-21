package com.globalcollect.gateway.sdk.java.riskassessments;

import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import com.globalcollect.gateway.sdk.java.ExampleBase;
import com.globalcollect.gateway.sdk.java.gc.GcClient;
import com.globalcollect.gateway.sdk.java.gc.fei.definitions.AdditionalOrderInputAirlineData;
import com.globalcollect.gateway.sdk.java.gc.fei.definitions.Address;
import com.globalcollect.gateway.sdk.java.gc.fei.definitions.AirlineData;
import com.globalcollect.gateway.sdk.java.gc.fei.definitions.AirlineFlightLeg;
import com.globalcollect.gateway.sdk.java.gc.fei.definitions.AmountOfMoney;
import com.globalcollect.gateway.sdk.java.gc.fei.definitions.Card;
import com.globalcollect.gateway.sdk.java.gc.riskassessments.RiskAssessmentCard;
import com.globalcollect.gateway.sdk.java.gc.riskassessments.RiskAssessmentResponse;
import com.globalcollect.gateway.sdk.java.gc.riskassessments.definitions.CustomerRiskAssessment;
import com.globalcollect.gateway.sdk.java.gc.riskassessments.definitions.OrderRiskAssessment;

public class RiskAssessmentCardsExample extends ExampleBase {
	
	public void example() throws URISyntaxException {
		GcClient client = getGcClient();
		
		RiskAssessmentCard body = new RiskAssessmentCard();
		
		Card card = new Card();
		card.setExpiryDate("0820");
		card.setCardNumber("4567350000427977");
		card.setCvv("123");
		body.setCard(card);
		
		OrderRiskAssessment order = new OrderRiskAssessment();
		
		AmountOfMoney amountOfMoney = new AmountOfMoney();
		amountOfMoney.setAmount(100L);
		amountOfMoney.setCurrencyCode("EUR");
		order.setAmountOfMoney(amountOfMoney);
		
		CustomerRiskAssessment customer = new CustomerRiskAssessment();
		customer.setLocale("en_GB");
		
		Address billingAddress = new Address();
		billingAddress.setCountryCode("US");
		customer.setBillingAddress(billingAddress);
		
		order.setCustomer(customer);
		
		AdditionalOrderInputAirlineData additionalInput = new AdditionalOrderInputAirlineData();
		
		AirlineData airlineData = new AirlineData();
		airlineData.setCode("123");
		airlineData.setName("Air France KLM");
		airlineData.setInvoiceNumber("123456");
		airlineData.setAgentNumericCode("123321");
		airlineData.setTicketNumber("KLM20050000");
		airlineData.setPnr("4JTGKT");
		airlineData.setIsETicket(true);
		airlineData.setTicketDeliveryMethod("e-ticket");
		airlineData.setPassengerName("WECOYOTE");
		airlineData.setPointOfSale("IATA point of sale name");
		airlineData.setPlaceOfIssue("Utah");
		airlineData.setFlightDate("20150102");
		airlineData.setIsThirdParty(true);
		airlineData.setIsRegisteredCustomer(true);
		airlineData.setPosCityCode("AMS");
		airlineData.setMerchantCustomerId("14");
		airlineData.setIssueDate("20150101");
		airlineData.setIsRestrictedTicket(true);
		
		List<AirlineFlightLeg> flightLegs = new ArrayList<AirlineFlightLeg>();
		
		AirlineFlightLeg flightLeg1 = new AirlineFlightLeg();
		flightLeg1.setNumber(1);
		flightLeg1.setDate("20150102");
		flightLeg1.setOriginAirport("BCN");
		flightLeg1.setArrivalAirport("AMS");
		flightLeg1.setStopoverCode("non-permitted");
		flightLeg1.setAirlineClass("1");
		flightLeg1.setCarrierCode("14");
		flightLeg1.setFareBasis("INTERNET");
		flightLeg1.setFlightNumber("KL791");
		flightLeg1.setDepartureTime("17:59");
		flightLeg1.setFare("fare");
		
		flightLegs.add(flightLeg1);
		
		AirlineFlightLeg flightLeg2 = new AirlineFlightLeg();
		flightLeg2.setNumber(2);
		flightLeg2.setDate("20150102");
		flightLeg2.setOriginAirport("AMS");
		flightLeg2.setArrivalAirport("BCN");
		flightLeg2.setStopoverCode("non-permitted");
		flightLeg2.setAirlineClass("1");
		flightLeg2.setCarrierCode("14");
		flightLeg2.setFareBasis("INTERNET");
		flightLeg2.setFlightNumber("KL792");
		flightLeg2.setDepartureTime("23:59");
		flightLeg2.setFare("fare");
		
		flightLegs.add(flightLeg2);
		
		airlineData.setFlightLegs(flightLegs);
		
		additionalInput.setAirlineData(airlineData);
		
		order.setAdditionalInput(additionalInput);
		
		body.setOrder(order);

		RiskAssessmentResponse response = client.merchant("merchantId").riskassessments().cards(body);
	}
}
