package com.codeghaib.designpattern.abstractfactory;

import java.math.BigDecimal;

public class ClientSide {

    public static void main(String[] args) {

        TaxAbstractFactory taxPPN = TaxAbstractFactory.getFactory(TaxType.PPN, new BigDecimal("1000000"));
        BigDecimal taxPPNTotal = taxPPN.calculate();

        System.out.println("taxTotal PPN : " + taxPPNTotal);

        TaxAbstractFactory taxPPNBM = TaxAbstractFactory.getFactory(TaxType.PPNBM, new BigDecimal("1000000"));
        BigDecimal taxPPNBMTotal = taxPPNBM.calculate();

        System.out.println("taxTotal PPNBM : " + taxPPNBMTotal);

    }

}
