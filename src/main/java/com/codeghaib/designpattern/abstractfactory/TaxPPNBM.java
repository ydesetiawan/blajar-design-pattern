package com.codeghaib.designpattern.abstractfactory;

import java.math.BigDecimal;

public class TaxPPNBM extends TaxAbstractFactory {

    private static final BigDecimal RATE_PPNBM = new BigDecimal("0.25");

    private BigDecimal taxAmount;

    public TaxPPNBM(BigDecimal taxAmount) {
        this.taxAmount = taxAmount;
    }

    @Override
    public BigDecimal getTaxAmount() {
        return this.taxAmount;
    }

    @Override
    public BigDecimal getRate() {
        return RATE_PPNBM;
    }
}
