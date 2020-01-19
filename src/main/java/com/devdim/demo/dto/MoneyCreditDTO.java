package com.devdim.demo.dto;

/**
 * created by Dima on 1/19/2020.
 */
public class MoneyCreditDTO {

    private double creditAmount;

    private String currency;

    public double getCreditAmount() {
        return creditAmount;
    }

    public void setCreditAmount(double creditAmount) {
        this.creditAmount = creditAmount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
