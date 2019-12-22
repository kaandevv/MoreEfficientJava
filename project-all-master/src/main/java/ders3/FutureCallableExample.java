package ders3;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class FutureCallableExample {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(10);
        List<Future<Integer>> futureList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            MyCallableClass myCallableClass = new MyCallableClass();
            myCallableClass.setNumber(i + 2);
            futureList.add(service.submit(myCallableClass));
        }
        futureList.stream().forEach(kaan -> {
            try {
                System.out.println(kaan.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        });

    }

}

class MyCallableClass implements Callable<Integer> {

    private Integer number;

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public Integer call() throws Exception {
       int value=1;
        for (int i = 2; i <number; i++) {
            value=value*i;
        }

        return value;
    }
}
