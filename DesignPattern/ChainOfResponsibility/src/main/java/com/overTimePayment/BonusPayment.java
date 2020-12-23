package com.overTimePayment;

import java.math.BigDecimal;

public class BonusPayment extends Handler {

    @Override
    public BigDecimal calculateOvertimePayment(BasicPaymentInfo basicPaymentInfo) {
        basicPaymentInfo.setTotalPayment(basicPaymentInfo.getBasicSalary().
                multiply(new BigDecimal(basicPaymentInfo.getNoOfHours()).multiply(new BigDecimal(20000))));
        System.out.println("Calculating bonus payment");

        if ((basicPaymentInfo.getNoOfHours().compareTo(20) == 0)||basicPaymentInfo.getNoOfHours().compareTo(20) == -1) {
            return basicPaymentInfo.getTotalPayment();
        } else
            return successor.calculateOvertimePayment(basicPaymentInfo);
    }
}
