package com.offer.promotion;

import com.offer.pizza.ChickenPizza;
import com.offer.pizza.SausagePizza;

public class SnackPack extends Offer {

    @Override
    protected void newOffer() {
        pizzas.add(new ChickenPizza());
        pizzas.add(new SausagePizza());
    }
}
