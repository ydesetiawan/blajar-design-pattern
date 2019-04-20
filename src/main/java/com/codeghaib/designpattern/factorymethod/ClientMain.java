package com.codeghaib.designpattern.factorymethod;

public class ClientMain {

    public static void main(String[] args) {
        Storage storageMysql = StorageFactory.getFactory(StorageType.DB_MYSQL);
        storageMysql.save(new Document("customer"));

        Storage storageCassandra = StorageFactory.getFactory(StorageType.DB_CASSANDRA);
        storageCassandra.save(new Document("vendor"));

        Storage storageElasticsearch = StorageFactory.getFactory(StorageType.DB_ELASTICSEARCH);
        storageElasticsearch.save(new Document("company"));
    }
}
