package com.java.test.crud;

import com.java.test.crud.model.Araba;

import java.sql.*;

//https://stackoverflow.com/questions/355089/difference-between-stringbuilder-and-stringbuffer
public class Helper {
    Connection connection;

    Helper() throws SQLException {
        connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/hibernate-tutorial", "postgres", "root");
    }

    public void addData(Araba araba) throws SQLException {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("INSERT INTO araba VALUES(" + araba.getId() + ",'" + araba.getName() + "')");
        Statement statement = connection.createStatement();
        statement.executeUpdate(stringBuilder.toString());
        this.showAllData();
    }


    public void showAllData() throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from araba");
        while (resultSet.next()) {
            Integer id = resultSet.getInt(1);
            String name = resultSet.getString(2);
            System.out.println("id :" + id);
            System.out.println("name :" + name);
        }
    }

    public boolean delete(int id) throws SQLException {
        Statement statement = connection.createStatement();
        statement.executeUpdate("delete from araba where id=" + id);
        return true;
    }


    public boolean update(Araba araba, int id) throws SQLException {
        String s = "UPDATE araba SET id=$param1,name='$param2' where id=" + id;
        s = s.replace("$param1", String.valueOf(araba.getId()));
        s = s.replace("$param2", String.valueOf(araba.getName()));

        Statement statement = connection.createStatement();
        statement.executeUpdate(s);
        return true;
    }

}
