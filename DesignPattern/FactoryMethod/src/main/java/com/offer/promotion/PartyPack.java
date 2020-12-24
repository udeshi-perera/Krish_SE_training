package com.offer.promotion;

import com.offer.pizza.CheesePizza;
import com.offer.pizza.ChickenBaconPizza;
import com.offer.pizza.ChickenPizza;

public class PartyPack extends Offer {

    @Override
    protected void newOffer() {
        pizzas.add(new CheesePizza());
        pizzas.add(new ChickenBaconPizza());
        pizzas.add(new ChickenPizza());
    }
}
