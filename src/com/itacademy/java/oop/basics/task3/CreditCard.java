package com.itacademy.java.oop.basics.task3;

public final class CreditCard extends Card{
    private final double INTEREST;
    private final double CREDIT;

    public CreditCard(double INTEREST, double CREDIT, double balance, String cardHolderName, String cardNumber) {
        super(balance, cardHolderName, cardNumber);
        this.INTEREST = INTEREST;
        this.CREDIT = CREDIT;
    }

    public double getInterestCost(double amount) {
        return amount * INTEREST / 100;
    }

    @Override
    void debit(double amount) {
        double amountToDecrease = amount + getInterestCost(amount);
        if(balance - amountToDecrease < -CREDIT){
            throw new NotEnoughCreditException();
        }
        balance -= amountToDecrease;
    }
}
