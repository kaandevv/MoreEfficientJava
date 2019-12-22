package com.java.test.crud;

import java.sql.*;

public class InsertJava {
    public static void main(String[] args) {
        try {

            String sql = "INSERT INTO araba " +
                    "VALUES (101, 'Toyota')";


            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/hibernate-tutorial", "postgres", "root");
            Statement statement = connection.createStatement();
            int status = statement.executeUpdate(sql);

        } catch (SQLException e) {
            System.out.println("Connection failure.");
            e.printStackTrace();
        }
    }
}
