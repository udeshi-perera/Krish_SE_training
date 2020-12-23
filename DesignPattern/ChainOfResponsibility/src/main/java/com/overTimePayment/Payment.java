package com.overTimePayment;

import java.math.BigDecimal;

public class Payment extends Handler {
    @Override
    public BigDecimal calculateOvertimePayment(BasicPaymentInfo basicPaymentInfo) {
        return successor.calculateOvertimePayment(basicPaymentInfo);
    }
}
