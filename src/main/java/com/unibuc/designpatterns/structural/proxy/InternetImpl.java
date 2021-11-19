package com.unibuc.designpatterns.structural.proxy;

public class InternetImpl implements Internet {

    @Override
    public void connectTo(String host) {
        System.out.println("Connected to: " + host);
    }
}
