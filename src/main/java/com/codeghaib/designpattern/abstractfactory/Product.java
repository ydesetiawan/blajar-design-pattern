package com.codeghaib.designpattern.abstractfactory;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
@AllArgsConstructor
public class Product {

    private String id;
    private String name;
    private BigDecimal price;

}
