package ders3.javaio;

import java.io.Serializable;

public class Player implements Serializable {
    Integer id;
    String name;
    Boolean isUser;
    transient Integer point;

    public Player(Integer id, String name, Boolean isUser, Integer point) {
        this.id = id;
        this.name = name;
        this.isUser = isUser;
        this.point = point;
    }

    @Override
    public String toString() {
        return "{" +
                "id:" + id + "\n" +
                "name:" + name + "\n" +
                "point:" + point + "\n" +
                "}";
    }
}
