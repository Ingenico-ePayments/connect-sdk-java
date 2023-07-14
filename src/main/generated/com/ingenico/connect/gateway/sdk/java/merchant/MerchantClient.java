/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */

package com.ingenico.connect.gateway.sdk.java.merchant;

import java.util.Map;

import com.ingenico.connect.gateway.sdk.java.ApiResource;
import com.ingenico.connect.gateway.sdk.java.merchant.captures.CapturesClient;
import com.ingenico.connect.gateway.sdk.java.merchant.disputes.DisputesClient;
import com.ingenico.connect.gateway.sdk.java.merchant.files.FilesClient;
import com.ingenico.connect.gateway.sdk.java.merchant.hostedcheckouts.HostedcheckoutsClient;
import com.ingenico.connect.gateway.sdk.java.merchant.hostedmandatemanagements.HostedmandatemanagementsClient;
import com.ingenico.connect.gateway.sdk.java.merchant.mandates.MandatesClient;
import com.ingenico.connect.gateway.sdk.java.merchant.payments.PaymentsClient;
import com.ingenico.connect.gateway.sdk.java.merchant.payouts.PayoutsClient;
import com.ingenico.connect.gateway.sdk.java.merchant.productgroups.ProductgroupsClient;
import com.ingenico.connect.gateway.sdk.java.merchant.products.ProductsClient;
import com.ingenico.connect.gateway.sdk.java.merchant.refunds.RefundsClient;
import com.ingenico.connect.gateway.sdk.java.merchant.riskassessments.RiskassessmentsClient;
import com.ingenico.connect.gateway.sdk.java.merchant.services.ServicesClient;
import com.ingenico.connect.gateway.sdk.java.merchant.sessions.SessionsClient;
import com.ingenico.connect.gateway.sdk.java.merchant.tokens.TokensClient;

/**
 * Merchant client. Thread-safe.
 */
public class MerchantClient extends ApiResource {

	public MerchantClient(ApiResource parent, Map<String, String> pathContext) {
		super(parent, pathContext);
	}

	/**
	 * Resource /{merchantId}/hostedcheckouts
	 *
	 * @return HostedcheckoutsClient
	 */
	public HostedcheckoutsClient hostedcheckouts() {
		return new HostedcheckoutsClient(this, null);
	}

	/**
	 * Resource /{merchantId}/hostedmandatemanagements
	 *
	 * @return HostedmandatemanagementsClient
	 */
	public HostedmandatemanagementsClient hostedmandatemanagements() {
		return new HostedmandatemanagementsClient(this, null);
	}

	/**
	 * Resource /{merchantId}/payments
	 *
	 * @return PaymentsClient
	 */
	public PaymentsClient payments() {
		return new PaymentsClient(this, null);
	}

	/**
	 * Resource /{merchantId}/captures
	 *
	 * @return CapturesClient
	 */
	public CapturesClient captures() {
		return new CapturesClient(this, null);
	}

	/**
	 * Resource /{merchantId}/refunds
	 *
	 * @return RefundsClient
	 */
	public RefundsClient refunds() {
		return new RefundsClient(this, null);
	}

	/**
	 * Resource /{merchantId}/disputes
	 *
	 * @return DisputesClient
	 */
	public DisputesClient disputes() {
		return new DisputesClient(this, null);
	}

	/**
	 * Resource /{merchantId}/payouts
	 *
	 * @return PayoutsClient
	 */
	public PayoutsClient payouts() {
		return new PayoutsClient(this, null);
	}

	/**
	 * Resource /{merchantId}/productgroups
	 *
	 * @return ProductgroupsClient
	 */
	public ProductgroupsClient productgroups() {
		return new ProductgroupsClient(this, null);
	}

	/**
	 * Resource /{merchantId}/products
	 *
	 * @return ProductsClient
	 */
	public ProductsClient products() {
		return new ProductsClient(this, null);
	}

	/**
	 * Resource /{merchantId}/riskassessments
	 *
	 * @return RiskassessmentsClient
	 */
	public RiskassessmentsClient riskassessments() {
		return new RiskassessmentsClient(this, null);
	}

	/**
	 * Resource /{merchantId}/services
	 *
	 * @return ServicesClient
	 */
	public ServicesClient services() {
		return new ServicesClient(this, null);
	}

	/**
	 * Resource /{merchantId}/tokens
	 *
	 * @return TokensClient
	 */
	public TokensClient tokens() {
		return new TokensClient(this, null);
	}

	/**
	 * Resource /{merchantId}/mandates
	 *
	 * @return MandatesClient
	 */
	public MandatesClient mandates() {
		return new MandatesClient(this, null);
	}

	/**
	 * Resource /{merchantId}/sessions
	 *
	 * @return SessionsClient
	 */
	public SessionsClient sessions() {
		return new SessionsClient(this, null);
	}

	/**
	 * Resource /{merchantId}/files
	 *
	 * @return FilesClient
	 */
	public FilesClient files() {
		return new FilesClient(this, null);
	}
}
