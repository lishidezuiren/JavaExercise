package com.code.thread.exercise1;

public class RunnableA implements Runnable {
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

    public RunnableA(){
        System.out.println("start  runnableA");
    }

    @Override
    public void run() {
        for(int i=0;i<3;i++){
            System.out.println("run runnableA -->"+i);
            Thread.yield();
        }
        System.out.println("end runnableA");
    }
}
