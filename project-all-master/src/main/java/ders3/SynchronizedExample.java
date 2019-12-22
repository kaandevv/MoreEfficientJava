package ders3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class SynchronizedExample {
    int counter = 0;

    synchronized void increaseOne() {
        counter = counter + 1;
    }


    void startService() throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(10);

        for (int i = 0; i < 10000; i++) {
            service.submit(this::increaseOne);
        }
        service.awaitTermination(1, TimeUnit.SECONDS);
        System.out.println(counter);
    }

    public static void main(String[] args) throws InterruptedException {
        SynchronizedExample synchronizedExample = new SynchronizedExample();
        synchronizedExample.startService();
    }
}
