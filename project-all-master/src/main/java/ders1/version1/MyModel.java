package ders1.version1;

public class MyModel {
    int degisken1;
    static int degisken2;

    MyModel() {
        degisken1 = degisken1 + 1;
        degisken2 = degisken2 + 1;
    }

    MyModel(int d) {
    }


    public void ekranaYaz() {
        System.out.println("Degisken1:" + degisken1);
        System.out.println("Degisken2:" + degisken2);
    }
}
