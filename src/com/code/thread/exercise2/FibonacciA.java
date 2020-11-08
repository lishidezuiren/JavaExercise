package com.code.thread.exercise2;


public class FibonacciA implements Runnable {
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
    public int n=0;

    public FibonacciA(int n){
        this.n=n;
    }

    public int fib(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }

    @Override
    public void run() {

        while (n>0){
            System.out.println("FA --> "+fib(n));
            n--;
        }


    }
}
