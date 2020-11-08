package com.code.thread;

public class Test {
    public static void main(String[] args) {
        int i=5;
        while (i>0){
            Thread t=new Thread(new Mythread(i));
            t.start();
            i--;
        }

    }
}
