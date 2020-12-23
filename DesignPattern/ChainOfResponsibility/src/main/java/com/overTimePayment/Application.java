package com.overTimePayment;

import java.math.BigDecimal;

public class Application {

    public static void main(String[] args) {

        InitialOverTimePayment initialOverTimePayment=new InitialOverTimePayment();
        BonusPayment bonusPayment=new BonusPayment();
        TotalBonusPayment totalBonusPayment=new TotalBonusPayment();
        Payment payment=new Payment();

        payment.setSuccessor(initialOverTimePayment);
        initialOverTimePayment.setSuccessor(bonusPayment);
        bonusPayment.setSuccessor(totalBonusPayment);

        BasicPaymentInfo basicPaymentInfo=new BasicPaymentInfo(BigDecimal.valueOf(40000),10);
        System.out.println(payment.calculateOvertimePayment(basicPaymentInfo));

        BasicPaymentInfo basicPaymentInfo1=new BasicPaymentInfo(BigDecimal.valueOf(40000),15);
        System.out.println(payment.calculateOvertimePayment(basicPaymentInfo1));

        BasicPaymentInfo basicPaymentInfo2=new BasicPaymentInfo(BigDecimal.valueOf(40000),30);
        System.out.println(payment.calculateOvertimePayment(basicPaymentInfo2));
    }
}
