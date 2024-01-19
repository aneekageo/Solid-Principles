//Liskov Substitution Principle


package com.ilp.service;

import com.ilp.entity.Game;

public interface Discountable {
    double calculateDiscount(Game game);
}
