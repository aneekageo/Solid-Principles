package com.ilp.utility;

import com.ilp.entity.Game;
import com.ilp.service.*;

public class MainGamePublisher {
    public static void main(String[] args) {
        
        Game myGame = new Game("Example Game", 50.0, "Adventure");

        //Open for extension and closed for modification
        ExtendedGameValidator extendedValidator = new ExtendedGameValidator();
        extendedValidator.validate(myGame);

        //Liskov Substitution Principle
        DiscountableGame discountableGameDefault = new DiscountableGame(new DefaultDiscountCalculator());
        double discountedPriceDefault = discountableGameDefault.applyDiscount(myGame);
        System.out.println("Discounted Price with Default Calculator: " + discountedPriceDefault);

        DiscountableGame discountableGamePremium = new DiscountableGame(new PremiumDiscountCalculator());
        double discountedPricePremium = discountableGamePremium.applyDiscount(myGame);
        System.out.println("Discounted Price with Premium Calculator: " + discountedPricePremium);

        
        //Interface Segregation Principle
        PaymentProcessor paymentProcessor = new GamePaymentProcessor();
        paymentProcessor.processPayment(discountedPricePremium);
        AnalyticsProvider analyticsProvider = new GamePaymentProcessor();
        analyticsProvider.trackAnalytics();

        //Dependency Inversion Principle
        NotificationService notificationService = new EmailNotificationService();
        NotificationManager notificationManager = new NotificationManager(notificationService);
        notificationManager.notifyUser("Thank you for your purchase!");
    }
}
