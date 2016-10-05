package com.ingenico.connect.gateway.sdk.java.merchant.products;

import java.util.ArrayList;
import java.util.List;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

import com.ingenico.connect.gateway.sdk.java.RequestParam;
import com.ingenico.connect.gateway.sdk.java.util.RequestParamMatcher;

public class DirectoryParamsTest {

	@Test
	public void testToRequestParameters() {
		DirectoryParams params = new DirectoryParams();
		List<Matcher<? super RequestParam>> matchers = new ArrayList<Matcher<? super RequestParam>>();

		Assert.assertThat(params.toRequestParameters(), Matchers.containsInAnyOrder(matchers));

		params.setCountryCode("NL");
		matchers.add(new RequestParamMatcher("countryCode", "NL"));
		Assert.assertThat(params.toRequestParameters(), Matchers.containsInAnyOrder(matchers));

		params.setCurrencyCode("EUR");
		matchers.add(new RequestParamMatcher("currencyCode", "EUR"));
		Assert.assertThat(params.toRequestParameters(), Matchers.containsInAnyOrder(matchers));

		params.setCountryCode(null);
		matchers.remove(0);
		Assert.assertThat(params.toRequestParameters(), Matchers.containsInAnyOrder(matchers));
	}
}
