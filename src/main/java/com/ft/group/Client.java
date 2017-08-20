package com.ft.group;

import java.util.concurrent.TimeUnit;

/**
 * Created by poseture on 2017/8/20.
 */
public class Client {

    public static void main(String[] args) {

//      创建一个ThreadGroup对象
        ThreadGroup threadGroup = new ThreadGroup("Searcher");


        Result result = new Result();
        SearchTask searchTask = new SearchTask(result);

        for(int i=0;i<10;i++){

            Thread thread = new Thread(threadGroup,searchTask);

            thread.start();;

            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }


        System.out.printf("Number of Threads: %d\n",threadGroup. activeCount());

        System.out.printf("Information about the Thread Group\n");

        threadGroup.list();

        /*
            使用activeCount()获取线程个数,
            enumreate获取与threadGroup对象关联的线程信息,
         */

        Thread[] threads = new Thread[threadGroup.activeCount()];
        threadGroup.enumerate(threads);

        for(int i= 0;i<threadGroup.activeCount();i++){
            System.out.printf("Thread %s: %s\n",threads[i].getName(),threads[i].getState());
        }

        //等待threadGroup对象的一个线程的结束
        waitFinish(threadGroup);

        //使用interrupt方法中断组里的其他线程
        threadGroup.interrupt();



    }

    private static void waitFinish(ThreadGroup threadGroup) {
        while(threadGroup.activeCount()>9){
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}
