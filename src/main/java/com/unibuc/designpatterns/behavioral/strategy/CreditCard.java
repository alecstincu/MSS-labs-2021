package com.unibuc.designpatterns.behavioral.strategy;

public class CreditCard {

    private Strategy strategy;

    public CreditCard(Strategy strategy) {
        this.strategy = strategy;
    }

    public void pay() {
        if (strategy.isValid()) {
            System.out.println("SUCCESS");
        } else {
            System.out.println("FAILURE");
        }
    }
}
