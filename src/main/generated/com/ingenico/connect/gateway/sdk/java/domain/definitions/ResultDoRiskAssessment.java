/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/
 */

package com.ingenico.connect.gateway.sdk.java.domain.definitions;

public class ResultDoRiskAssessment {

	private String category = null;

	private String result = null;

	private RetailDecisionsCCFraudCheckOutput retaildecisionsCCFraudCheckOutput = null;

	private ValidationBankAccountOutput validationBankAccountOutput = null;

	/**
	 * The Risk Services category with the following possible values:
	 * <ul class="paragraph-width">
	 * <li>retaildecisionsCCFraudCheck - checks performed by Retail Decisions
	 * <li>globalcollectBlacklistCheckCC - Checked against the blacklist on the GlobalCollect platform
	 * <li>authorizationCheck - 0$ auth card account validation check
	 * <li>ddFraudCheck - Check performed for German market via InterCard
	 * <li>validationbankAccount - Bank account details are algorithmically checked if they could exist
	 * <li>globalcollectBlacklistCheckDD - Checked against the blacklist on the GlobalCollect platform
	 * </ul>
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * The Risk Services category with the following possible values:
	 * <ul class="paragraph-width">
	 * <li>retaildecisionsCCFraudCheck - checks performed by Retail Decisions
	 * <li>globalcollectBlacklistCheckCC - Checked against the blacklist on the GlobalCollect platform
	 * <li>authorizationCheck - 0$ auth card account validation check
	 * <li>ddFraudCheck - Check performed for German market via InterCard
	 * <li>validationbankAccount - Bank account details are algorithmically checked if they could exist
	 * <li>globalcollectBlacklistCheckDD - Checked against the blacklist on the GlobalCollect platform
	 * </ul>
	 */
	public void setCategory(String value) {
		this.category = value;
	}

	/**
	 * Risk service result with the following possible results:
	 * <ul class="paragraph-width">
	 * <li>accepted - Based on the checks performed the transaction can be accepted
	 * <li>challenged - Based on the checks performed the transaction should be manually reviewed
	 * <li>denied - Based on the checks performed the transaction should be rejected
	 * <li>no-advice - No fraud check was requested/performed
	 * <li>error - The fraud check resulted in an error and the fraud check was thus not performed
	 * </ul>
	 */
	public String getResult() {
		return result;
	}

	/**
	 * Risk service result with the following possible results:
	 * <ul class="paragraph-width">
	 * <li>accepted - Based on the checks performed the transaction can be accepted
	 * <li>challenged - Based on the checks performed the transaction should be manually reviewed
	 * <li>denied - Based on the checks performed the transaction should be rejected
	 * <li>no-advice - No fraud check was requested/performed
	 * <li>error - The fraud check resulted in an error and the fraud check was thus not performed
	 * </ul>
	 */
	public void setResult(String value) {
		this.result = value;
	}

	/**
	 * Object containing the results of the fraud checks performed by Retail Decisions
	 */
	public RetailDecisionsCCFraudCheckOutput getRetaildecisionsCCFraudCheckOutput() {
		return retaildecisionsCCFraudCheckOutput;
	}

	/**
	 * Object containing the results of the fraud checks performed by Retail Decisions
	 */
	public void setRetaildecisionsCCFraudCheckOutput(RetailDecisionsCCFraudCheckOutput value) {
		this.retaildecisionsCCFraudCheckOutput = value;
	}

	/**
	 * Object containing the results of the fraud checks performed on the bank account data
	 */
	public ValidationBankAccountOutput getValidationBankAccountOutput() {
		return validationBankAccountOutput;
	}

	/**
	 * Object containing the results of the fraud checks performed on the bank account data
	 */
	public void setValidationBankAccountOutput(ValidationBankAccountOutput value) {
		this.validationBankAccountOutput = value;
	}
}
