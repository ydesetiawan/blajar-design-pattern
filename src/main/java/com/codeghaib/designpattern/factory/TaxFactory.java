package com.codeghaib.designpattern.factory;

public class TaxFactory {

    static Tax getFactory(TaxType taxType) {
        Tax factory;
        switch (taxType) {
            case PPN:
                factory = new TaxPPN();
                break;
            case PPNBM:
                factory = new TaxPPNBM();
                break;
            default:
                factory = null;
                break;

        }
        return factory;
    }

}
