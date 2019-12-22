package ders2;

public class MyModel {
    private int id;
    private String name;
    private int age;


    public int getirId(Role role) {
        if (role.text.equals("admin")) {
            return id;
        } else {
            return 0;
        }
    }

    public void setleId(int id) {
        this.id = id;
    }
}
