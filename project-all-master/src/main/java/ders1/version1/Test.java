package ders1.version1;

import ders1.version2.MatematikselIslemImpl;

public class Test {
    public static void main(String[] args) {
      /*  ClassFunction classFunction = new ClassFunction();
        Integer sonuc = classFunction.carp(4, 5);
        System.out.println("sonuc:" + sonuc);

        sonuc = ClassFunction.toplam(4, 5);
        System.out.println("sonuc:" + sonuc);

        sonuc = classFunction.cikar(4, 5);
        System.out.println("sonuc:" + sonuc);
*/
    /*    MyModel myModel = new MyModel();
        myModel.ekranaYaz();

        MyModel myModel2 = new MyModel();
        myModel2.ekranaYaz();*/

        MatematikselIslemImpl matematikselIslemImpl = new MatematikselIslemImpl();
        String response = matematikselIslemImpl.responseString("abscasdadad");
        System.out.println(response);
        Integer sonuc = matematikselIslemImpl.toplam(1, 7);
        matematikselIslemImpl.sonucYaz(sonuc);


    }
}
