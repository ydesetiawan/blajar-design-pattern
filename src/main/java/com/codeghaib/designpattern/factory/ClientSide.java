package com.codeghaib.designpattern.factory;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class ClientSide {

    public static void main(String[] args) {

        Transaction transactionPPN = new Transaction(getProducs(), TaxFactory.getFactory(TaxType.PPN));
        System.out.println("grandTotal : " + transactionPPN.getGrandTotal());

        Transaction transactionPPNBM = new Transaction(getProducs(), TaxFactory.getFactory(TaxType.PPNBM));
        System.out.println("grandTotal : " + transactionPPNBM.getGrandTotal());

        Transaction transactionWithoutTax = new Transaction(getProducs(), null);
        System.out.println("grandTotal : " + transactionWithoutTax.getGrandTotal());

    }

    public static List<Product> getProducs() {
        return Arrays.asList(
            new Product("1", "Product A", new BigDecimal("100000")),
            new Product("2", "Product B", new BigDecimal("140000")),
            new Product("3", "Product C", new BigDecimal("60000"))
            );
    }

}
