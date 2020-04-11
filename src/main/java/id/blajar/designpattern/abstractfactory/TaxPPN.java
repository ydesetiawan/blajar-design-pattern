package com.codeghaib.designpattern.abstractfactory;

import java.math.BigDecimal;

public class TaxPPN extends TaxAbstractFactory {

    private static final BigDecimal RATE_PPN = new BigDecimal("0.1");

    private BigDecimal taxAmount;

    public TaxPPN(BigDecimal taxAmount) {
        this.taxAmount = taxAmount;
    }

    @Override
    public BigDecimal getTaxAmount() {
        return this.taxAmount;
    }

    @Override
    public BigDecimal getRate() {
        return RATE_PPN;
    }

}
