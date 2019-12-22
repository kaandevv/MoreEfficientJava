package ders2;

public class TestExtendsClass extends Deneme1 {

    @Override
    public void ekrana1Yaz() {
        super.ekrana1Yaz();
    }

    @Override
    public void ekrana2Yaz() {
        super.ekrana2Yaz();
    }

    public static void main(String[] args) {

    }
}

class Deneme1 extends Deneme2 {
    public void ekrana1Yaz() {
        System.out.println("ekrana yazzz...");
    }

}


class Deneme2 {
    public void ekrana2Yaz() {
        System.out.println("ekrana2 yazzz...");
    }
}