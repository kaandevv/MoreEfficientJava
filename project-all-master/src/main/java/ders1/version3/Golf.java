package ders1.version3;

public class Golf extends Araba {
    @Override
    String renk() {
        return "Beyaz";
    }

    @Override
    void calis() {
        System.out.println("Engine is working...");
    }

    @Override
    String deneme() {
        System.out.println("deneme alt class");
        return "deneme alt class";
    }

    @Override
    void deneme1() {
        super.deneme1();
    }
}
