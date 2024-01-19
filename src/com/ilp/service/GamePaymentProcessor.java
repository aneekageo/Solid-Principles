package com.ilp.service;

public class GamePaymentProcessor implements PaymentProcessor, AnalyticsProvider {
    @Override
    public void processPayment(double amount) {
    	System.out.println("Payment Processed");
    }

    @Override
    public void trackAnalytics() {
    	System.out.println("Analytics Tracked");
    }
}
