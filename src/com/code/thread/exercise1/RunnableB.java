package com.code.thread.exercise1;

public class RunnableB implements Runnable {
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

    public RunnableB(){
        System.out.println("start  runnableB");
    }

    @Override
    public void run() {
        for(int i=0;i<3;i++){
            System.out.println("run runnableB -->"+i);
            Thread.yield();
        }
        System.out.println("end runnableB");
    }
}
