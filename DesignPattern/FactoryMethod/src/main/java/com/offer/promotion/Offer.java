package com.offer.promotion;

import com.offer.pizza.Pizza;

import java.util.ArrayList;
import java.util.List;

public abstract class Offer {

    protected List<Pizza> pizzas =new ArrayList<Pizza>();

    protected abstract void newOffer();

    public Offer(){
        newOffer();
    }

    @Override
    public String toString() {
        return "Offer{" +
                "pizzas=" + pizzas +
                '}';
    }
}
