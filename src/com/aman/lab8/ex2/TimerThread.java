package com.aman.lab8.ex2;

import java.time.LocalTime;

public class TimerThread implements Runnable {

    @Override
    public void run() {

        while (true) {

            System.out.println("Current Time : "
                    + LocalTime.now());

            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
