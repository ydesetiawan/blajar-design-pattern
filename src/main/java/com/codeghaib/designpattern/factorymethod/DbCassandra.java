package com.codeghaib.designpattern.factorymethod;

public class DbCassandra implements Storage {

    @Override
    public void save(Document document) {
        System.out.println("save data to cassandra");
    }
}
