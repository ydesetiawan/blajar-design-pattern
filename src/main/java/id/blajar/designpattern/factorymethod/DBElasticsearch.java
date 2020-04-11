package com.codeghaib.designpattern.factorymethod;

public class DBElasticsearch implements Storage {

    @Override
    public void save(Document document) {
        System.out.println("save data to elasticsearch");
    }
}
