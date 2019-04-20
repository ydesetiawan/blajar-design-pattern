package com.codeghaib.designpattern.factorymethod;

public class StorageFactory {

    static Storage getFactory(StorageType storageType) {
        Storage storage;
        switch (storageType) {
            case DB_MYSQL:
                storage = new DbMysql();
                break;
            case DB_CASSANDRA:
                storage = new DbCassandra();
                break;
            case DB_ELASTICSEARCH:
                storage = new DbElasticsearch();
                break;
            default:
                storage = null;
                break;
        }
        return storage;
    }
}
