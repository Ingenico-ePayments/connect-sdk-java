/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/
 */

package com.ingenico.connect.gateway.sdk.java.domain.product.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.KeyValuePair;

public class AccountOnFileAttribute extends KeyValuePair {

	private String mustWriteReason = null;

	private String status = null;

	/**
	 * The reason why the status is MUST_WRITE. Currently only "IN_THE_PAST" is possible as value (for expiry date), but this can be extended with new values in the future.
	 */
	public String getMustWriteReason() {
		return mustWriteReason;
	}

	/**
	 * The reason why the status is MUST_WRITE. Currently only "IN_THE_PAST" is possible as value (for expiry date), but this can be extended with new values in the future.
	 */
	public void setMustWriteReason(String value) {
		this.mustWriteReason = value;
	}

	/**
	 * Possible values:
	 * <ul class="paragraph-width"><li>READ_ONLY - attribute cannot be updated and should be presented in that way to the user
	 * <li>CAN_WRITE - attribute can be updated and should be presented as an editable field, for example an expiration date that will expire very soon
	 * <li>MUST_WRITE - attribute should be updated and must be presented as an editable field, for example an expiration date that has already expired
	 * </ul>
	 * Any updated values that are entered for CAN_WRITE or MUST_WRITE will be used to update the values stored in the token.
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Possible values:
	 * <ul class="paragraph-width"><li>READ_ONLY - attribute cannot be updated and should be presented in that way to the user
	 * <li>CAN_WRITE - attribute can be updated and should be presented as an editable field, for example an expiration date that will expire very soon
	 * <li>MUST_WRITE - attribute should be updated and must be presented as an editable field, for example an expiration date that has already expired
	 * </ul>
	 * Any updated values that are entered for CAN_WRITE or MUST_WRITE will be used to update the values stored in the token.
	 */
	public void setStatus(String value) {
		this.status = value;
	}
}
