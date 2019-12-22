package ders3;

public class Thread2 {
    public static void main(String[] args) {
        MyThead2 myThead2 = new MyThead2();
        myThead2.run();
    }
}


class MyThead2 implements Runnable {
    @Override
    public void run() {
        System.out.println("Workss..");
    }
}