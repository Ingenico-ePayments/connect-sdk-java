package com.ingenico.connect.gateway.sdk.java.merchant.tokens;

import java.util.ArrayList;
import java.util.List;

import org.hamcrest.Matcher;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

import com.ingenico.connect.gateway.sdk.java.RequestParam;
import com.ingenico.connect.gateway.sdk.java.util.RequestParamMatcher;

public class DeleteTokenParamsTest {

	@Test
	public void testToRequestParameters() {
		DeleteTokenParams params = new DeleteTokenParams();
		List<Matcher<? super RequestParam>> matchers = new ArrayList<Matcher<? super RequestParam>>();

		MatcherAssert.assertThat(params.toRequestParameters(), Matchers.containsInAnyOrder(matchers));

		params.setMandateCancelDate("20160610");
		matchers.add(new RequestParamMatcher("mandateCancelDate", "20160610"));
		MatcherAssert.assertThat(params.toRequestParameters(), Matchers.containsInAnyOrder(matchers));

		params.setMandateCancelDate(null);
		matchers.remove(0);
		MatcherAssert.assertThat(params.toRequestParameters(), Matchers.containsInAnyOrder(matchers));
	}
}
