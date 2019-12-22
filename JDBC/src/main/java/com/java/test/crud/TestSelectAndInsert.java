package com.java.test.crud;

import com.java.test.crud.model.Araba;

import java.sql.SQLException;

public class TestSelectAndInsert {

    public static void main(String[] args) throws SQLException {
        Helper helper = new Helper();
//        helper.addData(new Araba(101, "mazda"));
    /*    helper.delete(101);
        helper.showAllData();*/

        helper.update(new Araba(4, "ford"), 1);
        helper.showAllData();

    }

}
