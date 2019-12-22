package com.java.test2;

import java.sql.Connection;
import java.sql.SQLException;

public abstract class Helper2<T, PK> {
    abstract Connection createConnection();

    public void add(T t) throws SQLException {
    }

    public void update(T t, PK pk) throws SQLException {
    }

    public void delete(PK pk) throws SQLException {
    }
}
