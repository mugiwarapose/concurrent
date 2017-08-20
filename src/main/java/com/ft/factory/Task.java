package com.ft.factory;

import java.util.concurrent.TimeUnit;

/**
 * Created by poseture on 2017/8/20.
 */
public class Task implements Runnable {

    public void run() {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
