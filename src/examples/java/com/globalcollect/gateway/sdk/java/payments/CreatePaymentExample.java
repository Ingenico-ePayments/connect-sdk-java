package com.globalcollect.gateway.sdk.java.payments;

import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import com.globalcollect.gateway.sdk.java.ExampleBase;
import com.globalcollect.gateway.sdk.java.GcApiException;
import com.globalcollect.gateway.sdk.java.GcDeclinedPaymentException;
import com.globalcollect.gateway.sdk.java.gc.GcClient;
import com.globalcollect.gateway.sdk.java.gc.errors.definitions.APIError;
import com.globalcollect.gateway.sdk.java.gc.fei.definitions.Address;
import com.globalcollect.gateway.sdk.java.gc.fei.definitions.AmountOfMoney;
import com.globalcollect.gateway.sdk.java.gc.fei.definitions.Card;
import com.globalcollect.gateway.sdk.java.gc.fei.definitions.CompanyInformation;
import com.globalcollect.gateway.sdk.java.gc.payment.CreatePaymentRequest;
import com.globalcollect.gateway.sdk.java.gc.payment.CreatePaymentResponse;
import com.globalcollect.gateway.sdk.java.gc.payment.definitions.AddressPersonal;
import com.globalcollect.gateway.sdk.java.gc.payment.definitions.CardPaymentMethodSpecificInput;
import com.globalcollect.gateway.sdk.java.gc.payment.definitions.ContactDetails;
import com.globalcollect.gateway.sdk.java.gc.payment.definitions.CreatePaymentResult;
import com.globalcollect.gateway.sdk.java.gc.payment.definitions.Customer;
import com.globalcollect.gateway.sdk.java.gc.payment.definitions.LineItem;
import com.globalcollect.gateway.sdk.java.gc.payment.definitions.LineItemInvoiceData;
import com.globalcollect.gateway.sdk.java.gc.payment.definitions.Order;
import com.globalcollect.gateway.sdk.java.gc.payment.definitions.OrderInvoiceData;
import com.globalcollect.gateway.sdk.java.gc.payment.definitions.OrderReferences;
import com.globalcollect.gateway.sdk.java.gc.payment.definitions.PersonalInformation;
import com.globalcollect.gateway.sdk.java.gc.payment.definitions.PersonalName;

public class CreatePaymentExample extends ExampleBase {

	public void example() throws URISyntaxException {
		GcClient client = getGcClient();

		CreatePaymentRequest body = new CreatePaymentRequest();

		Order order = new Order();

		AmountOfMoney amountOfMoney = new AmountOfMoney();
		amountOfMoney.setAmount(2980L);
		amountOfMoney.setCurrencyCode("EUR");
		order.setAmountOfMoney(amountOfMoney);

		Customer customer = new Customer();
		customer.setMerchantCustomerId("1234");
		customer.setLocale("en_GB");
		customer.setVatNumber("1234AB5678CD");

		PersonalInformation personalInformation = new PersonalInformation();

		PersonalName name = new PersonalName();
		name.setTitle("Mr.");
		name.setFirstName("Wile");
		name.setSurnamePrefix("E.");
		name.setSurname("Coyote");
		personalInformation.setName(name);

		personalInformation.setGender("male");
		personalInformation.setDateOfBirth("19490917");
		customer.setPersonalInformation(personalInformation);

		CompanyInformation companyInformation = new CompanyInformation();
		companyInformation.setName("Acme Labs");
		customer.setCompanyInformation(companyInformation);

		Address billingAddress = new Address();
		billingAddress.setStreet("Desertroad");
		billingAddress.setHouseNumber("13");
		billingAddress.setAdditionalInfo("b");
		billingAddress.setZip("84536");
		billingAddress.setCity("Monument Valley");
		billingAddress.setState("Utah");
		billingAddress.setCountryCode("US");
		customer.setBillingAddress(billingAddress);

		AddressPersonal shippingAddress = new AddressPersonal();

		PersonalName shippingName = new PersonalName();
		shippingName.setTitle("Miss");
		shippingName.setFirstName("Road");
		shippingName.setSurname("Runner");
		shippingAddress.setName(shippingName);;

		shippingAddress.setStreet("Desertroad");
		shippingAddress.setHouseNumber("1");
		shippingAddress.setAdditionalInfo("Suite II");
		shippingAddress.setZip("84536");
		shippingAddress.setCity("Monument Valley");
		shippingAddress.setState("Utah");
		shippingAddress.setCountryCode("US");
		customer.setShippingAddress(shippingAddress);

		ContactDetails contactDetails = new ContactDetails();
		contactDetails.setEmailAddress("wile.e.coyote@acmelabs.com");
		contactDetails.setEmailMessageType("html");
		contactDetails.setPhoneNumber("+1234567890");
		contactDetails.setFaxNumber("+1234567891");
		customer.setContactDetails(contactDetails);

		order.setCustomer(customer);

		OrderReferences references = new OrderReferences();
		references.setMerchantOrderId(123456L);
		references.setMerchantReference("AcmeOrder0001");
		references.setDescriptor("Fast and Furry-ous");

		OrderInvoiceData invoiceData = new OrderInvoiceData();
		invoiceData.setInvoiceNumber("000000123");
		invoiceData.setInvoiceDate("20140306191500");
		references.setInvoiceData(invoiceData);

		order.setReferences(references);

		List<LineItem> items = new ArrayList<LineItem>();

		LineItem item1 = new LineItem();

		AmountOfMoney item1AmountOfMoney = new AmountOfMoney();
		item1AmountOfMoney.setAmount(2500L);
		item1AmountOfMoney.setCurrencyCode("EUR");
		item1.setAmountOfMoney(item1AmountOfMoney);

		LineItemInvoiceData item1InvoiceData = new LineItemInvoiceData();
		item1InvoiceData.setNrOfItems("1");
		item1InvoiceData.setDescription("ACME Super Outfit");
		item1InvoiceData.setPricePerItem(2500L);
		item1.setInvoiceData(item1InvoiceData);

		items.add(item1);

		LineItem item2 = new LineItem();

		AmountOfMoney item2AmountOfMoney = new AmountOfMoney();
		item2AmountOfMoney.setCurrencyCode("EUR");
		item2AmountOfMoney.setAmount(480L);
		item2.setAmountOfMoney(item2AmountOfMoney);

		LineItemInvoiceData item2InvoiceData = new LineItemInvoiceData();
		item2InvoiceData.setNrOfItems("12");
		item2InvoiceData.setDescription("Aspirin");
		item2InvoiceData.setPricePerItem(40L);
		item2.setInvoiceData(item2InvoiceData);

		items.add(item2);

		order.setItems(items);

		body.setOrder(order);

		CardPaymentMethodSpecificInput cardPaymentMethodSpecificInput = new CardPaymentMethodSpecificInput();
		cardPaymentMethodSpecificInput.setPaymentProductId(1);
		cardPaymentMethodSpecificInput.setSkipAuthentication(false);

		Card card = new Card();
		card.setCvv("123");
		card.setCardNumber("4567350000427977");
		card.setExpiryDate("1220");
		card.setCardholderName("Wile E. Coyote");
		cardPaymentMethodSpecificInput.setCard(card);

		body.setCardPaymentMethodSpecificInput(cardPaymentMethodSpecificInput);

		try {
			CreatePaymentResponse response = client.merchant("merchantId").payments().create(body);
		} catch (GcDeclinedPaymentException e) {
			handleDeclinedPayment(e.getCreatePaymentResult());
		} catch (GcApiException e) {
			handleApiErrors(e.getErrors());
		}
	}

	private void handleDeclinedPayment(CreatePaymentResult createPaymentResult) {
		// handle the result here
	}

	private void handleApiErrors(List<APIError> errors) {
		// handle the errors here
	}
}
