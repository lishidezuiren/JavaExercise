package com.code.thread.exercise3;


import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SleepTaskA implements Runnable {
    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        slp();
    }
    public static void slp(){
        Random random=new Random();
        try {
            int t=1000* random.nextInt(10);
            TimeUnit.MILLISECONDS.sleep(t);
            System.out.println("sleep : "+t);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: enter a number");
        }
        if (args.length == 1) {
            int n=Integer.parseInt(args[0]);
            ExecutorService executorService = Executors.newCachedThreadPool();
            for (int i = 0; i < n; i++) {
                executorService.execute(new SleepTaskA());
            }
            executorService.shutdown();
        }
    }
}
