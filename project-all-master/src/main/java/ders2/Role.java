package ders2;

public enum Role {
    USER(1,"user"),
    ADMIN(2,"admin"),
    GUEST(3,"guest");

    int id;
    String text;

    Role(int id,String text){
        this.id = id;
        this.text = text;
    }


}
