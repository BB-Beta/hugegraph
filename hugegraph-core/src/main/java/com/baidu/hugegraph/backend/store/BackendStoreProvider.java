package com.baidu.hugegraph.backend.store;

public interface BackendStoreProvider {

    public String type();

    public String name();

    public BackendStore loadSchemaStore(String name);

    public BackendStore loadGraphStore(String name);

    public BackendStore loadIndexStore(String name);

    public void close();

    public void init();

    public void clear();
}
