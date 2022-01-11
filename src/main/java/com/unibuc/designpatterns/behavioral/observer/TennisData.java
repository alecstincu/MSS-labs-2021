package com.unibuc.designpatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TennisData implements Subject {

    List<Observer> observerList = new ArrayList<>();

    int totalFirstServeWins, latestServeSpeed, totalPointPlayedOnFirstServe;

    @Override
    public void register(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observerList) {
            observer.display(totalFirstServeWins, latestServeSpeed, totalPointPlayedOnFirstServe);
        }
    }

    private int getLatestFirstServeWins() {
        return new Random().nextInt(100);
    }

    private int getLatestServeSpeed() {
        return new Random().nextInt(100);
    }

    private int getTotalPointPlayedOnFirstServe() {
        return new Random().nextInt(100);
    }

    public void dataChanged() {
        totalFirstServeWins = getLatestFirstServeWins();
        latestServeSpeed = getLatestServeSpeed();
        totalPointPlayedOnFirstServe = getTotalPointPlayedOnFirstServe();

        notifyObservers();
    }
}
