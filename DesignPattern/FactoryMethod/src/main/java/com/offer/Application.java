package com.offer;

import com.offer.promotion.Offer;
import com.offer.promotion.PromoCode;

public class Application {

    public static void main(String[] args) {

        Offer familyOffer= Promotion.checkPromoCode(PromoCode.FAMILY);
        System.out.println(familyOffer);

        Offer partyOffer=Promotion.checkPromoCode(PromoCode.PARTY);
        System.out.println(partyOffer);

        Offer snackOffer=Promotion.checkPromoCode(PromoCode.SNACK);
        System.out.println(snackOffer);
    }
}
