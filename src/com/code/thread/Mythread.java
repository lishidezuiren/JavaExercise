package com.code.thread;

public class Mythread implements Runnable {
    public Mythread(int i) {
        this.i = i;
    }

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

    private int i;

    @Override
    public void run() {
        plt(i);
    }
     public static void plt(int i){
         System.out.println(i);
     }
}
