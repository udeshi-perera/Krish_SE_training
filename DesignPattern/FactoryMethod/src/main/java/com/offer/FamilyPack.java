package com.offer;

public class FamilyPack extends Offer{

    @Override
    protected void newOffer() {
        pizzas.add(new CheesePizza());
    }
}
