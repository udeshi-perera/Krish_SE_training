package com.offer;

import com.offer.promotion.Offer;
import com.offer.promotion.FamilyPack;
import com.offer.promotion.PartyPack;
import com.offer.promotion.PromoCode;
import com.offer.promotion.SnackPack;

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
