package com.unibuc.designpatterns.behavioral.observer;

public class ScoreDisplay implements Observer {

    @Override
    public void display(int totalFirstServeWins, int latestServeSpeed, int totalPointPlayedOnFirstServe) {
        System.out.println("No of wins on first serve: " + totalFirstServeWins + "\n" +
                "Latest serve speed was: " + latestServeSpeed + "\n" +
                "Total points played on first serve are: " + totalPointPlayedOnFirstServe + ".");
    }
}
