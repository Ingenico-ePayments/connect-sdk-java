/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/
 */

package com.ingenico.connect.gateway.sdk.java.domain.definitions;

/**
 * Details of the card payment fraud checks that were performed
 */
public class CardFraudResults extends FraudResults {

	private String avsResult = null;

	private String cvvResult = null;

	private FraugsterResults fraugster = null;

	private FraudResultsRetailDecisions retailDecisions = null;

	/**
	 * Result of the Address Verification Service checks. Possible values are:
	 * <ul class="paragraph-width">
	 * <li>A - Address (Street) matches, Zip does not
	 * <li>B - Street address match for international transactions—Postal code not verified due to incompatible formats
	 * <li>C - Street address and postal code not verified for international transaction due to incompatible formats
	 * <li>D - Street address and postal code match for international transaction, cardholder name is incorrect
	 * <li>E - AVS error
	 * <li>F - Address does match and five digit ZIP code does match (UK only)
	 * <li>G - Address information is unavailable; international transaction; non-AVS participant
	 * <li>H - Billing address and postal code match, cardholder name is incorrect (Amex)
	 * <li>I - Address information not verified for international transaction
	 * <li>K - Cardholder name matches (Amex)
	 * <li>L - Cardholder name and postal code match (Amex)
	 * <li>M - Cardholder name, street address, and postal code match for international transaction
	 * <li>N - No Match on Address (Street) or Zip
	 * <li>O - Cardholder name and address match (Amex)
	 * <li>P - Postal codes match for international transaction—Street address not verified due to incompatible formats
	 * <li>Q - Billing address matches, cardholder is incorrect (Amex)
	 * <li>R - Retry, System unavailable or Timed out
	 * <li>S - Service not supported by issuer
	 * <li>U - Address information is unavailable
	 * <li>W - 9 digit Zip matches, Address (Street) does not
	 * <li>X - Exact AVS Match
	 * <li>Y - Address (Street) and 5 digit Zip match
	 * <li>Z - 5 digit Zip matches, Address (Street) does not
	 * <li>0 - No service available
	 * </ul>
	 */
	public String getAvsResult() {
		return avsResult;
	}

	/**
	 * Result of the Address Verification Service checks. Possible values are:
	 * <ul class="paragraph-width">
	 * <li>A - Address (Street) matches, Zip does not
	 * <li>B - Street address match for international transactions—Postal code not verified due to incompatible formats
	 * <li>C - Street address and postal code not verified for international transaction due to incompatible formats
	 * <li>D - Street address and postal code match for international transaction, cardholder name is incorrect
	 * <li>E - AVS error
	 * <li>F - Address does match and five digit ZIP code does match (UK only)
	 * <li>G - Address information is unavailable; international transaction; non-AVS participant
	 * <li>H - Billing address and postal code match, cardholder name is incorrect (Amex)
	 * <li>I - Address information not verified for international transaction
	 * <li>K - Cardholder name matches (Amex)
	 * <li>L - Cardholder name and postal code match (Amex)
	 * <li>M - Cardholder name, street address, and postal code match for international transaction
	 * <li>N - No Match on Address (Street) or Zip
	 * <li>O - Cardholder name and address match (Amex)
	 * <li>P - Postal codes match for international transaction—Street address not verified due to incompatible formats
	 * <li>Q - Billing address matches, cardholder is incorrect (Amex)
	 * <li>R - Retry, System unavailable or Timed out
	 * <li>S - Service not supported by issuer
	 * <li>U - Address information is unavailable
	 * <li>W - 9 digit Zip matches, Address (Street) does not
	 * <li>X - Exact AVS Match
	 * <li>Y - Address (Street) and 5 digit Zip match
	 * <li>Z - 5 digit Zip matches, Address (Street) does not
	 * <li>0 - No service available
	 * </ul>
	 */
	public void setAvsResult(String value) {
		this.avsResult = value;
	}

	/**
	 * Result of the Card Verification Value checks. Possible values are:
	 * <ul class="paragraph-width">
	 * <li>M - CVV check performed and valid value
	 * <li>N - CVV checked and no match
	 * <li>P - CVV check not performed, not requested
	 * <li>S - Cardholder claims no CVV code on card, issuer states CVV-code should be on card
	 * <li>U - Issuer not certified for CVV2
	 * <li>Y - Server provider did not respond
	 * <li>0 - No service available
	 * </ul>
	 */
	public String getCvvResult() {
		return cvvResult;
	}

	/**
	 * Result of the Card Verification Value checks. Possible values are:
	 * <ul class="paragraph-width">
	 * <li>M - CVV check performed and valid value
	 * <li>N - CVV checked and no match
	 * <li>P - CVV check not performed, not requested
	 * <li>S - Cardholder claims no CVV code on card, issuer states CVV-code should be on card
	 * <li>U - Issuer not certified for CVV2
	 * <li>Y - Server provider did not respond
	 * <li>0 - No service available
	 * </ul>
	 */
	public void setCvvResult(String value) {
		this.cvvResult = value;
	}

	/**
	 * Results of Fraugster fraud prevention check. Fraugster collects transaction data points such as name, email address, billing, etc. to analyze whether or not the transaction is fraudulent.
	 */
	public FraugsterResults getFraugster() {
		return fraugster;
	}

	/**
	 * Results of Fraugster fraud prevention check. Fraugster collects transaction data points such as name, email address, billing, etc. to analyze whether or not the transaction is fraudulent.
	 */
	public void setFraugster(FraugsterResults value) {
		this.fraugster = value;
	}

	/**
	 * Additional response data returned by RetailDecisions
	 */
	public FraudResultsRetailDecisions getRetailDecisions() {
		return retailDecisions;
	}

	/**
	 * Additional response data returned by RetailDecisions
	 */
	public void setRetailDecisions(FraudResultsRetailDecisions value) {
		this.retailDecisions = value;
	}
}
