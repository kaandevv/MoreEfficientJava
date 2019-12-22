package ders3.countdownlatch;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

public class UserChecker implements Callable<Boolean> {

    CountDownLatch countDownLatch;
    String name;

    UserChecker(CountDownLatch countDownLatch, String serviceName) {
        this.countDownLatch = countDownLatch;
        this.name = serviceName;
    }

    @Override
    public Boolean call() throws Exception {
        Thread.sleep(2000);
        countDownLatch.countDown();
        System.out.println("Service:" + name + " is UP");
        return Boolean.TRUE;
    }
}
