package com.codeghaib.designpattern.singleton;

public class ClientMain {

    public static void main(String[] args) {
        DBConnection dbConnection1 = DBConnection.getInstance();
        DBConnection dbConnection2 = DBConnection.getInstance();
        DBConnection dbConnection3 = DBConnection.getInstance();
        DBConnection dbConnection4 = DBConnection.getInstance();
    }

}
