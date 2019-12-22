package com.java.pattern.singleton;

public class SingletonStaticObj {
    private static String obj;

    public static String getObj() {
        if (obj == null) {
            obj = new String("deneme String bu");
            return obj;
        }
        return obj;

    }

}
