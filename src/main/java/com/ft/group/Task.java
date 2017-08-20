package com.ft.group;

import java.util.Random;

/**
 * Created by poseture on 2017/8/20.
 */
public class Task implements Runnable {
    public void run() {
        int result;

        Random random = new Random(Thread.currentThread().getId());

        while(true){
            result = (int) (1000/(random.nextDouble()*1000));

            System.out.printf("%s : %s\n",Thread.currentThread().getId(),result);

            if (Thread.currentThread().isInterrupted()){
                System.out.printf("%d : Interrupted\n",Thread.currentThread().getId());
                return;
            }
        }
    }
}
