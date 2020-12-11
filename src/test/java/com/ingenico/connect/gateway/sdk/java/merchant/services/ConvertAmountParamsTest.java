package com.ingenico.connect.gateway.sdk.java.merchant.services;

import java.util.ArrayList;
import java.util.List;

import org.hamcrest.Matcher;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

import com.ingenico.connect.gateway.sdk.java.RequestParam;
import com.ingenico.connect.gateway.sdk.java.util.RequestParamMatcher;

public class ConvertAmountParamsTest {

	@Test
	public void testToRequestParameters() {
		ConvertAmountParams params = new ConvertAmountParams();
		List<Matcher<? super RequestParam>> matchers = new ArrayList<Matcher<? super RequestParam>>();

		MatcherAssert.assertThat(params.toRequestParameters(), Matchers.containsInAnyOrder(matchers));

		params.setAmount(1000L);
		matchers.add(new RequestParamMatcher("amount", "1000"));
		MatcherAssert.assertThat(params.toRequestParameters(), Matchers.containsInAnyOrder(matchers));

		params.setSource("EUR");
		matchers.add(new RequestParamMatcher("source", "EUR"));
		MatcherAssert.assertThat(params.toRequestParameters(), Matchers.containsInAnyOrder(matchers));

		params.setTarget("USD");
		matchers.add(new RequestParamMatcher("target", "USD"));
		MatcherAssert.assertThat(params.toRequestParameters(), Matchers.containsInAnyOrder(matchers));

		params.setAmount(null);
		matchers.remove(0);
		MatcherAssert.assertThat(params.toRequestParameters(), Matchers.containsInAnyOrder(matchers));
	}
}
