package com.codeghaib.designpattern.abstractfactory;

import java.math.BigDecimal;

public class TaxPPN extends Tax {

    private static final BigDecimal RATE_PPN = new BigDecimal("0.1");

    public BigDecimal rate() {
        return RATE_PPN;
    }
}
