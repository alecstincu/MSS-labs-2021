package com.unibuc.designpatterns.behavioral.chainofresponsability;

public class DefaultSupportHandler extends Handler {

    public DefaultSupportHandler(Handler next) {
        super(next);
    }

    public void handleRequest(String request) {
        System.out.println("STOP");
    }
//
//    public void setNext(Handler next) {
//        super.setNext(next);
//    }
}
