package ders3;

public class Thread3 {

    public static void main(String[] args) {
        MyThread3 myThread3 = new MyThread3();
        MyThread3 myThread31 = new MyThread3();
        MyThread3 myThread32 = new MyThread3();
        MyThread3 myThread33 = new MyThread3();

        myThread3.run();
        myThread31.run();
        myThread32.run();
        myThread33.run();
    }
}


class MyThread3 implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName());
        System.out.println("Thread works");
    }
}