package com.offer;

public class PartyPack extends Offer {

    @Override
    protected void newOffer() {
        pizzas.add(new CheesePizza());
        pizzas.add(new ChickenBaconPizza());
        pizzas.add(new ChickenPizza());
    }
}
