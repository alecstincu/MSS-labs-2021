package com.unibuc.designpatterns.behavioral.strategy;

public class VisaStrategy implements Strategy{
    @Override
    public boolean isValid() {
        return false;
    }
}
