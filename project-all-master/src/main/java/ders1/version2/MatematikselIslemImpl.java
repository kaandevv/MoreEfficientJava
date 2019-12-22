package ders1.version2;

public class MatematikselIslemImpl implements MatematikselIslem {
    @Override
    public Integer toplam(Integer i1, Integer i2) {
        return i1 + i2;
    }

    @Override
    public void sonucYaz(Integer sonuc) {
        System.out.println(sonuc);
    }

    @Override
    public String responseString(String text) {
        return text.toUpperCase();
    }
}
