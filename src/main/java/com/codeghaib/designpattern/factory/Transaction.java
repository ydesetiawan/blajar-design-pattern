package com.codeghaib.designpattern.factory;

import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@Getter
@AllArgsConstructor
public class Transaction {

    private List<Product> products;

    private Tax tax;

    public BigDecimal getTotalPrice() {
        return products.stream()
            .map(Product::getPrice)
            .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public BigDecimal getGrandTotal() {
        BigDecimal value = getTotalPrice();

        if (tax != null) {
            value = value.add(value.multiply(tax.rate()));
        }

        return value;
    }

}
