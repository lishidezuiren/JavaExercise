package com.code.thread.exercise1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Run {
    public static void main(String[] args) {
//        Thread t=new Thread(new RunnableA());
//        Thread t1=new Thread(new RunnableB());
//        t.start();
//        t1.start();
        ExecutorService executorService= Executors.newCachedThreadPool() ;
        for(int i=0;i<10;i++){
            executorService.execute(new RunnableA());
        }
        executorService.shutdown();
    }
}
