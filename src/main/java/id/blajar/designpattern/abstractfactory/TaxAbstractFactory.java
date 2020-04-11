package id.blajar.designpattern.abstractfactory;

import java.math.BigDecimal;

public abstract class TaxAbstractFactory {

    static TaxAbstractFactory getFactory(TaxType taxType, BigDecimal taxAmount) {
        TaxAbstractFactory factory;
        switch (taxType) {
            case PPN:
                factory = new TaxPPN(taxAmount);
                break;
            case PPNBM:
                factory = new TaxPPNBM(taxAmount);
                break;
            default:
                factory = null;
                break;

        }
        return factory;
    }

    public abstract BigDecimal getTaxAmount();

    public abstract BigDecimal getRate();

    public BigDecimal calculate() {
        return getTaxAmount().add(getTaxAmount().multiply(getRate()));
    }

}
