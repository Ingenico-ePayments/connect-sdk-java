package com.ingenico.connect.gateway.sdk.java.merchant.tokens;

import java.util.ArrayList;
import java.util.List;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

import com.ingenico.connect.gateway.sdk.java.RequestParam;
import com.ingenico.connect.gateway.sdk.java.util.RequestParamMatcher;

public class DeleteTokenParamsTest {

	@Test
	public void testToRequestParameters() {
		DeleteTokenParams params = new DeleteTokenParams();
		List<Matcher<? super RequestParam>> matchers = new ArrayList<Matcher<? super RequestParam>>();

		Assert.assertThat(params.toRequestParameters(), Matchers.containsInAnyOrder(matchers));

		params.setMandateCancelDate("20160610");
		matchers.add(new RequestParamMatcher("mandateCancelDate", "20160610"));
		Assert.assertThat(params.toRequestParameters(), Matchers.containsInAnyOrder(matchers));

		params.setMandateCancelDate(null);
		matchers.remove(0);
		Assert.assertThat(params.toRequestParameters(), Matchers.containsInAnyOrder(matchers));
	}
}
