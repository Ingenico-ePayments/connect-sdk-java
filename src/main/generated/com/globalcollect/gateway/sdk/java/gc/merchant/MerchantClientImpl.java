package com.globalcollect.gateway.sdk.java.gc.merchant;

import com.globalcollect.gateway.sdk.java.GcApiResource;
import com.globalcollect.gateway.sdk.java.gc.merchant.hostedcheckouts.HostedcheckoutsClient;
import com.globalcollect.gateway.sdk.java.gc.merchant.hostedcheckouts.HostedcheckoutsClientImpl;
import com.globalcollect.gateway.sdk.java.gc.merchant.payments.PaymentsClient;
import com.globalcollect.gateway.sdk.java.gc.merchant.payments.PaymentsClientImpl;
import com.globalcollect.gateway.sdk.java.gc.merchant.payouts.PayoutsClient;
import com.globalcollect.gateway.sdk.java.gc.merchant.payouts.PayoutsClientImpl;
import com.globalcollect.gateway.sdk.java.gc.merchant.products.ProductsClient;
import com.globalcollect.gateway.sdk.java.gc.merchant.products.ProductsClientImpl;
import com.globalcollect.gateway.sdk.java.gc.merchant.refunds.RefundsClient;
import com.globalcollect.gateway.sdk.java.gc.merchant.refunds.RefundsClientImpl;
import com.globalcollect.gateway.sdk.java.gc.merchant.riskassessments.RiskassessmentsClient;
import com.globalcollect.gateway.sdk.java.gc.merchant.riskassessments.RiskassessmentsClientImpl;
import com.globalcollect.gateway.sdk.java.gc.merchant.services.ServicesClient;
import com.globalcollect.gateway.sdk.java.gc.merchant.services.ServicesClientImpl;
import com.globalcollect.gateway.sdk.java.gc.merchant.sessions.SessionsClient;
import com.globalcollect.gateway.sdk.java.gc.merchant.sessions.SessionsClientImpl;
import com.globalcollect.gateway.sdk.java.gc.merchant.tokens.TokensClient;
import com.globalcollect.gateway.sdk.java.gc.merchant.tokens.TokensClientImpl;
import java.util.Map;

public class MerchantClientImpl extends GcApiResource implements MerchantClient {

	public MerchantClientImpl(GcApiResource parent, Map<String, String> pathContext) {
		super(parent, pathContext);
	}

	@Override
	public PayoutsClient payouts() {
		return new PayoutsClientImpl(this, null);
	}

	@Override
	public RefundsClient refunds() {
		return new RefundsClientImpl(this, null);
	}

	@Override
	public SessionsClient sessions() {
		return new SessionsClientImpl(this, null);
	}

	@Override
	public TokensClient tokens() {
		return new TokensClientImpl(this, null);
	}

	@Override
	public HostedcheckoutsClient hostedcheckouts() {
		return new HostedcheckoutsClientImpl(this, null);
	}

	@Override
	public ProductsClient products() {
		return new ProductsClientImpl(this, null);
	}

	@Override
	public PaymentsClient payments() {
		return new PaymentsClientImpl(this, null);
	}

	@Override
	public ServicesClient services() {
		return new ServicesClientImpl(this, null);
	}

	@Override
	public RiskassessmentsClient riskassessments() {
		return new RiskassessmentsClientImpl(this, null);
	}
}
