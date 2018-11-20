package javaBase.thread;

import java.util.concurrent.*;

public class  CallableTest{
    public static class CallableTest1 implements Callable<String> {

        @Override
        public String call() throws Exception {
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName());
            }
            return Thread.currentThread().getName() + "OK";
        }
    }

    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newSingleThreadExecutor();
        ExecutorService threadPool1 = Executors.newSingleThreadExecutor();
        //启动线程
        Future<String> future = threadPool.submit(new CallableTest1());
        Future<String> future1 = threadPool1.submit(new CallableTest1());

        try {
             System.out.println(future.get());
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
