package ders2;

public class TestSuper {
    public static void main(String[] args) {
        ParentClass parentClass = new Child2Class(4);
        ParentClass parent2Class = new ChildClass(4);
    }
}

class ParentClass {
    ParentClass(int data) {
        System.out.println("Parent class a geldiniz...");
        System.out.println(data);
    }

    public void ekranaYaz() {
        System.out.println("deneme parent");
    }
}

class ChildClass extends ParentClass {
    ChildClass(int data) {
        super(data);
    }

    public void callSuperEkranaYaz() {
        super.ekranaYaz();
    }
}

class Child2Class extends ParentClass {
    Child2Class(int data) {
        super(data);
    }
}
