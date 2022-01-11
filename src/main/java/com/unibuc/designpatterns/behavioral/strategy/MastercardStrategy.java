package com.unibuc.designpatterns.behavioral.strategy;

public class MastercardStrategy implements Strategy {
    @Override
    public boolean isValid() {
        return true;
    }
}
