package com.ft.factory;

import com.ft.group.*;

/**
 * Created by poseture on 2017/8/20.
 */
public class Test {

    public static void main(String[] args) {
        MyThreadFactory factory = new MyThreadFactory("MyThreadFactory");

        Task task = new Task();

        Thread thread;

        System.out.printf("Starting the threads\n");

        for(int i=0;i<10;i++){
            thread = factory.newThread(task);
            thread.start();
        }
        System.out.println(factory.getStats());
    }
}
