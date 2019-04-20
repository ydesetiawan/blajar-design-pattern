package com.codeghaib.designpattern.singleton;

public class DBConnection {

    private DBConnection() {
        System.out.println("First calling");
    }

    private static DBConnection instance;

    public static DBConnection getInstance() {
        if (instance == null) {
            instance = new DBConnection();
        }
        return instance;
    }

}
