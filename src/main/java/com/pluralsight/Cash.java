package com.pluralsight;

public class Cash extends Asset {
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    double amount;

    public Cash(String description, String dateAcquired, double originalCost, double amount) {
        super(description, dateAcquired, originalCost);
        this.amount = amount;
    }

    @Override
    public double getValue() {
        return getAmount();
    }
}
