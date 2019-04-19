package com.codeghaib.designpattern.factory;

import java.math.BigDecimal;

public class TaxPPNBM extends Tax {

    private static final BigDecimal RATE_PPNBM = new BigDecimal("0.25");

    public BigDecimal rate() {
        return RATE_PPNBM;
    }
}
