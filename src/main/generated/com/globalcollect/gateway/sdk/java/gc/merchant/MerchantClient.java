package com.globalcollect.gateway.sdk.java.gc.merchant;

import com.globalcollect.gateway.sdk.java.gc.merchant.hostedcheckouts.HostedcheckoutsClient;
import com.globalcollect.gateway.sdk.java.gc.merchant.payments.PaymentsClient;
import com.globalcollect.gateway.sdk.java.gc.merchant.payouts.PayoutsClient;
import com.globalcollect.gateway.sdk.java.gc.merchant.productgroups.ProductgroupsClient;
import com.globalcollect.gateway.sdk.java.gc.merchant.products.ProductsClient;
import com.globalcollect.gateway.sdk.java.gc.merchant.refunds.RefundsClient;
import com.globalcollect.gateway.sdk.java.gc.merchant.riskassessments.RiskassessmentsClient;
import com.globalcollect.gateway.sdk.java.gc.merchant.services.ServicesClient;
import com.globalcollect.gateway.sdk.java.gc.merchant.sessions.SessionsClient;
import com.globalcollect.gateway.sdk.java.gc.merchant.tokens.TokensClient;

/**
 * Merchant client. Thread-safe.
 */
public interface MerchantClient {

	/**
	 * Resource /{merchantId}/payouts
	 * Create, cancel and approve payouts
	 *
	 * @return Payouts
	 */
	PayoutsClient payouts();

	/**
	 * Resource /{merchantId}/refunds
	 * Create, cancel and approve refunds
	 *
	 * @return Refunds
	 */
	RefundsClient refunds();

	/**
	 * Resource /{merchantId}/sessions
	 * Create new Session for Client2Server API calls
	 *
	 * @return Sessions
	 */
	SessionsClient sessions();

	/**
	 * Resource /{merchantId}/tokens
	 * Create, delete and update tokens
	 *
	 * @return Tokens
	 */
	TokensClient tokens();

	/**
	 * Resource /{merchantId}/services
	 * Several services to help you
	 *
	 * @return Services
	 */
	ServicesClient services();

	/**
	 * Resource /{merchantId}/hostedcheckouts
	 * Create new hosted checkout
	 *
	 * @return Hostedcheckouts
	 */
	HostedcheckoutsClient hostedcheckouts();

	/**
	 * Resource /{merchantId}/products
	 * Get information about payment products
	 *
	 * @return Products
	 */
	ProductsClient products();

	/**
	 * Resource /{merchantId}/payments
	 * Create, cancel and approve payments
	 *
	 * @return Payments
	 */
	PaymentsClient payments();

	/**
	 * Resource /{merchantId}/productgroups
	 * Get information about payment product groups
	 *
	 * @return Productgroups
	 */
	ProductgroupsClient productgroups();

	/**
	 * Resource /{merchantId}/riskassessments
	 * Perform risk assessments on your customer data
	 *
	 * @return Riskassessments
	 */
	RiskassessmentsClient riskassessments();
}
