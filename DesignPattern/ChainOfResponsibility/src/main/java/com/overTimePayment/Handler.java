package com.overTimePayment;

import java.math.BigDecimal;

public abstract class Handler {

    protected Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract BigDecimal calculateOvertimePayment(BasicPaymentInfo basicPaymentInfo);
}
