package com.ilp.service;

public class SimplePaymentProcessor implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
       System.out.println("Payment Processed");
    }
}
