package com.unibuc.designpatterns.structural.proxy;

import java.util.Arrays;
import java.util.List;

public class ProxyImpl implements Internet {

    private final Internet internet;
    private final List<String> allowedSites = Arrays.asList("abc", "def");

    public ProxyImpl(Internet internet) {
        this.internet = internet;
    }

    @Override
    public void connectTo(String host) {
        if (allowedSites.contains(host)) {
            internet.connectTo(host);
        } else {
            throw new IllegalArgumentException();
        }
    }
}
