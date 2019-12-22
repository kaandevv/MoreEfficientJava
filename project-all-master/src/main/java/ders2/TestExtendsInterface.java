package ders2;

public class TestExtendsInterface implements Interface1{

    @Override
    public void size1() {

    }

    @Override
    public String interface1ToUpperCase(String var) {
        return null;
    }

    @Override
    public void size2() {

    }

    @Override
    public String interface2ToUpperCase(String var) {
        return null;
    }
}

interface Interface1 extends Interface2 {
    void size1();

    String interface1ToUpperCase(String var);
}


interface Interface2 {
    void size2();

    String interface2ToUpperCase(String var);
}