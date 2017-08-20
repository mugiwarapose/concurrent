package com.ft.group;

/**
 * Created by poseture on 2017/8/20.
 */
public class Test {

    public static void main(String[] args) {
        MyThreadGroup myThreadGroup = new MyThreadGroup("MyThreadGroup");

        Task task = new Task();

        for(int i=0;i<2;i++){
            Thread thread = new Thread(myThreadGroup,task);
            thread.start();
        }

    }
}
