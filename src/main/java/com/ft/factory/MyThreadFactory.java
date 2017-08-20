package com.ft.factory;

import com.ft.group.MyThreadGroup;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ThreadFactory;

/**
 * Created by poseture on 2017/8/20.
 */
public class MyThreadFactory implements ThreadFactory {

    //线程数量
    private int counter;

    //线程名称
    private String name;

    //线程状态
    private List<String> stats;

    public MyThreadFactory(String name) {
        counter = 0;
        this.name = name;
        stats = new ArrayList<String>();
    }

    public Thread newThread(Runnable r) {

        Thread thread = new Thread(r,name+"_Thread_"+counter);

        counter++;

        stats.add(String.format("create thread %d with name %s on %s", thread.getId(),thread.getName(),new Date()));

        return thread;
    }

    /**
     * 返回线程的状态
     * @return
     */
    public String getStats(){
        StringBuffer buffer = new StringBuffer();

        Iterator<String> it = stats.iterator();

        while (it.hasNext()){
            buffer.append(it.next()).append("\n");
        }
        return buffer.toString();

    }


}
