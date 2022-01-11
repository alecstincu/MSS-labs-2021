package com.unibuc.designpatterns;

import com.unibuc.designpatterns.behavioral.observer.Observer;
import com.unibuc.designpatterns.behavioral.observer.ScoreDisplay;
import com.unibuc.designpatterns.behavioral.observer.StatisticsDisplay;
import com.unibuc.designpatterns.behavioral.observer.Subject;
import com.unibuc.designpatterns.behavioral.observer.TennisData;

public class Client {
    public static void main(String[] args) {

//        Handler defaultHandler = new DefaultSupportHandler(null);
//        Handler it = new ItSupportHandler(defaultHandler);
//        Handler billing = new BillingSupportHandler(it);
//
//        billing.handleRequest("bill");

//        Strategy visa = new VisaStrategy();
//        Strategy mastercard = new MastercardStrategy();
//        CreditCard creditCard = new CreditCard(visa);
//        creditCard.pay();
//        
//        CreditCard masterCard = new CreditCard(mastercard);
//        masterCard.pay();

        Subject tennisData = new TennisData();

        Observer scoreDisplay = new ScoreDisplay();
        Observer statisticsDisplay = new StatisticsDisplay();

        tennisData.dataChanged();

        tennisData.register(scoreDisplay);
        tennisData.dataChanged();

        System.out.println("-----------------------------");

        tennisData.register(statisticsDisplay);
        tennisData.dataChanged();

        System.out.println("-----------------------------");
        tennisData.unregister(scoreDisplay);
        tennisData.dataChanged();
    }
}
