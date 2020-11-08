package com.code.thread.exercise2;

import java.util.concurrent.*;

public class Run {
    public static void main(String[] args) {
//        Thread a=new Thread(new FibonacciA(10));
//        Thread b=new Thread(new FibonacciB(10));
//        a.start();
//        b.start();
//        ExecutorService executorService= Executors.newCachedThreadPool();
        ExecutorService executorService= Executors.newCachedThreadPool();
//        executorService.execute(new FibonacciA(5));
//        executorService.execute(new FibonacciB(5));
        Future<Integer> result=executorService.submit(new FibonacciCall(5));
            try {
                System.out.println("result:"+result.get());
            }catch ( InterruptedException e){
                e.printStackTrace();
            }
            catch (ExecutionException e){
                e.printStackTrace();
            }
            finally {
                executorService.shutdown();
            }

    }
}
