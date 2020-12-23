package com.overTimePayment;

import java.math.BigDecimal;

public class TotalBonusPayment extends Handler {

    @Override
    public BigDecimal calculateOvertimePayment(BasicPaymentInfo basicPaymentInfo) {
        basicPaymentInfo.setTotalPayment(basicPaymentInfo.getBasicSalary().
                multiply(new BigDecimal(basicPaymentInfo.getNoOfHours()).multiply(new BigDecimal(20000))));
        System.out.println("Calculating total bonus payment");

        if ((basicPaymentInfo.getNoOfHours().compareTo(20) == 1)) {
            return basicPaymentInfo.getTotalPayment();
        }
        return basicPaymentInfo.getTotalPayment();
    }
}

