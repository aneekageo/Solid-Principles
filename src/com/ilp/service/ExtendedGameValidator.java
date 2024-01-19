package com.ilp.service;

import com.ilp.entity.Game;

public class ExtendedGameValidator implements GameValidator {
    @Override
    public void validate(Game game) {
        if (game.getGenre() == null || game.getGenre().isEmpty()) {
            System.out.println("Genre must be specified.");
        }
        new DefaultGameValidator().validate(game);
    }
}
