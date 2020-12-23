package com.offer;

public class Promotion {

    public static Offer checkPromoCode(PromoCode promoCode) {
        switch (promoCode) {
            case PARTY:
                return new PartyPack();

            case SNACK:
                return new SnackPack();
            case FAMILY:
                return new FamilyPack();
            default:
                return null;
        }

    }
}
