package com.ingenico.connect.gateway.sdk.java.domain.webhooks;

import com.ingenico.connect.gateway.sdk.java.domain.dispute.DisputeResponse;
import com.ingenico.connect.gateway.sdk.java.domain.payment.PaymentResponse;
import com.ingenico.connect.gateway.sdk.java.domain.payout.PayoutResponse;
import com.ingenico.connect.gateway.sdk.java.domain.refund.RefundResponse;
import com.ingenico.connect.gateway.sdk.java.domain.token.TokenResponse;

public class WebhooksEvent {

	private String apiVersion;

	private String id;

	private String created;

	private String merchantId;

	private String type;

	private PaymentResponse payment;

	private RefundResponse refund;

	private PayoutResponse payout;

	private TokenResponse token;

	private DisputeResponse dispute;

	public String getApiVersion() {
		return apiVersion;
	}

	public void setApiVersion(String apiVersion) {
		this.apiVersion = apiVersion;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	public String getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public PaymentResponse getPayment() {
		return payment;
	}

	public void setPayment(PaymentResponse payment) {
		this.payment = payment;
	}

	public RefundResponse getRefund() {
		return refund;
	}

	public void setRefund(RefundResponse refund) {
		this.refund = refund;
	}

	public PayoutResponse getPayout() {
		return payout;
	}

	public void setPayout(PayoutResponse payout) {
		this.payout = payout;
	}

	public TokenResponse getToken() {
		return token;
	}

	public void setToken(TokenResponse token) {
		this.token = token;
	}

	public DisputeResponse getDispute() {
		return dispute;
	}

	public void setDispute(DisputeResponse dispute) {
		this.dispute = dispute;
	}
}
