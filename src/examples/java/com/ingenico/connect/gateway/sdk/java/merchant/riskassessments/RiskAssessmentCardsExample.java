/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.merchant.riskassessments;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import com.ingenico.connect.gateway.sdk.java.Client;
import com.ingenico.connect.gateway.sdk.java.CommunicatorConfiguration;
import com.ingenico.connect.gateway.sdk.java.Factory;
import com.ingenico.connect.gateway.sdk.java.domain.definitions.AdditionalOrderInputAirlineData;
import com.ingenico.connect.gateway.sdk.java.domain.definitions.Address;
import com.ingenico.connect.gateway.sdk.java.domain.definitions.AirlineData;
import com.ingenico.connect.gateway.sdk.java.domain.definitions.AirlineFlightLeg;
import com.ingenico.connect.gateway.sdk.java.domain.definitions.AmountOfMoney;
import com.ingenico.connect.gateway.sdk.java.domain.definitions.Card;
import com.ingenico.connect.gateway.sdk.java.domain.riskassessments.RiskAssessmentCard;
import com.ingenico.connect.gateway.sdk.java.domain.riskassessments.RiskAssessmentResponse;
import com.ingenico.connect.gateway.sdk.java.domain.riskassessments.definitions.CustomerRiskAssessment;
import com.ingenico.connect.gateway.sdk.java.domain.riskassessments.definitions.OrderRiskAssessment;

public class RiskAssessmentCardsExample {

	@SuppressWarnings("unused")
	public void example() throws URISyntaxException, IOException {
		Client client = getClient();
		try {
			Card card = new Card();
			card.setCardNumber("4567350000427977");
			card.setCvv("123");
			card.setExpiryDate("0820");

			List<AirlineFlightLeg> flightLegs = new ArrayList<AirlineFlightLeg>();

			AirlineFlightLeg flightLeg1 = new AirlineFlightLeg();
			flightLeg1.setAirlineClass("1");
			flightLeg1.setArrivalAirport("AMS");
			flightLeg1.setCarrierCode("KL");
			flightLeg1.setDate("20150102");
			flightLeg1.setDepartureTime("17:59");
			flightLeg1.setFare("fare");
			flightLeg1.setFareBasis("INTERNET");
			flightLeg1.setFlightNumber("791");
			flightLeg1.setNumber(1);
			flightLeg1.setOriginAirport("BCN");
			flightLeg1.setStopoverCode("non-permitted");

			flightLegs.add(flightLeg1);

			AirlineFlightLeg flightLeg2 = new AirlineFlightLeg();
			flightLeg2.setAirlineClass("1");
			flightLeg2.setArrivalAirport("BCN");
			flightLeg2.setCarrierCode("KL");
			flightLeg2.setDate("20150102");
			flightLeg2.setDepartureTime("23:59");
			flightLeg2.setFare("fare");
			flightLeg2.setFareBasis("INTERNET");
			flightLeg2.setFlightNumber("792");
			flightLeg2.setNumber(2);
			flightLeg2.setOriginAirport("AMS");
			flightLeg2.setStopoverCode("non-permitted");

			flightLegs.add(flightLeg2);

			AirlineData airlineData = new AirlineData();
			airlineData.setAgentNumericCode("123321");
			airlineData.setCode("123");
			airlineData.setFlightDate("20150102");
			airlineData.setFlightLegs(flightLegs);
			airlineData.setInvoiceNumber("123456");
			airlineData.setIsETicket(true);
			airlineData.setIsRegisteredCustomer(true);
			airlineData.setIsRestrictedTicket(true);
			airlineData.setIsThirdParty(true);
			airlineData.setIssueDate("20150101");
			airlineData.setMerchantCustomerId("14");
			airlineData.setName("Air France KLM");
			airlineData.setPassengerName("WECOYOTE");
			airlineData.setPlaceOfIssue("Utah");
			airlineData.setPnr("4JTGKT");
			airlineData.setPointOfSale("IATA point of sale name");
			airlineData.setPosCityCode("AMS");
			airlineData.setTicketDeliveryMethod("e-ticket");
			airlineData.setTicketNumber("KLM20050000");

			AdditionalOrderInputAirlineData additionalInput = new AdditionalOrderInputAirlineData();
			additionalInput.setAirlineData(airlineData);

			AmountOfMoney amountOfMoney = new AmountOfMoney();
			amountOfMoney.setAmount(100L);
			amountOfMoney.setCurrencyCode("EUR");

			Address billingAddress = new Address();
			billingAddress.setCountryCode("US");

			CustomerRiskAssessment customer = new CustomerRiskAssessment();
			customer.setBillingAddress(billingAddress);
			customer.setLocale("en_US");

			OrderRiskAssessment order = new OrderRiskAssessment();
			order.setAdditionalInput(additionalInput);
			order.setAmountOfMoney(amountOfMoney);
			order.setCustomer(customer);

			RiskAssessmentCard body = new RiskAssessmentCard();
			body.setCard(card);
			body.setOrder(order);

			RiskAssessmentResponse response = client.merchant("merchantId").riskassessments().cards(body);
		} finally {
			client.close();
		}
	}

	private Client getClient() throws URISyntaxException {
		String apiKeyId = System.getProperty("connect.api.apiKeyId", "someKey");
		String secretApiKey = System.getProperty("connect.api.secretApiKey", "someSecret");

		URL propertiesUrl = getClass().getResource("/example-configuration.properties");
		CommunicatorConfiguration configuration = Factory.createConfiguration(propertiesUrl.toURI(), apiKeyId, secretApiKey);
		return Factory.createClient(configuration);
	}
}
