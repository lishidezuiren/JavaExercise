package com.code.thread.exercise2;

import java.util.concurrent.Callable;

public class FibonacciCall implements Callable<Integer> {
    /**
     * Computes a result, or throws an exception if unable to do so.
     *
     * @return computed result
     * @throws Exception if unable to compute a result
     */

    public int n;

    public FibonacciCall(int n){
        this.n=n;
    }

    public int fib(int n){
        if(n<2)
            return 1;
        return fib(n-1)+fib(n-2);
    }

    @Override
    public Integer call() throws Exception {
        return fib(n);
    }
}
