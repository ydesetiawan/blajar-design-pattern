package com.codeghaib.designpattern.factorymethod;

public class DBMysql implements Storage {

    @Override
    public void save(Document document) {
        System.out.println("save data to mysql");
    }
}
