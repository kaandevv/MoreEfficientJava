package ders3.countdownlatch;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

public class ProviderChecker implements Callable<Boolean> {

    CountDownLatch countDownLatch;
    String name;

    ProviderChecker(CountDownLatch countDownLatch, String serviceName) {
        this.countDownLatch = countDownLatch;
        this.name = serviceName;
    }

    @Override
    public Boolean call() throws Exception {
        Thread.sleep(3000);
        countDownLatch.countDown();
        System.out.println("Service:" + name + " is UP");
        return Boolean.TRUE;
    }
}