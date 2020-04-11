package id.blajar.designpattern.factorymethod;

public class StorageFactory {

    static Storage getFactory(StorageType storageType) {
        Storage storage;
        switch (storageType) {
            case DB_MYSQL:
                storage = new DBMysql();
                break;
            case DB_CASSANDRA:
                storage = new DBCassandra();
                break;
            case DB_ELASTICSEARCH:
                storage = new DBElasticsearch();
                break;
            default:
                storage = null;
                break;
        }
        return storage;
    }
}
