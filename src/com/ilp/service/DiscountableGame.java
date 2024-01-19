package com.ilp.service;

import com.ilp.entity.Game;

public class DiscountableGame {
    private Discountable discountable;

    public DiscountableGame(Discountable discountable) {
        this.discountable = discountable;
    }

    public double applyDiscount(Game game) {
        return discountable.calculateDiscount(game);
    }
}
