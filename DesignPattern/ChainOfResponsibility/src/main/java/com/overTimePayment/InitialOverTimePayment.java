package com.overTimePayment;

import java.math.BigDecimal;

public class InitialOverTimePayment extends Handler {

    @Override
    public BigDecimal calculateOvertimePayment(BasicPaymentInfo basicPaymentInfo) {
        basicPaymentInfo.setTotalPayment(basicPaymentInfo.getBasicSalary().
                multiply(new BigDecimal(basicPaymentInfo.getNoOfHours()).multiply(new BigDecimal(10000))));
        System.out.println("Calculating Initial Overtime payment");

        if ((basicPaymentInfo.getNoOfHours().compareTo(10) == 0)||basicPaymentInfo.getNoOfHours().compareTo(10) == -1) {
            return basicPaymentInfo.getTotalPayment();
        } else
            return successor.calculateOvertimePayment(basicPaymentInfo);
    }
}
