package com.java.test2;

import com.java.test.crud.Helper;
import com.java.test.crud.model.Araba;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

public class Helper2Impl extends Helper2<Araba, Integer> {

    Connection createConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/hibernate-tutorial", "postgres", "root");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    Statement statement() throws SQLException {
        return createConnection().createStatement();
    }

    @Override
    public void add(Araba araba) throws SQLException {
        HashMap<String, String> values = new HashMap<String, String>();
        values.put("id", String.valueOf(araba.getId()));
        values.put("name", araba.getName());
        String addSqlQuery = SqlHelpers.mapAddArabaObject(values);
        statement().executeUpdate(addSqlQuery);
    }

    @Override
    public void delete(Integer integer) throws SQLException {
        statement().executeUpdate(SqlHelpers.mapDeleteObject(integer));
    }

    @Override
    public void update(Araba araba, Integer integer) throws SQLException {
        String s = "UPDATE araba SET id=$param1,name='$param2' where id=" + integer;
        s = s.replace("$param1", String.valueOf(araba.getId()));
        s = s.replace("$param2", String.valueOf(araba.getName()));

        statement().executeUpdate(s);
    }
}
