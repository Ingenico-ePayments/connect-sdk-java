/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */

package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.AmountOfMoney;

/**
 * Object containing data related to installments which can be used for card payments and only with some acquirers. In case you send in the details of this object, only the combination of card products and acquirers that do support installments will be shown on the MyCheckout hosted payment pages.
 */
public class Installments {

	private AmountOfMoney amountOfMoneyPerInstallment = null;

	private String frequencyOfInstallments = null;

	private Integer installmentPlanCode = null;

	private String interestRate = null;

	private Long numberOfInstallments = null;

	/**
	 * The amount that will be paid per installment. The total amount of amountOfMoneyPerInstallment x numberOfInstallments can not be higher than the total amount of this transaction, although we will not validate that.<br>
	 * For the payment product IDs BC Card (paymentProductId 8590), Hana Card (paymentProductId 8591), Hyundai Card (paymentProductId 8592), KB Card (paymentProductId 8593), Lotte Card (paymentProductId 8594), NH Card (paymentProductId 8595), Samsung Card (paymentProductId 8596) and Shinhan Card (paymentProductId 8597), this property is not used as the value is decided by the issuer.
	 */
	public AmountOfMoney getAmountOfMoneyPerInstallment() {
		return amountOfMoneyPerInstallment;
	}

	/**
	 * The amount that will be paid per installment. The total amount of amountOfMoneyPerInstallment x numberOfInstallments can not be higher than the total amount of this transaction, although we will not validate that.<br>
	 * For the payment product IDs BC Card (paymentProductId 8590), Hana Card (paymentProductId 8591), Hyundai Card (paymentProductId 8592), KB Card (paymentProductId 8593), Lotte Card (paymentProductId 8594), NH Card (paymentProductId 8595), Samsung Card (paymentProductId 8596) and Shinhan Card (paymentProductId 8597), this property is not used as the value is decided by the issuer.
	 */
	public void setAmountOfMoneyPerInstallment(AmountOfMoney value) {
		this.amountOfMoneyPerInstallment = value;
	}

	/**
	 * The frequency in which the installments will be collected from the customer.
	 *  The possible values are:
	 * <ul class="paragraph-width">
	 * <li>daily
	 * <li>weekly
	 * <li>monthly (default)
	 * <li>quarterly
	 * </ul><br>
	 * For the payment product IDs BC Card (paymentProductId 8590), Hana Card (paymentProductId 8591), Hyundai Card (paymentProductId 8592), KB Card (paymentProductId 8593), Lotte Card (paymentProductId 8594), NH Card (paymentProductId 8595), Samsung Card (paymentProductId 8596) and Shinhan Card (paymentProductId 8597), only the value monthly is valid.
	 */
	public String getFrequencyOfInstallments() {
		return frequencyOfInstallments;
	}

	/**
	 * The frequency in which the installments will be collected from the customer.
	 *  The possible values are:
	 * <ul class="paragraph-width">
	 * <li>daily
	 * <li>weekly
	 * <li>monthly (default)
	 * <li>quarterly
	 * </ul><br>
	 * For the payment product IDs BC Card (paymentProductId 8590), Hana Card (paymentProductId 8591), Hyundai Card (paymentProductId 8592), KB Card (paymentProductId 8593), Lotte Card (paymentProductId 8594), NH Card (paymentProductId 8595), Samsung Card (paymentProductId 8596) and Shinhan Card (paymentProductId 8597), only the value monthly is valid.
	 */
	public void setFrequencyOfInstallments(String value) {
		this.frequencyOfInstallments = value;
	}

	/**
	 * The code for the installment plan. The possible values are:
	 * <ul class="paragraph-width">
	 * <li><b>43</b> No-interest, 3 month Installmentplan
	 * <li><b>46</b>No-interest, 6 month Installmentplan
	 * <li><b>49</b>No-interest, 9 month Installmentplan
	 * <li><b>52</b>No-interest, 12 month Installmentplan
	 * </ul>
	 */
	public Integer getInstallmentPlanCode() {
		return installmentPlanCode;
	}

	/**
	 * The code for the installment plan. The possible values are:
	 * <ul class="paragraph-width">
	 * <li><b>43</b> No-interest, 3 month Installmentplan
	 * <li><b>46</b>No-interest, 6 month Installmentplan
	 * <li><b>49</b>No-interest, 9 month Installmentplan
	 * <li><b>52</b>No-interest, 12 month Installmentplan
	 * </ul>
	 */
	public void setInstallmentPlanCode(Integer value) {
		this.installmentPlanCode = value;
	}

	/**
	 * The interest rate paid for installments expressed in percentage. So for example 5.75 means 5.75%<br>
	 * For the payment product IDs BC Card (paymentProductId 8590), Hana Card (paymentProductId 8591), Hyundai Card (paymentProductId 8592), KB Card (paymentProductId 8593), Lotte Card (paymentProductId 8594), NH Card (paymentProductId 8595), Samsung Card (paymentProductId 8596) and Shinhan Card (paymentProductId 8597), this property is not used as the value is decided by the issuer.
	 */
	public String getInterestRate() {
		return interestRate;
	}

	/**
	 * The interest rate paid for installments expressed in percentage. So for example 5.75 means 5.75%<br>
	 * For the payment product IDs BC Card (paymentProductId 8590), Hana Card (paymentProductId 8591), Hyundai Card (paymentProductId 8592), KB Card (paymentProductId 8593), Lotte Card (paymentProductId 8594), NH Card (paymentProductId 8595), Samsung Card (paymentProductId 8596) and Shinhan Card (paymentProductId 8597), this property is not used as the value is decided by the issuer.
	 */
	public void setInterestRate(String value) {
		this.interestRate = value;
	}

	/**
	 * The number of installments in which this transaction will be paid, which can be used for card payments at supported acquirers, or with specific payment products. Only used with some acquirers. In case you send in the details of this object, only the payment products (or  combination of card products and acquirers) that support installments will be shown on the MyCheckout hosted payment pages. If this property is not provided the customer will not see details on the installment plan in a HostedCheckout.<br>
	 * For the payment product IDs BC Card (paymentProductId 8590), Hana Card (paymentProductId 8591), Hyundai Card (paymentProductId 8592), KB Card (paymentProductId 8593), Lotte Card (paymentProductId 8594), NH Card (paymentProductId 8595), Samsung Card (paymentProductId 8596) and Shinhan Card (paymentProductId 8597), there is a maximum of 12 installments.
	 */
	public Long getNumberOfInstallments() {
		return numberOfInstallments;
	}

	/**
	 * The number of installments in which this transaction will be paid, which can be used for card payments at supported acquirers, or with specific payment products. Only used with some acquirers. In case you send in the details of this object, only the payment products (or  combination of card products and acquirers) that support installments will be shown on the MyCheckout hosted payment pages. If this property is not provided the customer will not see details on the installment plan in a HostedCheckout.<br>
	 * For the payment product IDs BC Card (paymentProductId 8590), Hana Card (paymentProductId 8591), Hyundai Card (paymentProductId 8592), KB Card (paymentProductId 8593), Lotte Card (paymentProductId 8594), NH Card (paymentProductId 8595), Samsung Card (paymentProductId 8596) and Shinhan Card (paymentProductId 8597), there is a maximum of 12 installments.
	 */
	public void setNumberOfInstallments(Long value) {
		this.numberOfInstallments = value;
	}
}
