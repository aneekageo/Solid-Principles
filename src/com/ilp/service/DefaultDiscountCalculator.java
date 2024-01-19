package com.ilp.service;

import com.ilp.entity.Game;

public class DefaultDiscountCalculator implements Discountable {
    @Override
    public double calculateDiscount(Game game) {
        return game.getPrice() * 0.1;
    }
}
