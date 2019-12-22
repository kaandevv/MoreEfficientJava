package com.java.pattern.builder;

//https://www.journaldev.com/1425/builder-design-pattern-in-java
public class Test3 {
    public static void main(String[] args) {
        Araba araba = new Araba.ArabaBuilder().setId(1).setName("asfdadf").build();
        Araba araba1 = new Araba.ArabaBuilder().setName("asfdadf asdsad").setPrice(1230).build();
        System.out.println(araba);
        System.out.println(araba1);
    }
}
