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

	public MerchantClientImpl(GcApiResource parent, Map<String, String> context) {
		super(parent, context);
	}

	/**
	 * Resource /{merchantId}/payouts
	 * Create, cancel and approve payouts
	 * 
	 * @return Payouts
	 */
	@Override
	public PayoutsClient payouts() {
		return new PayoutsClientImpl(this, null);
	}

	/**
	 * Resource /{merchantId}/refunds
	 * Create, cancel and approve refunds
	 * 
	 * @return Refunds
	 */
	@Override
	public RefundsClient refunds() {
		return new RefundsClientImpl(this, null);
	}

	/**
	 * Resource /{merchantId}/sessions
	 * Create new Session for Client2Server API calls
	 * 
	 * @return Sessions
	 */
	@Override
	public SessionsClient sessions() {
		return new SessionsClientImpl(this, null);
	}

	/**
	 * Resource /{merchantId}/tokens
	 * Create, delete and update tokens
	 * 
	 * @return Tokens
	 */
	@Override
	public TokensClient tokens() {
		return new TokensClientImpl(this, null);
	}

	/**
	 * Resource /{merchantId}/hostedcheckouts
	 * Create new hosted checkout
	 * 
	 * @return Hostedcheckouts
	 */
	@Override
	public HostedcheckoutsClient hostedcheckouts() {
		return new HostedcheckoutsClientImpl(this, null);
	}

	/**
	 * Resource /{merchantId}/products
	 * Get information about payment products
	 * 
	 * @return Products
	 */
	@Override
	public ProductsClient products() {
		return new ProductsClientImpl(this, null);
	}

	/**
	 * Resource /{merchantId}/payments
	 * Create, cancel and approve payments
	 * 
	 * @return Payments
	 */
	@Override
	public PaymentsClient payments() {
		return new PaymentsClientImpl(this, null);
	}

	/**
	 * Resource /{merchantId}/services
	 * Several services to help you
	 * 
	 * @return Services
	 */
	@Override
	public ServicesClient services() {
		return new ServicesClientImpl(this, null);
	}

	/**
	 * Resource /{merchantId}/riskassessments
	 * Perform risk assessments on your customer data
	 * 
	 * @return Riskassessments
	 */
	@Override
	public RiskassessmentsClient riskassessments() {
		return new RiskassessmentsClientImpl(this, null);
	}

}
