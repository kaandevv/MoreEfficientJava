package com.java.test2;


import java.util.HashMap;

/**
 * INSERT INTO araba " +
 * "VALUES (101, 'Toyota')";
 */
public class SqlHelpers {
    public static final String arabaSelect = "select * from araba";
    public static String arabaDelete="delete from araba where id=";
    public static String add = "insert into araba values($1,'$2')";


    public static String mapAddArabaObject(HashMap<String, String> hashMap) {
        String id = hashMap.get("id");
        String name = hashMap.get("name");
        add = add.replace("$1", id);
        add = add.replace("$2", name);
        return add;
    }
    public static String  mapDeleteObject(Integer id){
        return arabaDelete +id;
    }
}
