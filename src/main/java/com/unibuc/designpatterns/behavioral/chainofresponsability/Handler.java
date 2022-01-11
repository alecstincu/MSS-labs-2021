package com.unibuc.designpatterns.behavioral.chainofresponsability;

public abstract class Handler {

    private Handler next;

    public Handler(Handler next) {
        this.next = next;
    }

    public void handleRequest(String request) {
        if (request != null) {
            next.handleRequest(request);
        }
    }

    public void setNext(Handler next) {
        this.next = next;
    }
}
