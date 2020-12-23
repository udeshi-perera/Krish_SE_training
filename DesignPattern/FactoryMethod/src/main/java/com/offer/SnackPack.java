package com.offer;

public class SnackPack extends Offer {

    @Override
    protected void newOffer() {
        pizzas.add(new ChickenPizza());
        pizzas.add(new SausagePizza());
    }
}
