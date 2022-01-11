package com.unibuc.designpatterns.behavioral.observer;

public class StatisticsDisplay implements Observer {
    
    @Override
    public void display(int totalFirstServeWins, int latestServeSpeed, int totalPointPlayedOnFirstServe) {
        float firstServeWinPercentage = (float) totalFirstServeWins / totalPointPlayedOnFirstServe;

        System.out.println("Percentage of won points on first serve: " + firstServeWinPercentage * 100);
    }
}
