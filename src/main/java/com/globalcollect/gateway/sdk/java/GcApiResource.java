package com.globalcollect.gateway.sdk.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.globalcollect.gateway.sdk.java.gc.errors.ErrorResponse;
import com.globalcollect.gateway.sdk.java.gc.errors.definitions.APIError;
import com.globalcollect.gateway.sdk.java.gc.payment.PaymentErrorResponse;
import com.globalcollect.gateway.sdk.java.gc.payout.PayoutErrorResponse;
import com.globalcollect.gateway.sdk.java.gc.refund.RefundErrorResponse;

/**
 * Base class of all GlobalCollect platform API resources.
 */
public abstract class GcApiResource {

	private final GcApiResource parent;
	protected final GcCommunicator communicator;
	private final Map<String, String> pathContext;
	protected final String clientMetaInfo;

	protected GcApiResource(GcApiResource parent, Map<String, String> pathContext) {
		if (parent == null) {
			throw new IllegalArgumentException("parent is required");
		}
		this.parent = parent;
		this.communicator = parent.communicator;
		this.pathContext = pathContext;
		this.clientMetaInfo = parent.clientMetaInfo;
	}

	protected GcApiResource(GcCommunicator communicator, String clientMetaInfo, Map<String, String> pathContext) {
		if (communicator == null) {
			throw new IllegalArgumentException("communicator is required");
		}
		this.parent = null;
		this.communicator = communicator;
		this.pathContext = pathContext;
		this.clientMetaInfo = clientMetaInfo;
	}

	protected List<RequestHeader> getClientHeaders() {
		if (clientMetaInfo != null) {

			List<RequestHeader> clientHeaders = new ArrayList<RequestHeader>();
			clientHeaders.add(new RequestHeader("X-GCS-ClientMetaInfo", clientMetaInfo));
			return clientHeaders;

		} else {
			return null;
		}
	}

	protected String instantiateUri(String uri, Map<String, String> pathContext) {
		uri = replaceAll(uri, pathContext);
		uri = instantiateUri(uri);
		return uri;
	}

	private String instantiateUri(String uri) {
		uri = replaceAll(uri, pathContext);
		if (parent != null) {
			uri = parent.instantiateUri(uri);
		}
		return uri;
	}

	private String replaceAll(String uri, Map<String, String> pathContext) {
		if (pathContext != null) {
			for (Map.Entry<String, String> entry : pathContext.entrySet()) {
				uri = uri.replace(String.format("{%s}", entry.getKey()), entry.getValue());
			}
		}
		return uri;
	}

	protected RuntimeException createException(int statusCode, String responseBody, Object errorObject, CallContext context) {
		if (errorObject instanceof PaymentErrorResponse && ((PaymentErrorResponse) errorObject).getPaymentResult() != null) {
			return new GcDeclinedPaymentException(statusCode, responseBody, (PaymentErrorResponse) errorObject);
		} else if (errorObject instanceof PayoutErrorResponse && ((PayoutErrorResponse) errorObject).getPayoutResult() != null) {
			return new GcDeclinedPayoutException(statusCode, responseBody, (PayoutErrorResponse) errorObject);
		} else if (errorObject instanceof RefundErrorResponse && ((RefundErrorResponse) errorObject).getRefundResult() != null) {
			return new GcDeclinedRefundException(statusCode, responseBody, (RefundErrorResponse) errorObject);
		}

		String errorId;
		List<APIError> errors;
		if (errorObject instanceof PaymentErrorResponse) {
			PaymentErrorResponse paymentErrorResponse = (PaymentErrorResponse) errorObject;
			errorId = paymentErrorResponse.getErrorId();
			errors = paymentErrorResponse.getErrors();
		} else if (errorObject instanceof PayoutErrorResponse) {
			PayoutErrorResponse payoutErrorResponse = (PayoutErrorResponse) errorObject;
			errorId = payoutErrorResponse.getErrorId();
			errors = payoutErrorResponse.getErrors();
		} else if (errorObject instanceof RefundErrorResponse) {
			RefundErrorResponse refundErrorResponse = (RefundErrorResponse) errorObject;
			errorId = refundErrorResponse.getErrorId();
			errors = refundErrorResponse.getErrors();
		} else if (errorObject instanceof ErrorResponse) {
			ErrorResponse errorResponse = (ErrorResponse) errorObject;
			errorId = errorResponse.getErrorId();
			errors = errorResponse.getErrors();
		} else {
			throw new IllegalArgumentException("unsupported error object type: " + errorObject.getClass().getName());
		}

		switch (statusCode) {
		case 400:
			return new GcValidationException(statusCode, responseBody, errorId, errors);
		case 403:
			return new GcAuthorizationException(statusCode, responseBody, errorId, errors);
		case 404:
			return new GcReferenceException(statusCode, responseBody, errorId, errors);
		case 409:
			if (isIdempotenceError(errors, context)) {
				String idempotenceKey = context.getIdempotenceKey();
				Long idempotenceRequestTimestamp = context.getIdempotenceRequestTimestamp();
				return new GcIdempotenceException(idempotenceKey, idempotenceRequestTimestamp, statusCode, responseBody, errorId, errors);
			} else {
				return new GcReferenceException(statusCode, responseBody, errorId, errors);
			}
		case 410:
			return new GcReferenceException(statusCode, responseBody, errorId, errors);
		case 500:
			return new GlobalCollectException(statusCode, responseBody, errorId, errors);
		case 502:
			return new GlobalCollectException(statusCode, responseBody, errorId, errors);
		case 503:
			return new GlobalCollectException(statusCode, responseBody, errorId, errors);
		default:
			return new GcApiException(statusCode, responseBody, errorId, errors);
		}
	}

	private boolean isIdempotenceError(List<APIError> errors, CallContext context) {
		return context != null
				&& context.getIdempotenceKey() != null
				&& errors.size() == 1
				&& "1409".equals(errors.get(0).getCode());
	}
}
