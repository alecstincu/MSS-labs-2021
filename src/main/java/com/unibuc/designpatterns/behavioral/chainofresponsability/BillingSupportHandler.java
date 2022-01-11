package com.unibuc.designpatterns.behavioral.chainofresponsability;

import java.util.Arrays;
import java.util.List;

public class BillingSupportHandler extends Handler {

    List<String> billingRequests = Arrays.asList("bill", "money", "pay");

    public BillingSupportHandler(Handler next) {
        super(next);
    }
    
//    public void setNext(Handler next) {
//        super.setNext(next);
//    }

    public void handleRequest(String request) {
        if (billingRequests.contains(request)) {
            System.out.println("Billing has it");
        } else {
            super.handleRequest(request);
        }
    }
}
