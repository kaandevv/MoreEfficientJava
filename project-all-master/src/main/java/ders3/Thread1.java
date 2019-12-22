package ders3;

public class Thread1 {

    public static void main(String[] args) {
        System.out.println("asdnajsd");
        for (int i = 0; i <= 1000; i++) {
            MyThread myThread = new MyThread(i);
            myThread.run();
        }


    }
}


class MyThread extends Thread {
    int i;

    MyThread(int i) {
        this.i = i;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println(i + "Merhaba thread calisiyor...");
    }
}