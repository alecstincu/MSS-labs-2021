package com.unibuc.designpatterns.behavioral.observer;

public interface Subject {

    void register(Observer observer);

    void unregister(Observer observer);

    void notifyObservers();

    void dataChanged();
}
