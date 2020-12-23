package com.overTimePayment;

import java.math.BigDecimal;

public class BasicPaymentInfo {

    private BigDecimal basicSalary;
    private Integer noOfHours;
    private BigDecimal totalPayment;

    public void setTotalPayment(BigDecimal totalPayment) {
        this.totalPayment = totalPayment;
    }

    public BasicPaymentInfo(BigDecimal basicSalary, Integer noOfHours) {
        this.basicSalary = basicSalary;
        this.noOfHours = noOfHours;
    }

    public BigDecimal getBasicSalary() {
        return basicSalary;
    }

    public Integer getNoOfHours() {
        return noOfHours;
    }

    public BigDecimal getTotalPayment() {
        return totalPayment;
    }
}
