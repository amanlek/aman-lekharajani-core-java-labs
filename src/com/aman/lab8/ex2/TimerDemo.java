package com.aman.lab8.ex2;
public class TimerDemo {

    public static void main(String[] args) {

        Runnable r = new TimerThread();

        Thread t = new Thread(r);

        t.start();
    }
}
