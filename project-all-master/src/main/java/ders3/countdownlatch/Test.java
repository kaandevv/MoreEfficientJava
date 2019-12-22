package ders3.countdownlatch;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Test {

    public static void main(String[] args) throws Exception {
        CountDownLatch countDownLatch = new CountDownLatch(3);
        ExecutorService service = Executors.newFixedThreadPool(10);

        List<Future<Boolean>> futureList = new ArrayList<>();

        futureList.add(service.submit(new AccountChecker(countDownLatch, "account")));
        futureList.add(service.submit(new UserChecker(countDownLatch, "user")));
        futureList.add(service.submit(new ProviderChecker(countDownLatch, "provider")));


        countDownLatch.await();
        Thread.sleep(1000);
        for (Future future : futureList) {
            Boolean aBoolean = (Boolean) future.get();
            System.out.println(aBoolean);
        }
    }
}
