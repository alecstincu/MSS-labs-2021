package com.unibuc.designpatterns.behavioral.chainofresponsability;

import java.util.Arrays;
import java.util.List;

public class ItSupportHandler extends Handler {

    List<String> itRequests = Arrays.asList("computer", "phone");

    public ItSupportHandler(Handler next) {
        super(next);
    }

//    public void setNext(Handler next) {
//        super.setNext(next);
//    }

    public void handleRequest(String request) {
        if (itRequests.contains(request)) {
            System.out.println("IT has it");
        } else {
            super.handleRequest(request);
        }
    }
}
