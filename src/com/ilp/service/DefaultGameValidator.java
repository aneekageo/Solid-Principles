package com.ilp.service;

import com.ilp.entity.Game;

public class DefaultGameValidator implements GameValidator {
    @Override
    public void validate(Game game) {
        if (game.getPrice() <= 0) {
            System.out.println("Price must be greater than zero.");
        }
    }
}
