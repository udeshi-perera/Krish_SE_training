package com.offer.promotion;

import com.offer.pizza.CheesePizza;

public class FamilyPack extends Offer {

    @Override
    protected void newOffer() {
        pizzas.add(new CheesePizza());
    }
}
